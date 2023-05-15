FROM amazoncorretto:17-alpine-jdk
MAINTAINER Anabela
COPY target/ backendarrieta-0.0.1-SNAPSHOT.jar arrieta-app.jar
ENTRYPOINT ["java","-jar","/arrieta-app.jar"]
