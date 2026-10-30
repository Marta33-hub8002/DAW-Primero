CREATE TABLE categorias (
    id      INTEGER PRIMARY KEY,
    nombre  VARCHAR(50) NOT NULL UNIQUE
);

CREATE TABLE restaurantes (
    id           INTEGER PRIMARY KEY,
    nombre       VARCHAR(100) NOT NULL,
    tipo_cocina  VARCHAR(50)  NOT NULL,
    barrio       VARCHAR(50)  NOT NULL,
    valoracion   NUMERIC(2,1) CHECK (valoracion BETWEEN 0 AND 5)
);

CREATE TABLE platos (
    id              INTEGER PRIMARY KEY,
    restaurante_id  INTEGER NOT NULL REFERENCES restaurantes(id),
    categoria_id    INTEGER NOT NULL REFERENCES categorias(id),
    nombre          VARCHAR(100) NOT NULL,
    precio          NUMERIC(6,2) NOT NULL CHECK (precio > 0)
);

CREATE TABLE clientes (
    id          INTEGER PRIMARY KEY,
    nombre      VARCHAR(50)  NOT NULL,
    apellidos   VARCHAR(100) NOT NULL,
    email       VARCHAR(100) NOT NULL UNIQUE,
    barrio      VARCHAR(50)  NOT NULL,
    fecha_alta  DATE NOT NULL
);

CREATE TABLE repartidores (
    id          INTEGER PRIMARY KEY,
    nombre      VARCHAR(50) NOT NULL,
    vehiculo    VARCHAR(20) NOT NULL CHECK (vehiculo IN ('Moto', 'Bicicleta', 'Patinete')),
    fecha_alta  DATE NOT NULL
);

CREATE TABLE pedidos (
    id              INTEGER PRIMARY KEY,
    cliente_id      INTEGER NOT NULL REFERENCES clientes(id),
    restaurante_id  INTEGER NOT NULL REFERENCES restaurantes(id),
    repartidor_id   INTEGER REFERENCES repartidores(id),
    fecha_hora      TIMESTAMP NOT NULL,
    estado          VARCHAR(20) NOT NULL CHECK (estado IN ('en_reparto', 'entregado', 'cancelado'))
);

CREATE TABLE lineas_pedido (
	id_linea_pedido  INTEGER PRIMARY KEY,
    pedido_id        INTEGER NOT NULL REFERENCES pedidos(id),
    plato_id         INTEGER NOT NULL REFERENCES platos(id),
    cantidad         INTEGER NOT NULL CHECK (cantidad > 0),
    precio_unitario  NUMERIC(6,2) NOT NULL
);


INSERT INTO categorias (id, nombre) VALUES
    (1, 'Entrantes'),
    (2, 'Principales'),
    (3, 'Postres'),
    (4, 'Bebidas'),
    (5, 'Ensaladas');

INSERT INTO restaurantes (id, nombre, tipo_cocina, barrio, valoracion) VALUES
    (1, 'Trattoria Nonna Lucia', 'Italiana', 'Chamberí', 4.6),
    (2, 'Sakura Sushi Bar', 'Japonesa', 'Malasaña', 4.4),
    (3, 'El Fogón de Paco', 'Española', 'Carabanchel', 4.2),
    (4, 'Taquería La Catrina', 'Mexicana', 'Lavapiés', 4.5),
    (5, 'Burger Lab', 'Hamburguesas', 'Chamberí', 3.9),
    (6, 'Curry House', 'India', 'Lavapiés', 4.1);

INSERT INTO platos (id, restaurante_id, categoria_id, nombre, precio) VALUES
    (1, 1, 1, 'Burrata con tomate', 11.50),
    (2, 1, 2, 'Pizza margarita', 12.00),
    (3, 1, 2, 'Lasaña boloñesa', 13.50),
    (4, 1, 2, 'Spaghetti carbonara', 12.50),
    (5, 1, 3, 'Tiramisú', 6.00),
    (6, 1, 4, 'Agua mineral', 2.00),
    (7, 2, 1, 'Gyozas de pollo', 7.50),
    (8, 2, 2, 'Bandeja sushi 12 piezas', 18.00),
    (9, 2, 2, 'Ramen tonkotsu', 14.00),
    (10, 2, 5, 'Ensalada wakame', 6.50),
    (11, 2, 3, 'Mochis variados', 5.50),
    (12, 2, 4, 'Té verde frío', 3.00),
    (13, 3, 1, 'Croquetas de jamón', 9.00),
    (14, 3, 1, 'Patatas bravas', 6.50),
    (15, 3, 2, 'Cocido madrileño', 15.00),
    (16, 3, 2, 'Tortilla de patatas', 10.00),
    (17, 3, 3, 'Arroz con leche', 5.00),
    (18, 3, 4, 'Refresco de limón', 2.50),
    (19, 4, 1, 'Nachos con guacamole', 8.50),
    (20, 4, 2, 'Tacos al pastor (3 uds.)', 10.50),
    (21, 4, 2, 'Burrito de cochinita', 11.00),
    (22, 4, 3, 'Churros con chocolate', 5.50),
    (23, 4, 4, 'Agua de jamaica', 3.50),
    (24, 5, 1, 'Alitas de pollo', 8.00),
    (25, 5, 2, 'Hamburguesa clásica', 11.90),
    (26, 5, 2, 'Hamburguesa vegana', 12.90),
    (27, 5, 5, 'Ensalada César', 9.50),
    (28, 5, 3, 'Brownie', 5.00),
    (29, 5, 4, 'Refresco de cola', 2.50),
    (30, 6, 2, 'Pollo tikka masala', 13.00),
    (31, 6, 2, 'Curry de garbanzos', 11.00),
    (32, 6, 1, 'Samosas (4 uds.)', 6.00),
    (33, 6, 3, 'Lassi de mango', 4.50);

INSERT INTO clientes (id, nombre, apellidos, email, barrio, fecha_alta) VALUES
    (1, 'Lucía', 'Martín Gómez', 'lucia.martin@correo.es', 'Chamberí', '2025-03-14'),
    (2, 'Carlos', 'Ruiz Sánchez', 'carlos.ruiz@correo.es', 'Carabanchel', '2025-05-02'),
    (3, 'Marta', 'López Díaz', 'marta.lopez@correo.es', 'Lavapiés', '2025-06-21'),
    (4, 'Javier', 'Pérez Molina', 'javier.perez@correo.es', 'Malasaña', '2025-08-09'),
    (5, 'Elena', 'García Ortiz', 'elena.garcia@correo.es', 'Chamberí', '2025-09-30'),
    (6, 'Pablo', 'Fernández Gil', 'pablo.fernandez@correo.es', 'Carabanchel', '2025-11-12'),
    (7, 'Sara', 'Jiménez Vega', 'sara.jimenez@correo.es', 'Usera', '2026-01-05'),
    (8, 'Diego', 'Moreno Castro', 'diego.moreno@correo.es', 'Lavapiés', '2026-01-28'),
    (9, 'Laura', 'Navarro Ramos', 'laura.navarro@correo.es', 'Malasaña', '2026-02-17'),
    (10, 'Andrés', 'Romero Serrano', 'andres.romero@correo.es', 'Carabanchel', '2026-03-03'),
    (11, 'Nuria', 'Torres Blanco', 'nuria.torres@correo.es', 'Chamberí', '2026-04-22'),
    (12, 'Hugo', 'Domínguez Rubio', 'hugo.dominguez@correo.es', 'Usera', '2026-05-15'),
    (13, 'Irene', 'Vázquez Prieto', 'irene.vazquez@correo.es', 'Lavapiés', '2026-06-08'),
    (14, 'Álex', 'Santos Herrera', 'alex.santos@correo.es', 'Malasaña', '2026-09-19'),
    (15, 'Paula', 'Iglesias Núñez', 'paula.iglesias@correo.es', 'Usera', '2026-10-10');

INSERT INTO repartidores (id, nombre, vehiculo, fecha_alta) VALUES
    (1, 'Óscar', 'Moto', '2024-02-01'),
    (2, 'Raquel', 'Bicicleta', '2024-07-15'),
    (3, 'Iván', 'Moto', '2025-01-10'),
    (4, 'Celia', 'Patinete', '2025-06-01'),
    (5, 'Rubén', 'Bicicleta', '2026-03-20'),
    (6, 'Noelia', 'Moto', '2026-10-15');

INSERT INTO pedidos (id, cliente_id, restaurante_id, repartidor_id, fecha_hora, estado) VALUES
    (1, 12, 2, 2, '2026-10-01 14:00', 'entregado'),
    (2, 4, 3, 1, '2026-10-01 14:20', 'entregado'),
    (3, 13, 5, 4, '2026-10-01 20:00', 'entregado'),
    (4, 6, 3, 1, '2026-10-02 14:41', 'entregado'),
    (5, 1, 4, 3, '2026-10-02 15:05', 'entregado'),
    (6, 8, 4, 3, '2026-10-03 21:33', 'entregado'),
    (7, 9, 4, NULL, '2026-10-03 14:12', 'cancelado'),
    (8, 13, 5, 2, '2026-10-04 15:41', 'entregado'),
    (9, 10, 5, 3, '2026-10-04 14:20', 'entregado'),
    (10, 5, 1, 5, '2026-10-05 22:12', 'entregado'),
    (11, 13, 1, 1, '2026-10-05 22:05', 'entregado'),
    (12, 9, 5, 1, '2026-10-05 22:33', 'entregado'),
    (13, 2, 2, 2, '2026-10-06 20:41', 'entregado'),
    (14, 6, 4, 5, '2026-10-06 15:12', 'entregado'),
    (15, 6, 5, 3, '2026-10-07 13:05', 'entregado'),
    (16, 2, 5, 5, '2026-10-07 14:55', 'entregado'),
    (17, 9, 4, 2, '2026-10-08 21:20', 'entregado'),
    (18, 1, 3, 2, '2026-10-08 14:41', 'entregado'),
    (19, 6, 1, NULL, '2026-10-09 14:00', 'cancelado'),
    (20, 13, 3, 4, '2026-10-09 22:20', 'entregado'),
    (21, 12, 1, 1, '2026-10-10 21:55', 'entregado'),
    (22, 4, 1, 4, '2026-10-10 14:20', 'entregado'),
    (23, 13, 5, 5, '2026-10-10 14:55', 'entregado'),
    (24, 13, 5, 2, '2026-10-11 13:05', 'entregado'),
    (25, 7, 4, 5, '2026-10-11 22:33', 'entregado'),
    (26, 10, 3, 5, '2026-10-12 13:00', 'entregado'),
    (27, 7, 1, 5, '2026-10-12 14:20', 'entregado'),
    (28, 4, 4, 3, '2026-10-13 21:33', 'entregado'),
    (29, 13, 5, 1, '2026-10-13 22:41', 'entregado'),
    (30, 6, 2, 4, '2026-10-14 14:20', 'entregado'),
    (31, 2, 5, NULL, '2026-10-14 14:33', 'cancelado'),
    (32, 9, 3, 1, '2026-10-14 15:33', 'entregado'),
    (33, 1, 2, 2, '2026-10-15 20:00', 'entregado'),
    (34, 6, 3, 2, '2026-10-15 14:00', 'entregado'),
    (35, 11, 1, 5, '2026-10-16 15:20', 'entregado'),
    (36, 13, 4, 2, '2026-10-16 21:48', 'entregado'),
    (37, 5, 5, 2, '2026-10-17 22:41', 'entregado'),
    (38, 6, 4, 4, '2026-10-17 14:33', 'entregado'),
    (39, 6, 4, 3, '2026-10-18 14:48', 'en_reparto'),
    (40, 7, 1, 3, '2026-10-18 15:41', 'en_reparto');

INSERT INTO lineas_pedido (id_linea_pedido, pedido_id, plato_id, cantidad, precio_unitario) VALUES
    (1, 1, 7, 1, 7.50),
    (2, 1, 11, 1, 5.50),
    (3, 2, 18, 1, 2.50),
    (4, 2, 17, 1, 5.00),
    (5, 3, 26, 3, 12.90),
    (6, 3, 25, 1, 10.90),
    (7, 3, 28, 1, 5.00),
    (8, 4, 17, 1, 5.00),
    (9, 4, 13, 2, 9.00),
    (10, 4, 16, 2, 10.00),
    (11, 4, 18, 2, 2.50),
    (12, 5, 20, 2, 10.50),
    (13, 6, 21, 1, 11.00),
    (14, 6, 23, 1, 3.50),
    (15, 7, 22, 1, 5.50),
    (16, 7, 23, 3, 3.50),
    (17, 8, 26, 1, 12.90),
    (18, 9, 29, 1, 2.50),
    (19, 9, 27, 3, 9.50),
    (20, 10, 5, 1, 6.00),
    (21, 10, 4, 1, 12.50),
    (22, 10, 3, 3, 13.50),
    (23, 11, 2, 1, 12.00),
    (24, 11, 4, 1, 12.50),
    (25, 12, 29, 2, 2.50),
    (26, 13, 7, 1, 7.50),
    (27, 13, 9, 1, 14.00),
    (28, 13, 10, 2, 6.50),
    (29, 13, 11, 2, 5.50),
    (30, 14, 23, 1, 3.50),
    (31, 15, 24, 2, 8.00),
    (32, 15, 25, 3, 10.90),
    (33, 16, 25, 3, 10.90),
    (34, 16, 27, 1, 9.50),
    (35, 17, 22, 2, 5.50),
    (36, 17, 21, 1, 11.00),
    (37, 17, 20, 1, 10.50),
    (38, 18, 13, 2, 9.00),
    (39, 18, 18, 1, 2.50),
    (40, 19, 3, 1, 13.50),
    (41, 19, 4, 1, 12.50),
    (42, 20, 13, 2, 9.00),
    (43, 20, 18, 1, 2.50),
    (44, 21, 4, 2, 12.50),
    (45, 22, 4, 1, 12.50),
    (46, 22, 2, 1, 12.00),
    (47, 23, 24, 2, 8.00),
    (48, 24, 27, 3, 9.50),
    (49, 24, 29, 1, 2.50),
    (50, 24, 25, 1, 11.90),
    (51, 24, 28, 1, 5.00),
    (52, 25, 20, 3, 10.50),
    (53, 25, 23, 1, 3.50),
    (54, 25, 22, 1, 5.50),
    (55, 25, 19, 2, 8.50),
    (56, 26, 13, 1, 9.00),
    (57, 26, 17, 1, 5.00),
    (58, 27, 5, 2, 6.00),
    (59, 27, 1, 1, 11.50),
    (60, 28, 21, 1, 11.00),
    (61, 28, 22, 2, 5.50),
    (62, 29, 28, 1, 5.00),
    (63, 29, 29, 1, 2.50),
    (64, 29, 24, 1, 8.00),
    (65, 29, 27, 1, 9.50),
    (66, 30, 11, 2, 5.50),
    (67, 30, 7, 1, 7.50),
    (68, 30, 9, 2, 14.00),
    (69, 31, 26, 2, 12.90),
    (70, 31, 29, 2, 2.50),
    (71, 32, 18, 1, 2.50),
    (72, 33, 8, 2, 18.00),
    (73, 33, 10, 1, 6.50),
    (74, 33, 9, 1, 14.00),
    (75, 34, 14, 2, 6.50),
    (76, 34, 13, 2, 9.00),
    (77, 34, 15, 2, 15.00),
    (78, 34, 18, 2, 2.50),
    (79, 35, 5, 3, 6.00),
    (80, 35, 2, 2, 12.00),
    (81, 35, 1, 2, 11.50),
    (82, 35, 3, 1, 13.50),
    (83, 36, 20, 2, 10.50),
    (84, 36, 19, 2, 8.50),
    (85, 36, 23, 1, 3.50),
    (86, 37, 24, 1, 8.00),
    (87, 37, 25, 1, 11.90),
    (88, 38, 19, 1, 8.50),
    (89, 38, 23, 3, 3.50),
    (90, 38, 20, 1, 10.50),
    (91, 39, 23, 1, 3.50),
    (92, 39, 19, 2, 8.50),
    (93, 39, 20, 1, 10.50),
    (94, 39, 22, 3, 5.50),
    (95, 40, 1, 1, 11.50),
    (96, 40, 3, 1, 13.50),
    (97, 40, 4, 1, 12.50);

--15. ¿En que fechas se vendieron platos con un precio distinto al precio de la carta?
SELECT DISTINCT pedidos.fecha_hora::date as fecha
FROM lineas_pedido
JOIN pedidos
on lineas_pedido.pedido_id = pedidos.id
JOIN platos
on lineas_pedido.plato_id = platos.id
WHERE lineas_pedido.precio_unitario <> platos.precio;
--16. Listado con el número de unidades vendidas de cada plato, ordenado de más a menos.
SELECT  platos.nombre as plato, sum(lineas_pedido.cantidad) as unidades_vendidas
FROM lineas_pedido
JOIN platos
on lineas_pedido.plato_id = platos.id
GROUP BY platos.id, platos.nombre
ORDER BY unidades_vendidas DESC;
--17. Nombres de los restaurantes y número de pedidos recibidos de aquellos restaurantes con valoración igual o superior a 4.4.
SELECT restaurantes.id, restaurantes.nombre as nombre_restaurante, restaurantes.valoracion as valoracion, COUNT (*) as numero_pedidos
FROM pedidos
JOIN restaurantes
on  pedidos.restaurante_id = restaurantes.id
WHERE valoracion >= 4.4
GROUP BY restaurantes.id, restaurantes.nombre, restaurantes.valoracion;
--18. Pedidos recibidos en los siete primeros días del mes de junto con el nombre del cliente.
SELECT  pedidos.id, pedidos.fecha_hora ::date as fecha, clientes.nombre as nombre
FROM pedidos
JOIN clientes
on pedidos.cliente_id = clientes.id
WHERE EXTRACT(DAY FROM  pedidos.fecha_hora) BETWEEN 1 AND 7;
--19. Muestra el nombre de cada plato junto con el nombre del restaurante donde se prepara y su categoría.
SELECT  platos.id, platos.nombre as plato_nombre, restaurantes.nombre as nombre_restaurante,categorias.nombre as nombre_categoria
FROM platos
JOIN restaurantes
on platos.restaurante_id = restaurantes.id
JOIN categorias
on platos.categoria_id = categorias.id
GROUP BY platos.id,platos.nombre,restaurantes.nombre,categorias.nombre
ORDER BY platos.id ASC;
--20. Listado con identificadores de todos los pedidos junto con el nombre del cliente y el nombre del restaurante.
SELECT pedidos.id  as id_pedidos, clientes.nombre as nombre_cliente, restaurantes.nombre as nombre_restaurante
FROM pedidos
JOIN clientes
on pedidos.cliente_id = clientes.id
JOIN restaurantes
on pedidos.restaurante_id = restaurantes.id;
--21. Listado con identificadores de todos los pedidos junto con el nombre del cliente y el del repartidor.
SELECT pedidos.id as id_pedidos, clientes.nombre as nombre_cliente, repartidores.nombre as nombre_repartidor
FROM pedidos
JOIN clientes
on pedidos.cliente_id = clientes.id
JOIN repartidores
on pedidos.repartidor_id = repartidores.id;
--22. Listado de identificadores de pedidos que están en reparto, indicando el restaurante y el nombre del repartidor.
SELECT pedidos.id as id_pedido, pedidos.estado as estado, restaurantes.nombre as nombre_restaurante, repartidores.nombre as nombre_repartidor
FROM pedidos
JOIN restaurantes
on pedidos.restaurante_id = restaurantes.id
JOIN repartidores
on pedidos.repartidor_id = repartidores.id
WHERE pedidos.estado = 'en_reparto';
--23. Platos incluidos en el pedido número 10 con su categoría y la cantidad pedida.
SELECT platos.nombre as nombre_plato, categorias.nombre as nombre_categoria, lineas_pedido.cantidad as cantidad
FROM lineas_pedido
JOIN platos
on lineas_pedido.plato_id = platos.id
JOIN categorias
on platos.categoria_id = categorias.id
WHERE lineas_pedido.pedido_id ='10';
--29. Nombres de los clientes que han pedido alguna vez comida japonesa.
SELECT clientes.id, clientes.nombre as clientes, restaurantes.tipo_cocina
FROM pedidos
JOIN clientes
on pedidos.cliente_id = clientes.id
JOIN restaurantes
on pedidos.restaurante_id = restaurantes.id
WHERE restaurantes.tipo_cocina = 'Japonesa'
ORDER BY clientes.nombre ASC;
--30. Número de pedidos que cada repartidor ha llevado a clientes de Lavapiés.
SELECT repartidores.id, repartidores.nombre as repartidor, COUNT(*) as num_pedidos
FROM pedidos
JOIN repartidores
on pedidos.repartidor_id = repartidores.id
JOIN clientes
on pedidos.cliente_id = clientes.id
WHERE clientes.barrio = 'Lavapiés'
GROUP BY repartidores.id, repartidores.nombre;
--31. Pedidos en los que el cliente vive en el mismo barrio que el restaurante.
SELECT pedidos.id as id_pedido, clientes.nombre as cliente,restaurantes.nombre as restaurante, clientes.barrio as barrio
FROM pedidos
JOIN clientes 
on pedidos.cliente_id = clientes.id
JOIN restaurantes 
on pedidos.restaurante_id = restaurantes.id
WHERE clientes.barrio = restaurantes.barrio;
--32. Fechas en las que se vendió la Hamburguesa clásica y precio unitario cobrado.
SELECT pedidos.fecha_hora::date as fecha, lineas_pedido.precio_unitario as precio_cobrado
FROM lineas_pedido
JOIN pedidos 
on lineas_pedido.pedido_id = pedidos.id
JOIN platos 
on lineas_pedido.plato_id = platos.id
WHERE platos.nombre = 'Hamburguesa clásica';
--33. Para cada cliente, cuántos pedidos ha hecho a cada restaurante.
SELECT clientes.id, clientes.nombre as cliente, restaurantes.nombre as restaurante, COUNT(*) as num_pedidos
FROM pedidos
JOIN clientes 
on pedidos.cliente_id = clientes.id
JOIN restaurantes 
on pedidos.restaurante_id = restaurantes.id
GROUP BY clientes.id, clientes.nombre, restaurantes.id, restaurantes.nombre
ORDER BY clientes.id;
--34. Para cada pedido, importe gastado en bebidas (solo pedidos que incluyen bebidas).
--35. De cada pedido cancelado: fecha, cliente y restaurante.
--36. Número de platos distintos que ha pedido cada cliente.
--37. Importe total de los pedidos entregados por cada repartidor.
--38. Listado con identificadores de los pedidos efectuados a partir de las 20:00, indicando el cliente y el restaurante.