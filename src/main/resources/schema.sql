create table if not exists reviews_0
(
    id               integer generated by default as identity
        constraint pk_reviews_0
            primary key,
    text             varchar(3000),
    author           varchar(255),
    created_at       timestamp,
    last_modified_at timestamp,
    course_id        integer
);

create table if not exists reviews_1
(
    id               integer generated by default as identity
        constraint pk_reviews_1
            primary key,
    text             varchar(3000),
    author           varchar(255),
    created_at       timestamp,
    last_modified_at timestamp,
    course_id        integer
);

--MySql

create table if not exists reviews_0
(
    id               INT         NOT NULL AUTO_INCREMENT,
    text             varchar(3000),
    author           varchar(255),
    created_at       timestamp,
    last_modified_at timestamp,
    course_id        integer,
    PRIMARY KEY (`id`)
);

create table if not exists reviews_1
(
    id               INT         NOT NULL AUTO_INCREMENT,
    text             varchar(3000),
    author           varchar(255),
    created_at       timestamp,
    last_modified_at timestamp,
    course_id        integer,
    PRIMARY KEY (`id`)
);

create table hibernate_sequence(
    next_val INTEGER NOT null
);

INSERT INTO hibernate_sequence (next_val) VALUES (1);
