#!/bin/bash
SERVICE_NAME="@projectName@"
SERVICE_HOME_NAME=`echo "${SERVICE_NAME}_HOME" | tr 'a-z' 'A-Z'`
SERVICE_HOME="/usr/local/${SERVICE_NAME}"

sed -i "/export ${SERVICE_HOME_NAME}=.*/d" /etc/profile
echo "export ${SERVICE_HOME_NAME}=${SERVICE_HOME}" >> /etc/profile
source /etc/profile

chmod 777 -R ${SERVICE_HOME}

tar -zxf tools/JDK8.tar.gz

sh add_service.sh ${SERVICE_NAME}
service ${SERVICE_NAME} start