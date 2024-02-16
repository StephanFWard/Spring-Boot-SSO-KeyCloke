# This project demonstrates a Spring Boot application with CRUD functionality for managing users stored in a SQL database, integrated with Keycloak for single sign-on (SSO) authentication.

# Setup

    1. A new Spring Boot project with dependencies for Spring Web, Spring Data JPA, and Keycloak.
    2. Set up a MySQL database and configure the connection details in application.properties.
    3. Configure Keycloak settings in application.properties, including the Keycloak server URL, realm, client ID, etc.
    4. Implement the UserController to handle user profile retrieval using Keycloak authentication.
    5. Update the Spring Security configuration in SecurityConfig.java to integrate with Keycloak.
    6. Customize the application according to your requirements, such as adding additional endpoints or business logic.

# Usage
    1. Start the Spring Boot application. It will automatically integrate with Keycloak for user authentication.
    2. Access the /users/profile endpoint to retrieve the user profile information after successful authentication.
    3. Implement additional functionality as needed, such as CRUD operations for managing users in the database.
# Note
    1. Ensure that all sensitive information such as Keycloak credentials, database connection # details, and API keys are stored securely and not exposed in the source code or README files.

Project Tree Shown Below

SPRING-BOOT-SSO-KEYCLOAK/
C:.
├───.vscode
├───backend
│   └───src
│       ├───main
│       │   ├───app
│       │   │   ├───components
│       │   │   │   ├───footer
│       │   │   │   │   └───footer.component.html
│       │   │   │   └───header
│       │   │   ├───java
│       │   │   │   └───com
│       │   │   │       └───example
│       │   │   │           └───springbootssocloak
│       │   │   │               └───config
│       │   │   └───shared
│       │   │       ├───services
│       │   │       │   └───user.service.ts
│       │   │       └───styles
│       │   │           ├───components
│       │   │           │   └───header.css
│       │   │           └───main.css
│       │   ├───java
│       │   │   └───com
│       │   │       └───example
│       │   │           └───controller
│       │   └───resources
│       │       └───static
│       │           └───css
│       │               └───components
│       └───test
├───frontend
│   └───src
│       └───app
│           ├───assets
│           └───components
│               ├───header
│               └───shared
│                   ├───services
│                   └───styles
│                       └───components
└───target
    ├───classes
    ├───maven-archiver
    └───test-classes



To run the Java Angular app of the specified structure, you'll need to start both the backend (Spring Boot) and frontend (Angular) applications separately. Here's how you can do it:

Running the Backend (Spring Boot) Application:
Navigate to the backend directory of your project:

bash
cd SPRING-BOOT-SSO-KEYCLOAK/backend
Make sure you have Maven installed and available in your system.

Build the backend Spring Boot application using Maven:

mvn clean install
Once the build is successful, you can run the Spring Boot application:

Note:
Powershell Admin scripts to path in Maven like so to make it easier.

$MavenHome = "$env:USERPROFILE\apache-maven-$MavenVersion"
[System.Environment]::SetEnvironmentVariable("M2_HOME", $MavenHome, [System.EnvironmentVariableTarget]::Machine)
[System.Environment]::SetEnvironmentVariable("M2", "$MavenHome\bin", [System.EnvironmentVariableTarget]::Machine)
[System.Environment]::SetEnvironmentVariable("MAVEN_HOME", $MavenHome, [System.EnvironmentVariableTarget]::Machine)
[System.Environment]::SetEnvironmentVariable("PATH", "$($env:PATH);$MavenHome\bin", [System.EnvironmentVariableTarget]::Machine)

mvn spring-boot:run

The Spring Boot application should start, and you should see logs indicating that the application has started successfully. By default, it should be accessible at http://localhost:8080.

Running the Frontend (Angular) Application:
Navigate to the frontend directory of your project:

cd SPRING-BOOT-SSO-KEYCLOAK/frontend
Make sure you have Node.js and npm (Node Package Manager) installed and available in your system.

Install the dependencies for the frontend Angular application by running:

npm install

Note: For Windows 11
Ensure that you are in the correct directory (frontend directory) before running the npm install command. You can change the directory using the cd command:

cd C:\Users\Path\To\App\Spring-Boot-SSO-KeyCloke\frontend
Once you're in the frontend directory, run the npm install command again:


npm install

If the package.json file is missing from the frontend directory, you'll need to create one. You can create a basic package.json file manually or by using the npm init command:


npm init -y

Once the dependencies are installed, you can start the Angular development server:

ng serve

The Angular development server should start, and you should see logs indicating that the application is running. By default, it should be accessible at http://localhost:4200.

Accessing the Application:
Once both the backend and frontend applications are running, you can access the full application by opening a web browser and navigating to http://localhost:4200 (assuming you're using the default Angular development server port). This will load the Angular frontend, which will communicate with the Spring Boot backend for any required data or functionality.
