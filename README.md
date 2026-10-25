# Employee Management System

A Java-based web application developed to manage employee records using Spring MVC, Hibernate ORM, JSP, and MySQL. The application allows the admin to add, update, delete, and view all employees through a web interface.

## 🚀 Project Overview

The Employee Management System is designed to simplify employee record management through a web application.

The application follows the Model-View-Controller (MVC) architecture. Spring MVC handles web requests, Hibernate ORM manages object-relational mapping, and MySQL stores employee information.

## ✨ Features

- **Add Employee** — Add new employee records to the database.
- **Update Employee** — Modify existing employee details.
- **Delete Employee** — Remove employee records from the database.
- **View All Employees** — Display all employee records in a structured table.
- **Admin Interface** — Manage employee records through the application.
- **Database Integration** — Store and retrieve employee information using MySQL.
- **Spring MVC** — Handle web requests using the MVC architecture.
- **Hibernate ORM** — Map Java objects to database tables and perform database operations.
- **JSP Pages** — Display dynamic web pages for employee management.

## 🛠️ Technologies Used

| Technology | Purpose |
|---|---|
| Java | Backend programming |
| Spring Context | Dependency injection and bean management |
| Spring ORM | Integration between Spring and Hibernate |
| Spring Web MVC | MVC architecture and request handling |
| Hibernate Core | Object-relational mapping |
| MySQL | Relational database management |
| MySQL Connector/J | JDBC connectivity with MySQL |
| JSP | Dynamic web pages |
| HTML | Web page structure |
| CSS | Web page styling |
| Apache Maven | Dependency management and build automation |
| Apache Tomcat | Web application deployment |
| Eclipse IDE | Development environment |
| Git & GitHub | Version control and source code hosting |

## 📦 Maven Dependencies

The project uses the following Maven dependencies in `pom.xml`.

| Dependency | Artifact ID | Purpose |
|---|---|---|
| Spring Context | `spring-context` | Dependency injection and bean management |
| Spring ORM | `spring-orm` | Integration between Spring and Hibernate |
| Spring Web MVC | `spring-webmvc` | Controllers and MVC configuration |
| Hibernate Core | `hibernate-core` | Object-relational mapping and persistence |
| MySQL Connector/J | `mysql-connector-j` | MySQL JDBC driver |

Maven downloads these dependencies automatically based on the configuration in `pom.xml`.

## 🏗️ Application Architecture

The application follows the Model-View-Controller (MVC) design pattern.

```text
                    Admin
                      |
                      v
                 JSP Pages
                   (View)
                      |
                      v
             Spring MVC Controller
                      |
                      v
              DAO / Data Access
                      |
                      v
                Hibernate ORM
                      |
                      v
                MySQL Database
```

### Architecture Components

- **Admin:** Manages employee records through the application.
- **View:** JSP pages display employee forms and employee records.
- **Controller:** Spring MVC controllers handle HTTP requests.
- **DAO:** Performs database-related operations.
- **Hibernate ORM:** Maps Java objects to relational database tables.
- **MySQL Database:** Stores employee information.

## 📂 Project Structure

The following is an illustrative Maven web application structure. Update the package names and folders to match your actual project.

```text
EmployeeManagement/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── flm/
│       │           ├── controller/
│       │           ├── model/
│       │           ├── dao/
│       │           └── config/
│       ├── resources/
│       └── webapp/
│           └── WEB-INF/
│               └── views/
│                   └── *.jsp
├── pom.xml
└── README.md
```

## ⚙️ Prerequisites

Install the following software before running the project:

- **Java JDK:** A version compatible with the project's Spring and Hibernate dependencies.
- **Eclipse IDE for Enterprise Java and Web Developers:** For development and project management.
- **Apache Maven:** For dependency management and building the application.
- **Apache Tomcat:** A version compatible with the project's Spring MVC and Jakarta Servlet configuration.
- **MySQL Server:** For storing and managing employee records.

### Required Libraries

The following libraries are managed through Maven:

- Spring Context
- Spring ORM
- Spring Web MVC
- Hibernate Core
- MySQL Connector/J

## ▶️ How to Run the Project

### Step 1: Clone the Repository

Open a terminal and execute:

```bash
git clone https://github.com/karivetisandeepvarma/EmployeeManagement.git
```

### Step 2: Import the Project into Eclipse

1. Open Eclipse IDE.
2. Select **File → Import**.
3. Choose **Maven → Existing Maven Projects**.
4. Browse to the cloned repository directory.
5. Select the project and click **Finish**.

### Step 3: Configure the MySQL Database

1. Start the MySQL Server.
2. Create the database required by the application.
3. Configure the database URL, username, and password in the project configuration.
4. Ensure the required tables exist or are configured to be generated by Hibernate.

Example database creation:

```sql
CREATE DATABASE employee_management;
```

Use the database name expected by your application's configuration.

**Security:** Do not commit database passwords or other confidential credentials to GitHub.

### Step 4: Update Maven Dependencies

In Eclipse:

1. Right-click the project.
2. Select **Maven → Update Project**.
3. Click **OK**.
4. Wait for Maven to download the required dependencies.

Alternatively, run the following command from the project directory:

```bash
mvn clean package
```

### Step 5: Configure Apache Tomcat

1. Configure a compatible Apache Tomcat server in Eclipse.
2. Add the EmployeeManagement project to the server.
3. Start the server.
4. Check the Eclipse console for startup errors.

### Step 6: Open the Application

Open your browser and navigate to the deployed application.

Example URL:

```text
http://localhost:8080/EmployeeManagement/
```

The actual URL depends on your configured context path and Spring MVC controller mappings.

## 🔄 CRUD Operations

The application implements the four fundamental CRUD operations for employee management.

| Operation | Description |
|---|---|
| Create | Add a new employee |
| Read | View all employees |
| Update | Modify an existing employee's details |
| Delete | Remove an employee record |

## 🎯 Learning Outcomes

This project provides practical experience with:

- Java web application development.
- Spring Context and dependency injection.
- Spring MVC controllers and request handling.
- JSP-based dynamic web pages.
- Hibernate ORM and object-relational mapping.
- MySQL database connectivity.
- Maven dependency management.
- Application deployment using Apache Tomcat.
- MVC architecture and separation of concerns.
- Implementing CRUD operations in a web application.

## 🔮 Future Enhancements

- Add employee search and filtering.
- Introduce form validation and improved error handling.
- Implement secure admin authentication and authorization.
- Improve the user interface with responsive CSS.
- Add automated unit and integration tests.

## 👨‍💻 Author

**Sandeep Varma Kariveti**

- **GitHub:** [karivetisandeepvarma](https://github.com/karivetisandeepvarma)
- **LinkedIn:** [Sandeep Varma Kariveti](https://www.linkedin.com/in/sandeep-varma-kariveti-09a841350/)

---

⭐ If you find this project useful, consider giving the repository a star.
