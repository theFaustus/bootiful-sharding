create table if not exists reviews
(
    id               INT NOT NULL AUTO_INCREMENT,
    text             varchar(3000),
    author           varchar(255),
    author_telephone varchar(255),
    author_email     varchar(255),
    invoice_code     varchar(255),
    created_at       timestamp,
    last_modified_at timestamp,
    course_id        integer,
    PRIMARY KEY (id)
);

create table if not exists reviews_0
(
    id               INT NOT NULL AUTO_INCREMENT,
    text             varchar(3000),
    author           varchar(255),
    author_telephone varchar(255),
    author_email     varchar(255),
    invoice_code     varchar(255),
    created_at       timestamp,
    last_modified_at timestamp,
    course_id        integer,
    PRIMARY KEY (id)
);

create table if not exists reviews_1
(
    id               INT NOT NULL AUTO_INCREMENT,
    text             varchar(3000),
    author           varchar(255),
    author_telephone varchar(255),
    author_email     varchar(255),
    invoice_code     varchar(255),
    created_at       timestamp,
    last_modified_at timestamp,
    course_id        integer,
    PRIMARY KEY (id)
);

create table hibernate_sequence
(
    next_val INTEGER NOT null
);

INSERT INTO hibernate_sequence (next_val)
VALUES (1);
