CREATE TABLE emission_type(
    id CHAR(5) NOT NULL
);

CREATE TABLE units(
    id CHAR(3) NOT NULL
);

CREATE TABLE emissions (
    id SERIAL PRIMARY KEY,
    type CHAR(3) NOT NULL,
    unit CHAR(3) NOT NULL,
    value REAL NOT NULL,
    CONSTRAINT pk_emissions PRIMARY KEY (id),
    CONSTRAINT fk_emissions_emission_type FOREIGN KEY (type) REFERENCES emission_type(id),
    CONSTRAINT fk_emissions_units FOREIGN KEY (unit) REFERENCES units(id)
);