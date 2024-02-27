# Notification System

## Description
This project implements a flexible and scalable notification system, designed following SOLID principles, design patterns, and best development practices in Java with Spring Boot. The system allows sending notifications through different channels (SMS, E-Mail, Push Notification) based on the category preferences and channel subscriptions of the users.

## Project Structure
The project is organized following a clean architecture and separation of concerns, thus facilitating the maintainability and scalability of the code.

### Main Components
- `model`: Defines the system entities, such as `User`.
- `repository`: Contains interfaces for database interaction.
- `service`: Includes business logic, especially notification management.
- `controller`: Handles HTTP requests, allowing interaction with the system through a REST API.

### Technologies Used
- Spring Boot
- JPA / Hibernate
- H2 Database / PostgreSQL
- SLF4J and Logback for logging

## Configuration and Execution
Details the necessary steps to configure and run the project locally. Includes prerequisites, how to clone the repository, and commands to run the project.

### Prerequisites
- Java JDK 11 or higher
- Maven

