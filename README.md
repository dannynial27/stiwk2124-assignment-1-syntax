[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/hxK3I8pK)
## Requirements for Assignment #1
[Read the instruction](https://github.com/STIWK2124-A242/class-activity-stiwk2124/blob/main/Assignment-1.md)

## WhatsApp Group

[Join WhatsApp Group](https://chat.whatsapp.com/Jo1tFcRylPiKKuvdmfthuh)

## Group Info:
1. Matric Number & Name & Photo & Phone Number
1. Mention who the leader is.
1. Other related info (if any)

|    |                          NAME                            |           MATRIC NUMBER          |              MEMBER DESCRIPTION | PHONE NUMBER          | PICTURE           |
| -- | -------------------------------------------------------- | -------------------------------- | ------------------------------ | --------------------- | ----------------- |
| 1. | <div align="center">KU HAZWAN BIN KU IZHAM</div>      | <div align="center">289889</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 19 - 8442357</div> | <div align="center"><img src="https://github.com/user-attachments/assets/d04db7fe-e7dd-4228-bb19-3ac3ad2394c5" alt="KU HAZWAN BIN KU IZHAM (289889)" width="100px"></div> |
| 2. | <div align="center">NILAM MUHAMMAD AZRILLUQMAN BIN JAAFAR</div>      | <div align="center">296015</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 19 -7273725</div> | <div align="center"><img src="IMAGELINK" alt="IMAGE DESCRIPTION" width="100px"></div> |
| 3. | <div align="center">HANA CAROLINA ISMAIL</div>      | <div align="center">289843</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 11 - 37971062</div> | <div align="center"><img src="IMAGELINK" alt="IMAGE DESCRIPTION" width="100px"></div> 
| 4. | <div align="center">ISKANDAR AZIMAN BIN SAIPUL AZWAN</div>      | <div align="center">284425</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 17-9503627</div> | <div align="center"><img src="https://github.com/user-attachments/assets/5561bd75-6693-49ce-a5c4-03fae002d8da"  alt="ISKANDAR AZIMAN BIN SAIPUL AZWAN (284425)" width="100px"></div> |
| 5. | <div align="center">LIM JUN WEI</div>      | <div align="center">293142</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 10 - 709 3853</div> | <div align="center"><img src="https://github.com/user-attachments/assets/b42499b1-c04f-462b-a3f6-cac57ec04a7c" alt="LIM JUN WEI ()" width="100px"></div> |
| 6. | <div align="center">MUHAMMAD DANIAL BIN MOHD FARIS</div> | <div align="center">294692</div> | <div align="center">LEADER</div> | <div align="center">(+60) 12 - 451 6452</div> | <div align="center"><img src="https://github.com/user-attachments/assets/13415d47-f128-427e-842d-fc8b3a27a858" alt="MUHAMMAD DANIAL BIN MOHD FARIS (294692)" width="100px"></div> |
| 7. | <div align="center">SHARWIN A/L PARAMESWARAN</div>       | <div align="center">295026</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 12 - 647 1786</div> | <div align="center"><img src="https://github.com/user-attachments/assets/8ef08b3b-4ea3-4b53-88fb-fcddd9eb182a" alt="SHARWIN A/L PARAMESWARAN (295026)" width="100px"></div> |

## Title of your application (a unique title) : QurbaMart : E-commerce Platform for Qurba Food Industries

## Abstract (in 300 words)

1. **Introduction**

   **QurbaMart** is a Spring Boot-based e-commerce platform designed to digitize the operations of **Qurba Food Industries**, a Malaysian Bumiputera-owned company established in 2007, specializing in food products. The application addresses the need for an efficient online system to manage users, roles, products, and categories, enabling seamless CRUD operations through a RESTful API.

   The backend leverages **Spring Boot** with **Spring Data JPA** for data persistence, supporting **MySQL** for production and **H2** for development. The database schema includes tables for users, roles, products, and categories, with sample data to simulate real-world scenarios. **Git** and **GitHub** ensure version control, while **Maven** manages dependencies.

   **Docker** containerizes the application and MySQL database, facilitating scalable deployment, with the Docker image hosted on Docker Hub. The methodology involves designing a relational database, developing a layered Spring Boot architecture (model, repository, service, controller), and deploying the application using Docker Compose. The application was tested using **Postman**, confirming successful CRUD operations.

   Results demonstrate a functional REST API, accessible at `http://localhost:8080`, with endpoints for managing e-commerce entities. The containerized deployment ensures portability and scalability. QurbaMart addresses the problem of manual processes in traditional commerce by providing a robust digital platform, enhancing operational efficiency and customer reach.

   The main objective is to streamline Qurba Food Industries’ product management and user administration. In conclusion, QurbaMart offers a scalable, maintainable solution for e-commerce, with potential for future enhancements like user authentication and payment integration. The project showcases the application of modern backend technologies to solve real-world business challenges, aligning with the digital transformation goals of small and medium enterprises in the food industry.

---

2. **Background**

   Qurba Food Industries, established in 2007, is a fully Bumiputera-owned company based in Jitra, Kedah, Malaysia. Registered as **Qurba Food Manufacturing Sdn. Bhd.** in 2011, it specializes in producing food products such as beverages, snacks, and desserts.

   Operating from a fixed location at Lot Industri KEDA Napoh, the company has traditionally relied on physical sales channels. With the rapid growth of e-commerce and the increasing demand for digital solutions in the food industry, there is a pressing need for an online platform to manage products, users, and categories efficiently.

   The absence of a digital system limits scalability, customer reach, and operational efficiency. **QurbaMart**, a Spring Boot-based e-commerce platform, was developed to address these challenges by providing a robust backend for managing e-commerce operations, enabling Qurba Food Industries to transition into the digital marketplace.

---

3. **Problem Statement**

   Qurba Food Industries relies on manual or semi-automated processes for product management, user administration, and sales, which are time-consuming, error-prone, and inefficient.

   The lack of an online platform restricts the company’s ability to:

   - Reach a broader customer base
   - Manage inventory effectively
   - Streamline operations

   Without a digital system, tracking user roles (e.g., admin, seller, customer) and product categories is challenging, leading to operational bottlenecks. Additionally, the absence of a scalable e-commerce solution hinders competitiveness in the digital marketplace. There is a critical need for a robust, automated platform to:

   - Manage e-commerce operations
   - Improve customer experience
   - Enhance operational efficiency

---

4. **Main Objective**

   - Develop a Spring Boot-based e-commerce platform for Qurba Food Industries  
   - Enable efficient management of users, roles, products, and categories  
   - Provide comprehensive CRUD functionality via a RESTful API  
   - Support containerized deployment using Docker  
   - Ensure scalability and maintainability of the application  
   - Streamline product and user management through digitization  
   - Enhance customer reach and engagement  
   - Contribute to the company’s digital transformation in the competitive food industry  

---

5. **Methodology**

   The development of QurbaMart followed a structured approach:

   - **Database Design**: Designed a relational database with four tables: `user`, `role`, `product`, and `category`. SQL scripts (`create_and_insert.sql`) were created for schema definition and inserting three sample records per table. **MySQL** was used for production, and **H2** was used for development. Configuration was set in `application.properties`.
   
   - **Application Development**: Developed a Spring Boot application using **Maven** for dependency management. The codebase was organized into layers:
     - **Model**: entity classes
     - **Repository**: JPA interfaces
     - **Service**: business logic
     - **Controller**: REST endpoints
     CRUD operations were implemented for all entities, accessible via endpoints like `/api/products` and `/api/users`. **IntelliJ IDEA** was used for coding, testing, and debugging.

   - **Version Control**: A **Git** repository was initialized and hosted on **GitHub**, with changes committed regularly. The project adhered to the specified folder structure (`src`, `sql`, etc.).

   - **Containerization**: A `Dockerfile` was created to build a Docker image of the Spring Boot application. A `docker-compose.yml` file was used to orchestrate the application and MySQL containers. The Docker image was pushed to **Docker Hub** for public access.

   - **Testing**: CRUD operations were tested using **Postman**. Database connectivity was validated with both **H2** and **MySQL**. The deployment was tested with `docker-compose up` to ensure proper containerized deployment.

---

6. **Result**

   QurbaMart achieved the following outcomes:

   - **REST API**: A fully functional REST API with endpoints for managing users, roles, products, and categories (e.g., `GET /api/products`, `POST /api/users`). All endpoints were tested successfully using Postman.
   
   - **Database**: A relational database with sample data, accessible via **H2** for development and **MySQL** for production, ensuring data persistence.
   
   - **Containerization**: A Docker image (`yourdockerhubusername/qurba-ecommerce`) hosted on Docker Hub, with the `docker-compose.yml` file enabling seamless deployment of the application and MySQL database.
   
   - **Version Control**: All source code, SQL scripts, and Docker configurations were hosted on **GitHub**, adhering to the specified folder structure.
   
   - **Testing**: Postman tests confirmed successful CRUD operations, with screenshots included in the README for documentation.
   
   - **Deployment**: The application is accessible at `http://localhost:8080`, with Docker ensuring portability and scalability across environments.

---

7. **Conclusion**

   QurbaMart successfully addresses the digital transformation needs of Qurba Food Industries by providing a scalable and maintainable e-commerce platform. The Spring Boot application, with its RESTful API and containerized deployment, streamlines product and user management, overcoming the inefficiencies of manual processes.

   Leveraging modern technologies like **Spring Boot**, **Docker**, and **Git**, the project demonstrates robustness, portability, and flexibility. It showcases the practical application of backend development principles, offering a replicable model for small and medium enterprises (SMEs) transitioning to the digital economy.

   **Future Enhancements**:

   - User authentication
   - Payment gateway integration
   - Frontend interface for end users

   **QurbaMart** aligns with the digital transformation goals of the food industry, positioning **Qurba Food Industries** for growth in the competitive e-commerce landscape.


## Spring Boot Project

```
Select:

Project: Maven
Language: Java
Spring Boot: 3.x (latest)
Group: com.assignment1
Artifact: ecommerce
Name: ecommerce
Description: A Spring Boot application for managing e-commerce data with CRUD operations
Package name: com.assignment1.ecommerce
Dependencies:
         Spring Web
         Spring Data JPA
         MySQL Driver
         H2 Database
         Spring Boot DevTools
         Lombok
```

## API Endpoints Documentation

### 🔹 **Users**

#### List of Endpoints

| Method | Endpoint            | Description             |
|--------|---------------------|-------------------------|
| GET    | /api/users          | Get all users           |
| GET    | /api/users/{id}     | Get user by ID          |
| POST   | /api/users          | Create new user         |
| PUT    | /api/users/{id}     | Update existing user    |
| DELETE | /api/users/{id}     | Delete user by ID       |

#### cURL Commands

| Action                        | cURL Command                                                                                      |
|------------------------------|----------------------------------------------------------------------------------------------------|
| Get All Users (GET)          | `curl http://localhost:8080/api/users`                                                             |
| Get User by ID (GET)         | `curl http://localhost:8080/api/users/{user id}`                                                   |
| Create New User (POST)       | `curl -X POST http://localhost:8080/api/users -H "Content-Type: application/json" -d "{\"name\":\"{user name}\",\"email\":\"{user email}\",\"password\":\"{user password}\",\"roleId\":{role id}}` |
| Update User by ID (PUT)      | `curl -X PUT http://localhost:8080/api/users/{user id} -H "Content-Type: application/json" -d "{\"name\":\"{updated name}\",\"email\":\"{updated email}\",\"password\":\"{updated password}\",\"roleId\":{updated role id}}` |
| Delete User by ID (DELETE)   | `curl -X DELETE http://localhost:8080/api/users/{user id}`                                         |

#### Placeholders

- `{user id}`: ID of the user
- `{user name}`, `{user email}`, `{user password}`: User credentials
- `{role id}`: ID from the roles table

#### Sample Commands

**Get All Users (GET) :**

```
curl http://localhost:8080/api/users
```

**Get User by ID (GET) :**

```
curl http://localhost:8080/api/users/1
```

**Create New User (POST) :**

```
curl -X POST http://localhost:8080/api/users -H "Content-Type: application/json" -d "{\"name\":\"Jane Doe\",\"email\":\"jane@example.com\",\"password\":\"secure123\",\"roleId\":3}"
```

**Update User by ID (PUT) :**

```
curl -X PUT http://localhost:8080/api/users/1 -H "Content-Type: application/json" -d "{\"name\":\"Updated Name\",\"email\":\"updated@example.com\",\"password\":\"newpass\",\"roleId\":2}"
```

**Delete User by ID (DELETE) :**

```
curl -X DELETE http://localhost:8080/api/users/1
```

---

### 🔹 **Roles**

#### List of Endpoints

| Method | Endpoint            | Description             |
|--------|---------------------|-------------------------|
| GET    | /api/roles          | Get all roles           |
| GET    | /api/roles/{id}     | Get role by ID          |
| POST   | /api/roles          | Create new role         |
| PUT    | /api/roles/{id}     | Update existing role    |
| DELETE | /api/roles/{id}     | Delete role by ID       |

#### cURL Commands

| Action                        | cURL Command                                                                                      |
|------------------------------|----------------------------------------------------------------------------------------------------|
| Get All Roles (GET)          | `curl http://localhost:8080/api/roles`                                                             |
| Get Role by ID (GET)         | `curl http://localhost:8080/api/roles/{role id}`                                                   |
| Create New Role (POST)       | `curl -X POST http://localhost:8080/api/roles -H "Content-Type: application/json" -d "{\"name\":\"{role name}\",\"description\":\"{role description}\"}"` |
| Update Role by ID (PUT)      | `curl -X PUT http://localhost:8080/api/roles/{role id} -H "Content-Type: application/json" -d "{\"name\":\"{updated name}\",\"description\":\"{updated description}\"}"` |
| Delete Role by ID (DELETE)   | `curl -X DELETE http://localhost:8080/api/roles/{role id}`                                         |

#### Placeholders

- `{role id}`: ID of the role
- `{role name}`: Name of the role (e.g., ADMIN)
- `{role description}`: Description for the role

#### Sample Commands

**Get All Roles (GET) :**

```
curl http://localhost:8080/api/roles
```

**Get Role by ID (GET) :**

```
curl http://localhost:8080/api/roles/1
```

**Create New Role (POST) :**

```
curl -X POST http://localhost:8080/api/roles -H "Content-Type: application/json" -d "{\"name\":\"TEST_ROLE\",\"description\":\"A test role\"}"
```

**Update Role by ID (PUT) :**

```
curl -X PUT http://localhost:8080/api/roles/1 -H "Content-Type: application/json" -d "{\"name\":\"UPDATED_ROLE\",\"description\":\"Updated role description\"}"
```

**Delete Role by ID (DELETE) :**

```
curl -X DELETE http://localhost:8080/api/roles/1
```

---

### 🔹 **Categories**

#### List of Endpoints

| Method | Endpoint              | Description                |
|--------|-----------------------|----------------------------|
| GET    | /api/categories       | Get all categories         |
| GET    | /api/categories/{id}  | Get category by ID         |
| POST   | /api/categories       | Create new category        |
| PUT    | /api/categories/{id}  | Update existing category   |
| DELETE | /api/categories/{id}  | Delete category by ID      |

#### cURL Commands

| Action                             | cURL Command                                                                                      |
|------------------------------------|----------------------------------------------------------------------------------------------------|
| Get All Categories (GET)           | `curl http://localhost:8080/api/categories`                                                        |
| Get Category by ID (GET)           | `curl http://localhost:8080/api/categories/{category id}`                                          |
| Create New Category (POST)         | `curl -X POST http://localhost:8080/api/categories -H "Content-Type: application/json" -d "{\"name\":\"{category name}\",\"description\":\"{category description}\"}"` |
| Update Category by ID (PUT)        | `curl -X PUT http://localhost:8080/api/categories/{category id} -H "Content-Type: application/json" -d "{\"name\":\"{updated name}\",\"description\":\"{updated description}\"}"` |
| Delete Category by ID (DELETE)     | `curl -X DELETE http://localhost:8080/api/categories/{category id}`                               |

#### Placeholders

- `{category id}`: ID of the category
- `{category name}`, `{category description}`: Category details

#### Sample Commands

**Get All Categories (GET) :**

```
curl http://localhost:8080/api/categories
```

**Get Category by ID (GET) :**

```
curl http://localhost:8080/api/categories/1
```

**Create New Category (POST) :**

```
curl -X POST http://localhost:8080/api/categories -H "Content-Type: application/json" -d "{\"name\": \"Books\", \"description\": \"Books and literature\", \"products\": [{\"name\": \"Novel\", \"description\": \"Bestselling fiction novel\", \"price\": 14.99, \"stockQuantity\": 200, \"imageUrl\": \"novel.jpg\"}]}"
```

**Update Category by ID (PUT) :**

```
curl -X PUT http://localhost:8080/api/categories/3 -H "Content-Type: application/json" -d "{\"id\": 3, \"name\": \"Home & Kitchen\", \"description\": \"Updated home appliances and kitchenware\", \"products\": []}"
```

**Delete Category by ID (DELETE) :**

```
curl -X DELETE http://localhost:8080/api/categories/1
```

---

### 🔹 **Products**

#### List of Endpoints

| Method | Endpoint             | Description             |
|--------|----------------------|-------------------------|
| GET    | /api/products        | Get all products        |
| GET    | /api/products/{id}   | Get product by ID       |
| POST   | /api/products        | Create new product      |
| PUT    | /api/products/{id}   | Update existing product |
| DELETE | /api/products/{id}   | Delete product by ID    |

#### cURL Commands

| Action                            | cURL Command                                                                                           |
|-----------------------------------|---------------------------------------------------------------------------------------------------------|
| Get All Products (GET)            | `curl http://localhost:8080/api/products`                                                               |
| Get Product by ID (GET)           | `curl http://localhost:8080/api/products/{product id}`                                                  |
| Create New Product (POST)         | `curl -X POST http://localhost:8080/api/products -H "Content-Type: application/json" -d "{\"name\":\"{product name}\",\"description\":\"{product description}\",\"price\":{product price},\"stockQuantity\":{stock},\"imageUrl\":\"{image url}\",\"categoryId\":{category id}}` |
| Update Product by ID (PUT)        | `curl -X PUT http://localhost:8080/api/products/{product id} -H "Content-Type: application/json" -d "{\"name\":\"{updated name}\",\"description\":\"{updated description}\",\"price\":{updated price},\"stockQuantity\":{updated stock},\"imageUrl\":\"{updated image url}\",\"categoryId\":{updated category id}}` |
| Delete Product by ID (DELETE)     | `curl -X DELETE http://localhost:8080/api/products/{product id}`                                        |

#### Placeholders

- `{product id}`, `{product name}`, `{product description}`
- `{price}`, `{stock}`, `{image url}`, `{category id}`

#### Sample Commands

**Get All Products (GET) :**

```
curl http://localhost:8080/api/products
```

**Get Product by ID (GET) :**

```
curl http://localhost:8080/api/products/1
```

**Create New Product (POST) :**

```
curl -X POST http://localhost:8080/api/products -H "Content-Type: application/json" -d "{\"name\":\"Book A\",\"description\":\"Fiction novel\",\"price\":29.99,\"stockQuantity\":25,\"imageUrl\":\"book.jpg\",\"categoryId\":1}"
```

**Update Product by ID (PUT) :**

```
curl -X PUT http://localhost:8080/api/products/1 -H "Content-Type: application/json" -d "{\"name\":\"Updated Product\",\"description\":\"Updated description\",\"price\":49.99,\"stockQuantity\":40,\"imageUrl\":\"updated.jpg\",\"categoryId\":2}"
```

**Delete Product by ID (DELETE) :**
```
curl -X DELETE http://localhost:8080/api/products/1
```

## Link for Docker Image
[Docker Hub - telegram-bot](https://hub.docker.com/r/edison0208/ecommerce-app)

## Instructions on how to run the Docker.
1. Open the Docker Desktop
2. Clone / Download the github repository / Download ```docker-compose.yml``` from repository
3. Use the command to pull everything from docker :

```
docker pull edison0208/ecommerce-app:latest
```

4. Use the command to start :
```
docker-compose up -d
```

5. Use the application as needed
6. Use the command to close :

```
docker-compose down
```

## Link for the YouTube Presentation

## Result/Output (Screenshot of the output)

---

### Users

**Original Data:** 

```
http://localhost:8080/api/users
```

![Original Data](https://github.com/user-attachments/assets/58fbd6aa-18b2-44d5-884e-7d80d781265c)  
*Description: View original data.*

#### Get All Users (GET)  
![Get All Users](https://github.com/user-attachments/assets/e28fad2f-71db-4173-b071-bfde909ca4d3)
*Description: Retrieve all users in the system.*

#### Get User by ID (GET)  
![Get User by ID](https://github.com/user-attachments/assets/25490532-0f7f-4370-b8d4-0e2a5cafb36d)
*Description: Fetch details of a specific user based on the ID.*

#### Create New User (POST)  
![Create New User](https://github.com/user-attachments/assets/a59ce314-bda0-4cbd-8c80-b174c608e7ea)
*Description: Add a new user to the system.*

#### Update User by ID (PUT)  
![Update User by ID](https://github.com/user-attachments/assets/8a00736b-6286-4477-9c7f-5ce74695d6bc)
*Description: Modify an existing user's information using their unique ID.*

#### Delete User by ID (DELETE)  
![Delete User by ID](https://github.com/user-attachments/assets/6a7bac9a-84d7-430e-b68d-6076ce06ea82)
*Description: Remove a user from the system using their ID.*

---

### Roles

**Original Data:**  

```
http://localhost:8080/api/roles
```

![Original Data](https://github.com/user-attachments/assets/ca2440bc-2639-4273-9ef0-e4740da16c9d)  
*Description: View original data.*

#### Get All Roles (GET)  
![Get All Roles](https://github.com/user-attachments/assets/07e70fcb-6d02-4e87-a1df-5c5216c71dbe)
*Description: Retrieve a list of all roles in the system.*

#### Get Role by ID (GET)  
![Get Role by ID](https://github.com/user-attachments/assets/e860a67d-cab9-451f-a131-b44b5b20dde0)
*Description: Fetch details of a specific role using its ID.*

#### Create New Role (POST)  
![Create New Role](https://github.com/user-attachments/assets/09cf7740-747e-4922-a0ca-800991d3898d)
*Description: Add a new role to the system.*

#### Update Role by ID (PUT)  
![Update Role by ID](https://github.com/user-attachments/assets/18d74ee6-ce69-4f05-9fdd-393620260cf8)
*Description: Modify the details of a specific role using its ID.*

#### Delete Role by ID (DELETE)  
![Delete Role by ID](https://github.com/user-attachments/assets/5fc05792-1b1f-4383-bd46-d5b5280e903f)
*Description: Remove a role from the system using its ID.*

---

### Categories

**Original Data:**  

```
http://localhost:8080/api/categories
```

![Original Data](https://github.com/user-attachments/assets/361de248-2bc3-41c0-b63d-ffd338c8d21e)  
*Description: View original data.*

#### Get All Categories (GET)  
![Get All Categories](https://github.com/user-attachments/assets/3b72c11a-6cce-422a-87cd-f2f8eb5bdf59)
*Description: Retrieve a list of all categories.*

#### Get Category by ID (GET)  
![Get Category by ID](https://github.com/user-attachments/assets/57490df7-e308-4621-ad24-86b6ef8dc279)
*Description: Fetch a category's details using its ID.*

#### Create New Category (POST)  
![Create New Category](https://github.com/user-attachments/assets/652223e2-7350-443a-bfee-4b5e8f8a83c2)
*Description: Add a new category to the system.*

#### Update Category by ID (PUT)  
![Update Category by ID](https://github.com/user-attachments/assets/c3f254a3-24c2-48e6-936d-6c06fdbb9788)
*Description: Modify a specific category's details using its ID.*

#### Delete Category by ID (DELETE)  
![Delete Category by ID](https://github.com/user-attachments/assets/9aea985c-2b79-4ffc-a63b-3437d11b21aa)
*Description: Remove a category from the system using its ID.*

---

### Products

**Original Data:**  

```
http://localhost:8080/api/products
```

![Original Data](https://github.com/user-attachments/assets/a6a30c3b-b4c9-4f67-878b-4a89e43cf9bb)  
*Description: View original data.*

#### Get All Products (GET)  
![Get All Products](https://github.com/user-attachments/assets/3b11baca-a936-4e6f-90d0-8cdae2e27425)
*Description: Retrieve a list of all products.*

#### Get Product by ID (GET)  
![Get Product by ID](https://github.com/user-attachments/assets/c2e0de52-a97a-41e8-83d4-1c6d2f56c0dd)
*Description: Fetch a specific product's details using its ID.*

#### Create New Product (POST)  
![Create New Product](https://github.com/user-attachments/assets/27b55910-ee52-4875-85c1-866125cfbc0b)
*Description: Add a new product to the system.*

#### Update Product by ID (PUT)  
![Update Product by ID](https://github.com/user-attachments/assets/ca06d61d-8fda-4ffa-9510-c519786dd532)
*Description: Modify the details of a specific product using its ID.*

#### Delete Product by ID (DELETE)  
![Delete Product by ID](https://github.com/user-attachments/assets/daba8e7c-0f7b-475c-8348-762584c7cd46)
*Description: Remove a product from the system using its ID.*

---


## References (Not less than 10)

1. Baeldung, & Baeldung. (2024, February 14). Learn Spring Boot Series | Baeldung. Baeldung. https://www.baeldung.com/spring-boot
2. “Home.” (2025, February 27). Docker Documentation. https://docs.docker.com/
3. GitHub.com help documentation. (n.d.). GitHub Docs. https://docs.github.com/
4. H2 Database Engine. (n.d.). http://www.h2database.com/html/main.html
5. IntelliJ IDEA | Resources. (2021, June 1). JetBrains. https://www.jetbrains.com/idea/documentation/
6. Van Zyl, J., & Redmond, E. (2009, August 1). Maven Documentation – Maven. https://maven.apache.org/guides/
7. MySQL :: MySQL Documentation. (n.d.). https://dev.mysql.com/doc/
8. Java Documentation - Get started. (2023, January 31). Oracle Help Center. https://docs.oracle.com/en/java/
9. Postman: The world’s leading API platform | Sign up for free. (n.d.). Postman API Platform. https://www.postman.com/
10. Spring boot :: Spring boot. (n.d.). https://docs.spring.io/spring-boot/docs/current/reference/html/
11. Spring Data JPA :: Spring Data JPA. (n.d.). https://docs.spring.io/spring-data/jpa/docs/current/reference/html/
12. Porter, B., Van Zyl, J., & Lamy, O. (n.d.). Welcome to Apache Maven – Maven. https://maven.apache.org/
13. What is Docker? (n.d.). https://www.redhat.com/en/topics/containers/what-is-docker
14. GmbH, F. P. J. H. S. S. L. V. 2.-. 2. V. (n.d.). Spring Boot - tutorial. https://www.vogella.com/tutorials/SpringBoot/article.html
15. SudheeshGH. (n.d.). Azure Database for MySQL documentation. Microsoft Learn. https://learn.microsoft.com/en-us/azure/mysql/
