#define base image
FROM openjdk:17

#create a new app directory for application files
RUN mkdir /app

#copy files from host image into image filesystem
COPY out/production/DockerPractice/ /app

#set directory for executing future commands
WORKDIR /app

#Run main class
CMD java Main