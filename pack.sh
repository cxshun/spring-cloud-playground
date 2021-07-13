#!/bin/bash

curDir=`pwd`
cd $curDir/admin-server
mvn clean package
cd $curDir/eureka-server
mvn clean package
cd $curDir/feign-consumer
mvn clean package
cd $curDir/feign-provider
mvn clean package
cd $curDir/hystrix-server
mvn clean package
cd $curDir/turbine-server
mvn clean package
cd $curDir/zipkin-server
mvn clean package
cd $curDir/zuul-server
mvn clean package
