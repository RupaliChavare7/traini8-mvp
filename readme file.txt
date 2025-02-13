Traini8 Backend Assignment
Overview
This project is an MVP for a registry of government-funded training centers. It provides two APIs to create and retrieve training center information using Spring Boot.

Table of Contents
Technologies Used
Setup Instructions
API Endpoints
Validation Rules
Exception Handling
Project Structure


Technologies Used
Java 11
Spring Boot
Spring Data JPA
Hibernate
H2 Database (or any other database of your choice)
Maven
Setup Instructions
Clone the Repository

bash
Copy code
git clone 
cd Traini8
Build the Project

bash
Copy code
mvn clean install
Run the Application

bash
Copy code
mvn spring-boot:run
Access the Application

The application will run on http://localhost:8080.
API Endpoints
1. Create a Training Center
Endpoint: POST /api/training-centers
Request Body:
json
Copy code
{
    "centerName": "Example Center",
    "centerCode": "ABC12345678",
    "address": {
        "detailedAddress": "123 Example St",
        "city": "Example City",
        "state": "Example State",
        "pincode": "123456"
    },
    "studentCapacity": 100,
    "coursesOffered": ["Course1", "Course2"],
    "contactEmail": "example@example.com",
    "contactPhone": "1234567890"
}
Response:
Returns the created training center information in JSON format.
2. Get All Training Centers
Endpoint: GET /api/training-centers

Response:
Returns a list of all training centers in JSON format. If no centers are found, returns an empty list.

Validation Rules

Mandatory Fields:
centerName, centerCode, address, contactPhone are required.

Field Constraints:
centerName: Max 40 characters.
centerCode: Exactly 12 alphanumeric characters.
contactPhone: Must be a valid 10-digit phone number.
contactEmail: If present, must be a valid email format.

CreatedOn Field:
Automatically populated with the server timestamp.

Exception Handling
The application uses a global exception handler to manage validation errors and return appropriate error messages.

Project Structure

Traini8
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── traini8
│   │   │           ├── controller
│   │   │           ├── model
│   │   │           ├── repository
│   │   │           ├── service
│   │   │           └── exception
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
│           └── com
│               └── traini8
└── README.md
