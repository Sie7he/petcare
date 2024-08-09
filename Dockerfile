FROM openjdk:21-jdk-slim
ARG JAR_FILE=target/petcare-0.0.1.jar
COPY ${JAR_FILE} app_petcare.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app_petcare.jar"]
LABEL authors="7"

