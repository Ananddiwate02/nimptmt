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

---

### **Step 2: Configure the Database**

- Update the `application.properties` file to connect to your **MySQL** database.
- Example configuration:
  ```properties
  spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
  spring.datasource.username=your_username
  spring.datasource.password=your_password
  spring.jpa.hibernate.ddl-auto=update
  spring.jpa.show-sql=true
  spring.jpa.properties.hibernate.format_sql=true
