FROM openjdk:17

# Set the working directory and copy files
WORKDIR /usr/src/app
COPY ./pom.xml ./
COPY ./src ./src

# Set environment variables for Maven installation
ENV MAVEN_VERSION 3.8.4
ENV MAVEN_HOME /usr/share/maven
ENV MAVEN_OPTS="-Xms256m -Xmx512m"

# Download and install Maven
RUN mkdir -p $MAVEN_HOME && \
    curl -fsSL -o /tmp/apache-maven.tar.gz "https://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz" && \
    tar -xzf /tmp/apache-maven.tar.gz -C $MAVEN_HOME --strip-components=1 && \
    rm /tmp/apache-maven.tar.gz && \
    ln -s $MAVEN_HOME/bin/mvn /usr/bin/mvn

# Expose the port
EXPOSE 22137

# Command to run the application
CMD ["mvn", "spring-boot:run"]