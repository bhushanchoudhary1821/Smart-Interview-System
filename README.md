👇

🚀 Smart Interview System (Spring Boot)
📌 Project Overview

Smart Interview System is a secure backend application developed using Spring Boot that enables user authentication and authorization using JWT (JSON Web Token).
It provides REST APIs for user registration, login, and access to protected resources.

🔐 Key Features
✅ User Registration with validation
✅ Secure Login with JWT Token generation
✅ Role-based Authentication & Authorization
✅ Stateless Security using Spring Security
✅ Custom JWT Filter for request validation
✅ Global Exception Handling
✅ Input Validation (DTO level)
✅ MySQL Database Integration
🛠️ Tech Stack
☕ Java 21
🌱 Spring Boot
🔐 Spring Security + JWT
🗄️ Hibernate (JPA)
🐬 MySQL
🔗 RESTful APIs
🔑 API Endpoints
🧾 Register User
POST /api/users
🔑 Login
POST /api/auth/login
🔒 Get Users (Protected API)
GET /api/users
🔄 JWT Authentication Flow
User sends login request with credentials
Server validates credentials
JWT token is generated
Token is returned to client
Client sends token in Authorization header
JWT Filter validates token for every request
Access granted to secured endpoints
⚙️ Project Highlights
Stateless authentication (No session stored on server)
Secure API endpoints using filters
Clean layered architecture (Controller → Service → Repository)
Scalable and production-ready structure
📌 Future Enhancements
🔹 Role-based access (Admin/User)
🔹 Interview question module
🔹 AI-based interview feedback system
🔹 Frontend integration (React/Angular)
👨‍💻 Author

Bhushan Choudhary
