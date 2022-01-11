FROM openjdk:11
ADD target/*.jar  springboot.jar 
ENTRYPOINT ["java", "-jar" , "springboot.jar "]