# MVC Using Servlet, JSP, and JDBC

This project demonstrates the implementation of the Model-View-Controller (MVC) architecture using Servlets, JSP, and JDBC to create a simple user registration application.

---

## 📂 Project Structure:

```
MvcJspJdbcProject
├── Deployment Descriptor: MvcJspJdbcProject
├── JAX-WS Web Services
├── Java Resources
│   └── src/main/java
│       └── (default package)
│           ├── JdbcUtil.java
│           ├── RegisterController.java
│           └── RegisterDao.java
├── Libraries
├── build
└── src
    └── main
        └── webapp
            ├── META-INF
            ├── WEB-INF
            ├── failure.jsp
            ├── index.html
            └── success.jsp
```

---

## 🛠️ Setup Instructions

Follow the steps below to set up and run the project:

### 1. Prerequisites

- JDK 8 or later
- Apache Tomcat Server 9.0 or later
- MySQL or PostgreSQL Database
- Eclipse IDE (or any Java-supported IDE)
- JDBC Driver for MySQL or PostgreSQL

### 2. Database Setup

#### For MySQL:

1. Install MySQL and create a database named `telusko_db`.
2. Execute the following SQL query to create the `personinfo` table:

```sql
CREATE TABLE personinfo (
    id INT AUTO_INCREMENT PRIMARY KEY,
    uname VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    upassword VARCHAR(255) NOT NULL,
    ucity VARCHAR(255)
);
```

#### For PostgreSQL:

1. Install PostgreSQL and create a database named `telusko_db`.
2. Execute the following SQL query to create the `personinfo` table:

```sql
CREATE TABLE personinfo (
    id SERIAL PRIMARY KEY,
    uname VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL,
    upassword VARCHAR(255) NOT NULL,
    ucity VARCHAR(255)
);
```

### 3. Project Configuration

1. Clone or download the project from this repository.
2. Open the project in your IDE (e.g., Eclipse).
3. Add the appropriate JDBC Driver (MySQL or PostgreSQL) to the project’s build path.

### 4. Update Database Connection in `JdbcUtil.java`

Modify the following variables in the `JdbcUtil.java` file based on your database choice:

#### For MySQL:

```java
Class.forName("com.mysql.cj.jdbc.Driver");
String url = "jdbc:mysql://localhost:3306/telusko_db";
String userName = "root";
String password = "root";
```

#### For PostgreSQL:

```java
Class.forName("org.postgresql.Driver");
String url = "jdbc:postgresql://localhost:5432/telusko_db";
String userName = "postgres";
String password = "postgres";
```

### 5. Deploy and Run the Application

1. Deploy the project on the Apache Tomcat server.
2. Access the application by opening `http://localhost:8080/MvcJspJdbcProject/index.html` in your browser.

---

## 🔍 Features

- **Model**: Manages application data (RegisterDao.java).
- **View**: User interfaces (index.html, success.jsp, failure.jsp).
- **Controller**: Handles user input and updates the model (RegisterController.java).

---

## 💻 Usage

1. Open the `index.html` page.
2. Fill in the registration form with the following fields:
   - Name
   - Email
   - Password
   - City (optional)
3. Click the **Register** button.
4. The result will be displayed on either:
   - `success.jsp` if registration is successful.
   - `failure.jsp` if there is an error.

---

## 📜 File Descriptions

### 1. `JdbcUtil.java`

Contains utility methods for establishing a connection with the database (MySQL or PostgreSQL).

### 2. `RegisterDao.java`

Defines methods for interacting with the database and performing CRUD operations.

### 3. `RegisterController.java`

Servlet that handles HTTP requests and controls the flow of the application.

### 4. `index.html`

The front-end registration form for user input.

### 5. `success.jsp`

Displays a success message upon successful registration.

### 6. `failure.jsp`

Displays an error message if registration fails.

---

## 🔗 Dependencies

- MySQL Connector/J or PostgreSQL JDBC Driver
- Apache Tomcat Server
- JSP and Servlet API

---

## 🚀 Future Enhancements

- Add input validation on the client and server side.
- Implement password encryption for enhanced security.
- Add user authentication and session management.

---

## 🙋‍♂️ Support

For any issues or queries, feel free to contact the project maintainer.

---

## 🖍️ License

This project is licensed under the MIT License.
