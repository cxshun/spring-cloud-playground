FROM openjdk:8-jdk-oracle
MAINTAINER cxshun

EXPOSE 8803
COPY target/zipkin-server-1.0-SNAPSHOT.jar /var
WORKDIR /var
CMD ["java", "-jar", "zipkin-server-1.0-SNAPSHOT.jar"]