FROM openjdk:8-jdk-oracle
MAINTAINER cxshun

EXPOSE 8807
COPY target/turbine-server-1.0-SNAPSHOT.jar /var
WORKDIR /var
CMD ["java", "-jar", "turbine-server-1.0-SNAPSHOT.jar"]