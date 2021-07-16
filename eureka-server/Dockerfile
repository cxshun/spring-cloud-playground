FROM openjdk:8-jdk-oracle
MAINTAINER cxshun

EXPOSE 8801
COPY target/eureka-server-1.0-SNAPSHOT.jar /var
WORKDIR /var
ENTRYPOINT ["java", "-jar", "eureka-server-1.0-SNAPSHOT.jar"]