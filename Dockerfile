FROM openjdk:8
ADD ./target/catalog-service.jar catalog-service.jar
EXPOSE 9001
ENTRYPOINT ["java","-jar","catalog-service.jar"]                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
