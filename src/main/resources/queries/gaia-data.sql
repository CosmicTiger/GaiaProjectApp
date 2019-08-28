/***
**	  GAIA APPLICATION SERVICE PROVIDER 
**		 MYSQL QUERY DataFiller DB
**	  Version 1.4
**	  Author: lotus_zero
**    Revised by: lotus_zero 14:14 p.m. 28 August, 2019
**    Copyright Millionaire Projects, assoc. March, 2019 - August, 2019
**    All Rights Reserved
**    Date: 26th August 2019
***/


USE GaiaDatabase;

/* Adding data to HUMAN TALENT */
# TABLE STAFF
SELECT * FROM Staff;

insert into Staff(staff_code, status, first_name, middle_name, lastName_primary, lastName_secondary,
		telephone, address, email, salary) values ('S01', 'active','Luisangel', 'Martin', 
        'Marcia', 'Palma', '57766675', 
        '11035 Av. North East - Bertha Diaz', 'luisangelmarcia@gmail.com', 200);
        
insert into Staff(staff_code, status, first_name, middle_name, 
lastName_primary, lastName_secondary, telephone, address, email, salary) 
values ('S02', 'active', 'Walger', '', 'Herrera', 'Treminio', 
        '57766675', 
        '11152 UNI (RUPAP), Managua', 
        'walgerherrera@gmail.com', 400);


# TABLE USER
select * from User;

insert into User(id_staff, profile_photo, username, password, security_question, security_answer) 
values (1, '', 'joker', '1234', 'Cuanto te costo el proyecto?', 'Un huevo');

insert into User(id_staff, profile_photo, username, password, security_question, security_answer) 
values (2, '', 'joker', '1234', 'Cuanto te costo el proyecto?', 'Un huevo');