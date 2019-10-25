FROM openjdk:8-jdk-alpine

VOLUME /tmp

COPY ./target/simple-api-spring-0.0.1-SNAPSHOT.jar app/

WORKDIR /app

RUN sh -c 'touch simple-api-spring-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","simple-api-spring-0.0.1-SNAPSHOT.jar"]

