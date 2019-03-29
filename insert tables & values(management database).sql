create database management;
use management;

create table Employee (
    Emp_no int Primary key,
    First_name varchar(15) NOT NULL,
    Last_name varchar(15) NOT NULL,
    Sex enum('M','F') NOT NULL,
    Joined_on date NOT NULL,
    Dep_id varchar(5) NOT NULL,
    Designation varchar(25) NOT NULL,
    Phone_no varchar(15) NOT NULL,
    Salary double NOT NULL);

create table Department (
    Dep_id varchar(5) Primary key,
    Dep_name varchar(35) NOT NULL);

/*****************************************************************************************/

/*IMP VALUES*/
insert into Employee values ('17001','Anurag','Verma','M','2017/10/15','REC','receptionist','+919871234654', 35000);
insert into Employee values ('17002','Biplab','Sahoo','M','2017/10/15','DIN','dining incharge','+918798645728', 40000);
insert into Employee values ('17003','Ayush','Mantri','M','2017/10/15','DIN','dining employee','+918834609761', 30000);
insert into Employee values ('17004','Arvind','Ravikumar','M','2017/10/15','DIN','dining employee','+919988775234', 30000);
insert into Employee values ('17005','Dipankar','Shrivastava','M','2017/10/15','HKE','housekeeping incharge','+919674545783', 40000);
insert into Employee values ('17006','Umesh','Lodhi','M','2017/10/15','HKE','housekeeping employee','+917698435678', 30000);
insert into Employee values ('17007','Somesh','Patil','M','2017/10/15','HKE','housekeeping employee','+917765348982', 30000);
insert into Employee values ('17008','Tirthesh','Ingale','M','2017/10/15','SAL','salon incharge','+918634572899', 40000);
insert into Employee values ('17009','Chetan','Sharma','M','2017/10/15','SAL','salon employee','+919763478255', 30000);

insert into Department values ('REC','Front office department');
insert into Department values ('DIN','Dining facity department');
insert into Department values ('HKE','housekeeping and laundry department');
insert into Department values ('SAL','Salon and spa department');