# CRM Web App REST Client

This is a CRM (Customer Relationship Management) Web App REST client that communicates with the CRM REST API. The client app leverages the CRM REST API for data retrieval and manipulation at mySQL database.

## Introduction
The CRM Web App REST client acts as the frontend interface, while the backend REST API handles the data storage and retrieval.

The application architecture allows users to make RESTful client calls to the CRM REST API for retrieving, adding, updating, and deleting customer data at CRM Web App. By leveraging the CRM REST API, the CRM Web App REST client can seamlessly integrate with the backend and provide a user-friendly interface for managing customers.

## Application Configuration Properties
The CRM Web App REST Client needs to connect to the CRM REST API. To achieve this, a configuration property is added that holds the URL of the REST API. The URL can be configured in the application.properties file.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## Prerequisites
- Java Development Kit (JDK) 8 or higher
- Apache Maven
- Docker
- MySQL database


## How to run
1. Run SQL scripts at */spring-crm-rest-api/sql-scripts* folder to create database name `hb_customer_tracker` and create table `customer`
2. Clone the project into local system.
3. Import code into Intellji.
4. Update *application.properties*: In the CRM web app REST client, set the URL for the CRM REST API in the *application.properties* file.
5. Run 2 applications by using Docker Compose: Navigate to the project root directory where the docker-compose.yml file is located and run the following commands to build and start the containers.

    ```
    docker-compose down
    docker-compose up -d --build
    ```
    This will start both the backend and frontend services.

## Deployment to the cloud
1. Uploaded the project to your server.
    ```
    scp -r /path/to/your/local/project-root user@your-server:/path/to/remote/directory
    ```
2. SSH into your server and stop/remove any existing containers that might conflict with your new setup.
    ```
    ssh user@your-server
    docker ps -a
    docker stop <container_id>
    docker rm <container_id>
    ```
3. Navigate to the directory where you uploaded your project and run Docker Compose to build and start the containers.
    ```
    cd /path/to/remote/directory
    docker-compose down
    docker-compose up -d --build
    ```
4. Verify the containers are up and running.
    ```
    docker ps
    ```

## Built With
- Spring Framework - The web framework used
- Hibernate - ORM for database operations
- MySQL - Database for storing customer data
- Docker - Containerization of applications
- Docker Compose - Managing multi-container Docker applications
- Tomcat Server - Web server for running the applications

