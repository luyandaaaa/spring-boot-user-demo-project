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

