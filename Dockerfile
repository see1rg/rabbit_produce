FROM openjdk:11
ADD /target/rabbitProduce-0.0.1-SNAPSHOT.jar backend_produce.jar
ENTRYPOINT ["java", "-jar", "backend_produce.jar"]