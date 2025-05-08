# Spring Boot User Management Demo 🚀

<div align="center">
  <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white" alt="Java">
  <img src="https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white" alt="Spring Boot">
  <img src="https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white" alt="Gradle">
  <img src="https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white" alt="JUnit 5">
  <img src="https://img.shields.io/badge/Mockito-78CFF5?style=for-the-badge" alt="Mockito">
</div>

## 📁 Project Structure

```text
spring-boot-user-demo/
├── 📂 src/
│   ├── 📂 main/
│   │   ├── 📂 java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           ├── 🟢 DemoApplication.java         # Main application
│   │   │           ├── 📂 model/
│   │   │           │   └── 🧑 User.java               # User entity
│   │   │           ├── 📂 repo/
│   │   │           │   ├── 💾 FakeRepo.java           # Repository
│   │   │           │   └── 📜 FakeRepoInterface.java  # Repository interface
│   │   │           └── 📂 service/
│   │   │               ├── ⚙️ UserService.java        # Service interface
│   │   │               └── 🔧 UserServiceImpl.java    # Service implementation
│   │   └── 📂 resources/
│   │       └── ⚙️ application.properties              # Config
│   └── 📂 test/
│       └── 📂 java/
│           └── com/
│               └── example/
│                   └── spring_boot_user_demo/
│                       └── 🧪 UserServiceTests.java   # Unit tests
├── 📜 build.gradle                                   # Build config
└── 📖 README.md                                     # This file

## ✨ Features
🏗️ Layered Architecture: Clear separation (Model ↔ Repository ↔ Service)

💉 Dependency Injection: Spring-managed components (@Autowired)

🧠 In-Memory Storage: Array-based fake repository

🧪 Unit Testing: 90%+ coverage with Mockito

🛠️ Spring Boot Best Practices: Proper annotations usage

## 🛠️ Technologies
Technology	Icon	Purpose
Java 17	<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original.svg" width="20">	Core language
Spring Boot	<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/spring/spring-original.svg" width="20">	Framework
Gradle	<img src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/gradle/gradle-plain.svg" width="20">	Build tool
JUnit 5	<img src="https://junit.org/junit5/assets/img/junit5-logo.png" width="20">	Testing
Mockito	<img src="https://site.mockito.org/favicon.ico" width="20">	Mocking

## ⚙️ Installation
```text
git clone https://github.com/yourusername/spring-boot-user-demo.git
cd spring-boot-user-demo

## 🏃 Running the Application
```text
./gradlew bootRun

<details> <summary> ## 📺 Expected Output</summary>
```text
🟢 User 'John' added with ID: 1
👋 Hello John Doe
❌ User 'John' removed
</details>

## 🧪 Running Tests
```text
./gradlew test

##📜 License
Distributed under the MIT License. See LICENSE for more information.

📬 Contact
<img src="https://cdn-icons-png.flaticon.com/512/561/561127.png" width="16"> Luyanda Xhakaza - lloyiswa2003@gmail.com
<img src="https://cdn-icons-png.flaticon.com/512/733/733609.png" width="16"> Project Link: https://github.com/luyandaaaa/spring-boot-user-demo
