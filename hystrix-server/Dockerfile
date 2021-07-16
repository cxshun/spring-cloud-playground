FROM openjdk:8-jdk-oracle
MAINTAINER cxshun

EXPOSE 8806
COPY target/hystrix-server-1.0-SNAPSHOT.jar /var
WORKDIR /var
ENTRYPOINT ["java", "-jar", "hystrix-server-1.0-SNAPSHOT.jar"]