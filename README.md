PS: This project was developed using GitHub Codespaces. This ensures a consistent, cloud-native development environment and allows the API to be built, tested, and deployed seamlessly regardless of local hardware specifications.
PS：本项目使用 GitHub Codespaces 开发。这确保了一致的云原生开发环境，并允许 API 的构建、测试和部署无缝进行，而无需考虑本地硬件规格。

🚀 Employee Management API (Restful & JPA Evolution)
本项目是一个基于 Spring Boot 3.x 构建的高性能后端 RESTful API 系统。它不仅实现了完整的员工数据管理逻辑，更体现了从“内存存储”到“数据库持久化”的架构演进过程。
This project is a high-performance RESTful API built with Spring Boot 3.x. It implements comprehensive employee management logic and demonstrates the architectural evolution from in-memory storage to database persistence.
🚩 Project Evolution Status / 项目演进状态:
    Phase 1: REST API with In-Memory ArrayList (Completed ✅)
    Phase 2: JPA & H2 Database Integration (Already merged from branch to main🚧)
      Note: Database features are currently being developed in the H2JPAVersion branch.
      注：数据库功能目前正在 H2JPAVersion 分支中进行开发。
 
🏗️ System Architecture (系统架构)
本项目遵循现代分布式系统的解耦原则，采用标准的 MVC 分层架构。
This project follows the decoupling principle of modern distributed systems, utilizing a standard MVC layered architecture.
App 1 (Client): Postman / Frontend. 发送包含 URI、Method 和 Body 的 Requests。
    Postman / Frontend. Sends Requests containing a URI, Method, and Body.

App 2 (Server): 本 Spring Boot 应用。处理业务逻辑并返回 Responses。
    This Spring Boot application. Processes logic and sends back Responses (Status 200, 400, 500).
    Significance / 意义: 这种架构允许后端与任何前端或跨语言客户端无缝通信，因为它们共享同一种“语言”：JSON over HTTP。
    This architecture allows seamless communication with any frontend or cross-language client via JSON over HTTP.

🛠️ Technical Stack (技术栈)
  Framework: Spring Boot 3.2.5
  Language: Java 17
  Database (Branch: H2JPAVersion): H2 (In-Memory)
  Persistence: Spring Data JPA / Hibernate
  Tools: Lombok, Jackson, Postman, GitHub Codespaces
  Architecture: RESTful API (GET, POST, PUT, DELETE)

💡 Development Insights (开发实战细节)
1. Spring Boot Annotations Dictionary (核心注解词典)
| Annotation | Description (中) | Description (En) |
|---|---|---|
| @RestController | 标记为处理 JSON 的 Web 处理器 | Marks the class as a JSON web handler |
| @Service | 业务逻辑提供者 | Marks the business logic provider |
| @Autowired | 依赖注入 (DI) | Enables Dependency Injection |
| @RequestBody | JSON 到对象的映射 | Maps JSON Body to Java Object |
| @Entity | JPA 实体映射 | Maps Java class to Database table |
2. Troubleshooting & Solutions (踩坑记录与解决方案)
  HTTP 400 Bad Request (JSON Mapping):
   * Issue: Jackson library failed to instantiate the object.
   * Solution: Ensure the Entity has a No-Args Constructor and Setters (or use Lombok @Data).
   * 问题：Jackson 库无法实例化对象。
   * 解法：确保实体类具备无参构造函数和 Setters（或使用 Lombok @Data）。
  HTTP 500 Internal Server Error:
   * Issue: Server crashed when accessing non-existent IDs.
   * Solution: Implemented boundary checks in Service layer using .orElseThrow().
   * 问题：操作不存在的 ID 时服务器崩溃。
   * 解法：在服务层引入 .orElseThrow() 进行边界检查，实现优雅异常处理。
  H2 Console 404 & Connection:
   * Issue: Database not found in Codespaces.
   * Solution: Ensure spring.h2.console.enabled=true and use JDBC URL: jdbc:h2:mem:testdb.
   * 问题：在 Codespaces 环境下找不到 H2 数据库。
   * 解法：开启 H2 控制台配置，并统一使用 JDBC URL: jdbc:h2:mem:testdb。

💻 Linux & Git Command Cheat Sheet (指令集)
    Process Management (进程管理)
    Kill the process on port 8080 / 强制杀死 8080 端口进程
    fuser -k 8080/tcp
    
    Git Workflow (Git 工作流)
    # Standard push / 标准提交
    git add .
    git commit -m "docs:"
    git push origin H2JPAVersion
    Phase 1: RESTful API Development
    
Data Persistence Note
數據持久化筆記
Currently, data is stored in memory. To enable file-based persistence, update the JDBC URL in application.properties to: jdbc:h2:file:./data/employee_db.
目前數據存儲在內存中。若要啟用文件持久化，請將 application.properties 中的 JDBC URL 更新為：jdbc:h2:file:./data/employee_db。

🚩 Future Roadmap (未来路线图)
   In-Memory ArrayList CRUD / 基于内存的增删改查截圖附件在根目錄（done，PostMan Testing in screnshot file under root）
   JPA & H2 Integration / 集成 H2 数据库与 JPA
   Implement Repository Layer / 实现 Repository 持久层 🚧
   Token-based Authentication (JWT) / 引入 JWT 认证


