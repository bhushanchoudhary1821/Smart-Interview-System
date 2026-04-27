# Smart Interview System (Spring Boot Project)

## 🚀 Project Overview
Smart Interview System is a backend application built using Spring Boot that allows users to register, login, and access secured APIs using JWT authentication.

---

## 🔐 Features
- User Registration API
- Login API (JWT Token Generation)
- JWT Authentication & Authorization
- Secure APIs using Filter
- Validation & Exception Handling
- MySQL Database Integration

---

## 🛠️ Tech Stack
- Java 21
- Spring Boot
- Spring Security (JWT)
- Hibernate (JPA)
- MySQL
- REST APIs

---

## 🔑 API Endpoints

### 1. Register User
POST /api/users

### 2. Login
POST /api/auth/login

### 3. Get Users (Secured)
GET /api/users

---

## 🔐 JWT Flow
1. User logs in
2. Server generates JWT token
3. Token is sent in Authorization header
4. Filter validates token before allowing access

---

## 📌 Author
Bhushan Choudhary
