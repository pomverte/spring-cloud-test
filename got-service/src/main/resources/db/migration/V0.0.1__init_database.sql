CREATE TABLE house (
	id BIGSERIAL NOT NULL,
	name VARCHAR(255) NOT NULL,
	words  VARCHAR(255) NOT NULL
);

INSERT INTO house (name, words) VALUES
    ('Stark', 'Winter is Coming')
    ,('Lannister', 'Hear Me Roar')
    ,('Greyjoy', 'We Do Not Sow')
    ,('Arryn', 'As High as Honor')
    ,('Frey', 'We Stand Together')
    ,('Tyrell', 'Growing Strong')
    ,('Targaryen', 'Fire and Blood ')
    ,('Tully', 'Family, Duty, Honor')
    ,('Baratheon', 'Ours is the Fury')
    ,('Martell', 'Unbowed, Unbent, Unbroken')
    ,('Bolton', 'Our Blades Are Sharp');
