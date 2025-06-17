# API REST de Productos

API REST desarrollada en Java con Spring Boot para la gestión de productos en una base de datos MySQL.

## Características

- Operaciones CRUD completas para productos
- Validación de datos
- Manejo de excepciones
- Documentación de API

## Estructura de la Base de Datos

```sql
CREATE TABLE productos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    descripcion TEXT,
    cantidad_disponible INT NOT NULL DEFAULT 0,
    precio_compra DECIMAL(10,2) NOT NULL,
    precio_venta DECIMAL(10,2) NOT NULL,
    fecha_creacion TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
```

## Requisitos

- Java 11 o superior
- Maven
- MySQL

## Configuración

La configuración de la base de datos se encuentra en el archivo `src/main/resources/application.properties`.

## Endpoints de la API

### Obtener todos los productos
```
GET /api/productos
```

### Obtener un producto por ID
```
GET /api/productos/{id}
```

### Crear un nuevo producto
```
POST /api/productos
```

Ejemplo de cuerpo de la solicitud:
```json
{
  "nombre": "Producto Ejemplo",
  "descripcion": "Descripción del producto",
  "cantidadDisponible": 100,
  "precioCompra": 10.50,
  "precioVenta": 15.75
}
```

### Actualizar un producto existente
```
PUT /api/productos/{id}
```

### Eliminar un producto
```
DELETE /api/productos/{id}
```

## Ejecución

Para ejecutar la aplicación:

```
mvn spring-boot:run
```

La API estará disponible en: `http://localhost:8080/api/productos`
