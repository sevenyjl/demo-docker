# FROM 设置基础镜像
FROM openjdk:11
# 设置镜像作者
MAINTAINER seven
#设置环境信息
ENV TZ Asia/Shanghai
ENV LANG C.UTF-8
ENV DEBIAN_FRONTEND noninteractive
#ADD ./target/demo-docker-0.0.1-SNAPSHOT.jar /
copy ./target/demo-docker*.jar test.jar
# 设置容器的入口
ENTRYPOINT ["java","-jar","/test.jar"]


