Initial setup:

Download and install java 23
Set the environment variables for java
Download and install Apache Maven 3.9.9
Set the environment variables for Maven

Run the project (from Command Prompt terminal):

Pull the project
cd Klinikos_IS
(for first run or when config changes) mvn clean install -DskipTests or ./mvnw clean install -DskipTests
mvn spring-boot:run -DskipTests or ./mvnw spring-boot:run -DskipTests
http://localhost:8080
