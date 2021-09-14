FROM openjdk:11
COPY "/target/spring-boot-docker.jar" "app.jar"
EXPOSE 9095
ENTRYPOINT [ "java", "-jar", "app.jar" ]
