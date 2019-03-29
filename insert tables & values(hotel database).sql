create database hotel;
use hotel;

create table Customer_info(
	First_name varchar(15) NOT NULL,
	Last_name varchar(15) NOT NULL,
	Cust_id int Primary Key,
	Age int NOT NULL,
	Phone_no varchar(15) NOT NULL,
	Email varchar(50) DEFAULT NULL,
	Sex enum('M','F') NOT NULL,
	Address varchar(80) NOT NULL);

create table Room_info(
	Room_no int Primary Key,
	Type enum('Regular','Premium'),
	Active_status int NOT NULL,
	Charge double NOT NULL);

create table Membership(
	Membership_id int Primary Key,
	Cust_id int NOT NULL,
	Discount int NOT NULL,
	Type enum('Gold','Platinum') NOT NULL,
	Aadhar_id bigint NOT NULL,
	Brought_on date NOT NULL,
	Valid_till date NOT NULL,
	UNIQUE (Aadhar_id)
);

create table Booking_info(
	Booking_id int Primary Key,
	Cust_id int NOT NULL,
	Active_status int NOT NULL,
	Laundry_charge double DEFAULT 0,
	Dining_charge double DEFAULT 0,
	Salon_charge double DEFAULT 0,
	Room_charge double DEFAULT 0,
	Total_charge double DEFAULT 0,
	Booked_on date NOT NULL,
	Booked_till date NOT NULL);

create table Salon_info(
	Bill_no int Primary key,
	Booking_id int NOT NULL,
	Total_price double NOT NULL,
	Bill_date date NOT NULL);

create table Salon_Service_info(
	Name varchar(35) Primary key,
	Price double NOT NULL);

create table Salon_service_list(
	Bill_no int NOT NULL,
	Name varchar(35) NOT NULL,
	Primary key (Bill_no, Name));

create table Laundry_info(
	Bill_no int Primary key,
	Booking_id int NOT NULL,
	Total_price double NOT NULL,
	Bill_date date NOT NULL);

create table Laundry_Service_info(
	Name varchar(35) Primary key,
	Price double NOT NULL);

create table Laundry_service_list(
	Bill_no int NOT NULL,
	Name varchar(35) NOT NULL,
	Quantity int NOT NULL,
	Primary key (Bill_no, Name));

create table Dining_info(
	Bill_no int Primary key,
	Booking_id int NOT NULL,
	Bill_date date NOT NULL,
	Total_price double NOT NULL);

create table Dining_product_info(
	Name varchar(50) Primary key,
	Price int NOT NULL);

create table Dining_Order_list(
	Bill_no int NOT NULL,
	Name varchar(50) NOT NULL,
	Quantity int NOT NULL,
	Primary key (Bill_no, Name));

create table cust_room_info(
	Room_no int NOT NULL,
	Booking_id int NOT NULL,
	Primary key (Room_no, Booking_id));
    
/**************************************************************************************************/

/*IMP VALUES*/
insert into Laundry_Service_info values('washing','10');
insert into Laundry_Service_info values('press','10');
insert into Laundry_Service_info values('dry clean','30');

insert into Salon_service_info values('hair cut','50');
insert into Salon_service_info values('massage','100');
insert into Salon_service_info values('manicure','30');
insert into salon_service_info values('pedicure','40');
insert into Salon_service_info values('waxing','40');
insert into Salon_service_info values('facial','100');

insert into Dining_product_info values('steamed Rice','70');
insert into Dining_product_info values('plain Chapati','10');
insert into Dining_product_info values('tandoori roti','10');
insert into Dining_product_info values('butter nan','25');
insert into Dining_product_info values('rumali Roti','20');
insert into Dining_product_info values('curd','30');
insert into Dining_product_info values('vegetable salad','30');
insert into Dining_product_info values('veg biryani','100');
insert into Dining_product_info values('chicken biryani','120');
insert into Dining_product_info values('mutton biryani','130');
insert into Dining_product_info values('raita','30');
insert into Dining_product_info values('chilly Paneer','80');
insert into Dining_product_info values('kadhai paneer','90');
insert into Dining_product_info values('chhole','70');
insert into Dining_product_info values('mix veg','80');
insert into Dining_product_info values('gobhi masala','70');
insert into Dining_product_info values('bhindi fried','60');
insert into Dining_product_info values('chilly chicken','90');
insert into Dining_product_info values('kabuli chicken','100');
insert into Dining_product_info values('tandoori chicken','90');
insert into Dining_product_info values('mutton curry','100');
insert into Dining_product_info values('mutton afghani','120');
insert into Dining_product_info values('fried fish','70');
insert into Dining_product_info values('fish curry','80');
insert into Dining_product_info values('ice cream','30');
insert into Dining_product_info values('choco lava cake','100');
insert into Dining_product_info values('coke(600 ml)','40');
insert into Dining_product_info values('veg noodles','70');
insert into Dining_product_info values('chicken noodles','90');
insert into Dining_product_info values('veg Pasta','70');
insert into Dining_product_info values('dal makhani','90');
insert into Dining_product_info values('plain moong dal','70');
insert into Dining_product_info values('dosa sambhar','100');
insert into Dining_product_info values('idli sambhar','80');
insert into Dining_product_info values('sambhar vada','70');
insert into Dining_product_info values('jeera rice','90');

insert into Room_info values('201','Regular','0','2000');
insert into Room_info values('202','Regular','0','2000');
insert into Room_info values('203','Regular','0','2000');
insert into Room_info values('204','Regular','0','2000');
insert into Room_info values('205','Regular','0','2000');
insert into Room_info values('206','Regular','0','2000');
insert into Room_info values('207','Regular','0','2000');
insert into Room_info values('208','Premium','0','5000');
insert into Room_info values('209','Premium','0','5000');
insert into Room_info values('210','Premium','0','5000');
insert into Room_info values('301','Regular','0','2000');
insert into Room_info values('302','Regular','0','2000');
insert into Room_info values('303','Regular','0','2000');
insert into Room_info values('304','Regular','0','2000');
insert into Room_info values('305','Regular','0','2000');
insert into Room_info values('306','Regular','0','2000');
insert into Room_info values('307','Regular','0','2000');
insert into Room_info values('308','Premium','0','5000');
insert into Room_info values('309','Premium','0','5000');
insert into Room_info values('310','Premium','0','5000');

insert into customer_info values('ABC', 'XYZ', 1000, 0, '+919999999999', 'abc.xyz@gmail.com', 'M', 'PQR');
insert into booking_info values(10000, 1000, 0, 0, 0, 0 , 0, 0, '2000/01/01', '2000/01/01');
Insert into dining_info(Bill_no, Booking_id, Total_price, Bill_date) values(100000, 10000, 0, '2000/01/01');
Insert into salon_info(Bill_no, Booking_id, Total_price, Bill_date) values(100000, 10000, 0, '2000/01/01');
Insert into laundry_info(Bill_no, Booking_id, Total_price, Bill_date) values(100000, 10000, 0, '2000/01/01');
Insert into membership values(0, 1000, 0, 'Gold', 000000000000, '2000/01/01', '2000/01/01');