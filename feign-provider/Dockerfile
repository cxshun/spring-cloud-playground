FROM openjdk:8-jdk-alpine
MAINTAINER cxshun

RUN apk add --no-cache ospd-netstat curl tzdata bash

EXPOSE 8083
COPY target/feign-provider-1.0-SNAPSHOT.jar /var
COPY check_eureka.sh /var
WORKDIR /var