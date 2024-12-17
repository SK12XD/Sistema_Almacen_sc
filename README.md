#Sistema de almacen.
La base de datos, usa MySql con la ayuda del WampServer.
Codigo_Database:
inventario_db;
TABLE productos (
    codigo_barras VARCHAR(50) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(50),
    cantidad INT NOT NULL,
    precio DECIMAL(10,2) NOT NULL
);
