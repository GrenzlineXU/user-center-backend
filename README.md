User Management Center

Project Introduction A one-stop user management system based on Spring Boot + React, implementing user registration, login, search, and management functions.

Frontend:
HTML, CSS, Js, TS, React, Ant Desgin pro, Ant Design, Umi, Umi Request, Forward/Reverse Proxy

Backend:
Java, Spring, SpringMVC, SpringBoot, Mybatis, Mybatis-plus, MySQL, JUnit, Maven

Infra:
Nginx, EC2, RDS, Xsell

Backend points:
1. Used MyBatis + MyBatis-Plus for data operation encapsulation, implemented many reusable methods, and leveraged inheritance to define a universal operation template, greatly improving project development efficiency.
2. To standardize API responses, customized response errors and implemented global exception handling, ensuring consistent error responses and reducing unnecessary log outputs.
3. Standardized JSON processing within the project and applied the double-checked locking singleton pattern for object management, enabling object reuse and avoiding redundant object creation, thereby improving maintainability. (Code examples for the double-checked locking pattern can be provided if needed.)
4. Used Nginx for project deployment and Docker containers for environment setup. Additionally, utilized role-based access control to enforce project security.
5. Used JUnit Jupiter API, leveraging @Test annotations and assertions to implement unit testing for common modules, achieving a test coverage rate of 90%.
6. Managed multiple environments in Spring Boot using the application-{env}.yml configuration files, allowing dynamic environment switching via --spring.profiles.active=prod.
7. Configured Nginx reverse proxy to forward frontend API requests and resolve cross-origin issues using proxy_pass.


Register menu:
![unnamed](https://github.com/user-attachments/assets/d5878246-1ee0-4d80-9177-b061475a4b88)

Login menu:
![WeChat截图_20241212072922](https://github.com/user-attachments/assets/3ce6c545-07f5-4fcb-9e1e-fce52d0b4c75)

Manager menu:
![WeChat截图_20241216072045](https://github.com/user-attachments/assets/ac4b169d-e68b-4d20-94dd-be8b21a94a85)
