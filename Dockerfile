FROM openjdk:8
EXPOSE 8080
ADD target/spring-jenkin.jar spring-jenkin.jar
ENTRYPOINT ["java","-jar","/spring-jenkin.jar"]