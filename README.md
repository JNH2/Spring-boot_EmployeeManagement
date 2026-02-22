PS: This project was developed using GitHub Codespaces. This ensures a consistent, cloud-native development environment and allows the API to be built, tested, and deployed seamlessly regardless of local hardware specifications.
PS：本项目使用 GitHub Codespaces 开发。这确保了一致的云原生开发环境，并允许 API 的构建、测试和部署无缝进行，而无需考虑本地硬件规格。

项目简介 / Project Overview
本项目是一个基于 Spring Boot 3.x 构建的后端 RESTful API 系统。它模拟了真实企业开发中对员工数据的管理流程，实现了从前端请求到后端逻辑处理的完整闭环。在开发过程中，遇到并独立解决了端口冲突、JSON 序列化失败（400 错误）以及业务逻辑异常（500 错误）等实战问题。
This project is a high-performance Spring Boot 3.x RESTful API designed for employee data management. It demonstrates a full-cycle backend implementation from handling HTTP requests to executing business logic. During development, it successfully troubleshoted real-world issues including port conflicts, JSON mapping errors, and server-side logic exceptions.

技术栈 / Technical Stack
Framework: Spring Boot 3.x (Web, DevTools)
Language: Java 17+
Architecture: RESTful API (GET, POST, PUT, DELETE)
Testing: Postman

核心功能 / Core Features
Decoupled Architecture: Implemented using Controller, Service, and Entity layers for better maintainability
解耦架构：采用控制器、服务、实体三层架构，以提高可维护性。
Data Processing: Utilized Java Stream API for efficient data filtering and management within an ArrayList-based memory store.
数据处理：利用 Java Stream API 在基于 ArrayList 的内存存储中进行高效的数据过滤和管理。
Robust Communication: Handled complex JSON-to-Object mapping using Jackson, ensuring seamless frontend-backend integration.
强大的通信：使用 Jackson 处理复杂的 JSON 到对象映射，确保前后端无缝集成。

开发挑战与解决方案 / Troubleshooting & Solutions
HTTP 400 Bad Request
   * Issue: JSON mapping failed when receiving data from Postman.
   * Solution: Identified that the Employee entity lacked a no-args constructor and setter methods. Resolved by implementing them to allow Jackson library to instantiate and populate objects.
HTTP 400 错误请求
问题：从 Postman 接收数据时，JSON 映射失败。
解决方案：发现 Employee 实体缺少无参构造函数和 setter 方法。通过实现这些方法，允许 Jackson 库实例化和填充对象，从而解决了此问题。
HTTP 500 Internal Server Error
   * Issue: Server crashed when attempting to update or delete non-existent IDs.
   * Solution: Implemented boundary checks in the Service layer using .orElseThrow() to manage exceptions gracefully and provide meaningful error feedback.
HTTP 500 内部服务器错误
问题：尝试更新或删除不存在的 ID 时，服务器崩溃。
解决方案：在服务层使用 `.orElseThrow()` 实现边界检查，以优雅地处理异常并提供有意义的错误反馈。

Port Management
   * Issue: Port 8080 was frequently occupied in the Cloud Environment (Codespaces).
   * Solution: Mastered Linux terminal commands (fuser -k 8080/tcp) to manage process lifecycles and ensure service availability.
端口管理
问题：云环境（代码空间）中 8080 端口经常被占用。
解决方案：掌握了 Linux 终端命令（例如 `fuser -k 8080/tcp`）来管理进程生命周期并确保服务可用性。

如何运行 / How to Run 
Clone this repository.
Ensure Java 17 and Maven are installed.
Run mvn spring-boot:run.
Access the API via http://localhost:8080/api/v1/employees.

Terminal 提交代码专用命令：
git add .
git commit -m "feat: complete Employee CRUD with ArrayList and optimized README"
git push origin main


PostMan Testing in screnshot file under root
