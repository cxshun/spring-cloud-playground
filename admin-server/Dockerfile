FROM openjdk:8-jdk-oracle
MAINTAINER cxshun

EXPOSE 8804
COPY target/admin-server-1.0-SNAPSHOT.jar /var
WORKDIR /var
ENTRYPOINT ["java", "-jar", "admin-server-1.0-SNAPSHOT.jar"]