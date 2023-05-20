FROM openjdk:17.0.1-jdk-slim

WORKDIR /app

COPY build.gradle .
COPY settings.gradle .
COPY gradlew .
COPY gradle/ gradle/
COPY src/ src/

RUN chmod +x gradlew
RUN ./gradlew build

CMD ["java", "-jar", "build/libs/your-jar-file.jar"]