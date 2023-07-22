INSERT INTO
    ASESORES (
        DNI,
        NOMBRES,
        CLAVE,
        APELLIDOS,
        TELEFONO,
        CORREO,
        FECHA_NACIMIENTO,
        ESTADO
    )
VALUES
    (
        '11111111',
        'Aamir',
        '111',
        'Khan Peiro',
        '981682285',
        'Aamir@gmail.com',
        '1900-01-01',
        true
    ),
    (
        '11111112',
        'Peggy',
        '112',
        'Carter Molina',
        '918261268',
        'Peggy@gmail.com',
        '1900-01-01',
        true
    ),
    (
        '11111113',
        'Pepper',
        '113',
        'Pots Molina',
        '974758872',
        'Pepper@gmail.com',
        '1900-01-01',
        true
    ),
    (
        '11111114',
        'Ralph',
        '114',
        'Bohner Camacho',
        '957788435',
        'Ralph@gmail.com',
        '1900-01-01',
        true
    ),
    (
        '11111115',
        'Jimmy',
        '115',
        'Woo Muñiz',
        '900374705',
        'Jimmy@gmail.com',
        '1900-01-01',
        true
    ),
    (
        '11111116',
        'Sharon ',
        '116',
        'Carter Ahmed',
        '928880773',
        'Sharon@gmail.com',
        '1900-01-01',
        true
    ),
    (
        '11111117',
        'Dane',
        '117',
        'Whitman Gomis',
        '973678621',
        'Dane@gmail.com',
        '1900-01-01',
        true
    ),
    (
        '11111118',
        'Kingpin',
        '118',
        'Collado Cobos',
        '941813821',
        'Kingpin@gmail.com',
        '1900-01-01',
        true
    ),
    (
        '11111119',
        'Khonshu',
        '119',
        'Gallego Reig',
        '986398958',
        'Khonshu@gmail.com',
        '1900-01-01',
        true
    ),
    (
        '11111121',
        'Killmonger',
        '121',
        'Arellano Raya',
        '911565216',
        'Killmonger@gmail.com',
        '1900-01-01',
        true
    ),
    (
        '11111131',
        'Jane',
        '131',
        'Foster Rosell',
        '970012240',
        'Jane@gmail.com',
        '1900-01-01',
        true
    ),
    (
        '11111141',
        'Matt',
        '141',
        'Murdock Rosa',
        '994963541',
        'Matt@gmail.com',
        '1900-01-01',
        true
    );

-- SUPERVISORES
INSERT INTO
    SUPERVISORES (
        DNI,
        NOMBRES,
        CLAVE,
        APELLIDOS,
        TELEFONO,
        CORREO,
        FECHA_NACIMIENTO,
        ESTADO
    )
VALUES
    (
        '99999999',
        'Trevor Slattery',
        '999',
        'PAREDES FLORES',
        '998877445',
        'Trevor@gmail.com',
        '1900-01-01',
        true
    ),
    (
        '88888888',
        'James Rocket',
        '888',
        'RISEL RAMOS',
        '998877446',
        'James@gmail.com',
        '1900-01-01',
        true
    );

-- ADMINISTRADOR
INSERT INTO
    ADMINISTRADORES (USUARIO, CLAVE, CORREO)
VALUES
    ('sys', 'sys1', 'sys@gmail.com'),
    ('admin', 'sys2', 'admin@gmail.com');

-- PACIENTE
INSERT INTO
    PACIENTES (
        DNI,
        NOMBRES,
        APELLIDOS,
        DIRECCION,
        CORREO,
        TELEFONO,
        FECHA_NACIMIENTO
    )
VALUES
    (
        '12345671',
        'Jigglypuff',
        'Pokemon',
        'cercado de lima',
        'Jigglypuff@gmail.com',
        '938937970',
        '1900-01-01'
    ),
    (
        '12345672',
        'Goldeen',
        'Pokemon',
        'cercado de lima',
        'Goldeen@gmail.com',
        '955572676',
        '1900-01-01'
    ),
    (
        '12345673',
        'Eevee',
        'Pokemon',
        'cercado de lima',
        'Eevee@gmail.com',
        '955572676',
        '1900-01-01'
    ),
    (
        '12345674',
        'Dratini',
        'Pokemon',
        'cercado de lima',
        'Dratini@gmail.com',
        '921229260',
        '1900-01-01'
    ),
    (
        '12345675',
        'Dragonite',
        'Pokemon',
        'cercado de lima',
        'Dragonite@gmail.com',
        '921229260',
        '1900-01-01'
    ),
    (
        '12345676',
        'Ditto',
        'Pokemon',
        'cercado de lima',
        'Ditto@gmail.com',
        '979993692',
        '1900-01-01'
    ),
    (
        '12345677',
        'Diglett',
        'Pokemon',
        'cercado de lima',
        'Diglett@gmail.com',
        '994117363',
        '1900-01-01'
    ),
    (
        '12345678',
        'Cyndaquil',
        'Pokemon',
        'cercado de lima',
        'Cyndaquil@gmail.com',
        '994117363',
        '1900-01-01'
    ),
    (
        '12345679',
        'Clefairy',
        'Pokemon',
        'cercado de lima',
        'Clefairy@gmail.com',
        '994117363',
        '1900-01-01'
    ),
    (
        '12345611',
        'Clefable',
        'Pokemon',
        'cercado de lima',
        'Clefable@gmail.com',
        '994117363',
        '1900-01-01'
    ),
    (
        '12345621',
        'Chikorita',
        'Pokemon',
        'cercado de lima',
        'Chikorita@gmail.com',
        '930188121',
        '1900-01-01'
    ),
    (
        '12345631',
        'Charmander',
        'Pokemon',
        'cercado de lima',
        'Charmander@gmail.com',
        '930188121',
        '1900-01-01'
    ),
    (
        '12345641',
        'Chansey',
        'Pokemon',
        'cercado de lima',
        'Chansey@gmail.com',
        '999014461',
        '1900-01-01'
    ),
    (
        '12345651',
        'Butterfree',
        'Pokemon',
        'cercado de lima',
        'Butterfree@gmail.com',
        '999014461',
        '1900-01-01'
    ),
    (
        '12345661',
        'Celebi',
        'Pokemon',
        'cercado de lima',
        'Celebi@gmail.com',
        '999014461',
        '1900-01-01'
    );

INSERT INTO
    CAMPANAS_MEDICAS (ID_SUPERVISOR, UBICACION, HORARIO)
VALUES
    ('99999999', 'Cercado de lima', '9 AM - 2 PM'),
    ('88888888', 'La Victoria', '9 AM - 2 PM');

-- ATENCIONES
INSERT INTO
    ATENCIONES (
        ID_ASESOR,
        ID_PACIENTE,
        ID_CAMPANA,
        CANTIDAD_TIRAS,
        FECHA_ATENCION
    )
VALUES
    -- 1
    ('11111111', '12345671', '1', 2, '2023-01-03'),
    -- 2
    ('11111111', '12345672', '1', 1, '2023-01-10'),
    -- 3
    ('11111111', '12345673', '1', 2, '2023-01-10'),
    -- 4
    ('11111111', '12345674', '1', 1, '2023-01-10'),
    -- 5
    ('11111111', '12345675', '1', 1, '2023-01-10'),
    -- 6
    ('11111112', '12345676', '1', 1, '2023-01-10'),
    -- 7
    ('11111112', '12345677', '1', 1, '2023-01-10'),
    -- 8
    ('11111113', '12345678', '1', 1, '2023-01-10'),
    -- 9
    ('11111113', '12345679', '1', 1, '2023-01-10'),
    -- 10
    ('11111113', '12345611', '1', 3, '2023-01-10');

-- EXAMENES
INSERT INTO
    EXAMENES_MEDICOS (NOMBRE, COSTO, STOCK)
VALUES
    ('Glucosa', 10.00, 25),
    ('Triglicérido', 10.00, 25),
    ('Diabetes', 10.00, 25),
    ('Anemia', 10.00, 25);

-- ATENCIONES
-- DETALLE
INSERT INTO
    ATENCIONES_EXAMENES (ID_ATENCION, ID_EXAMEN, RESULTADO, COMENTARIO)
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