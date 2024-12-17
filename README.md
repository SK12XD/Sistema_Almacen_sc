# Sistema de Almacén
Practica de sistema de gestión de inventarios, con MySQL y con el uso del WampServer.

## Base de datos
### Nombre: `inventario_db`
### Tabla: `productos`
```sql
CREATE TABLE productos (
    codigo_barras VARCHAR(50) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(50),
    cantidad INT NOT NULL,
    precio DECIMAL(10,2) NOT NULL
);

