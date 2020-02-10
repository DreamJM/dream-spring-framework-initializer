#!/bin/bash
# cp service file to /etc/rc.d/init.d and add service for it

SERVICE_NAME=$1
DST_SCRIPT_PATH=/etc/rc.d/init.d

if [[ $# -ne 1 ]]
then
    echo "parameter number not 1 error"
    exit 1
fi

alias cp=\cp
cp -f @projectName@ ${DST_SCRIPT_PATH}/${SERVICE_NAME}
chmod 777 ${DST_SCRIPT_PATH}/${SERVICE_NAME}

chkconfig --del ${SERVICE_NAME}
chkconfig --add ${SERVICE_NAME}
