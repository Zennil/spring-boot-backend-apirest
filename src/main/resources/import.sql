/*Populate TABLE regiones*/
INSERT INTO regiones (id, nombre) VALUES (1, "Sudamérica");
INSERT INTO regiones (id, nombre) VALUES (2, "Centroamérica");
INSERT INTO regiones (id, nombre) VALUES (3, "Norteamérica");
INSERT INTO regiones (id, nombre) VALUES (4, "Europa");
INSERT INTO regiones (id, nombre) VALUES (5, "Asia");
INSERT INTO regiones (id, nombre) VALUES (6, "Africa");
INSERT INTO regiones (id, nombre) VALUES (7, "Oceanía");
INSERT INTO regiones (id, nombre) VALUES (8, "Antártida");

/*Populate TABLE clientes*/
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Personá1', 'Apellid1','correo1@gmail.com','2020-01-01',1);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Persona2', 'Apellid2','correo2@gmail.com','2020-01-01',2);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Persona3', 'Apellid3','correo3@gmail.com','2020-01-01',4);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Persona4', 'Apellid4','correo4@gmail.com','2020-01-01',4);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Persona5', 'Apellid5','correo5@gmail.com','2020-01-01',4);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Persona6', 'Apellid6','correo6@gmail.com','2020-01-01',3);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Persona7', 'Apellid7','correo7@gmail.com','2020-01-01',3);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Persona8', 'Apellid8','correo8@gmail.com','2020-01-01',3);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Persona9', 'Apellid9','correo9@gmail.com','2020-01-01',3);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Persona10', 'Apellid10','correo10@gmail.com','2020-01-01',5);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Persona11', 'Apellid11','correo11@gmail.com','2020-01-01',6);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Persona12', 'Apellid12','correo12@gmail.com','2020-01-01',7);
INSERT INTO clientes (nombre, apellido, email, create_at, region_id) VALUES('Persona13', 'Apellid13','correo13@gmail.com','2020-01-01',8);

/*Creacion de usuarios con sus roles*/
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('armando', '$2a$10$T7pJy8zK50Wsy8kI/xYw7epudCPjuvglIecG5Mc37JZDSfM7ZJFsy', 1, 'Armando', 'Zenil', 'szenil@gmail.com');
INSERT INTO usuarios (username, password, enabled, nombre, apellido, email) VALUES ('admin', '$2a$10$qzBYJ0Jza6QXbvfk4RWTOubF5.V7Zn4ZCyKS2QRIq16atdx5aco32', 1, 'Franz', 'Kafka', 'fkafka@gmail.com');

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);
