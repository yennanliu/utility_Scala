### Spark word count 
- Modify from https://github.com/mahesh2492/spark-on-mesos

### Quick start 

- Prerequest
```bash 
$ git clone https://github.com/yennanliu/utility_Scala.git
$ cd utility_Scala
$ cd spark-word-count
``` 

- sbt build 
```bash 
$ sbt clean compile
$ sbt assembly
```
- sbt run 
```bash 
$ sbt run
```

- spark-submit run scala spark word count demo 
```bash
$ sbt assembly
$ cd /root/spark-word-count/target/scala-2.11
$ spark-submit --class "rdd.WordCount" \
  --master mesos://127.0.0.1:50 \
  spark-on-mesos-assembly-1.0.jar

```

### Quick start via Docker 
```bash
$ git clone https://github.com/yennanliu/utility_Scala.git
$ cd utility_Scala
# docker build 
$ docker build . -t spark_scala_env 
# docker run 
$ docker run  --mount \
type=bind,\
source="$(pwd)"/.,\
target=/spark-word-count \
-i -t spark_scala_env \
/bin/bash 
```
