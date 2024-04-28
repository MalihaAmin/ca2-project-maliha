FROM openjdk:17
WORKDIR /usr/src/app
COPY ./pom.xml ./
COPY ./src ./src


# Install Maven
RUN wget -q "https://archive.apache.org/dist/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz" && \
    tar -xzf "apache-maven-$MAVEN_VERSION-bin.tar.gz" && \
    rm "apache-maven-$MAVEN_VERSION-bin.tar.gz" && \
    mv "apache-maven-$MAVEN_VERSION" "$MAVEN_HOME" && \
    ln -s "$MAVEN_HOME/bin/mvn" /usr/bin/mvn


# Expose the port
EXPOSE 22137

# Command to run the application
CMD ["mvn", "spring-boot:run"]