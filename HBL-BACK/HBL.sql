drop table persona;
create table persona(
  id integer ,
  nombre varchar(50),
  apellido_m varchar(50),
  apellido_p varchar(50),
  fecha_nacimiento date
);

drop table producto;
CREATE TABLE producto(
  id_sku  INTEGER PRIMARY KEY NOT NULL,
  nombre  VARCHAR(50),
  cantidad  INTEGER
);

INSERT INTO persona VALUES(1,'oscar','santoyo','martinez',current);
SELECT * FROM persona;
SELECT * FROM producto;

show tables;