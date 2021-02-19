# FROM 设置基础镜像
FROM openjdk:11
# 设置镜像作者
MAINTAINER seven
# VOLUME 设置容器的挂载卷
VOLUME /tmp
# 编译时复制文件到镜像中
COPY target/demo-docker-0.0.1-SNAPSHOT.jar test.jar
# RUN 编译镜像时运行的脚本
RUN bash -c 'touch /test.jar'
# 设置容器的入口
ENTRYPOINT ["java","-jar","/test.jar"]


