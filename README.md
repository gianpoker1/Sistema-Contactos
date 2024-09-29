 # Sistema de Gestión de Contactos

Este proyecto es un sistema de gestión de contactos desarrollado en Java utilizando el framework Spring y Thymeleaf para la interfaz de usuario. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre los registros de contactos.

## Características

- **Listado de Contactos:** Visualiza una lista de todos los contactos registrados.
- **Agregar Contacto:** Permite agregar nuevos contactos al sistema.
- **Editar Contacto:** Permite editar la información de los contactos existentes.
- **Eliminar Contacto:** Permite eliminar contactos del sistema.

## Tecnologías Utilizadas

- **Java:** Lenguaje de programación.
- **Spring Framework:** Framework para el desarrollo de aplicaciones Java.
- **Thymeleaf:** Motor de plantillas para la creación de páginas web dinámicas.
- **Bootstrap:** Framework CSS para el diseño de la interfaz de usuario.

## Estructura del Proyecto

- **src/main/java/gian/contactos/controller:** Contiene los controladores de Spring.
- **src/main/java/gian/contactos/model:** Contiene las clases de modelo.
- **src/main/java/gian/contactos/service:** Contiene los servicios de Spring.
- **src/main/resources/templates:** Contiene las plantillas Thymeleaf.

## Instrucciones de Uso

1. **Clonar el Repositorio:**
   ```bash
   git clone https://github.com/gianpoker1/Sistema-Contactos.git

2. **Configurar el Entorno:**

  Asegúrate de tener instalado Java y Maven.
  Configura tu base de datos y actualiza las configuraciones en el archivo `application.properties`

3. **Compilar y Ejecutar:**

    ```
    mvn clean install
    mvn spring-boot:run
    ```
4. **Acceder a la Aplicación:**

Abre tu navegador y visita `http://localhost:8080`
    
