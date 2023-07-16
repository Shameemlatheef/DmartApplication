# DmartApplication
I have developed this REST API which is build on Maven an Stock  Application. This API performs all the fundamental CRUD operations .

This project is developed by me for Dmart assignemnts .
 # Functionalities
-   admin can enter data in stock,Product,Store location
-   admin can delete data in stock,Product,Store location
-   admin can update data in stock,Product,Store location
-  
-   


## Backend Work
-  Proper Exception Handling
-  Data Stored in the database(MySql)

-  ## Installation and Run
-  You can clone this repo and start the serve on localhost
-   Before running the API server, we should update the database config inside the application.properties file.
-   Update the port number, username and password as per our local database config.
-  #changing the server port
server.port=8088
#db specific properties
spring.datasource.url=jdbc:mysql://localhost:3306/sb201db
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.username=root
spring.datasource.password=4935
#ORM s/w specific properties
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

spring.mvc.pathmatch.matching-strategy = ANT_PATH_MATCHER
-   
# Tech Stacks
-   Java Core
-   Spring Data JPA
-   Spring Boot
-   Hibernate
-   Maven
-   MySql
