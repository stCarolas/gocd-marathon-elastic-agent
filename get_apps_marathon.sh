#! /bin/sh
#
# get_apps_marathon.sh
# Copyright (C) 2018 stcarolas <stcarolas@homeGround>
#
# Distributed under terms of the MIT license.
#


curl --header "Authorization: token=$(dcos config show core.dcos_acs_token)" m1.dcos/service/marathon/v2/apps | jq . | less
