#   nimapmt
Spring Boot Project
Introduction:
This document outlines the steps to set up and run a Spring Boot project that performs CRUD operations on Categories and Products, including testing with Postman. The project also demonstrates server-side pagination and linking of products with categories.

# Steps to Run the Code:
1.Step 1: Create a Spring Boot project using Spring Initializr or your preferred IDE.
Dependencies:
oSpring Web
oSpring Data JPA
oMySQL Driver
oSpring Boot DevTools
oHibernate
2.Step 2: Set up application.properties to connect with MySQL or H2 for testing.
3.Step 3:Create Category and Product Entities - Define Category and Product entities.
4.Step 4: Create Repository Interfaces - Set up repository interfaces for Category and Product.
5.Step 5:Create Controller for CRUD Operations - Create a controller for performing Create, Read, Update, Delete operations for both categories and products.
6.Step 6: Implement Server-Side Pagination - Implement pagination for fetching categories and products.
7.Step 7:Fetch Product with Category Details - Ensure products are linked to their categories and can be fetched together
8.Step 8: Testing with Postman.

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
