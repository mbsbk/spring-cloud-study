FROM java:8
VOLUME /tmp
ADD microservice-config-server-eureka-1.0-snapshot.jar app.jar
RUN bash -c 'touch /app.jar'
EXPOSE 8050
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]