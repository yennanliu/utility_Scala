### Spark word count 
- Modify from https://github.com/mahesh2492/spark-on-mesos

### Quick start 

- Step 0) Prerequest
```bash 
$ git clone https://github.com/yennanliu/utility_Scala.git
$ cd utility_Scala
$ cd spark-word-count
``` 

- Step 1) sbt build 
```bash 
$ sbt clean compile
$ sbt assembly
```
- Step 1') sbt run 
```bash 
$ sbt run
```

- - Step 2) spark-submit run scala spark word count demo 
```bash
$ sbt assembly
$ spark-submit --class "rdd.WordCount" target/ \
scala-2.11/spark-word-count-assembly-1.0.jar
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
source="$(pwd)"/spark-word-count,\
target=/spark-word-count \
-i -t spark_scala_env \
/bin/bash 
# inside docker env 
root@79c0100f5cf6:~# cd ../spark-word-count
root@79c0100f5cf6:~# sbt assembly
root@79c0100f5cf6:~# spark-submit --class "rdd.WordCount" target/ \
scala-2.11/spark-word-count-assembly-1.0.jar
```
