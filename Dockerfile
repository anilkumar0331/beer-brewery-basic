FROM eclipse-temurin:21-jdk-alpine
WORKDIR /app
COPY target/beer-brewery-basic.jar beer-brewery-basic.jar
EXPOSE 8080
CMD ["java", "-jar", "beer-brewery-basic.jar"]