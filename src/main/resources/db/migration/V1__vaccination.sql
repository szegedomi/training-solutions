USE vaccination;

CREATE TABLE cities (
    zip CHAR(4) NOT NULL,
    city VARCHAR(50) NOT NULL
);

CREATE TABLE citizens(
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    citizen_name VARCHAR(100) NOT NULL,
    zip CHAR(4) NOT NULL,
    age INT NOT NULL,
    email VARCHAR(100) NOT NULL,
    taj CHAR(9) UNIQUE NOT NULL,
    number_of_vaccination INT DEFAULT 0,
    last_vaccination DATE
);

CREATE TABLE vaccination (
    id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    FOREIGN KEY (citizen_id) REFERENCES citizens(id),
    vaccination_date DATE,
    status VARCHAR(50),
    note VARCHAR(100),
    vaccination_type VARCHAR(50)
);

INSERT INTO cities(zip, city) VALUES('2021', 'Tahitótfalu, Tótfalu');
INSERT INTO cities(zip, city) VALUES('2022', 'Tahitótfalu, Tahi');
INSERT INTO cities(zip, city) VALUES('2023', 'Dunabogdány');
INSERT INTO cities(zip, city) VALUES('2024', 'Kisoroszi');
INSERT INTO cities(zip, city) VALUES('2025', 'Visegrád');
INSERT INTO cities(zip, city) VALUES('1085', 'Budapest, VIII. kerület');
INSERT INTO cities(zip, city) VALUES('7100', 'Szekszárd');
INSERT INTO cities(zip, city) VALUES('7140', 'Bátaszék');
