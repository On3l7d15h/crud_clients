Create DataBase Admin_app;
Use Admin_app;

-- tabla usuarios
Create Table User(
	nombre varchar(40) not null,
    apellido varchar(40) not null,
    nom_usuario varchar(40) not null,
    pass varchar(40) not null
);

-- tabla Clientes
Create Table Clients(
	id Integer primary key auto_increment, 
    nombre varchar(50) not null,
    apellido varchar(50) not null,
    dirección varchar(100) not null,
    email varchar(50) not null
);
Truncate Table Clients;
-- Aquí, querys duros, insertando desde MySql

Insert into Clients
Values(null, 'Oscar', 'Martínez', 'Aut. San Isidro', 'OscMar@hotmail.com'),
	  (null, 'Angie', 'Lizbeth', 'Av. La Avanzada', 'Angiedish@gmail.com');
      
Select * From Clients;
Select * From User;