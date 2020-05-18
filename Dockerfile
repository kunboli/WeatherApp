FROM openjdk:8
ADD target/docker-weather-app.jar docker-weather-app.jar
EXPOSE 8181
ENTRYPOINT ["java", "-jar", "docker-weather-app.jar"]