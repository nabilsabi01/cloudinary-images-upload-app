# 🖼️ Cloudinary Images Upload Application

## 🌟 Overview

This application is a robust image upload and management system built with Spring Boot 3.3.3 and integrated with Cloudinary for image storage. It provides a RESTful API for uploading, retrieving, and deleting images, supporting both single and multi-image operations.

## ✨ Features

- 📤 Upload single or multiple images
- 📋 Retrieve image metadata
- 🗑️ Delete single or multiple images
- ☁️ Cloudinary integration for secure and efficient image storage
- 🗄️ MySQL database for storing image metadata
- 🔗 RESTful API design

## 🛠️ Technologies

- ☕ Java 21
- 🍃 Spring Boot 3.3.3
- 🔄 Spring Data JPA
- 🐬 MySQL
- 🏗️ Lombok
- 🗺️ MapStruct
- ☁️ Cloudinary

## 📋 Prerequisites

Before you begin, ensure you have met the following requirements:

- 📦 Java Development Kit (JDK) 21
- 🏗️ Maven 3.6+
- 🐬 MySQL 8.0+
- ☁️ Cloudinary account (for API key and secret)

## 🚀 Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/nabilsabi01/cloudinary-images-upload-app.git
   cd cloudinary-images-upload-app
   ```

2. Configure the application:
   - Copy `src/main/resources/application.properties.example` to `src/main/resources/application.properties`
   - Edit `application.properties` and add your MySQL and Cloudinary credentials

3. Build the project:
   ```bash
   mvn clean install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```

## 📘 Usage

### API Endpoints

#### 📤 Upload Images
- **URL:** `/api/images/upload`
- **Method:** POST
- **Content-Type:** multipart/form-data
- **Request Body:** files[] (multiple file upload)
- **Response:** List of uploaded image DTOs

#### 📋 Get All Images
- **URL:** `/api/images`
- **Method:** GET
- **Response:** List of all image DTOs

#### 🔍 Get Image by ID
- **URL:** `/api/images/{id}`
- **Method:** GET
- **Response:** Single image DTO

#### 🗑️ Delete Image
- **URL:** `/api/images/{id}`
- **Method:** DELETE

#### 🗑️ Batch Delete Images
- **URL:** `/api/images/batch?ids=1,2,3`
- **Method:** DELETE
- **Query Params:** ids (comma-separated list of image IDs)

### 🧪 Example cURL Commands

1. Upload multiple images:
   ```bash
   curl -X POST -F "files[]=@image1.jpg" -F "files[]=@image2.jpg" http://localhost:8080/api/images/upload
   ```

2. Get all images:
   ```bash
   curl http://localhost:8080/api/images
   ```

3. Delete an image:
   ```bash
   curl -X DELETE http://localhost:8080/api/images/1
   ```

4. Batch delete images:
   ```bash
   curl -X DELETE "http://localhost:8080/api/images/batch?ids=1,2,3"
   ```

## ⚙️ Configuration

The following properties can be configured in `application.properties`:

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

## 🤝 Contributing

Contributions to this project are welcome. Please follow these steps:

1. 🍴 Fork the repository
2. 🌿 Create a new branch (`git checkout -b feature/amazing-feature`)
3. 🔧 Make your changes
4. 📝 Commit your changes (`git commit -m 'Add some amazing feature'`)
5. 📤 Push to the branch (`git push origin feature/amazing-feature`)
6. 🔍 Open a Pull Request

## 📞 Contact

Nabil Sabi - nabilsabi01@gmail.com

Project Link: [https://github.com/nabilsabi01/cloudinary-images-upload-app](https://github.com/nabilsabi01/cloudinary-images-upload-app)

---

⭐ Star this repo if you find it useful! Thank you for your interest in the Cloudinary Image Upload Application! 🙏
