FROM java:8
COPY target/filme-flix-movie-api-0.0.1-SNAPSHOT.jar filme-flix-movie-api.jar
ENTRYPOINT ["java","-jar","filme-flix-movie-api.jar"]