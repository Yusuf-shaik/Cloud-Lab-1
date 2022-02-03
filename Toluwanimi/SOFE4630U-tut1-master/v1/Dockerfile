#use the OpenJDK 11 image
FROM openjdk:14

#create a new app directory for my application files
RUN mkdir /app

COPY out/production/HelloWorldDocker/ /app

WORKDIR /app

CMD java Main