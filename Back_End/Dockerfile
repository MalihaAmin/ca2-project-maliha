FROM openjdk:17

# Set environment variables for Maven installation
ENV MAVEN_VERSION 3.8.4
ENV MAVEN_HOME /usr/share/maven
ENV MAVEN_OPTS="-Xms256m -Xmx512m"


# Install Maven
RUN wget -q "https://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz" && \
    tar -xzf "apache-maven-$MAVEN_VERSION-bin.tar.gz" && \
    rm "apache-maven-$MAVEN_VERSION-bin.tar.gz" && \
    mv "apache-maven-$MAVEN_VERSION" "$MAVEN_HOME" && \
    ln -s "$MAVEN_HOME/bin/mvn" /usr/bin/mvn

# Set the working directory and copy files
WORKDIR /usr/src/app
COPY ./pom.xml ./
COPY ./src ./src


# Expose the port
EXPOSE 22137

# Command to run the application
CMD ["mvn", "spring-boot:run"]