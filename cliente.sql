-- Table: public.cliente

-- DROP TABLE public.cliente;

CREATE TABLE public.cliente
(
    id_cliente integer NOT NULL DEFAULT nextval('cliente_id_cliente_seq'::regclass),
    nome_cliente character varying COLLATE pg_catalog."default" NOT NULL,
    cnpj_cliente numeric NOT NULL,
    inscricao_cliente numeric,
    logradouro_cliente character varying COLLATE pg_catalog."default",
    endereco_cliente character varying COLLATE pg_catalog."default",
    num_endereco_cliente numeric,
    complemento_cliente character varying COLLATE pg_catalog."default",
    telefone_cliente numeric,
    email_cliente character varying COLLATE pg_catalog."default",
    site_cliente character varying COLLATE pg_catalog."default",
    CONSTRAINT cliente_pkey PRIMARY KEY (id_cliente)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.cliente
    OWNER to postgres;