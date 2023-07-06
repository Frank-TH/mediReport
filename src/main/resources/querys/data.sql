INSERT INTO
    ASESORES (DNI, NOMBRE, CLAVE)
VALUES
    ('11111111', 'Aamir Khan', '111'),
    ('11111112', 'Peggy Carter', '112'),
    ('11111113', 'Pepper Pots', '113'),
    ('11111114', 'Ralph Bohner', '114'),
    ('11111115', 'Jimmy Woo', '115'),
    ('11111116', 'Sharon Carter', '116'),
    ('11111117', 'Dane Whitman', '117'),
    ('11111118', 'Kingpin', '118'),
    ('11111119', 'Khonshu', '119'),
    ('11111121', 'Killmonger', '121'),
    ('11111131', 'Jane Foster', '131'),
    ('11111141', 'Matt Murdock', '141');

-- SUPERVISORES
INSERT INTO
    SUPERVISORES (DNI, NOMBRE, CLAVE)
VALUES
    ('99999999', 'Trevor Slattery', '999'),
    ('88888888', 'James Rocket', '888');

-- ADMINISTRADOR
INSERT INTO
    ADMINISTRADOR (NOMBRE, CLAVE, CORREO)
VALUES
    ('system', 'sys', 'admin@gmail.com');

-- PACIENTE
INSERT INTO
    PACIENTES (DNI, NOMBRE)
VALUES
    ('12345671', 'Jigglypuff'),
    ('12345672', 'Goldeen'),
    ('12345673', 'Eevee'),
    ('12345674', 'Dratini'),
    ('12345675', 'Dragonite'),
    ('12345676', 'Ditto'),
    ('12345677', 'Diglett'),
    ('12345678', 'Cyndaquil'),
    ('12345679', 'Clefairy'),
    ('12345611', 'Clefable'),
    ('12345621', 'Chikorita'),
    ('12345631', 'Charmander'),
    ('12345641', 'Chansey'),
    ('12345651', 'Butterfree'),
    ('12345661', 'Celebi');

-- PEDIDO
INSERT INTO
    PEDIDOS (ID_ASESOR, ID_PACIENTE, CANTIDAD, FECHA)
VALUES
    -- 1
    ('11111111', '12345671', 2, '2023-01-03'),
    -- 2
    ('11111111', '12345672', 1, '2023-01-10'),
    -- 3
    ('11111111', '12345673', 2, '2023-01-10'),
    -- 4
    ('11111111', '12345674', 1, '2023-01-10'),
    -- 5
    ('11111111', '12345675', 1, '2023-01-10'),
    -- 6
    ('11111112', '12345676', 1, '2023-01-10'),
    -- 7
    ('11111112', '12345677', 1, '2023-01-10'),
    -- 8
    ('11111113', '12345678', 1, '2023-01-10'),
    -- 9
    ('11111113', '12345679', 1, '2023-01-10'),
    -- 10
    ('11111113', '12345611', 3, '2023-01-10');

-- EXAMENES
INSERT INTO
    EXAMENES (NOMBRE, COSTO)
VALUES
    ('Glucosa', 10.00),
    ('Triglicérido', 10.00),
    ('Diabetes', 10.00),
    ('Anemia', 10.00);

-- ATENCIONES
INSERT INTO
    ATENCIONES (ID_ASESOR, ID_SUPERVISOR)
VALUES
    ('11111111', '99999999'),
    ('11111112', '99999999'),
    ('11111113', '99999999');

-- DETALLE
INSERT INTO
    DETALLES (ID_PEDIDO, ID_EXAMEN, RESULTADO, COMENTARIO)
VALUES
    -- 1
    (1, 1, '14.1', 'medio'),
    (1, 3, '14.2', 'medio'),
    -- 2
    (2, 3, '14.6', 'medio'),
    -- 3
    (3, 1, '14.8', 'medio'),
    (3, 2, '14.7', 'medio'),
    -- 4
    (4, 1, '12.6', 'baja'),
    -- 5
    (5, 1, '11.6', 'baja'),
    -- 6
    (6, 2, '10.6', 'baja'),
    -- 7
    (7, 3, '18.6', 'alta'),
    -- 8
    (8, 4, '19.6', 'alta'),
    -- 9
    (9, 1, '20.6', 'alta'),
    -- 10
    (10, 4, '14.2', 'medio'),
    (10, 2, '14.4', 'medio'),
    (10, 3, '14.5', 'medio');

-- SE REINICIAN LAS SECUENCIAS SEGÚN LOS DATOS INICIALES
SELECT
    setval ('public.administrador_id_seq', 1, true);

SELECT
    setval ('public.atenciones_id_seq', 3, true);

SELECT
    setval ('public.examenes_id_seq', 4, true);

SELECT
    setval ('public.pedidos_id_seq', 10, true);