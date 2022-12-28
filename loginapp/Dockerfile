FROM openjdk:8-jdk-alpine
MAINTAINER baeldung.com
COPY target/loginapp-0.0.1-SNAPSHOT.jar loginapp-0.0.1-SNAPSHOT.jar
EXPOSE 8090
ENTRYPOINT ["java", "-jar", "/loginapp-0.0.1-SNAPSHOT.jar", "--spring.datasource.url=dbc:mysql://$MYSQL:3306/login_app"]