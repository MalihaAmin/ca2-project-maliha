FROM openjdk:17
WORKDIR /usr/src/app
COPY ./pom.xml ./
COPY ./src ./src


# Install Maven
RUN sudo apt install -y maven


# Expose the port
EXPOSE 22137

# Command to run the application
CMD ["mvn", "spring-boot:run"]