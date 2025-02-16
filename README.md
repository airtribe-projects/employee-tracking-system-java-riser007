# Employee Management System (EMS)

## Overview
The Employee Management System (EMS) is a **Spring Boot** application that provides CRUD operations for **Employees, Departments, and Projects**. It implements **OAuth2.0 & OpenID Connect (OIDC)** for authentication, caching, validation, and exception handling.

## Features
✅ **CRUD Operations** for Employees, Departments, and Projects  
✅ **OAuth2.0 & OIDC Authentication** (Okta/Auth0)  
✅ **Role-Based Access Control (RBAC)** (Admin, Manager, Employee)  
✅ **Spring Cache Implementation** (ConcurrentMapCacheManager, Redis optional)  
✅ **Error Handling & Input Validation**  
✅ **Unit & Integration Testing** using JUnit, Mockito & MockMvc  
✅ **Swagger API Documentation** (SpringDoc OpenAPI)  

## Technologies Used
- **Spring Boot 3.x**
- **Spring Security & OAuth2.0**
- **Spring Data JPA (MySQL/H2)**
- **Spring Cache (EhCache/Redis)**
- **JUnit 5, Mockito, MockMvc**
- **Swagger (SpringDoc OpenAPI)**

## Setup Instructions
### 1️⃣ Clone the Repository
```sh
git clone https://github.com/your-repo/employee-management-system.git
cd employee-management-system
```

### 2️⃣ Configure Database
Modify `src/main/resources/application.properties` with your **MySQL** or **H2** configuration:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ems_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
```

### 3️⃣ Configure OAuth2.0 (Okta/Auth0)
Update `application.properties` with your **Okta/Auth0 credentials**:
```properties
spring.security.oauth2.client.registration.okta.client-id=YOUR_CLIENT_ID
spring.security.oauth2.client.registration.okta.client-secret=YOUR_CLIENT_SECRET
spring.security.oauth2.client.provider.okta.issuer-uri=https://YOUR_OKTA_DOMAIN/oauth2/default
```

### 4️⃣ Build & Run Application
```sh
mvn clean install
mvn spring-boot:run
```

### 5️⃣ Access API Endpoints
- **Swagger UI:** `http://localhost:8080/swagger-ui.html`
- **Login with OAuth2:** `http://localhost:8080/login`

### 6️⃣ Running Tests
Run **unit & integration tests**:
```sh
mvn test
```

## API Endpoints
| HTTP Method | Endpoint | Role Access |
|------------|----------|-------------|
| GET | `/employees` | ADMIN, MANAGER |
| GET | `/employees/{id}` | ADMIN, MANAGER, EMPLOYEE (Self) |
| POST | `/employees` | ADMIN |
| DELETE | `/employees/{id}` | ADMIN |
| GET | `/departments` | ADMIN, MANAGER |
| GET | `/projects` | ADMIN, MANAGER |


