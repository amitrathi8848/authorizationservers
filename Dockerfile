FROM openjdk:17-alpine
RUN mkdir -p /opt/app
ENV PROJECT_HOME /opt/app
COPY target/authorizationserver.jar $PROJECT_HOME/authorizationserver.jar
WORKDIR $PROJECT_HOME
CMD ["java" ,"-jar","./authorizationserver.jar"]