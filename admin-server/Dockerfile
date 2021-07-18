FROM openjdk:8-jdk-alpine
MAINTAINER cxshun

RUN apk add --no-cache ospd-netstat curl tzdata bash

EXPOSE 8804
COPY target/admin-server-1.0-SNAPSHOT.jar /var
ADD check_eureka.sh /var
WORKDIR /var