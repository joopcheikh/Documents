CREATE TABLE IF NOT EXISTS student
(
    birthdate date NOT NULL,
    id integer NOT NULL,
    school_id integer,
    speciality_id integer,
    email character varying(255) COLLATE pg_catalog."default" NOT NULL,
    firstname character varying(255) COLLATE pg_catalog."default" NOT NULL,
    lastname character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT student_pkey PRIMARY KEY (id),
    CONSTRAINT student_firstname_key UNIQUE (firstname),
    CONSTRAINT fk1vm0oqhk9viil6eocn49rj1l9 FOREIGN KEY (school_id)
        REFERENCES test.school (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT fkt434hun0i4tv58xnfvkbttk7v FOREIGN KEY (speciality_id)
        REFERENCES test.speciality (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

CREATE TABLE IF NOT EXISTS school
(
    id integer NOT NULL,
    number_of_students integer NOT NULL,
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT school_pkey PRIMARY KEY (id)
)

CREATE TABLE IF NOT EXISTS speciality
(
    id integer NOT NULL,
    name character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT speciality_pkey PRIMARY KEY (id)
)

CREATE TABLE IF NOT EXISTS teacher
(
    id integer NOT NULL,
    firstname character varying(255) COLLATE pg_catalog."default" NOT NULL,
    lastname character varying(255) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT teacher_pkey PRIMARY KEY (id)
)


