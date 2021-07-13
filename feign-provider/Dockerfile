FROM openjdk:8-jdk-oracle
MAINTAINER cxshun

EXPOSE 8083
COPY target/feign-provider-1.0-SNAPSHOT.jar /var
WORKDIR /var
CMD ["java", "-jar", "feign-provider-1.0-SNAPSHOT.jar"]