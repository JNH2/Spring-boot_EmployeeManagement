Employee Management System Project
員工管理系統項目
Phase 1: RESTful API Development
第一階段：RESTful API 開發
In this phase, we established the core CRUD functionality. We used a Service layer to handle business logic and an ArrayList as a temporary in-memory database. This helped us understand the separation of concerns between Controllers and Services.
在此階段，我們建立了核心的 CRUD 功能。我們使用 Service 層處理業務邏輯，並使用 ArrayList 作為臨時的內存數據庫。這有助於我們理解 Controller 與 Service 之間的職責分離。
Phase 2: JPA and Database Persistence
第二階段：JPA 與數據庫持久化
We evolved the system to include persistent storage using Spring Data JPA and the H2 Database. By implementing the Repository pattern, we enabled the application to automatically translate Java objects into SQL. We also added custom exception handling for better API reliability.
我們將系統演進為使用 Spring Data JPA 和 H2 數據庫的持久化存儲。透過實現 Repository 模式，我們使應用程序能夠自動將 Java 對象翻譯為 SQL。我們還增加了自定義異常處理，以提高 API 的可靠性。
Data Persistence Note
數據持久化筆記
Currently, data is stored in memory. To enable file-based persistence, update the JDBC URL in application.properties to: jdbc:h2:file:./data/employee_db.
目前數據存儲在內存中。若要啟用文件持久化，請將 application.properties 中的 JDBC URL 更新為：jdbc:h2:file:./data/employee_db。