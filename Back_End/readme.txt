1. execute: mvnw spring-boot:run
 - This will compile and run the web service using the properties defined in application.properties (located in src/main/resources).

4. It can be accessed on http://localhost:8080
 - 22137 can be changed in /config/config.json property "exposedPort"
 - The following 4sample microservices have been implemented:
	-- Test app works:  	(GET) /
	-- Get all recipes: 	(GET) /recipes
	-- Add recipe: 		(POST) /recipe
	-- Delete recipe: 	(DELETE) /recipe/{name}
