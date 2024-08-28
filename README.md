# 🖼️ Cloudinary Images Upload Application

## 🌟 Overview

This full-stack application provides a robust image upload and management system. It consists of a Spring Boot backend integrated with Cloudinary for image storage, and an Angular frontend for a user-friendly interface.

## ✨ Features

- 📤 Upload single or multiple images
- 📋 Retrieve and display image metadata
- 🗑️ Delete single or multiple images
- ☁️ Cloudinary integration for secure and efficient image storage
- 🗄️ MySQL database for storing image metadata
- 🔗 RESTful API design
- 🖥️ Responsive Angular frontend

## 🛠️ Technologies

### Backend
- ☕ Java 21
- 🍃 Spring Boot 3.3.3
- 🔄 Spring Data JPA
- 🐬 MySQL
- 🏗️ Lombok
- 🗺️ MapStruct
- ☁️ Cloudinary

### Frontend
- 🅰️ Angular (latest version)
- 🎨 Angular Material
- 📡 RxJS

## 📋 Prerequisites

Before you begin, ensure you have met the following requirements:

- 📦 Java Development Kit (JDK) 21
- 🏗️ Maven 3.6+
- 🐬 MySQL 8.0+
- ☁️ Cloudinary account (for API key and secret)
- 📘 Node.js and npm (for Angular frontend)
- 🅰️ Angular CLI

## 🚀 Installation and Setup

### Backend

1. Navigate to the backend directory:
   ```bash
   cd backend
   ```

2. Configure the application:
   - Copy `src/main/resources/application.properties.example` to `src/main/resources/application.properties`
   - Edit `application.properties` and add your MySQL and Cloudinary credentials

3. Build and run the backend:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

### Frontend

1. Navigate to the frontend directory:
   ```bash
   cd frontend
   ```

2. Install dependencies:
   ```bash
   npm install
   ```

3. Start the Angular development server:
   ```bash
   ng serve
   ```

## 📘 Usage

1. Open your browser and go to `http://localhost:4200`
2. Use the web interface to upload, view, and manage images
3. The Angular frontend will communicate with the Spring Boot backend API

## ⚙️ Configuration

### Backend Configuration

Edit `backend/src/main/resources/application.properties`:

```properties
# Database
spring.datasource.url=jdbc:mysql://localhost:3306/cloudinary_image_db
spring.datasource.username=your_username
spring.datasource.password=your_password

# Cloudinary
cloudinary.cloud-name=your_cloud_name
cloudinary.api-key=your_api_key
cloudinary.api-secret=your_api_secret

# File upload limits
spring.servlet.multipart.max-file-size=10MB
spring.servlet.multipart.max-request-size=50MB
```

### Frontend Configuration

Edit `frontend/src/environments/environment.ts` to set the API URL:

```typescript
export const environment = {
  production: false,
  apiUrl: 'http://localhost:8080/api'
};
```

## 📞 Contact

Nabil Sabi - nabilsabi01@gmail.com

Project Link: [https://github.com/nabilsabi01/cloudinary-images-upload-app](https://github.com/nabilsabi01/cloudinary-images-upload-app)

---

⭐ Star this repo if you find it useful! Thank you for your interest in the Cloudinary Image Upload Application! 🙏
