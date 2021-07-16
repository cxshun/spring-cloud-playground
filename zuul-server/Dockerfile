FROM openjdk:8-jdk-oracle
MAINTAINER cxshun

EXPOSE 8805
COPY target/zuul-server-1.0-SNAPSHOT.jar /var
WORKDIR /var
ENTRYPOINT ["java", "-jar", "zuul-server-1.0-SNAPSHOT.jar"]