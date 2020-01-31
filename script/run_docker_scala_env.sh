#!/bin/sh

git clone https://github.com/yennanliu/utility_Scala.git
cd utility_Scala
docker build . -t spark_env
docker run  --mount \
type=bind,\
source="$(pwd)"/.,\
target=/utility_Scala \
-i -t spark_env \
/bin/bash  
