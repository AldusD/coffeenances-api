FROM eclipse-temurin:17-jdk-alpine

VOLUME /tmp

COPY . .

RUN ./mvnw clean compile

ENTRYPOINT ["java","-jar","/app.jar"]