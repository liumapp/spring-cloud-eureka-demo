# eureka-demo
A demo for spring cloud eureka .

the project is under coding , plz don't use right now .

## how to use

* start eureka-demo-server

* open browser and visit http://localhost:1234 , this is the pannel of Eureka server.

* start eureka-demo-client

* open browser and visit http://localhost:8080

* Now you can find the client info in Eureka server pannel. 

### documents

#### get admin page

* mvn install

* cd backend/web/target

* java -jar web-1.0.0-SNAPSHOT.jar

* open your browser and look for http://localhost:8080 , you will find backend page.

#### get frontend page

* mvn install (only onced should be enough)

* cd frontend/web/target

* java -jar web-1.0.0-SNAPSHOT.jar

* open your browser and look for http://localhost:8080 , you will find frontend page.

### Something else

* if you want a simple module project , plz view my another git repository [SpringBootMavenArchetype](https://github.com/liumapp/SpringBootMavenArchetype)