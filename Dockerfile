FROM eclipse-temurin:21-jdk-jammy
WORKDIR /app
COPY target/micro-services-day-1-eureka-server-sample-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","app.jar"]
