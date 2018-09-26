#! /bin/sh
#
# start.sh
# Copyright (C) 2018 stcarolas <stcarolas@homeGround>
#
# Distributed under terms of the MIT license.
#
if [[ -f /tmp/http_server_pid ]]
then
    echo "use existing http server"
else
    current_dir=$(pwd)
    cd ~
    echo "load http server"
    nohup python -m SimpleHTTPServer &
    echo $! > /tmp/http_server_pid
    cd $current_dir
fi
./gradlew build
cp -f ./build/libs/gocd-marathon-elastic-agent-0.0.1.jar ~/Downloads/
sleep 3
docker rm -f gocd || true
docker run -d -p8153:8153 -p8154:8154 --net=host \
    -v /srv/gocd:/godata \
     --name gocd \
    -e GOCD_PLUGIN_INSTALL_docker-elastic-agents="http://localhost:8000/Downloads/gocd-marathon-elastic-agent-0.0.1.jar" \
    gocd/gocd-server:v18.9.0
