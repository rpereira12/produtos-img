-- Table: public.produto

-- DROP TABLE public.produto;

CREATE TABLE public.produto
(
    id_produto integer NOT NULL DEFAULT nextval('produto_id_produto_seq'::regclass),
    nome_produto character varying(30) COLLATE pg_catalog."default" NOT NULL,
    sigla_produto character varying(10) COLLATE pg_catalog."default",
    categoria_produto character varying(10) COLLATE pg_catalog."default",
    descricao_produto character varying(50) COLLATE pg_catalog."default",
    comprimento_produto numeric,
    largura_produto numeric,
    altura_produto numeric,
    preco_produto numeric,
    imagem_produto bytea,
    CONSTRAINT produto_pkey PRIMARY KEY (id_produto)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.produto
    OWNER to postgres;