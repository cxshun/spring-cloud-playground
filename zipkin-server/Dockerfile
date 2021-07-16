FROM openjdk:8-jdk-oracle
MAINTAINER cxshun

EXPOSE 8803
COPY target/zipkin-server-1.0-SNAPSHOT.jar /var
WORKDIR /var
ENTRYPOINT ["java", "-jar", "zipkin-server-1.0-SNAPSHOT.jar"]