# **NimapMT - Spring Boot Project**

## **Introduction**

This Spring Boot project demonstrates CRUD operations for **Categories** and **Products**, including server-side pagination and establishing a one-to-many relationship between categories and products. Additionally, the project is tested using **Postman** to ensure seamless API functionality.

---

## **Steps to Run the Project**

### **Step 1: Create a Spring Boot Project**

- Use **Spring Initializr** or your preferred IDE.
- Include the following dependencies:
  - **Spring Web**
  - **Spring Data JPA**
  - **MySQL Driver**
  - **Spring Boot DevTools**
  - **Hibernate**

2.Step  Set up application.properties to connect with MySQL or H2 for testing.


3.Step Create Category and Product Entities - Define Category and Product entities.


4.Step  Create Repository Interfaces - Set up repository interfaces for Category and Product.


5.Step Create Controller for CRUD Operations - Create a controller for performing Create, Read, Update, Delete operations for both categories and products.


6.Step Implement Server-Side Pagination - Implement pagination for fetching categories and products.


7.Step Fetch Product with Category Details - Ensure products are linked to their categories and can be fetched together


8.Step  Testing with Postman.

Postman Testing:
Use Postman to test the following endpoints for Categories and Products.



# Categories Endpoints:

1.POST - create a new category
URL: http://localhost:8080/api/categories
Method: POST

2.GET all the categories
URL: http://localhost:8080/api/categories
Method: GET


3.GET all the categories
URL: http://localhost:8080/api/categories/1
Method: GET


4 . PUT - update category by id
URL: http://localhost:8080/api/categories/1
Method:PUT

5 . Delete category By ID
URL: http://localhost:8080/api/categories/1
Method: DELETE


# Products Endpoints:

1.POST - create a new product
URL: http://localhost:8080/api/products
Method: POST

2.GET all the products
URL: http://localhost:8080/api/products
Method: GET

3.GET product by Id
URL: http://localhost:8080/api/products/1
Method: Get


4.PUT - update product by id
URL: http://localhost:8080/api/products/1
Method: PUT

5.DELETE - Delete product by id
URL: http://localhost:8080/api/products/1
Method: DELETE

---

### **Step 2: Configure the Database**

- Update the `application.properties` file to connect to your **MySQL** or **H2** database.
- Example configuration:
  ```properties
  spring.application.name=nimapmt
   H2 Database Configuration
  spring.datasource.username=sa
  spring.datasource.password=password
  spring.datasource.driverClassName=org.h2.Driver
  # Hibernate Configuration
  spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true

  # Enable H2 Console (optional)
  spring.h2.console.enabled=true
  spring.h2.console.path=/h2-console
  spring.datasource.url=jdbc:h2:mem:testdb
  logging.level.org.springframework=DEBUG

  spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
  spring.datasource.username=your_username
  spring.datasource.password=your_password
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true
  spring.jpa.properties.hibernate.format_sql=true
