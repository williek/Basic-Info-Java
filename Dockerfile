FROM openjdk:17-jdk-alpine
WORKDIR /JavaApp
COPY ./target/*.jar app.jar
USER 1000
EXPOSE 8080
CMD [ "java", "-jar", "app.jar" ]