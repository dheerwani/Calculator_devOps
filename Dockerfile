FROM openjdk:8
COPY ./target/mini_project-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-cp", "mini_project-1.0-SNAPSHOT.jar", "Mycalc"]