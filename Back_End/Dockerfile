FROM openjdk:17

# Set the working directory and copy files
WORKDIR /usr/src/app
COPY ./pom.xml ./
COPY ./src ./src

# Install wget and tar
RUN apt-get update && apt-get install -y wget tar

# Install Maven
RUN wget -q "https://archive.apache.org/dist/maven/maven-3/3.8.4/binaries/apache-maven-3.8.4-bin.tar.gz" && \
    tar -xzf "apache-maven-3.8.4-bin.tar.gz" && \
    rm "apache-maven-3.8.4-bin.tar.gz" && \
    mv "apache-maven-3.8.4" "/usr/share/maven" && \
    ln -s "/usr/share/maven/bin/mvn" /usr/bin/mvn

# Expose the port
EXPOSE 22137

# Command to run the application
CMD ["mvn", "spring-boot:run"]