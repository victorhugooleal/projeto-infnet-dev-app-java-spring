-- Insere alguns clientes
INSERT INTO cliente (nome) VALUES ('João da Silva');
INSERT INTO cliente (nome) VALUES ('Maria Oliveira');
INSERT INTO cliente (nome) VALUES ('Pedro Santos');
INSERT INTO cliente (nome) VALUES ('Ana Costa');

-- Insere alguns livros
INSERT INTO livro (nome, preco, ativo, autor, paginas) VALUES ('Java para Iniciantes', 79.90, true, 'Carlos Silva', 300);
INSERT INTO livro (nome, preco, ativo, autor, paginas) VALUES ('Spring Boot em Ação', 89.90, true, 'Ana Costa', 250);
INSERT INTO livro (nome, preco, ativo, autor, paginas) VALUES ('Effective Java', 99.90, true, 'Joshua Bloch', 416);
INSERT INTO livro (nome, preco, ativo, autor, paginas) VALUES ('Clean Code', 89.90, true, 'Robert C. Martin', 464);

-- Insere alguns eletrônicos
INSERT INTO eletronico (nome, preco, ativo, marca, garantia_meses) VALUES ('Smartphone XYZ', 1599.90, true, 'XYZ Corp', 24);
INSERT INTO eletronico (nome, preco, ativo, marca, garantia_meses) VALUES ('Notebook ABC', 2999.90, true, 'ABC Ltd', 36);
INSERT INTO eletronico (nome, preco, ativo, marca, garantia_meses) VALUES ('Fone de Ouvido Bluetooth', 299.90, true, 'TechSound', 12);
INSERT INTO eletronico (nome, preco, ativo, marca, garantia_meses) VALUES ('Smartwatch Pro', 699.90, true, 'TimeTech', 24);

-- Insere alguns pedidos
-- João da Silva compra 2 unidades do livro 'Java para Iniciantes' e 1 unidade do 'Smartphone XYZ'
INSERT INTO pedido (cliente_id, produto_id, quantidade) VALUES (1, 1, 2);
INSERT INTO pedido (cliente_id, produto_id, quantidade) VALUES (1, 3, 1);

-- Maria Oliveira compra 1 unidade do livro 'Spring Boot em Ação' e 1 unidade do 'Fone de Ouvido Bluetooth'
INSERT INTO pedido (cliente_id, produto_id, quantidade) VALUES (2, 2, 1);
INSERT INTO pedido (cliente_id, produto_id, quantidade) VALUES (2, 3, 1);

-- Pedro Santos compra 1 unidade do livro 'Clean Code' e 1 unidade do 'Smartwatch Pro'
INSERT INTO pedido (cliente_id, produto_id, quantidade) VALUES (3, 4, 1);
INSERT INTO pedido (cliente_id, produto_id, quantidade) VALUES (3, 4, 1);

-- Ana Costa compra 1 unidade do livro 'Effective Java' e 1 unidade do 'Notebook ABC'
INSERT INTO pedido (cliente_id, produto_id, quantidade) VALUES (4, 3, 1);
INSERT INTO pedido (cliente_id, produto_id, quantidade) VALUES (4, 2, 1);