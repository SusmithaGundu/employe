FROM openjdk:11
ADD /target/Employe-0.0.1-SNAPSHOT.jar Employe-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "Employe-0.0.1-SNAPSHOT.jar"]
