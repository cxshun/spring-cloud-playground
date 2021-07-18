FROM openjdk:8-jdk-alpine
MAINTAINER cxshun

RUN apk add --no-cache ospd-netstat curl tzdata bash

EXPOSE 8801
COPY target/eureka-server-1.0-SNAPSHOT.jar /var
WORKDIR /var