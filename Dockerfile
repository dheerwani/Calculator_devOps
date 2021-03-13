FROM openjdk:8
COPY ./target/calculatorDevOps-1.0-SNAPSHOT-jar-with-dependencies.jargit  ./
WORKDIR ./
CMD ["java", "-cp", "calculatorDevOps-1.0-SNAPSHOT-jar-with-dependencies.jar", "Calculator"]