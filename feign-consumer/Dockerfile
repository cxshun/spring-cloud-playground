FROM openjdk:8-jdk-oracle
MAINTAINER cxshun

EXPOSE 8081
COPY target/feign-consumer-1.0-SNAPSHOT.jar /var
WORKDIR /var
CMD ["java", "-jar", "feign-consumer-1.0-SNAPSHOT.jar"]