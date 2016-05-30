DROP TABLE delegaciones;
DROP TABLE municipios;
DROP TABLE colonias;
DROP TABLE calles;
DROP TABLE camaras;
DROP TABLE visitas;

CREATE TABLE delegaciones(
  id_delegacion   INTEGER,
  nombre      varchar(100)
);

CREATE TABLE municipios(
  id_municipio  INTEGER,
  id_delegacion INTEGER,
  nombre  VARCHAR(100)
);

CREATE TABLE colonias(
  id_colonia  INTEGER,
  id_municipio  INTEGER,
  nombre  VARCHAR(100)
);

CREATE TABLE calles(
  id_calle  INTEGER,
  id_colonia  INTEGER,
  nombre  VARCHAR(100)
);

CREATE TABLE camaras(
  id_camara INTEGER,
  id_delegacion INTEGER,
  id_municipio  INTEGER,
  id_colonia  INTEGER,
  id_calle  INTEGER,
  url VARCHAR(100),
  nombre  VARCHAR(100)
);

CREATE TABLE visitas(
  id_visita INTEGER,
  id_camara INTEGER,
  fecha DATE
);