FROM openjdk:11
ADD /target/messaging-rabbitmq-0.0.1-SNAPSHOT.jar backend_produce.jar
ENTRYPOINT ["java", "-jar", "backend_produce.jar"]