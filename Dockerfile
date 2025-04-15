# Build stage
FROM maven:3.8.5-openjdk-21-slim AS build
WORKDIR /app
COPY . .
RUN mvn clean install -DskipTests

# Run stage
FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
