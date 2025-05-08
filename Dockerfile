FROM openjdk:21-jdk-slim
WORKDIR /app
COPY .mvn/ .mvn/
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY . .
RUN ./mvnw package -DskipTests
EXPOSE 8080
CMD ["java", "-jar", "target/ecommerce-0.0.1-SNAPSHOT.jar"]