CREATE TABLE usuarios (
  id            BIGSERIAL PRIMARY KEY,
  nombre        VARCHAR(100) NOT NULL,
  email         VARCHAR(200) NOT NULL UNIQUE,
  creado_en     TIMESTAMP    NOT NULL DEFAULT NOW()
);