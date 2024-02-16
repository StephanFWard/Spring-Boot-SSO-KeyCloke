# This project demonstrates a Spring Boot application with CRUD functionality for managing users stored in a SQL database, integrated with Keycloak for single sign-on (SSO) authentication.

# Setup
1. Create a new Spring Boot project with dependencies for Spring Web, Spring Data JPA, and Keycloak.
2. Set up a MySQL database and configure the connection details in application.properties.
3. Configure Keycloak settings in application.properties, including the Keycloak server URL, realm, client ID, etc.
4. Implement the UserController to handle user profile retrieval using Keycloak authentication.
5. Update the Spring Security configuration in SecurityConfig.java to integrate with Keycloak.
6. Customize the application according to your requirements, such as adding additional endpoints or business logic.

# Usage
1. Start the Spring Boot application. It will automatically integrate with Keycloak for user authentication.
2. Access the /users/profile endpoint to retrieve the user profile information after successful authentication.
3. Implement additional functionality as needed, such as CRUD operations for managing users in the database.
Note
1. Ensure that all sensitive information such as Keycloak credentials, database connection # details, and API keys are stored securely and not exposed in the source code or README files.

SPRING-BOOT-SSO-KEYCLOAK/
├── backend/
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── example/
│   │   │   │           └── controller/
│   │   │   │               └── UserController.java
│   │   │   │           └── config/
│   │   │   │               └── SecurityConfig.java
│   │   │   ├── resources/
│   │   │   │   ├── static/
│   │   │   │   │   ├── css/
│   │   │   │   │   │   ├── main.css
│   │   │   │   │   │   └── components/
│   │   │   │   │   │       ├── header.css
│   │   │   │   │   │       └── footer.css
│   │   │   │   │   ├── js/
│   │   │   │   │   └── img/
│   │   │   │   ├── application.properties
│   │   │   │   └── data.sql
│   │   └── test/
├── frontend/
│   ├── src/
│   │   ├── app/
│   │   │   ├── components/
│   │   │   │   ├── header/
│   │   │   │   │   ├── header.component.html
│   │   │   │   │   └── header.component.css
│   │   │   │   ├── footer/
│   │   │   │   │   ├── footer.component.html
│   │   │   │   │   └── footer.component.css
│   │   │   ├── shared/
│   │   │   │   ├── styles/
│   │   │   │   │   ├── main.css
│   │   │   │   │   └── components/
│   │   │   │   │       ├── header.css
│   │   │   │   │       └── footer.css
│   │   │   │   └── services/
│   │   │   │       └── user.service.ts
│   │   │   └── ...
│   │   ├── assets/
│   │   └── ...
│   ├── angular.json
│   ├── package.json
│   └── ...
├── pom.xml
└── README.md


To run the Java Angular app of the specified structure, you'll need to start both the backend (Spring Boot) and frontend (Angular) applications separately. Here's how you can do it:

Running the Backend (Spring Boot) Application:
Navigate to the backend directory of your project:

bash
cd SPRING-BOOT-SSO-KEYCLOAK/backend
Make sure you have Maven installed and available in your system.

Build the backend Spring Boot application using Maven:

mvn clean install
Once the build is successful, you can run the Spring Boot application:

mvn spring-boot:run
The Spring Boot application should start, and you should see logs indicating that the application has started successfully. By default, it should be accessible at http://localhost:8080.

Running the Frontend (Angular) Application:
Navigate to the frontend directory of your project:

cd SPRING-BOOT-SSO-KEYCLOAK/frontend
Make sure you have Node.js and npm (Node Package Manager) installed and available in your system.

Install the dependencies for the frontend Angular application by running:

npm install
Once the dependencies are installed, you can start the Angular development server:

ng serve
The Angular development server should start, and you should see logs indicating that the application is running. By default, it should be accessible at http://localhost:4200.

Accessing the Application:
Once both the backend and frontend applications are running, you can access the full application by opening a web browser and navigating to http://localhost:4200 (assuming you're using the default Angular development server port). This will load the Angular frontend, which will communicate with the Spring Boot backend for any required data or functionality.
