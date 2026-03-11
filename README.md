
---

# 📚 BiblioUni – Sistema de Biblioteca

### Proyecto Integrador 2 – Semana 09

Sistema académico desarrollado con **Java y Spring Boot** que permite gestionar préstamos de libros en una biblioteca universitaria.

En esta iteración del proyecto se agregó la **entidad Cupón**, permitiendo aplicar descuentos a las multas generadas en los préstamos.

---

# ✨ Nueva Funcionalidad – Cupones de Descuento

Se implementó una entidad llamada **Cupon** que representa un **descuento aplicable a un préstamo**.

El objetivo es permitir que un préstamo pueda **reducir su multa mediante un cupón registrado en el sistema**.

### 📦 Entidad Cupon

La entidad contiene información como:

* Código del cupón
* Descuento aplicado
* Fecha de expiración
* Estado (activo/inactivo)

Ejemplo conceptual:

```
Cupon
-------------------
id
codigo
descuento
fechaExpiracion
activo
```

---

# 🔗 Relación entre las entidades

Se estableció una relación entre:

```
Prestamo  ——  Cupon
```

### Tipo de relación

Se utilizó una **relación de asociación**.

Esto se debe a que:

* Un **cupón puede existir sin estar asociado a un préstamo**
* Un **préstamo puede existir sin un cupón aplicado**

---

# 📊 Multiplicidad

La multiplicidad definida es:

* 📖 **Un préstamo puede tener 0 o 1 cupón**
* 🎟️ **Un cupón puede aplicarse a muchos préstamos**

Representación conceptual:

```
Prestamo 0..1 -------- 1 Cupon
```

En **JPA / Spring Boot** esto se implementó como:

```java
@ManyToOne
@JoinColumn(name = "cupon_id")
private Cupon cupon;
```

Esto significa que **muchos préstamos pueden usar el mismo cupón**.

---

# 🛠 Tecnologías Utilizadas

* ☕ Java 17
* 🌱 Spring Boot
* 🗄 Spring Data JPA
* 🐬 MySQL
* 🎨 Thymeleaf
* 📦 Lombok
* 💻 IntelliJ IDEA

---

# ⚙️ Instalación del Proyecto

## 1️⃣ Clonar el repositorio

Crear una carpeta vacía.

Ejemplo:

```
BIBLIOTECA
```

Luego abrir **Git Bash** en esa carpeta.

Ejecutar:

```bash
git clone https://github.com/Alvarofm-22/BiblioUni
```

---

## 2️⃣ Abrir el proyecto en IntelliJ IDEA

1. Abrir **IntelliJ IDEA**
2. Click en **Open**
3. Seleccionar la carpeta descargada

---

# 🗄 Configuración de Base de Datos

El proyecto usa **MySQL**.

Crear un schema llamado:

```
biblioteca
```

Luego configurar en el archivo:

```
application.properties
```

Ejemplo:

```
spring.datasource.url=jdbc:mysql://localhost:3306/biblioteca
spring.datasource.username=root
spring.datasource.password=TU_CONTRASEÑA
```

---

# ▶️ Ejecutar el Proyecto

Abrir la clase principal:

```
BiblioUniApplication
```

Luego presionar **Run ▶**

Si todo está correcto el proyecto iniciará sin errores.

---

# 🔐 Credenciales de Acceso

Ejecutar el siguiente script:

```sql
INSERT INTO usuarios (nombre, email, password, tipo, estado) 
VALUES (
'Alvaro Flores',
'profesor@gmail.com',
'$2a$10$r8NiOaiWXhYeLi7KEGCAWeT5LRMTFEGGOf.uN8ndwoodS.vutrbeq',
'PROFESOR',
true
);
```

### Usuario

```
profesor@gmail.com
```

### Contraseña

```
123
```

---

# 📚 Insertar Libros de Prueba

Ejecutar el siguiente script en MySQL:

```sql
INSERT INTO biblioteca.libros (isbn, autor, cant_disponible, editorial, titulo) VALUES
('9780141439518','Jane Austen',5,'Penguin Classics','Orgullo y Prejuicio'),
('9780141441146','Jane Austen',4,'Penguin Classics','Sentido y Sensibilidad'),
('9780141441160','Jane Austen',3,'Penguin Classics','Emma'),
('9780141441184','Jane Austen',4,'Penguin Classics','Persuasión'),
('9780141441214','Jane Austen',3,'Penguin Classics','La Abadía de Northanger'),
('9780141439556','Elizabeth Gaskell',3,'Penguin Classics','Norte y Sur'),
('9780141439600','Emily Bronte',3,'Penguin Classics','Cumbres Borrascosas'),
('9780140449266','Victor Hugo',2,'Penguin Classics','Los Miserables'),
('9780141441147','Charlotte Bronte',4,'Penguin Classics','Jane Eyre'),
('9780140449648','Fyodor Dostoevsky',5,'Penguin Classics','Noches Blancas');
```

---

# 🎟 Módulo de Cupones

El sistema permite registrar nuevos cupones desde la interfaz.

### Funcionalidades

✔ Registrar cupón
✔ Listar cupones
✔ Aplicar cupón a un préstamo

---

# 📖 Aplicación de Cupones en Préstamos

Cuando se registra un préstamo el sistema permite **seleccionar un cupón activo**.

Flujo:

```
Registrar Préstamo
       ↓
Seleccionar Usuario
       ↓
Seleccionar Libro
       ↓
Seleccionar Cupón (opcional)
       ↓
Guardar préstamo
```

---

# 🏗 Arquitectura del Proyecto

El sistema sigue una arquitectura por capas:

```
Controller
   ↓
Service
   ↓
Repository
   ↓
Model
   ↓
Database
```

### Capas del proyecto

📂 Model
Contiene las entidades del sistema.

📂 Repository
Interfaces de acceso a datos usando **JpaRepository**.

📂 Service
Define las interfaces de negocio.

📂 ServiceImpl
Implementa la lógica del sistema.

📂 Controller
Gestiona la comunicación con las vistas.

📂 Templates
Contiene las vistas desarrolladas con **Thymeleaf**.

---

# 📷 Evidencia del Sistema

### Registro de Cupones

Sistema permite crear nuevos cupones.

### Aplicación de Cupones

Los cupones registrados pueden aplicarse al momento de registrar un préstamo.

---

# 👨‍💻 Autor

**Álvaro Flores**
Proyecto académico – Desarrollo de Sistemas

GitHub:
[https://github.com/Alvarofm-22](https://github.com/Alvarofm-22)

---

