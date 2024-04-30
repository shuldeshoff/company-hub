CREATE USER IF NOT EXISTS 'company_hub'@'localhost' IDENTIFIED BY '4hw5vkev';
CREATE DATABASE IF NOT EXISTS company_hub_db;
GRANT ALL PRIVILEGES ON company_hub_db.* TO 'company_hub'@'localhost';


CREATE TABLE IF NOT EXISTS addresses (
    id BIGINT NOT NULL AUTO_INCREMENT,
    postcode VARCHAR(100) NOT NULL,
    city VARCHAR(255) NOT NULL,
    street VARCHAR(100) NOT NULL,
    house VARCHAR(10) NOT NULL,
    apartment VARCHAR(5) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS сompanies (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    legal_form INT NOT NULL,
    address_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (address_id) REFERENCES addresses(id)
);

CREATE TABLE IF NOT EXISTS branches (
    id BIGINT NOT NULL AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    address_id BIGINT,
    owner_id BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (address_id) REFERENCES addresses(id),
    FOREIGN KEY (owner_id) REFERENCES сompanies(id)
);

