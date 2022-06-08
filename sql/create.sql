DROP TABLE IF EXISTS brands;
CREATE TABLE brands (
    brand_id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    brand_name VARCHAR(255),
    min_work_time INT,
    marks INT,
    PRIMARY KEY (brand_id)
);

DROP TABLE IF EXISTS users;
CREATE TABLE users (
    user_id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    full_name VARCHAR(255),
    email VARCHAR(255),
    password VARCHAR(255),
    brand_id INT,
    PRIMARY KEY (user_id),
    FOREIGN KEY (brand_id) REFERENCES brands(brand_id)
);

DROP TABLE IF EXISTS hours_card;
CREATE TABLE hours_card (
    hours_card_id INT NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1 INCREMENT BY 1),
    input_time VARCHAR(255),
    output_time VARCHAR(255),
    worked_time INT,
    extra_time INT,
    actual_date DATE,
    finished_day BOOLEAN,
    mark_counter INT,
    user_id INT,
    PRIMARY KEY (hours_card_id),
    FOREIGN KEY (user_id) REFERENCES users(user_id)
);
