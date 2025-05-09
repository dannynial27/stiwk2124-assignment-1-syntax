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
| 1. | <div align="center">KU HAZWAN BIN KU IZHAM</div>      | <div align="center">289889</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 19 - 8442357</div> | <div align="center"><img src="IMAGELINK" alt="IMAGE DESCRIPTION" width="100px"></div> |
| 2. | <div align="center">NILAM MUHAMMAD AZRILLUQMAN BIN JAAFAR</div>      | <div align="center">296015</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 19 -7273725</div> | <div align="center"><img src="IMAGELINK" alt="IMAGE DESCRIPTION" width="100px"></div> |
| 3. | <div align="center">HANA CAROLINA ISMAIL</div>      | <div align="center">289843</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 11 - 37971062</div> | <div align="center"><img src="IMAGELINK" alt="IMAGE DESCRIPTION" width="100px"></div> 
| 4. | <div align="center">ISKANDAR AZIMAN BIN SAIPUL AZWAN</div>      | <div align="center">284425</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 17-9503627</div> | <div align="center"><img src="IMAGELINK"  alt="IMAGE DESCRIPTION" width="100px"></div> |
| 5. | <div align="center">LIM JUN WEI</div>      | <div align="center">293142</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 10 - 709 3853</div> | <div align="center"><img src="https://github.com/user-attachments/assets/b42499b1-c04f-462b-a3f6-cac57ec04a7c" alt="LIM JUN WEI ()" width="100px"></div> |
| 6. | <div align="center">MUHAMMAD DANIAL BIN MOHD FARIS</div> | <div align="center">294692</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 12 - 451 6452</div> | <div align="center"><img src="https://github.com/user-attachments/assets/13415d47-f128-427e-842d-fc8b3a27a858" alt="MUHAMMAD DANIAL BIN MOHD FARIS (294692)" width="100px"></div> |
| 7. | <div align="center">SHARWIN A/L PARAMESWARAN</div>       | <div align="center">295026</div> | <div align="center">MEMBER</div> | <div align="center">(+60) 12 - 647 1786</div> | <div align="center"><img src="https://github.com/user-attachments/assets/8ef08b3b-4ea3-4b53-88fb-fcddd9eb182a" alt="SHARWIN A/L PARAMESWARAN (295026)" width="100px"></div> |

## Title of your application (a unique title) : QurbaMart: E-commerce Platform for Qurba Food Industries

## Abstract (in 300 words)
   1.Introduction

QurbaMart is a Spring Boot-based e-commerce platform designed to digitize the operations of Qurba Food Industries, a Malaysian Bumiputera-owned company established in 2007, specializing in food products. The application addresses the need for an efficient online system to manage users, roles, products, and categories, enabling seamless CRUD operations through a RESTful API. The backend leverages Spring Boot with Spring Data JPA for data persistence, supporting MySQL for production and H2 for development. The database schema includes tables for users, roles, products, and categories, with sample data to simulate real-world scenarios. Git and GitHub ensure version control, while Maven manages dependencies. Docker containerizes the application and MySQL database, facilitating scalable deployment, with the Docker image hosted on Docker Hub. The methodology involves designing a relational database, developing a layered Spring Boot architecture (model, repository, service, controller), and deploying the application using Docker Compose. The application was tested using Postman, confirming successful CRUD operations. Results demonstrate a functional REST API, accessible at http://localhost:8080, with endpoints for managing e-commerce entities. The containerized deployment ensures portability and scalability. QurbaMart addresses the problem of manual processes in traditional commerce by providing a robust digital platform, enhancing operational efficiency and customer reach. The main objective is to streamline Qurba Food Industries’ product management and user administration. In conclusion, QurbaMart offers a scalable, maintainable solution for e-commerce, with potential for future enhancements like user authentication and payment integration. The project showcases the application of modern backend technologies to solve real-world business challenges, aligning with the digital transformation goals of small and medium enterprises in the food industry.

   2. Background

Qurba Food Industries, established in 2007, is a fully Bumiputera-owned company based in Jitra, Kedah, Malaysia. Registered as Qurba Food Manufacturing Sdn. Bhd. in 2011, it specializes in producing food products such as beverages, snacks, and desserts. Operating from a fixed location at Lot Industri KEDA Napoh, the company has traditionally relied on physical sales channels. With the rapid growth of e-commerce and the increasing demand for digital solutions in the food industry, there is a pressing need for an online platform to manage products, users, and categories efficiently. The absence of a digital system limits scalability, customer reach, and operational efficiency. QurbaMart, a Spring Boot-based e-commerce platform, was developed to address these challenges by providing a robust backend for managing e-commerce operations, enabling Qurba Food Industries to transition into the digital marketplace.

   3. Problem Statement (from article)

Qurba Food Industries relies on manual or semi-automated processes for product management, user administration, and sales, which are time-consuming, error-prone, and inefficient. The lack of an online platform restricts the company’s ability to reach a broader customer base, manage inventory effectively, and streamline operations. Without a digital system, tracking user roles (e.g., admin, seller, customer) and product categories is challenging, leading to operational bottlenecks. Additionally, the absence of a scalable e-commerce solution hinders competitiveness in the digital marketplace, where consumers increasingly prefer online purchasing. There is a critical need for a robust, automated platform to manage e-commerce operations, improve customer experience, and enhance operational efficiency for Qurba Food Industries.

   4. Main objective
   5. Methodology
   6. Result
   7. Conclusion

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
curl -X POST http://localhost:8080/api/categories -H "Content-Type: application/json" -d "{\"name\":\"Books\",\"description\":\"All types of books\"}"
```

**Update Category by ID (PUT) :**

```
curl -X PUT http://localhost:8080/api/categories/1 -H "Content-Type: application/json" -d "{\"name\":\"Updated Category\",\"description\":\"Updated description\"}"
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

## Instructions on how to run the Docker.

## link for the YouTube Presentation

## Result/Output (Screenshot of the output)

## References (Not less than 10)

