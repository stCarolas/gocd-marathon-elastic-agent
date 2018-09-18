#! /bin/sh
#
# start.sh
# Copyright (C) 2018 stcarolas <stcarolas@homeGround>
#
# Distributed under terms of the MIT license.
#


docker run -d -p8153:8153 -p8154:8154 --net=host -e GOCD_PLUGIN_INSTALL_docker-elastic-agents="http://localhost:8000/Downloads/elastic-agent-skeleton-plugin-0.2-SNAPSHOT.jar" gocd/gocd-server:v18.9.0
