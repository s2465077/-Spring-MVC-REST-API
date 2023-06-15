# CRM Web App Rest Client

This is a CRM (Customer Relationship Management) Web App REST client that communicates with the CRM REST API. The client app leverages the CRM REST API for data retrieval and manipulation at mySQL database.

## Introduction
The CRM Web App REST client acts as the frontend interface, while the backend REST API handles the data storage and retrieval.

The application architecture allows users to make RESTful client calls to the CRM REST API for retrieving, adding, updating, and deleting customer data at CRM Web App. By leveraging the CRM REST API, the CRM Web App REST client can seamlessly integrate with the backend and provide a user-friendly interface for managing customers.

## Application Configuration Properties
The CRM Web App REST Client needs to connect to the CRM REST API. To achieve this, a configuration property is added that holds the URL of the REST API. The URL can be configured in the application.properties file.

## Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes. See deployment for notes on how to deploy the project on a live system.

## How to run
1. Run SQL scripts at */spring-crm-rest-api/sql-scripts* folder to create database name 'hb_customer_tracker’ and create table ‘customer’
2. clone the project into local system.
3. import code into Intellji.
4. Put the url for CRM REST Api at application.properties file of CRM web app rest client. 
5. Run 2 applications, CRM web app rest client and CRM REST API, on different servers.
