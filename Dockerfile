FROM openjdk:11
COPY /target/rabbitProduce-0.0.1-SNAPSHOT.jar backend_produce.jar
CMD ["java", "-jar", "backend_produce.jar"]