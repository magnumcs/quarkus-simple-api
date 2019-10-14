# init-quarkus
The project: https://quarkus.io/

This is a simple code for learning Quarkus with Rest-API and persistence in Postgres DB.

You will need:

- An IDE;

- JDK 1.8+ installed with JAVA_HOME configured appropriately;

- Apache Maven 3.5.3+

- H2.

# Extensions used
- quarkus-hibernate-orm-panache
- quarkus-resteasy-jackson

A quick guide for installing extensions in Quarkus:

- https://quarkus.io/extensions/

# Commands
- Add a new extension
```
./mvnw quarkus:add-extension -Dextensions="jdbc-h2"
```
- Run and compile on dev mode

```
./mvnw compile quarkus:dev
```