-- ---------------------------------------------------------------------
-- 1. CREACIÓN DE LA TABLA
-- ---------------------------------------------------------------------
-- salario      -> salario bruto anual en euros
-- comision     -> porcentaje en tanto por uno (0.10 = 10 %). Solo la tienen
--                 los empleados de Ventas; en el resto vale NULL
-- teletrabajo  -> TRUE = teletrabaja, FALSE = presencial

CREATE TABLE empleados (
    id               INT            GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nombre           VARCHAR(50)    NOT NULL,
    apellidos        VARCHAR(80)    NOT NULL,
    departamento     VARCHAR(30)    NOT NULL,
    puesto           VARCHAR(50)    NOT NULL,
    ciudad           VARCHAR(30)    NOT NULL,
    salario          NUMERIC(8,2)   NOT NULL,
    fecha_alta       DATE           NOT NULL,
    fecha_nacimiento DATE           NOT NULL,
    comision         NUMERIC(3,2)   NULL,
    teletrabajo      BOOLEAN        NOT NULL DEFAULT FALSE
);


-- ---------------------------------------------------------------------
-- 2. INSERCIÓN DE DATOS (30 filas)
-- ---------------------------------------------------------------------
INSERT INTO empleados
    (nombre, apellidos, departamento, puesto, ciudad, salario, fecha_alta, fecha_nacimiento, comision, teletrabajo)
VALUES
    ('Lucía',     'García López',     'Desarrollo', 'Programadora Senior',            'Madrid',    42000, '2018-03-12', '1988-05-21', NULL, TRUE),
    ('Marcos',    'Fernández Ruiz',   'Desarrollo', 'Programador Junior',             'Madrid',    24000, '2023-09-01', '1999-11-02', NULL, TRUE),
    ('Elena',     'Martín Sanz',      'Desarrollo', 'Jefa de Proyecto',               'Barcelona', 52000, '2015-01-20', '1982-02-14', NULL, FALSE),
    ('Javier',    'Romero Gil',       'Desarrollo', 'Programador Senior',             'Valencia',  40000, '2019-06-03', '1990-08-30', NULL, TRUE),
    ('Paula',     'Navarro Díaz',     'Desarrollo', 'Programadora Junior',            'Sevilla',   23500, '2024-02-15', '2000-01-17', NULL, TRUE),
    ('Sergio',    'Torres Vega',      'Desarrollo', 'Analista',                       'Madrid',    36000, '2020-10-05', '1992-07-09', NULL, FALSE),
    ('Nuria',     'Ramírez Ortega',   'Desarrollo', 'Programadora Senior',            'Bilbao',    41000, '2017-11-27', '1987-12-03', NULL, TRUE),
    ('Andrés',    'Molina Castro',    'Sistemas',   'Administrador de Sistemas',      'Madrid',    38000, '2016-04-18', '1985-03-25', NULL, FALSE),
    ('Carmen',    'Ortiz Rubio',      'Sistemas',   'Técnica de Soporte',             'Madrid',    22000, '2022-05-09', '1997-06-11', NULL, FALSE),
    ('Raúl',      'Delgado Marín',    'Sistemas',   'Técnico de Soporte',             'Barcelona', 22500, '2021-09-13', '1996-10-19', NULL, FALSE),
    ('Irene',     'Suárez Peña',      'Sistemas',   'Responsable de Seguridad',       'Madrid',    48000, '2014-07-01', '1980-04-08', NULL, TRUE),
    ('Pablo',     'Iglesias Cano',    'Sistemas',   'Administrador de Bases de Datos','Valencia',  39500, '2019-02-11', '1989-09-15', NULL, TRUE),
    ('Marta',     'Vázquez León',     'Marketing',  'Directora de Marketing',         'Barcelona', 55000, '2013-05-06', '1978-01-29', NULL, FALSE),
    ('Diego',     'Herrera Mora',     'Marketing',  'Diseñador Gráfico',              'Barcelona', 27000, '2021-03-22', '1994-05-05', NULL, TRUE),
    ('Sara',      'Giménez Prieto',   'Marketing',  'Community Manager',              'Madrid',    25000, '2022-11-07', '1998-08-23', NULL, TRUE),
    ('Hugo',      'Cabrera Soto',     'Marketing',  'Especialista SEO',               'Sevilla',   29000, '2020-01-13', '1993-02-27', NULL, TRUE),
    ('Alberto',   'Ruiz Campos',      'Ventas',     'Director Comercial',             'Madrid',    50000, '2012-09-17', '1976-11-12', 0.15, FALSE),
    ('Cristina',  'Moreno Vidal',     'Ventas',     'Comercial',                      'Madrid',    26000, '2019-04-01', '1991-03-03', 0.10, FALSE),
    ('Óscar',     'Jiménez Lara',     'Ventas',     'Comercial',                      'Barcelona', 25500, '2020-06-15', '1993-12-20', 0.10, FALSE),
    ('Beatriz',   'Alonso Reyes',     'Ventas',     'Comercial',                      'Valencia',  24500, '2021-10-04', '1995-07-07', 0.08, FALSE),
    ('Víctor',    'Sánchez Bravo',    'Ventas',     'Comercial',                      'Sevilla',   24000, '2023-01-09', '1998-04-14', 0.08, FALSE),
    ('Laura',     'Domínguez Flores', 'Ventas',     'Comercial',                      'Bilbao',    25000, '2022-03-28', '1996-09-01', 0.08, FALSE),
    ('Daniel',    'Pérez Arias',      'Ventas',     'Jefe de Zona',                   'Barcelona', 38000, '2016-08-22', '1984-06-18', 0.12, FALSE),
    ('Rocío',     'Gutiérrez Luna',   'RRHH',       'Directora de RRHH',              'Madrid',    47000, '2014-02-03', '1981-10-10', NULL, FALSE),
    ('Iván',      'Muñoz Santos',     'RRHH',       'Técnico de Selección',           'Madrid',    28000, '2021-05-17', '1994-01-22', NULL, TRUE),
    ('Alicia',    'Blanco Nieto',     'RRHH',       'Técnica de Formación',           'Valencia',  27500, '2020-09-21', '1992-11-30', NULL, TRUE),
    ('Fernando',  'Castillo Rey',     'Finanzas',   'Director Financiero',            'Madrid',    58000, '2011-06-13', '1975-08-16', NULL, FALSE),
    ('Silvia',    'Ramos Cortés',     'Finanzas',   'Contable',                       'Madrid',    30000, '2018-10-15', '1990-02-06', NULL, FALSE),
    ('Adrián',    'Gallego Pastor',   'Finanzas',   'Contable',                       'Bilbao',    29500, '2019-12-02', '1991-06-28', NULL, FALSE),
    ('Natalia',   'Hidalgo Crespo',   'Finanzas',   'Controller',                     'Barcelona', 37000, '2017-03-06', '1986-12-12', NULL, TRUE);


-- CONSULTAS DE EJEMPLO

-- Muestra todos los datos de todos los empleados
SELECT *
FROM empleados;

-- Muestra solo el nombre, los apellidos y el salario
SELECT nombre, apellidos, salario
FROM empleados;

-- Muestra los nombres de los departamentos (sin repetidos)
SELECT DISTINCT departamento
FROM empleados;

-- Muestra el nombre y el salario mensual redondeado a dos decimales
SELECT nombre, ROUND(salario/12, 2) as salario_mensual
FROM empleados;

-- Muestra en una sola columna llamada nombre_completo el nombre completo
SELECT CONCAT(nombre, ' ', apellidos) as nombre_completo
FROM empleados;

-- Muestra los nombres de los empleados que trabajan en Madrid
SELECT nombre, ciudad
FROM empleados
WHERE ciudad = 'Madrid';

-- Muestra el nombre, los apellidos y el salario de los empleados que cobran más de 40.000 €
SELECT nombre, apellidos, salario
FROM empleados
WHERE salario > 40000;

-- Muestra el nombre de los empleados del departamento Desarrollo
SELECT nombre, departamento
FROM empleados
WHERE departamento = 'Desarrollo';

-- Muestra el nombre de los empleados que trabajan en Barcelona o Valencia
SELECT nombre, ciudad
FROM empleados
WHERE ciudad IN ('Barcelona', 'Valencia');

-- Muestra el nombre de los empleados con salario entre 25.000 y 35.000 €
SELECT nombre, salario
FROM empleados
WHERE salario BETWEEN 25000 AND 35000;