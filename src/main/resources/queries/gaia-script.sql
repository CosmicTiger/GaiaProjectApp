/***
**	  GAIA APPLICATION SERVICE PROVIDER 
**		 MYSQL QUERY Initializer DB
**	  Version 2.2
**	  Author: chacha
**    Revised by: lotus_zero 14:14 p.m. 28th August, 2019
**    Copyright Millionaire Projects, assoc. March, 2019 - August, 2019
**    All Rights Reserved
**    Date: 26th August 2019
***/

create database GaiaDatabase;

use GaiaDatabase;

/*HUMAN TALENT*/

create table Staff (
	id_staff int not null auto_increment,
    staff_code varchar(12) not null,
    status varchar(12) not null,
    first_name varchar(25) not null,
    middle_name varchar(25),
    lastName_primary varchar(25) not null,
    lastName_secondary varchar(25),
    telephone varchar(30),
    address varchar(500) not null,
    email varchar(25) not null,
    salary double not null,
    primary key (id_staff)
);


create table User (
	id_user int not null auto_increment,
    id_staff int not null,
    profile_photo varchar(500),
    username varchar(30) not null,
    password varchar(30) not null,
    security_question varchar(100) not null,
    security_answer varchar(100) not null,
	primary key (id_user),
    foreign key (id_staff) references Staff(id_staff)
);

/*Turnos*/
create table Shift (
	id_shift int not null auto_increment,
    status varchar(12) not null,
    initial_date date,
    final_date date,
    shift_name varchar(60),
    hour time,
    primary key(id_shift)
);

create table Veterinary (
	id_veterinary int not null auto_increment,
    id_staff int not null,
    role varchar(120) not null,
    description_role varchar(250) not null,
    id_shift int,
    primary key(id_veterinary),
    foreign key(id_staff) references Staff(id_staff) on delete cascade,
    foreign key(id_shift) references Shift(id_shift) on delete cascade
);

create table Caretaker (
	id_caretaker int not null auto_increment,
    id_staff int not null,
    role varchar(120) not null,
    description_role varchar(250) not null,
    id_shift int,
    primary key (id_caretaker),
    foreign key (id_staff) references Staff(id_staff) on delete cascade,
    foreign key (id_shift) references Shift(id_shift) on delete cascade
);

create table Guide (
	id_guide int not null auto_increment,
    id_staff int not null,
    role varchar(120) not null,
    description_Role varchar(250) not null,
    id_shift int,
    primary key(id_guide),
    foreign key (id_staff) references Staff(id_staff) on delete cascade,
    foreign key (id_shift) references Shift(id_shift) on delete cascade
);

create table Management (
	id_management int not null auto_increment,
    id_staff int not null,
    role varchar(120) not null,
    description_role varchar(250) not null,
    id_shift int,
    primary key (id_management),
    foreign key (id_staff) references Staff(id_staff) on delete cascade,
    foreign key (id_shift) references Shift(id_shift) on delete cascade
);

create table Botanic (
	id_botanic int not null auto_increment,
    id_staff int not null,
    role varchar(120),
    description_Role varchar(250),
    id_shift int,
    primary key (id_botanic),
    foreign key (id_staff) references Staff(id_staff) on delete cascade,
    foreign key (id_shift) references Shift(id_shift) on delete cascade
);

create table Security (
	id_security int not null auto_increment,
    id_staff int not null,
    id_zone int,
    role varchar(120),
    description_role varchar(250),
    id_shift int,
    primary key (id_security),
    foreign key (id_staff) references Staff(id_staff) on delete cascade,
    foreign key (id_zone) references Zone(id_zone) on delete cascade
);

create table Viatic (
	id_viatic int not null auto_increment,
    id_staff int not null,
    viatic_code varchar(12) not null,
    concept varchar(250) not null,
    date_viatic date not null,
    amount double not null,
    primary key (id_viatic),
    foreign key (id_staff) references Staff(id_staff) on delete cascade
);

create table Payment_Detail(
	id_payment_dtl int not null auto_increment,
    id_staff int not null,
    payment_date date not null,
    gross_amount double not null,
    net_amount double not null,
    primary key (id_payment_dtl),
    foreign key (id_staff) references Staff(id_staff) on delete cascade
);

create table Itinerary_Guide (
	id_itinerary_guide int not null auto_increment,
    id_guide int not null,
    id_itinerary int not null,
    primary key (id_itinerary_guide),
    foreign key (id_guide) references Guide(id_guide) on delete cascade,
    foreign key (id_itinerary) references Itinerary(id_itinerary) on delete cascade
);

/*NATURA DATA - INTANGIBLE*/
create table Association (
	id_association int not null auto_increment,
    association_code varchar(12) not null,
    status varchar(12) not null,
    association_name varchar(120) not null,
    concept varchar(250) not null,
    association_type varchar(50) not null,
    objective varchar(500) not null,
    telephone varchar(25) not null,
    address varchar(50) not null,
    email varchar(50) not null,
    country varchar(60) not null,
    province varchar(60) not null,
    primary key (id_association)
);

create table Donation (
	id_donation int not null auto_increment,
    id_association int not null,
    donation_code varchar(12) not null,
    concept varchar(250) not null,
    date_donation date not null,
    primary key (id_donation),
    foreign key (id_association) references Association(id_association) on delete cascade
);

create table Program (
	id_program int not null auto_increment,
    program_code int not null,
    status varchar(12) not null,
    program_name varchar(120) not null,
    description varchar(250) not null,
    program_type varchar(90) not null,
    initial_date date,
    final_date date,
    primary key (id_program)
);

create table Transferences (
	id_transferences int not null auto_increment,
    transference_code varchar(12) not null,
    status varchar(12) not null,
    id_program int not null,
    id_specie int not null,
    name varchar(120) not null,
    date_transference date not null,
    age int not null,
    primary key (id_transferences),
    foreign key (id_program) references Program(id_program) on delete cascade,
    foreign key (id_specie) references Specie(id_specie) on delete cascade
);

create table Program_Donation (
	id_program_donation int not null auto_increment,
    id_program int not null,
    id_donation int not null,
    primary key (id_program_donation),
    foreign key (id_program) references Program(id_program) on delete cascade,
    foreign key (id_donation) references Donation(id_donation) on delete cascade
);

create table Monetary_Donation (
	id_monetary_donation int not null auto_increment,
    id_donation int not null,
    amount_money double not null,
    primary key (id_monetary_donation),
    foreign key (id_donation) references Donation(id_donation) on delete cascade
);

create table Inventory_Donation (
	id_inventory_donation int not null auto_increment,
    id_supply int not null,
    id_donation int not null,
    primary key (id_inventory_donation),
    foreign key (id_supply) references Supply(id_supply) on delete cascade,
    foreign key (id_donation) references Donation(id_donation) on delete cascade
);

/*RESOURCES*/
create table Zone(
	id_zone int not null auto_increment,
    zone_code varchar(12) not null,
    status varchar(12) not null,
    name_zone varchar(100) not null,
    extension varchar(50) not null,
    description varchar(250) not null,
    temperature varchar(60) not null,
    role varchar(120) not null,
    primary key (id_zone)
);

create table Warehouse (
	id_warehouse int not null auto_increment,
    id_management int not null,
    id_zone int not null,
    capacity int not null,
    size double not null,
    primary key (id_warehouse),
    foreign key (id_management) references Management(id_management) on delete cascade,
    foreign key (id_zone) references Zone(id_zone) on delete cascade
);

create table Supply (
	id_supply int not null auto_increment,
    id_warehouse int not null,
    supply_code varchar(12),
    status varchar(12) not null,
    name varchar(250) not null,
    type_supply varchar(150) not null,
	admission_date date not null,
    expiration_date date,
    departure_date date,
    cost double not null,
    primary key (id_supply),
    foreign key (id_warehouse) references Warehouse(id_warehouse) on delete cascade
);

create table Merchandising (
	id_merchandising int not null auto_increment,
    id_warehouse int not null,
    id_merchandising_zone int not null,
    admission_date date not null,
    expiration_date date not null,
    primary key (id_merchandising),
    foreign key (id_warehouse) references Warehouse(id_warehouse) on delete cascade,
    foreign key (id_merchandising_zone) references Zone(id_zone) on delete cascade
);

create table Sale (
	id_sale int not null auto_increment,
    id_management int not null,
    id_warehouse int not null,
    sale_code varchar(12) not null,
    sale_concept varchar(250),
    sale_date date,
    primary key (id_sale),
    foreign key (id_management) references Management(id_management) on delete cascade,
    foreign key (id_warehouse) references Warehouse(id_warehouse) on delete cascade
);

create table Sale_Detail (
	id_sale_detail int not null auto_increment,
    id_sale int not null,
    id_merchandising int not null,
    amount double not null,
    quantity int not null,
    discount double not null,
    primary key (id_sale_detail),
    foreign key (id_sale) references Sale(id_sale) on delete cascade,
    foreign key (id_merchandising) references Merchandising(id_merchandising) on delete cascade
);

/*NATURA DATA - TANGIBLE*/
create table Specie (
	id_specie int not null auto_increment,
    specie_code varchar(12) not null,
    common_name varchar(120) not null,
    cientific_name varchar(120) not null,
    status varchar(50) not null,
    primary key (id_specie)
);

create table Plantae (
	id_plantae int not null auto_increment,
    id_specie int not null,
    description varchar(250),
    origin varchar(120) not null,
    status varchar(50) not null,
    primary key (id_plantae),
    foreign key (id_specie) references Specie(id_specie) on delete cascade
);

create table Caretaker_Plantae (
	id_caretaker_plantae int not null auto_increment,
    id_caretaker int not null,
    id_plantae int not null,
    initial_date date not null,
    final_date date not null,
    primary key (id_caretaker_plantae),
    foreign key (id_caretaker) references Caretaker (id_caretaker) on delete cascade,
    foreign key (id_plantae) references Plantae(id_plantae) on delete cascade
);

create table Botanic_Plantae(
	id_botanic_plantae int not null auto_increment, 
    id_plantae int not null,
    id_botanic int not null,
    id_supply int not null,
    primary key (id_botanic_plantae),
    foreign key (id_plantae) references Plantae(id_plantae) on delete cascade,
    foreign key (id_botanic) references Botanic(id_botanic) on delete cascade,
    foreign key (id_supply) references Supply(id_supply) on delete cascade
);

create table Transferences_Plantae (
	id_transference_plantae int not null auto_increment,
    id_plantae int not null,
    id_transferences int not null,
    primary key (id_transference_plantae),
    foreign key (id_plantae) references Plantae(id_plantae) on delete cascade,
    foreign key (id_transferences) references Transferences(id_transferences) on delete cascade
);

create table Plantae_Zone (
	id_plantae_zone int not null auto_increment,
    id_plantae int not null,
    id_zone int not null,
    primary key (id_plantae_zone),
    foreign key (id_plantae) references Plantae(id_plantae) on delete cascade,
    foreign key (id_zone) references Zone(id_zone) on delete cascade
);

create table Animalia (
	id_animalia int not null auto_increment,
    id_specie int not null,
    description varchar(250),
    origin varchar(120) not null,
    status varchar(50) not null,
    primary key (id_animalia),
    foreign key (id_specie) references Specie(id_specie) on delete cascade
);

create table Caretaker_Animalia (
	id_caretaker_animalia int not null auto_increment,
    id_animalia int not null,
    id_caretaker int not null,
    initial_date date not null,
    final_date date not null,
    primary key (id_caretaker_animalia),
    foreign key (id_animalia) references Animalia(id_animalia) on delete cascade,
    foreign key (id_caretaker) references Caretaker(id_caretaker) on delete cascade
);

create table Veterinary_Animalia (
	id_veterinary_animalia int not null auto_increment, 
    id_animalia int not null,
    id_veterinary int not null,
    id_supply int not null,
    primary key (id_veterinary_animalia),
    foreign key (id_animalia) references Animalia(id_animalia) on delete cascade,
    foreign key (id_veterinary) references Veterinary(id_veterinary) on delete cascade,
    foreign key (id_supply) references Supply(id_supply) on delete cascade
);

create table Transferences_Animalia (
	id_transference_animalia int not null auto_increment,
    id_animalia int not null,
    id_transferences int not null,
    primary key (id_transference_animalia),
    foreign key (id_animalia) references Animalia(id_animalia) on delete cascade,
    foreign key (id_transferences) references Transferences(id_transferences) on delete cascade
);

create table Animalia_Zone (
	id_animalia_zone int not null auto_increment,
    id_animalia int not null,
    id_zone int not null,
    primary key (id_animalia_zone),
    foreign key (id_animalia) references Animalia(id_animalia) on delete cascade,
    foreign key (id_zone) references Zone(id_zone) on delete cascade
);

create table Itinerary (
	id_itinerary int not null auto_increment,
    itinerary_code varchar(12) not null,
    status varchar(12) not null,
    itinerary_date date not null,
    walk_duration varchar(40) not null,
    itinerary_length double not null,
    max_number_people int not null,
    max_number_visited_specie int not null,
    primary key (id_itinerary)
);

create table Itinerary_Zone (
	id_itinerary_zone int not null auto_increment,
    id_zone int not null,
    id_itinerary int not null,
    primary key (id_itinerary_zone),
    foreign key (id_zone) references Zone(id_zone) on delete cascade,
    foreign key (id_itinerary) references Itinerary(id_itinerary) on delete cascade
);