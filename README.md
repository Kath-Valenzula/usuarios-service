📦 usuarios-service
Microservicio desarrollado en Java + Spring Boot para la gestión de usuarios.
Incluye funcionalidades CRUD completas, validaciones automáticas, conexión a base de datos Oracle XE y manejo global de errores.

🚀 Tecnologías usadas
Java 21

Spring Boot 3.2.12

Spring Data JPA

Spring Validation (JSR 380)

Oracle Database XE 21c (Docker)

Maven

Git y GitHub

🛠️ Funcionalidades principales
Crear usuario

Consultar todos los usuarios

Buscar usuario por ID

Actualizar datos de un usuario

Eliminar usuario

Validaciones automáticas con anotaciones @Valid

Manejo de errores personalizados con GlobalExceptionHandler

⚙️ Configuración de base de datos (application.properties)
properties
Copiar
Editar
spring.datasource.url=jdbc:oracle:thin:@localhost:1521/XEPDB1
spring.datasource.username=system
spring.datasource.password=admin123
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.database-platform=org.hibernate.dialect.OracleDialect

server.port=8081
🖥️ Cómo levantar el proyecto
Asegúrate de tener Oracle XE ejecutándose en Docker.

Clona el repositorio:

bash
Copiar
Editar
git clone https://github.com/Kath-Valenzula/usuarios-service.git
Abre el proyecto en tu IDE favorito (IntelliJ, VSCode, Eclipse).

Ejecuta la clase principal UsuariosServiceApplication.java.

Prueba los endpoints usando Postman, Insomnia o el archivo .http incluido.

✅ Estado del proyecto: 100% funcional.
✏️ Autor: Katherine Valenzuela
