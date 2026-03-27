# 🏥 Smart Hospital Management System

A full-stack Hospital Management System built using **Spring Boot (Backend)** and **React (Frontend)**.  
This system enables efficient management of patients, doctors, and appointments with a clean and user-friendly interface.

---

## 🚀 Features

### 👤 Patient Portal
- Add new patients  
- View patient list  
- Delete patient records  
- Track patient entry date  

### 👨‍⚕️ Doctor Portal
- Add doctors with specialization  
- View all doctors with ID, name, and specialization  
- Delete doctor records  
- Check doctor-wise appointment schedule  

### 📅 Appointment Scheduling
- Book appointments between patient & doctor  
- Priority-based scheduling:
  - 🔴 Emergency  
  - 🟡 Senior  
  - 🟢 General  
- View all scheduled appointments  
- Filter appointments by doctor  
- Delete completed appointments  

---

## 🧠 Tech Stack

**Frontend:**  
- React.js  
- CSS  

**Backend:**  
- Java  
- Spring Boot  
- Spring Data JPA  

**Database:**  
- MySQL  


## ⚙️ Setup Instructions

### 🔧 Backend (Spring Boot)

1. Open project in IntelliJ IDEA  
2. Configure `application.properties`:


spring.datasource.url=jdbc:mysql://localhost:3306/hospital_db
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


3. Run the Spring Boot application  

---

### 🌐 Frontend (React)

1. Navigate to frontend folder:
cd frontend


2. Install dependencies:
npm install


3. Start the app:
npm start


---

## 🔗 API Endpoints

### Patient
- `POST /patients` → Add patient  
- `GET /patients` → Get all patients  
- `DELETE /patients/{id}` → Delete patient  

### Doctor
- `POST /doctors` → Add doctor  
- `GET /doctors` → Get all doctors  
- `DELETE /doctors/{id}` → Delete doctor  

### Appointment
- `POST /appointments` → Book appointment  
- `GET /appointments` → Get all appointments  
- `GET /appointments/doctor/{name}` → Get doctor schedule  
- `DELETE /appointments/{id}` → Delete appointment  
---

## 🎯 Key Highlights

- Clean and responsive UI
- Full CRUD operations
- Priority-based appointment handling
- Doctor-wise schedule tracking
- Global exception handling
- Modular architecture (Controller-Service-Repository)

---

## 💡 Future Improvements

- 🔐 Login system (Doctor & Patient)
- 📊 Dashboard analytics
- ⏱ Auto time-slot scheduling
- 📱 Mobile responsive UI

---

## 👩‍💻 Author

**Mahek Aggarwal**

---
