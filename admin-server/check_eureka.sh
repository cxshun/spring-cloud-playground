#!/bin/bash
while :
  do
    CODE=`curl -I -m 10 -o /dev/null -s -w %{http_code} http://eureka-server:8801/`
    if [[ $CODE -eq 200 ]]; then
      echo -e "\033[42;34m eureka-server is ok \033[0m"
      break;
    else
      sleep 1
    fi
  done

java -jar $1.jar