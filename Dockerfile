FROM maven:3.6.3-adoptopenjdk-11

COPY pom.xml ./project/pom.xml
RUN mvn -B dependency:go-offline -f ./project/pom.xml
COPY /src/ ./project/src/
WORKDIR ./project/
RUN mvn clean install

FROM openjdk:11-jdk-slim
COPY --from=0 ./project/target/api-0.0.1-SNAPSHOT.jar ./target/api-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:9000","./target/api-0.0.1-SNAPSHOT.jar"]
