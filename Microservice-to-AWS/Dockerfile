# Use a base image with OpenJDK Java 11 installed
FROM  openjdk:21

# Set the working directory in the container
WORKDIR /app

# Copy the packaged jar file into the container at /app
COPY target/Microservice-to-AWS-0.0.1-SNAPSHOT.jar /app/Microservice-to-AWS-0.0.1-SNAPSHOT.jar

# Expose the port that your application runs on
EXPOSE 8080

# Specify the command to run your application
CMD ["java","-jar","Microservice-to-AWS-0.0.1-SNAPSHOT.jar"]
