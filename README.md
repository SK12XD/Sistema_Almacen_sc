Practica de un sistema de alamacen de herramientas.
Tablas creadas hasta ahora:
CREATE TABLE productos (
    codigo_barras VARCHAR(50) PRIMARY KEY,
    nombre VARCHAR(100) NOT NULL,
    categoria VARCHAR(50) NOT NULL,
    cantidad INT NOT NULL,
    descripcion TEXT
);

CREATE TABLE usuarios (
    id_usuario INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    password VARCHAR(100) NOT NULL,
    rol VARCHAR(20) NOT NULL
);

//Esto lo dejo para el uso con el mySQL.
INSERT INTO usuarios (username, password, rol) VALUES
('admin', '1234', 'admin');
