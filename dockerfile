FROM java:8
EXPOSE 8086
ADD /target/Course-1.0.jar Course.jar
ENTRYPOINT [ "java", "-jar" , "Course.jar"]