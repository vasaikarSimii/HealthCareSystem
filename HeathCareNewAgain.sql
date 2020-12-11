/*
SQLyog Community v13.1.6 (64 bit)
MySQL - 5.5.1-m2-community : Database - test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`test` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `test`;

/*Table structure for table `airline` */

DROP TABLE IF EXISTS `airline`;

CREATE TABLE `airline` (
  `name` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL,
  `seats` int(5) DEFAULT NULL,
  `model_no` varchar(20) NOT NULL,
  PRIMARY KEY (`model_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `airline` */

insert  into `airline`(`name`,`type`,`seats`,`model_no`) values 
('Etihad','AirBus 380',30,'ABE101'),
('Qatar','Boeing 777',45,'BQ101'),
('United Airlines','AirBus 380',45,'UAA101');

/*Table structure for table `allowance` */

DROP TABLE IF EXISTS `allowance`;

CREATE TABLE `allowance` (
  `employee_id` int(6) NOT NULL,
  `first_name` varchar(20) DEFAULT NULL,
  `b_salary` float DEFAULT NULL,
  `grade_pay` float DEFAULT NULL,
  `sa` float DEFAULT NULL,
  `pa` float DEFAULT NULL,
  `ra` float DEFAULT NULL,
  `ea` float DEFAULT NULL,
  `hra` float DEFAULT NULL,
  `total_days` int(7) DEFAULT NULL,
  `present_days` int(7) DEFAULT NULL,
  `total_allowances` float DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `allowance` */

insert  into `allowance`(`employee_id`,`first_name`,`b_salary`,`grade_pay`,`sa`,`pa`,`ra`,`ea`,`hra`,`total_days`,`present_days`,`total_allowances`) values 
(101,'Adesh',40000,0,0,0,0,0,0,30,29,38666.7),
(102,'Dev',90000,500,0,0,0,0,0,30,25,75416.7),
(103,'Lalita',50000,600,0,0,0,0,0,30,30,50600),
(104,'Ninja',20000,456,0,0,0,0,0,30,30,20456);

/*Table structure for table `ambulance_report` */

DROP TABLE IF EXISTS `ambulance_report`;

CREATE TABLE `ambulance_report` (
  `informer_id` varchar(50) NOT NULL,
  `informer_name` varchar(50) DEFAULT NULL,
  `total_injured` varchar(50) DEFAULT NULL,
  `loaction` varchar(50) DEFAULT NULL,
  `contact` varchar(50) DEFAULT NULL,
  `alt_contact` varchar(50) DEFAULT NULL,
  `time_of_response` varchar(50) NOT NULL,
  `contact_ambulance` varchar(50) DEFAULT NULL,
  `network` varchar(50) DEFAULT NULL,
  `ambulance_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`informer_id`,`time_of_response`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `ambulance_report` */

insert  into `ambulance_report`(`informer_id`,`informer_name`,`total_injured`,`loaction`,`contact`,`alt_contact`,`time_of_response`,`contact_ambulance`,`network`,`ambulance_name`) values 
('aaki101','Aakarsh Mandloi','2','City Center','9977010888','7788554455','11/12/2020 14:17:00','7894561230','BosNet','Wheels'),
('aaki101','Aakarsh Mandloi','4','Center Square','9977010888','9977889977','NA','NA','NA','NA'),
('dev101','Dev Vyas','5','Beach','7894561230','7744112255','11/12/2020 14:18:37','7894561230','BosNet','Wheels');

/*Table structure for table `appoint_status` */

DROP TABLE IF EXISTS `appoint_status`;

CREATE TABLE `appoint_status` (
  `pat_id` varchar(50) NOT NULL,
  `pat_name` varchar(50) DEFAULT NULL,
  `doctor_id` varchar(50) NOT NULL,
  `appointment` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pat_id`,`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `appoint_status` */

insert  into `appoint_status`(`pat_id`,`pat_name`,`doctor_id`,`appointment`,`date`) values 
('aaki101','Aakarsh Mandloi','thomas101','Accepted','09/12/2020'),
('ada101','Ada Khan','anita101','Accepted','11/12/2020'),
('dev101','Dev Vyas','adesh101','Accepted','10/12/2020'),
('dev101','Dev Vyas','anita101','Accepted','17/12/2020'),
('dev101','Dev Vyas','thomas101','Denied','NA');

/*Table structure for table `appointment` */

DROP TABLE IF EXISTS `appointment`;

CREATE TABLE `appointment` (
  `p_name` varchar(50) DEFAULT NULL,
  `p_id` varchar(50) NOT NULL,
  `p_age` varchar(50) DEFAULT NULL,
  `p_sym` varchar(500) DEFAULT NULL,
  `d_name` varchar(50) DEFAULT NULL,
  `d_id` varchar(50) NOT NULL,
  `d_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`p_id`,`d_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `appointment` */

insert  into `appointment`(`p_name`,`p_id`,`p_age`,`p_sym`,`d_name`,`d_id`,`d_enter`) values 
('Aakarsh Mandloi','aaki101','25','Cough,Nausia','Thomas','thomas101','Cal Hospital'),
('Ada Khan','ada101','26','Achne','Anita','anita101','City Hospital'),
('Dev Vyas','dev101','20','Ear pain','Adesh','adesh101','Cal Hospital'),
('Dev Vyas','dev101','20','Cough','Anita','anita101','City Hospital'),
('Dev Vyas','dev101','20','Headache','David','david101','Cal Hospital'),
('Dev Vyas','dev101','20','fever','Thomas','thomas101','Cal Hospital');

/*Table structure for table `audit` */

DROP TABLE IF EXISTS `audit`;

CREATE TABLE `audit` (
  `username` varchar(20) DEFAULT NULL,
  `time` varchar(50) NOT NULL,
  `status` varchar(20) DEFAULT NULL,
  `id` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`time`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `audit` */

insert  into `audit`(`username`,`time`,`status`,`id`) values 
('adesh_vyas','Jul 17, 2020/00:38:59','logged in','1'),
('dev','Jul 17, 2020/00:51:52','logged in','2'),
('lalita','Jul 17, 2020/00:54:13','logged in','3'),
('dev','Jul 17, 2020/01:13:39','logged in','2'),
('dev','Jul 17, 2020/01:13:42','logged out','2'),
('adesh_vyas','Oct 1, 2020/12:12:48','logged in','1'),
('adesh_vyas','Sep 26, 2020/10:55:51','logged in','1'),
('adesh_vyas','Sep 26, 2020/12:34:19','logged in','1'),
('adesh_vyas','Sep 26, 2020/12:50:28','logged out','1');

/*Table structure for table `bank_details` */

DROP TABLE IF EXISTS `bank_details`;

CREATE TABLE `bank_details` (
  `employ_id` varchar(20) NOT NULL,
  `bank_name` varchar(50) DEFAULT NULL,
  `account_no` varchar(20) DEFAULT NULL,
  `ifsc` varchar(20) DEFAULT NULL,
  `branch` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`employ_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `bank_details` */

insert  into `bank_details`(`employ_id`,`bank_name`,`account_no`,`ifsc`,`branch`) values 
('101','SBi','552244117788','SBI1012034','Rau'),
('102','HDFC','100200356545','HDFC134646','Mhow'),
('103','IDFC','564978412364','IDFC789456','Sudama Nagar'),
('104','SBI','456794561365','SBI10235465','China');

/*Table structure for table `cars` */

DROP TABLE IF EXISTS `cars`;

CREATE TABLE `cars` (
  `serial_no` varchar(12) NOT NULL,
  `car_type` varchar(40) DEFAULT NULL,
  `manuf` varchar(20) DEFAULT NULL,
  `model` varchar(40) DEFAULT NULL,
  `yom` int(10) DEFAULT NULL,
  `aval` varchar(10) DEFAULT NULL,
  `min_seat` int(10) DEFAULT NULL,
  `max_seat` int(10) DEFAULT NULL,
  `state` varchar(40) DEFAULT NULL,
  `city` varchar(40) DEFAULT NULL,
  `maintain` varchar(20) DEFAULT NULL,
  `doc` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`serial_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `cars` */

insert  into `cars`(`serial_no`,`car_type`,`manuf`,`model`,`yom`,`aval`,`min_seat`,`max_seat`,`state`,`city`,`maintain`,`doc`) values 
('M-09-PX-2015','SUV','Ford','Ecosport',2019,'Yes',1,8,'California','San Jose','Not Expired','08/10/2020');

/*Table structure for table `covid_booking` */

DROP TABLE IF EXISTS `covid_booking`;

CREATE TABLE `covid_booking` (
  `patient_i` varchar(50) NOT NULL,
  `patient_n` varchar(50) DEFAULT NULL,
  `patient_add` varchar(500) DEFAULT NULL,
  `patient_age` varchar(50) DEFAULT NULL,
  `patient_phone` varchar(50) DEFAULT NULL,
  `patient_email` varchar(50) DEFAULT NULL,
  `test_type` varchar(50) DEFAULT NULL,
  `covid_center` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`patient_i`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `covid_booking` */

insert  into `covid_booking`(`patient_i`,`patient_n`,`patient_add`,`patient_age`,`patient_phone`,`patient_email`,`test_type`,`covid_center`) values 
('aaki101','Aakarsh Mandloi','Somewhere','25','9977010888','aaki@gmail.com','RT-PCR','Cal Hospital'),
('ada101','Ada Khan','Indore','26','8527419630','ada@hotmail.com','RT-PCR','City Hospital'),
('dev101','Dev Vyas','Earth','20','7894561230','dev@gmail.com','Antigen','Cal Hospital');

/*Table structure for table `covid_care_result` */

DROP TABLE IF EXISTS `covid_care_result`;

CREATE TABLE `covid_care_result` (
  `patient_i` varchar(50) NOT NULL,
  `patient_n` varchar(50) DEFAULT NULL,
  `patient_add` varchar(500) DEFAULT NULL,
  `patient_age` varchar(50) DEFAULT NULL,
  `patient_phone` varchar(50) DEFAULT NULL,
  `patient_email` varchar(50) DEFAULT NULL,
  `test_type` varchar(50) DEFAULT NULL,
  `covid_center` varchar(50) DEFAULT NULL,
  `request_status` varchar(50) DEFAULT NULL,
  `test_result` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`patient_i`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `covid_care_result` */

insert  into `covid_care_result`(`patient_i`,`patient_n`,`patient_add`,`patient_age`,`patient_phone`,`patient_email`,`test_type`,`covid_center`,`request_status`,`test_result`) values 
('aaki101','Aakarsh Mandloi','Somewhere','25','9977010888','aaki@gmail.com','RT-PCR','Cal Hospital','Declined','Null'),
('ada101','Ada Khan','Indore','26','8527419630','ada@hotmail.com','RT-PCR','City Hospital','Accepted','Positive'),
('dev101','Dev Vyas','Earth','20','7894561230','dev@gmail.com','Antigen','Cal Hospital','Accepted','Negative');

/*Table structure for table `customer` */

DROP TABLE IF EXISTS `customer`;

CREATE TABLE `customer` (
  `f_name` varchar(30) DEFAULT NULL,
  `l_name` varchar(30) DEFAULT NULL,
  `mobile` varchar(12) NOT NULL,
  `email` varchar(50) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `dob` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `customer` */

insert  into `customer`(`f_name`,`l_name`,`mobile`,`email`,`password`,`dob`) values 
('Dev','Vyas','7788994466','dev26vyas@gmail.com','dev101','05/05/1995'),
('Rakesh','Sharma','8844779955','rak@gmail.com','rakesh101',NULL),
('Adesh','Vyas','9988774455','adesh05vyas@gmail.com','adesh102','14/10/2020');

/*Table structure for table `deduction` */

DROP TABLE IF EXISTS `deduction`;

CREATE TABLE `deduction` (
  `e_id` int(11) NOT NULL,
  `name_f` varchar(20) DEFAULT NULL,
  `pf` float DEFAULT NULL,
  `esic` float DEFAULT NULL,
  `pt` float DEFAULT NULL,
  `income_tax` float DEFAULT NULL,
  `adv` float DEFAULT NULL,
  `other` float DEFAULT NULL,
  `other_reason` varchar(200) DEFAULT NULL,
  `total_deduction` float DEFAULT NULL,
  `salary_final` float DEFAULT NULL,
  PRIMARY KEY (`e_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `deduction` */

insert  into `deduction`(`e_id`,`name_f`,`pf`,`esic`,`pt`,`income_tax`,`adv`,`other`,`other_reason`,`total_deduction`,`salary_final`) values 
(101,'Adesh',3600,0,208,0,0,0,'',3808,34858.7),
(102,'Dev',1000,0,208,0,0,0,'No reason for this',1208,74208.7),
(103,'Lalita',900,0,208,0,0,0,'sdfasfdwsfsdafs',1108,49492),
(104,'Ninja',0,0,125,0,0,0,'',125,20331);

/*Table structure for table `donor_request` */

DROP TABLE IF EXISTS `donor_request`;

CREATE TABLE `donor_request` (
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `blood` varchar(50) DEFAULT NULL,
  `weight` varchar(50) DEFAULT NULL,
  `height` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `age` varchar(50) DEFAULT NULL,
  `donor_org` varchar(50) NOT NULL,
  `donor_location` varchar(50) DEFAULT NULL,
  `donor_net` varchar(50) DEFAULT NULL,
  `donor_enter` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`,`donor_org`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `donor_request` */

insert  into `donor_request`(`first_name`,`last_name`,`gender`,`address`,`email`,`phone`,`blood`,`weight`,`height`,`username`,`age`,`donor_org`,`donor_location`,`donor_net`,`donor_enter`,`status`) values 
('Aakarsh','Mandloi','Male','Somewhere','aaki@gmail.com','9977010888','B+','147.71','165','aaki101','25','Save Life Blood Bank','Earth','BosNet','San Jose','Pending'),
('Dev','Vyas','Male','Earth','dev@gmail.com','7894561230','AB+','187','178','dev101','20','Save Life Blood Bank','Earth','BosNet','San Jose','Accepted');

/*Table structure for table `emp_table` */

DROP TABLE IF EXISTS `emp_table`;

CREATE TABLE `emp_table` (
  `emp_id` int(6) NOT NULL AUTO_INCREMENT,
  `f_name` varchar(20) DEFAULT NULL,
  `l_name` varchar(20) DEFAULT NULL,
  `gender` varchar(10) DEFAULT NULL,
  `dob` varchar(10) DEFAULT NULL,
  `email` varchar(30) DEFAULT NULL,
  `contact` varchar(12) DEFAULT NULL,
  `p_address` varchar(100) DEFAULT NULL,
  `c_address` varchar(100) DEFAULT NULL,
  `pincode` varchar(6) DEFAULT NULL,
  `institute` varchar(20) DEFAULT NULL,
  `dept` varchar(20) DEFAULT NULL,
  `designation` varchar(30) DEFAULT NULL,
  `doj` varchar(12) DEFAULT NULL,
  `basic_salary` float DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `image` mediumblob,
  PRIMARY KEY (`emp_id`)
) ENGINE=InnoDB AUTO_INCREMENT=105 DEFAULT CHARSET=latin1;

/*Data for the table `emp_table` */

insert  into `emp_table`(`emp_id`,`f_name`,`l_name`,`gender`,`dob`,`email`,`contact`,`p_address`,`c_address`,`pincode`,`institute`,`dept`,`designation`,`doj`,`basic_salary`,`status`,`image`) values 
(101,'Adesh','Vyas','','05/05/1995','adesh@gmail.com','8602386226','somewhere in world','somewhere in world','452009','IIST','CSE','Assosiate Professor','29/07/2019',40000,'Permanent',NULL),
(102,'Dev','Vyas','','05/05/1995','dev@gmail.com','9893198938','Indore','Indore','452001','IIST','IT','Principal','29/07/2019',90000,'Permanent',NULL),
(103,'Lalita','Rawal','','10/07/1966','lalita@gmail.com','987654321','somewhere on earth','somewhere on earth','452009','IIP','B2','Professor','10/10/2010',50000,'Permanent',NULL),
(104,'Ninja','Warrior','','26/09/2020','ninjahasnoid@gmail.com','9977101888','Shaolin Temple','Shaolin Temple','452020','Transport','Ambulance','None','27/09/2020',20000,'Contract',NULL);

/*Table structure for table `fire_report` */

DROP TABLE IF EXISTS `fire_report`;

CREATE TABLE `fire_report` (
  `informer_id` varchar(50) NOT NULL,
  `informer_name` varchar(50) DEFAULT NULL,
  `total_injured` varchar(50) DEFAULT NULL,
  `loaction` varchar(50) DEFAULT NULL,
  `contact` varchar(50) DEFAULT NULL,
  `alt_contact` varchar(50) DEFAULT NULL,
  `time_of_response` varchar(50) DEFAULT NULL,
  `contact_fire` varchar(50) DEFAULT NULL,
  `network` varchar(50) DEFAULT NULL,
  `fire_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`informer_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `fire_report` */

insert  into `fire_report`(`informer_id`,`informer_name`,`total_injured`,`loaction`,`contact`,`alt_contact`,`time_of_response`,`contact_fire`,`network`,`fire_name`) values 
('aaki101','Aakarsh Mandloi','2','City Center','9977010888','7788554455','11/12/2020 14:38:01','8877994455','BosNet','FireOut'),
('dev101','Dev Vyas','5','Beach','7894561230','7744112255','NA','NA','NA','NA');

/*Table structure for table `flight` */

DROP TABLE IF EXISTS `flight`;

CREATE TABLE `flight` (
  `fli_name` varchar(30) DEFAULT NULL,
  `fli_type` varchar(30) DEFAULT NULL,
  `flight_no` varchar(30) NOT NULL,
  `source` varchar(20) DEFAULT NULL,
  `destination` varchar(20) DEFAULT NULL,
  `de_date` varchar(12) DEFAULT NULL,
  `ar_date` varchar(12) DEFAULT NULL,
  `de_time` varchar(12) DEFAULT NULL,
  `ar_time` varchar(12) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  `a_seat` int(10) DEFAULT NULL,
  PRIMARY KEY (`flight_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `flight` */

insert  into `flight`(`fli_name`,`fli_type`,`flight_no`,`source`,`destination`,`de_date`,`ar_date`,`de_time`,`ar_time`,`price`,`a_seat`) values 
('Air India','AirBus 380','1230','Mumbai','New York','03/11/2020','04/11/2020','16:00','19:00',200,30),
('United Airlines','AirBus 380','4510','New York','London','02/11/2020','03/11/2020','21:00','05:35',630,28),
('Air China','Boeing 777','4560','Tokyo','Mumbai','31/10/2020','02/11/2020','22:30','00:20',1505,45),
('Emirates','AirBus 380','7890','Boston','New York','03/11/2020','03/11/2020','04:00','05:20',850,30);

/*Table structure for table `insurance` */

DROP TABLE IF EXISTS `insurance`;

CREATE TABLE `insurance` (
  `company_name` varchar(50) DEFAULT NULL,
  `company_id` varchar(50) NOT NULL,
  `pass` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`company_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `insurance` */

insert  into `insurance`(`company_name`,`company_id`,`pass`) values 
('ICICI','com101','compass');

/*Table structure for table `insure_request` */

DROP TABLE IF EXISTS `insure_request`;

CREATE TABLE `insure_request` (
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `blood` varchar(50) DEFAULT NULL,
  `weight` varchar(50) DEFAULT NULL,
  `height` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `age` varchar(50) DEFAULT NULL,
  `duration` varchar(50) DEFAULT NULL,
  `pack_type` varchar(50) DEFAULT NULL,
  `amount` double DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `insure_request` */

insert  into `insure_request`(`first_name`,`last_name`,`gender`,`address`,`email`,`phone`,`blood`,`weight`,`height`,`username`,`age`,`duration`,`pack_type`,`amount`,`status`) values 
('Aakarsh','Mandloi','Male','Somewhere','aaki@gmail.com','9977010888','B+','147.71','165','aaki101','25','1 year','Gold',200,'Accepted'),
('Dev','Vyas','Male','Earth','dev@gmail.com','7894561230','AB+','187','178','dev101','20','1 year','Gold',500,'Rejected');

/*Table structure for table `logins` */

DROP TABLE IF EXISTS `logins`;

CREATE TABLE `logins` (
  `user` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`user`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `logins` */

/*Table structure for table `manage_ambulance` */

DROP TABLE IF EXISTS `manage_ambulance`;

CREATE TABLE `manage_ambulance` (
  `ambulance_name` varchar(50) DEFAULT NULL,
  `contact` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `usern` varchar(50) NOT NULL,
  `passw` varchar(50) DEFAULT NULL,
  `net` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`usern`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_ambulance` */

insert  into `manage_ambulance`(`ambulance_name`,`contact`,`location`,`usern`,`passw`,`net`) values 
('Wheels','7894561230','Earth','wh101','whpass','BosNet');

/*Table structure for table `manage_covid` */

DROP TABLE IF EXISTS `manage_covid`;

CREATE TABLE `manage_covid` (
  `covid_doc` varchar(50) DEFAULT NULL,
  `covid_location` varchar(50) DEFAULT NULL,
  `covid_username` varchar(50) NOT NULL,
  `covid_pass` varchar(50) DEFAULT NULL,
  `covid_net` varchar(50) DEFAULT NULL,
  `covid_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`covid_username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_covid` */

insert  into `manage_covid`(`covid_doc`,`covid_location`,`covid_username`,`covid_pass`,`covid_net`,`covid_enter`) values 
('Anshul','Someplace','anshul101','anshulpass','Texas','City Hospital'),
('Peter','MountIDA','peter101','peterpass','CalNet','Cal Hospital');

/*Table structure for table `manage_doc` */

DROP TABLE IF EXISTS `manage_doc`;

CREATE TABLE `manage_doc` (
  `doc_name` varchar(50) DEFAULT NULL,
  `special` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `usern` varchar(50) NOT NULL,
  `passw` varchar(50) DEFAULT NULL,
  `doc_net` varchar(50) DEFAULT NULL,
  `doc_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`usern`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_doc` */

insert  into `manage_doc`(`doc_name`,`special`,`location`,`usern`,`passw`,`doc_net`,`doc_enter`) values 
('Adesh','ENT','Kane Squre','adesh101','adeshpass','CalNet','Cal Hospital'),
('Anita','Dermitologist','Someplace','anita101','anitapass','Texas','City Hospital'),
('David','Cardiology','Kane Squre','david101','davidpass','CalNet','Cal Hospital'),
('Thomas','Ortho','Mount IDA','thomas101','thomaspass','CalNet','Cal Hospital');

/*Table structure for table `manage_donor` */

DROP TABLE IF EXISTS `manage_donor`;

CREATE TABLE `manage_donor` (
  `donor_org` varchar(50) DEFAULT NULL,
  `donor_location` varchar(50) DEFAULT NULL,
  `donor_username` varchar(50) NOT NULL,
  `donor_pass` varchar(50) DEFAULT NULL,
  `donor_net` varchar(50) DEFAULT NULL,
  `donor_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`donor_username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_donor` */

insert  into `manage_donor`(`donor_org`,`donor_location`,`donor_username`,`donor_pass`,`donor_net`,`donor_enter`) values 
('Save Life Blood Bank','Earth','ravi101','ravipass','BosNet','San Jose');

/*Table structure for table `manage_emerg` */

DROP TABLE IF EXISTS `manage_emerg`;

CREATE TABLE `manage_emerg` (
  `org_id` varchar(50) NOT NULL,
  `org_type` varchar(50) DEFAULT NULL,
  `org_name` varchar(50) DEFAULT NULL,
  `org_net` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`org_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_emerg` */

insert  into `manage_emerg`(`org_id`,`org_type`,`org_name`,`org_net`) values 
('1','Ambulance','Wheels','BosNet'),
('2','Fire Department','FireOut','BosNet');

/*Table structure for table `manage_enter` */

DROP TABLE IF EXISTS `manage_enter`;

CREATE TABLE `manage_enter` (
  `network_name` varchar(50) DEFAULT NULL,
  `enter_type` varchar(50) DEFAULT NULL,
  `name` varchar(50) NOT NULL,
  PRIMARY KEY (`name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_enter` */

insert  into `manage_enter`(`network_name`,`enter_type`,`name`) values 
('AriNet','Emergency','Arizona City Emergency'),
('CalNet','Hospital','Cal Hospital'),
('FloNet','Medical Services','Center of Medical Service'),
('Texas','Hospital','City Hospital'),
('BosNet','Emergency','CityBostonEmergency'),
('CalNet','Emergency','Quick Response'),
('BosNet','Emergency','San Jose');

/*Table structure for table `manage_fire` */

DROP TABLE IF EXISTS `manage_fire`;

CREATE TABLE `manage_fire` (
  `fire_name` varchar(50) DEFAULT NULL,
  `contact` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `usern` varchar(50) NOT NULL,
  `passw` varchar(50) DEFAULT NULL,
  `net` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`usern`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_fire` */

insert  into `manage_fire`(`fire_name`,`contact`,`location`,`usern`,`passw`,`net`) values 
('FireOut','8877994455','Beach','fo101','fopass','BosNet');

/*Table structure for table `manage_hospital` */

DROP TABLE IF EXISTS `manage_hospital`;

CREATE TABLE `manage_hospital` (
  `o_id` int(10) NOT NULL,
  `o_type` varchar(50) DEFAULT NULL,
  `o_name` varchar(50) DEFAULT NULL,
  `o_net` varchar(50) DEFAULT NULL,
  `o_ent` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`o_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_hospital` */

insert  into `manage_hospital`(`o_id`,`o_type`,`o_name`,`o_net`,`o_ent`) values 
(1,'Doctor','Thomas','CalNet','Cal Hospital'),
(2,'CovidCare','Peter','CalNet','Cal Hospital'),
(3,'Doctor','David','CalNet','Cal Hospital'),
(4,'Doctor','Adesh','CalNet','Cal Hospital'),
(5,'Doctor','Anita','Texas','City Hospital'),
(6,'CovidCare','Anshul','Texas','City Hospital');

/*Table structure for table `manage_lab` */

DROP TABLE IF EXISTS `manage_lab`;

CREATE TABLE `manage_lab` (
  `phamacy_org` varchar(50) DEFAULT NULL,
  `phamacy_location` varchar(50) DEFAULT NULL,
  `phamacy_username` varchar(50) NOT NULL,
  `phamacy_pass` varchar(50) DEFAULT NULL,
  `phamacy_net` varchar(50) DEFAULT NULL,
  `phamacy_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`phamacy_username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_lab` */

insert  into `manage_lab`(`phamacy_org`,`phamacy_location`,`phamacy_username`,`phamacy_pass`,`phamacy_net`,`phamacy_enter`) values 
('Test Laby','Someplace near','rahul101','rahulpass','BosNet','San Jose');

/*Table structure for table `manage_logins` */

DROP TABLE IF EXISTS `manage_logins`;

CREATE TABLE `manage_logins` (
  `n_name` varchar(50) DEFAULT NULL,
  `e_name` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `o_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_logins` */

insert  into `manage_logins`(`n_name`,`e_name`,`username`,`password`,`o_name`) values 
('BosNet','CityBostonEmergency','cbe101','cbepass','Rohit Verma'),
('CalNet','Cal Hospital','ch101','chpass','Monty Singh'),
('Texas','City Hospital','city101','citypass','Dev Vyas'),
('FloNet','Center of Medical Service','cm101','cmpass','Robert D'),
('AriNet','Arizona City Emergency','don101','donpass','Don'),
('BosNet','San Jose','sj101','sjpass','Rakesh Jain');

/*Table structure for table `manage_medical` */

DROP TABLE IF EXISTS `manage_medical`;

CREATE TABLE `manage_medical` (
  `org_id` varchar(50) NOT NULL,
  `org_type` varchar(50) DEFAULT NULL,
  `org_name` varchar(50) DEFAULT NULL,
  `org_net` varchar(50) DEFAULT NULL,
  `org_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`org_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_medical` */

insert  into `manage_medical`(`org_id`,`org_type`,`org_name`,`org_net`,`org_enter`) values 
('1','Pharmacy','Medi Home Pharmacy','BosNet','San Jose'),
('2','Laboratory','Test Laby','BosNet','San Jose'),
('3','Blood Donor Camp','Save Life Blood Bank','BosNet','San Jose');

/*Table structure for table `manage_phamacy` */

DROP TABLE IF EXISTS `manage_phamacy`;

CREATE TABLE `manage_phamacy` (
  `phamacy_org` varchar(50) DEFAULT NULL,
  `phamacy_location` varchar(50) DEFAULT NULL,
  `phamacy_username` varchar(50) NOT NULL,
  `phamacy_pass` varchar(50) DEFAULT NULL,
  `phamacy_net` varchar(50) DEFAULT NULL,
  `phamacy_enter` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`phamacy_username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manage_phamacy` */

insert  into `manage_phamacy`(`phamacy_org`,`phamacy_location`,`phamacy_username`,`phamacy_pass`,`phamacy_net`,`phamacy_enter`) values 
('Medi Home Pharmacy','around','monu101','monupass','BosNet','San Jose');

/*Table structure for table `network` */

DROP TABLE IF EXISTS `network`;

CREATE TABLE `network` (
  `state_name` varchar(50) NOT NULL,
  `net_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`state_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `network` */

insert  into `network`(`state_name`,`net_name`) values 
('Arizona','AriNet'),
('Boston','BosNet'),
('California','CalNet'),
('Florida','FloNet'),
('TexNet','Texas');

/*Table structure for table `pharmacy_status` */

DROP TABLE IF EXISTS `pharmacy_status`;

CREATE TABLE `pharmacy_status` (
  `b_id` varchar(50) NOT NULL,
  `b_name` varchar(50) DEFAULT NULL,
  `do_id` varchar(50) NOT NULL,
  `do_name` varchar(50) DEFAULT NULL,
  `do_enter` varchar(50) DEFAULT NULL,
  `drug` varchar(50) DEFAULT NULL,
  `quantity` varchar(50) DEFAULT NULL,
  `dose` varchar(50) DEFAULT NULL,
  `duration` varchar(50) DEFAULT NULL,
  `instruction` varchar(500) DEFAULT NULL,
  `date_time` varchar(50) NOT NULL,
  `request` varchar(50) DEFAULT NULL,
  `p_id` varchar(50) DEFAULT NULL,
  `p_org` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`b_id`,`do_id`,`date_time`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `pharmacy_status` */

insert  into `pharmacy_status`(`b_id`,`b_name`,`do_id`,`do_name`,`do_enter`,`drug`,`quantity`,`dose`,`duration`,`instruction`,`date_time`,`request`,`p_id`,`p_org`) values 
('aaki101','Aakarsh Mandloi','thomas101','Thomas','Cal Hospital','Paracitamol','200','2','5 days','Take to Tablet per day','10/12/2020 20:45:15','Accepted','Medi Home Pharmacy','monu101'),
('ada101','Ada Khan','anita101','Anita','City Hospital','Avil','20','1','2 days','Before breakfast','10/12/2020 20:43:42','Accepted','Medi Home Pharmacy','monu101'),
('dev101','Dev Vyas','thomas101','Thomas','Cal Hospital','Parxon','50','1','7 days','Once a day after lunch','10/12/2020 20:44:09','Denied','Medi Home Pharmacy','monu101');

/*Table structure for table `prescription` */

DROP TABLE IF EXISTS `prescription`;

CREATE TABLE `prescription` (
  `b_id` varchar(50) NOT NULL,
  `b_name` varchar(50) DEFAULT NULL,
  `do_id` varchar(50) NOT NULL,
  `do_name` varchar(50) DEFAULT NULL,
  `do_enter` varchar(50) DEFAULT NULL,
  `drug` varchar(50) DEFAULT NULL,
  `quantity` varchar(50) DEFAULT NULL,
  `dose` varchar(50) DEFAULT NULL,
  `duration` varchar(50) DEFAULT NULL,
  `instruction` varchar(500) DEFAULT NULL,
  PRIMARY KEY (`b_id`,`do_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `prescription` */

insert  into `prescription`(`b_id`,`b_name`,`do_id`,`do_name`,`do_enter`,`drug`,`quantity`,`dose`,`duration`,`instruction`) values 
('aaki101','Aakarsh Mandloi','thomas101','Thomas','Cal Hospital','Paracitamol','200','2','5 days','Take to Tablet per day'),
('ada101','Ada Khan','anita101','Anita','City Hospital','Avil','20','1','2 days','Before breakfast'),
('dev101','Dev Vyas','thomas101','Thomas','Cal Hospital','Parxon','50','1','7 days','Once a day after lunch');

/*Table structure for table `salary` */

DROP TABLE IF EXISTS `salary`;

CREATE TABLE `salary` (
  `employ_id` int(11) NOT NULL,
  `name_first` varchar(20) DEFAULT NULL,
  `name_last` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`employ_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `salary` */

/*Table structure for table `testing` */

DROP TABLE IF EXISTS `testing`;

CREATE TABLE `testing` (
  `pat_id` varchar(50) NOT NULL,
  `pat_name` varchar(50) DEFAULT NULL,
  `doctor_id` varchar(50) NOT NULL,
  `doctor_name` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `test_type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pat_id`,`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `testing` */

insert  into `testing`(`pat_id`,`pat_name`,`doctor_id`,`doctor_name`,`date`,`test_type`) values 
('ada101','Ada Khan','anita101','Anita','12/12/2020','ECG'),
('dev101','Dev Vyas','anita101','Anita','11/12/2020','CBC');

/*Table structure for table `testing_status` */

DROP TABLE IF EXISTS `testing_status`;

CREATE TABLE `testing_status` (
  `pat_id` varchar(50) NOT NULL,
  `pat_name` varchar(50) DEFAULT NULL,
  `doctor_id` varchar(50) NOT NULL,
  `doctor_name` varchar(50) DEFAULT NULL,
  `doctor_date` varchar(50) DEFAULT NULL,
  `test_type` varchar(50) DEFAULT NULL,
  `reporting_date` varchar(50) DEFAULT NULL,
  `result` varchar(50) DEFAULT NULL,
  `organisation` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  `network` varchar(50) DEFAULT NULL,
  `enterprise` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pat_id`,`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `testing_status` */

insert  into `testing_status`(`pat_id`,`pat_name`,`doctor_id`,`doctor_name`,`doctor_date`,`test_type`,`reporting_date`,`result`,`organisation`,`location`,`network`,`enterprise`) values 
('ada101','Ada Khan','anita101','Anita','12/12/2020','ECG','11/12/2020 00:09:29','Positive','Test Laby','Someplace near','BosNet','San Jose'),
('dev101','Dev Vyas','anita101','Anita','11/12/2020','CBC','11/12/2020 00:10:24','Negative','Test Laby','Someplace near','BosNet','San Jose');

/*Table structure for table `user_data` */

DROP TABLE IF EXISTS `user_data`;

CREATE TABLE `user_data` (
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `address` varchar(100) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `phone` varchar(50) DEFAULT NULL,
  `blood` varchar(50) DEFAULT NULL,
  `weight` varchar(50) DEFAULT NULL,
  `height` varchar(50) DEFAULT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) DEFAULT NULL,
  `age` varchar(50) DEFAULT NULL,
  `image` mediumblob,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user_data` */

insert  into `user_data`(`first_name`,`last_name`,`gender`,`address`,`email`,`phone`,`blood`,`weight`,`height`,`username`,`password`,`age`,`image`) values 
('Aakarsh','Mandloi','Male','Somewhere','aaki@gmail.com','9977010888','B+','147.71','165','aaki101','aakipass','25',NULL),
('Ada','Khan','Female','Indore','ada@hotmail.com','8527419630','B+','153','150','ada101','adapass','20',NULL),
('Dev','Vyas','Male','Earth','dev@gmail.com','7894561230','AB+','187','178','dev101','devpass','20','ˇÿˇ‡\0JFIF\0\0`\0`\0\0ˇ·|Exif\0\0MM\0*\0\0\0\0\r\0\0\0\0\0\0∂\0\0\0\0\0\0æ1\0\0\0\0\0\0Œ2\0\0\0\0\0\0÷;\0\0\0\0\0\0Í\0\0\0\0\0\0\0\0\0\0\0\0\0\nõ\0\0\0\0\0\0\n‘ái\0\0\0\0\0\0Úà%\0\0\0\0\0\0‚úù\0\0\0\0\0\0fÍ\0\0\0\0\0\0™Í\0	\0\0\0\0\0<\0\0\0\0Í\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0LENOVO\0\0Lenovo A6020a40\0Picasa\0\02016:08:29 21:01:31\0Picasa\0\0\0Çö\0\0\0\0\0\0`à\"\0\0\0\0\0\0\0\0à\'\0\0\0\0™\0\0ê\0\0\0\0\00220ê\0\0\0\0\0\0hê\0\0\0\0\0\0|ë\0\0\0\0\0í\0\0\0\0\0\0êí\0\0\0\0\0\0òí\0\n\0\0\0\0\0†í\0\0\0\0\0\0\0í	\0\0\0\0\0\0\0í\n\0\0\0\0\0\0®íê\0\0\0\0\0\0∞íë\0\0\0\044\0\0íí\0\0\0\044\0\0†\0\0\0\0\00100†\0\0\0\0\0\0\0†\0\0\0\0\0\0≤†\0\0\0\0\0\0\n¢\0\0\0\0\0\0∏¢\0\0\0\0\0\0\0\n£\0\0\0\0\0\n\0§\0\0\0\0\0\0\0\n§\0\0\0\0\0\0\0\0§\0\0\0\0\0\0∑§\0\0\0\0\0\r§ \0\0\0\0!\0\0¿Í\0\0\0\0\0\nT\0\0\0\0Í\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\02016:08:29 20:55:42\02016:08:29 20:55:42\0\0\0ı\0\0Ë\0\0\0‹\0\0\0dˇˇˇã\0\0\0d\0\0`\0\0Ë445347\0\0\0\0S\0\0\037e36f4e86aa4fedcc3563f766b0cc8b\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0\00\0\0\0\0\0\0\08\0\0\0\0\0M\0\0\0\0\0\0\0\0\0\0P\0\0\0\0\0\0\0X\0\0\0\0\0\0\0‹\0\0\0d\0\0\0\0\0\0\0\0\0\0\0\0\0\0\0&\0\0\0\0\0\0|\0\0\02016:08:29\0\0\0\0P\0i\0c\0a\0s\0a\0\0\0ˇ·Bhttp://ns.adobe.com/xap/1.0/\0<?xpacket begin=\'Ôªø\' id=\'W5M0MpCehiHzreSzNTczkc9d\'?>\r\n<x:xmpmeta xmlns:x=\"adobe:ns:meta/\"><rdf:RDF xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:Description rdf:about=\"uuid:faf5bdd5-ba3d-11da-ad31-d33d75182f1b\" xmlns:xmp=\"http://ns.adobe.com/xap/1.0/\"><xmp:CreateDate>2016-08-29T20:55:42.440</xmp:CreateDate><xmp:CreatorTool>Picasa</xmp:CreatorTool></rdf:Description><rdf:Description rdf:about=\"uuid:faf5bdd5-ba3d-11da-ad31-d33d75182f1b\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\"/><rdf:Description rdf:about=\"uuid:faf5bdd5-ba3d-11da-ad31-d33d75182f1b\" xmlns:dc=\"http://purl.org/dc/elements/1.1/\"><dc:creator><rdf:Seq xmlns:rdf=\"http://www.w3.org/1999/02/22-rdf-syntax-ns#\"><rdf:li>Picasa</rdf:li></rdf:Seq>\r\n			</dc:creator></rdf:Description></rdf:RDF></x:xmpmeta>\r\n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                                                                                                    \n                            <?xpacket end=\'w\'?>ˇ€\0C\0		\n\r\Z\Z $.\' \",#(7),01444\'9=82<.342ˇ€\0C			\r\r2!!22222222222222222222222222222222222222222222222222ˇ¿\0áP\"\0ˇƒ\0\0\0\0\0\0\0\0\0\0\0	\nˇƒ\0µ\0\0\0}\0!1AQa\"q2Åë°#B±¡R—$3brÇ	\n\Z%&\'()*456789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzÉÑÖÜáàâäíìîïñóòôö¢£§•¶ß®©™≤≥¥µ∂∑∏π∫¬√ƒ≈∆«»… “”‘’÷◊ÿŸ⁄·‚„‰ÂÊÁËÈÍÒÚÛÙıˆ˜¯˘˙ˇƒ\0\0\0\0\0\0\0\0	\nˇƒ\0µ\0\0w\0!1AQaq\"2ÅBë°±¡	#3Rbr—\n$4·%Ò\Z&\'()*56789:CDEFGHIJSTUVWXYZcdefghijstuvwxyzÇÉÑÖÜáàâäíìîïñóòôö¢£§•¶ß®©™≤≥¥µ∂∑∏π∫¬√ƒ≈∆«»… “”‘’÷◊ÿŸ⁄‚„‰ÂÊÁËÈÍÚÛÙıˆ˜¯˘˙ˇ⁄\0\0\0?\0Ë|:ªtàΩ˘≠z°§ßó¶@?Ÿ´¬á∏\n)E%ÄQKH3ìJ(i{QK@	K@ÈK@(£•¿ZQäJZ\0Z 4¥\0Í3Qº©%ò∆±uZŸÇÜo@i6ˆiª¿Ô^}u„IπÿòZ§|ctF1œ÷ïÿœMÛE4‹FΩ\\~uÂ2¯Æ˘≤‚©?à/YÚ◊\rÙçXÀˆàøæ?:z»≠–É^6û\"ª$fv≠ù;≈s« Y#ÎF°°È‘Vfù©•‹J¡ÜH≠ ¬®B—FA¢Äíî—@\r§≈:ê–i\r-!†¢ñíÄ\n)h†¢ÉE\0î¥PmäÌ≥à≤*ÕG\0ƒ†©)\0S©¢ñÄS©)E\0--&)E\0îP(†•§•†ä*é•©Cß€¥í0ÇÄ,\\^Clª§pøSXWﬁ.¥∑RÉ6;W¨ÎsÍó\"0xZ∆23ö9[‹\r˝Cƒ◊wéJπE=Öc…;»3gÍjßöI„µ#eTûÿßdÉQ^br=)™Ï=jLß=*ƒ!≤\0]∆ÜÏREvë∑ıÌQ›œ9©.w$á#¶,LÎìE¬¿É◊•K…V‹\0™“©Ozcp£ûΩ©\\Gq·œ%π\"g∆zk∏∑◊≠¶Ä…ÊØ÷ºId\"¨«}*\0äÏı§‚∆{Mñπo)?ΩÁ÷∂#ù$º6\rM‡*†úÉúÊª=≈KΩcîÒÍhWB=—T≠Ø#û0»¿Ê¨´nzU}%-!†§ßSh(¢ä\0(¢ä\0J)i(\0¢ä(î|\"èjíòΩ)’ :ÅIKL\nZAKä\0ZZJZ\0QKIK@-Û$4ép\0†\n⁄ñ£ündë±Å¿Ø0÷ı©u+í≈é¿xZ±‚=iı∆ﬂ∫S¿ıÆnY7n#≠]Xƒy	8¶y§)‡S7bò[\0í*õâÉqö]Â£€éµSsy‰’òP‡dÚjæ[∆F*XLÍ≈ê~t˚ÖÚqÜ…ÔI;ÆUÄ=j[∏…<áòÔîTWîÄäBé¶≠@Ú™ÂáïqNÑ2‚≥Ê∞ŒnRXgﬁ´Áûkj˚O	+«•dIèÊ-¯V©¶KBI\0ÒN\\ÉÄjoü⁄ûIq“¨	’˝J±¨GıQìJ≤˜†≥LÒ-≈ñ’›πG©ØC—µ∏µÜ√w‚»˝˝+kJ’%±ô„<ä,#€≤)k+F‘V˙’qZ¥CHih4\0⁄)h†¢äZ\0J(¢Ää(†\nÉ•:ÅKR0ñíú1\0•£Ω®ii1K@-P\\ﬂão≈æû—√øªu0ÇÁ†Ø*Ò¨◊˜Œ¡æE‡R›ÿf4Ów‡uÔU›ÇÛ÷ïòúìP6~∏≠éIœå˘ı4“I\\Sx⁄O~’,° ·:sW≠HuÁå÷z©ÍA≈IÃßäñÆÄﬁé≈&åªu≈U˚[∂ˆ\nÜﬁˆ|‡}ﬂj∏.∑\r≤éıñ®°\\	ÇòŒ1⁄§WxW%O\n›[«Çô$zRçH≥a¢8>’,eü¥Cq.*§˙l3Ç»zÙßIlØ`€IÌUaëÏXìr„Ω(ﬂ†å˘ÙŸ`9#5RF(vëœzÍ!Ωä˘ô1Ç=k;P”ÜKFyEkΩò¨d+j@I¬èÛöëzzV©àö6∆*‹.3“®.r\0´1>;SB;ˇ\0_îo,∑·^ânPk≈Ù[ø\"ıp+◊tŸºÎDlıòã¥QE\0%Q@%PEî\0QIE\0W¥\nZê\nZJQL\n\\R\nZ\0Z(¢ÄQKHhƒ◊im•KìÛÄ+…\'l‰˜5⁄x‚·ÃÎÔó“∏iâfà˜Dƒ˛UdåSôøZc∑U1å-¡‰`£“ìf;Ê≠Y⁄}°Ò“°ª!ñºÿÁMÅ@»ÎQMa‰(*w(û‘€HÁ⁄ëÁ+å∑ÖXíŸÑ)ûπ5†\"éÂ\n©¡¨ÿﬁ8sÅÎRÀ$¶bîÓˆ¢IÄ¢“[ICú2˜´M<ƒ`7jÀ{©ÿ|œÚ\Z≠ˆ¥fßï∞π–-˛ŒC0»¨ãîíaàÜs⁄´Ω⁄¥$c»5Ç]À»®åZÇ¨ˆí ´TßQrƒ∑\\RÕ®ÅÛ-gª‰éïi_q\\æ”≈4CÂ¡M@\0 ú˛X\në_ÎVïÑH=çO=≈V•A∑ö`_Å±&‡k’<%|g∞«$WìBs∆k∂é¢E⁄√–MàÙùÿ•®A#dK∏ìR!‘QE0\nJ(†\0“\Z(†§•¶ö\0á4Ím8Tå)E%-\08R“\nQLBÊñíñÄêÙ¢ë‹\"í{RÕ<hå∑·èC\\åÉwS]Gão≈Ê¢»Éà¯ÕrÚuïQÿ9¸Èõ0Ωz‘∆C¥ØcLnòÙ†§D´á…Ë*‚]2.*Kìœ Q“¢V\ZW\'k‘πôKÄ*µÁóø÷îz;úÊ¥#¡êÁ5ó¥äfﬁ L‰€zú‘JÃâ»‚ª?¯D>bpƒT±xIwÚúzSˆ—BGæc.“	ˆ¶µ¨£%co Ω2/ƒ†|ÉÚ´c√Ì¡A˘VoóB÷ª<ù-‰¡‹Üòc€ì^ïy·Ùä6\nùkôõ√Ó‡~ïqØπ2√µ±Ã⁄0:SJûµØ.ã2Hx®_LôG\"¥ÁL…”íËgi¯Á5#C∞úÒäa˝j—\rXê\r´ú‰‘±‰’u…Jû3”jÑXã!∏Æª¬ë4ì£Úkíè9Î]∑ÉÀæ°Ï#æÉ Q…´köé¬ÄOZû§ä;P\r0íéÙÜÄöh&íÄ\ni•4”@äZh4µ)E6î\Z`:ñì4¥\0¥¥‹“–!j;éal˙Tî…tlqIåÒÕeÇÍw∂„XÔ&N+{≈v‚€TuS˜ékõ\'Ê<’≠ÄêT‰˝)õ≤‹\ZkÄsQÉó„Ω&R,Fò	ÆõMÄ∏/ZÀ”tôgevZÌ4˚®≈q◊™ñàÎ£EÓ…m,A ∞≠À{uUTQF1W¢\nÂRl›°¬«›ßyÈS1GW&ƒB%©b•§4Ä≠,«\"≥Æ4Âsê+g≠1îP¡]º˙H$úV=ˆûPp+∏í<ÒY◊Vä√ëQŒ÷¶´]œ)‘`hÂ9òJÙ-oKY %WÊ¬MBÂt5ËP®¶é\ZÙπ]»Ä»©cR>¥¡…©”Ä3](Ê±<x„äÙ/ZJ-Lò·çp˙}©∫πHáV5ÏZÄ±”“?ATˆ~ ¡FÓµ-í†§§¢ò4A4ô†<RPM% i3Fi(:u2ú*F--6îP©i(¿u(4‹“–© ä(†7Òñöcª[ì»cåWwWq^≠‚õc4hqê5…^hÈ496+/k ÏŒà—Êç—≈r´ö——Ï≈Õ◊#ÅZz4w,-˛∞t´ö<	jÚF¯Wú—V•£†Qáø©jK’≤eÜ(˜A◊ßéAî¬‘Ô,Â…Zk•Æﬂõn+ÇÒÍé◊w±=øä·\râ8≠HºQjz∏√jrÿÉÑ#pÙ¨M‚W*ÆG„[∆îdéyM¶{5æ∑m*Ç%_ŒÆ%‚H2¨\rxÂ≠Ωﬁ·≤r£”5ÿhÛ\\FÅ$êµs‘ß…≥7ßyné‡L1÷É0$÷TS1PMC{v—ƒHÙ¨yôß%ÕsvÉ¯ÖB˙Ñ#´Æ~µÊ∫ûπ}ÁïçäèZÃ˚]¸Ã7\\0œΩtBåöªf3íN»ı)5´Tm¶Eœ÷©‹kˆÉ 85¡C¶‹O f∫$˝kA4∆Ô7uúz±\'.∆„Î∑\\÷}Óïoxªê®®óJ(ºäøj¶( ûÇí|ö≈õY…ZH·omç≠”DzîärE_’ïÆµ:U˚M=Ú}Ú3^Ñj%Ÿ¿È9I®ö>”$∏‘r>UØUAµ\0ÙÆW¡ˆÇ^üçuu≠Óa(Úª¶“ìM&ÇBì4Iö\0\\“fì4@&hÕ%\0.i3II@\rÕ(¶fî\Zëè†Ss@4¿ì4¢ôöZ\0x•¶\np†•§ó4V˙‹On G5∆ﬂ#Aù±]„r1\\wâ£ÿí`pEs÷ç⁄gNv–Â<?)óTëõ±®¸Iæﬁ˚ÕâHrE/á≤/ﬁ∫MFÕ.Ï‹…≈gR|≥.+ô\\Ê≠°∏ö–JÃF·“í⁄ [ádûBt–È–,∫z(Ø\'ˆi-ú`÷•ôº`ö8çCCôn[…ìµii^Y†Û.kû’÷&üé£5\'Ÿ@´Îÿü´£î>íHés«J≠.°y§I˚’‹ÉΩvÜ‘éMs>!áÌ\r™å≥∞ÈPßœ+H’«ñ:≈„KeâC∏ı[PÒjMàÌ–≥5ni˛\n±˚2óå#ík^‹Z]ƒ3¿ø.ÓERç+ëy¢ÑZ]›˙emÄÙ∞¯fyG2ú(‚∫[Xô·\\t\"ÆShP´ITØ‘Û[˚yŸ…êq≈m[I™AgÁ»‰èC]\\∫rõ`›Ù™”⁄HÒyd|æïN™í’™ROs6€R∏û,‚™›ks[Æò›“µ!≥0ç†pjùÓò5Ë°Ëñ¢<Æ^EÕIGG©í∑(à%\'/#d˝+©±ï/#DN‚πΩWOé⁄˙(SÖÓk¨ˆöbïdOô1]<ëïéxNPπ⁄iVÀmj™=*˘™ˆÁ‰bßÕnr7wvõA4ôÕ1!¢íÄ\nJ)\r\0-%§4Ä)3E!4fh¶Êñê«fú\r34†–!Ù¢ò\r8\ZcKûi¥¥p•¶äPh˝ÎüÒ\røô{äﬂ≥5î/lqY’¯M)¸GúÈ1òµ\'Nz◊Xãπ6û‚≥¢¥HÓ|¿95•¿Æ:≤Êw:‚≠°J¶∞w*õëéqV„‘c?}O∏´âÜ‘üeç˙†¨ÆûÊ∂ÏBó∂‰}ÒOVÁ¯◊Û°¥∏òp¢†mOJ,É^‚‹ﬂ€$d˘ÄëX:|\r®kÂ◊˜i˜sﬁ¥d—PIñ‰z\ZøkD¢Ä*y¢∂‹•’öëaPY^ ∂˚MìÆ>a»≠(ò‡\näÂ7ÇJõıécHπ@û\\áº`÷˙¥l\"±.¥–n7ß⁄¨Ee&—Û5iÓΩIÂë®|≥‹T2$ dê*∫ÿ∂yf©\rÄ#Ê…¸i;!Íg\\‹¡ü3v≈EßZ»è%ƒ£˝†≠î±Ö9ÿ3I0\n&ñàﬁÁ¨ô%ør]?Ü5O≥ƒ©p§zU’%Ω}ÀúöÎ-¥;i-ì‰äÙi;≈5Uü©ß‹S°¨ˆ™∂÷1ZÆUö‘Êbîò≈)¶ÊòÑ“gö\0ZCIE ä)¶ÅÖÑ”s@•ì4RÍPiπ†\ZH\r/z`ßfò«É≈-0\Zu\0?4\nhßfÄ)ìD≥!VßäQC\nÁH¡ÈÕf/ q]]»Ã\rÙÆRC∂V˙◊x§Ù:iI≤‰g•[çÖfƒ¸éj⁄IÔ\\w±÷ïÕaä	™È/cOﬂ≈;Ü≈kíw`SaSö.eT˘€•UáQâü\0‘%©IËnEÕ2u‚°K∞T|’^ÎPé,Ì≈T§ö≤ZêNòì5<#8ÈY—jﬁ>c9£•2õ-™åRïZãÃ¿¶4ﬁÙ€&¬…Ä*Ñ˘<ı4≥ääÊŒ£ﬁ™îy•b&˘P€\rWüÕqÅöÍ¢O.0æîB°c©‰◊™¢¢¨è>srzàiπßM4Ãƒ&öM)¶ì@M!£4ÑÛ@i	§§4\0π¶ìJi	†bR–M&hπ•ôöu 4¢íî\Zc)‘⁄Z\0p4¢êqK@·M·@•—N†»7FGµró—òÓX{◊[X:’πÃéıçh›\ZRïôîçä≤íÙ™*‹”ô»Wü4z0w4V‡g©º·é¢πÔ¥∏êé’*NÃ:‘XrFï√,àAÈYõÂ8léM>(’è&ò-\n2‹\\>A:Õp°d$ä›[8…ŒF*;à#U¿\"ã§4—OMÜ;X¿kY&_ZÀ€≥ΩWûÌ°ËsKV\rçp=jó5Ñ∫ì;\0x´©6VéVWBÀ»j˛çí}‰p+$fF\n:öÍ¥ª_\"«&ª∞‘˛—√àüC@p(4föMuúbgõ©r)¶òi§–x‹“sIFi3@!•¶–HiO4”H4Üå‚íò\r•î¢êKIöQLcÖ- •†äZh•†\nu0SÖ\0<RÊö\r(†TPâ·e#µME\'®#àªâ≠ßd=3Q‹+WƒH<’a≈aF‰\Z·´}⁄S≤‘íHLäBı§áOπ€Äıb\'´©8^ò¨∂ÁMÓeõÂlìëW#≥∏UŒMj€‹#êäº&™Ù`€0W\0u5Fqrd(™∆∫ﬂ*1ÈP aåg4≠∏&r\"Œ˛Líp*≥È˜éˇ\0;+¶ûÌNB’GêbßùtCh…K]òœZ±∏*äY‰&£¥Cstäzf¥ß\'©\' çÌƒÃ¬WvÆ°T(¿®l·X`UUÉ^ä\\™»Û%.gq¥Üñöií4ı§&î”	†\0ëM4MÕ\0£<”xÕ\0Ï–M £4\0fõKHh)\r.)\r\02ñõJ;P®î¢Ä)‘¿i{P1‚ùLπ†“ÉQ	®•2\03övbπ(4ªÄÔYíÍ+>’ö˙úÚøÀ¿≠£BL∆XàDÈ|≈≈4‹FΩXW5q{,P-Œ+6Àôr“9¡Ë+:—T∑eR®Íøu\Zö‰…,ÉiŒ+óû*i\\øSÕ4◊ó)ks”Ñ4∞’Üë¬ÒR*sV%a“≥ñ∫ö«C*MFXF@?Ö$~%ô\n5n«a˝Âß\ZMôÁÀ_ öq∂•6Œq¸W*ø*É˛	Á<©ÆéM—õ;¢}\ZŸUE\'(\r\\…K…däìÕb2j‹ñâ \n°)…⁄îíLrv#g.¯´˙c,wIûôÎT“<û¥·ë˜x5Ω9$—Ñ‚⁄=—£\\5K∏ï¬Èöú¬O)â8ı5∫öìÆ3^≤†‰π¢x“Æ¢˘dnM=*î7»Î…©M‘c∏¨›9\'fçcR-^‰¶ê‘\"Ó2q∏SÑ™›\r.VäROaMFOΩ<öåı§PQIﬁì&Å…ÈKög8•÷ÄHiºÊñêû)¥§“Pbå”sK@π¶Êå˙—`∏iŸ‚†i’{’wΩ¿‚µç)Kc9UåweÊëPrjçŒ•\Z¸ä‹÷U˝‰Ñd6SEÛ@~s]TΩY…S}\"jß›ù‹Rõ«ç’GqÈKû+©Sècâ’ï˜iãµ,8ŸœZ®ƒzUàà)ÔV„°öê›DÉnjîtUÀ•ﬂj•Exôúl”=Ã™WRDáöU£⁄Å^K=òËJ)<Ô/†H»y∂ÅuECÇi_\\ç?é®\\⁄É»çyf˘<öµ»èy2kë±˚‚ú˙ºdc}pøgù_Ü5vﬁ	XÇƒö∑F)^‚çI>áC6°Êù®iëÆy™A∑’Â¨›ñ∆â_qqMûiÌ≈FO5Q&Dê∑ é¶∂7q÷±cøZ‘\'èz˙,›$|÷b≠TîHGz_5˝j≥Nç≤kπ≈w34“ƒKqSX_»G$ıÔJT0‰fò\"8ú\"’ôq™‚nExÆ95`0#5ŒÜd‰\Zπ„Û\Z‚´Ü∂±;Èb”“FÆrh5Uo˜© {◊3ß%–ÎU\"ˆd¿‚ìΩ08=\r8*\Ze&áÉGzh4fê«QFi)4π™Kr895	∏vº(JG<ÒâqÓ~µZK¶<g‹4ª∆”Q	%2Ö ‚ª)·“‹‰©àrÿºYè9¶ö‡s÷åˆ≠‘NFÓC$«4õ6.\0´4“3÷®õïâ¡¶	ı4óÖ£åïòe¿Á ö—\"MF\ny±‰\ZÇ-ﬁPÕL‡\ZA±3¸ÀèQT6˘nWuXëÕC2g,:◊6áµ¶Ì∫;p8èeU_f3º\nEléikÊeùôıqi´°¿ä7d‘yÊîT2–ˆ\\ä©5∞~’gwΩ!aé¥\\fÿW9\"¶Kt^’9aÎIúöõ Tú@§Œ1ﬁí¨Fh”zöê\n⁄æà N⁄ÑÒÒÙ´‰˙T 8‰’îûïı8j~Œöã>KW⁄Um=(\0á¨6æjaé+†‰:t†Ä{Sø\n_“§§WîÌÙÿ‹©\']»@Îä©R( Á4Ìt4ÀÅ≤8ßn u5@®¡ßñ©ÂCÊ∂√÷v^ı:^ıRÄ’ú©F[£H÷úvfö])2 ¨85èº\nñ9äúéïœ<2Ët√Ô©Æ\r^√Åö∞Æ9A≈Ÿùöö∫03ìíi¿Åﬁ†Û:R˘æÉ5ÏX€&84†∏®ÑîÔ4S∞åQ«T~j®Õ7Ì)Ähl`—‘˚”REqêxßnƒ1„W\"™=îeÅ€ﬁØ)¨GLSLEwàÄ8¶™cäú∞\"ôëö	∑ª„<S¯a@¿¶ÆÅ”≠F:`’”èJç£VÌ^f/™˚—‹ı∞YÉ•Óœb°—ÉS<DsLµx5iJõ¥ëÙ4™¬¢ºYùπ™≤\\cå’˜Ñ∞8™ç`I¨óô±[ÌX=jdπó˚8ı≈=,ä„än√pÕ1â&¨}übÛNä∆¶*Ïó±qEYé-œœAV<ïçy4≈ í{X#oûGçòc#…Ÿ Aê*U^*Q	4ZÃ$û+›∂áŒ^‰í\'B:‘™ΩiåAÔN“`â\0†äØÊNÍí9≠I[\"òT\np>Ù6)Ä‹RcÉÌA4ÄÒ@Ñ¡•«4Ó(¿Õ!ëë˘R©Á≠6V\nßöÇﬁBœÕcA©‡’∏n3¡5EiCcΩs‘¶§éäU\\Hπ£”∂ìJ∫.aa0i@•¡£Ó+]≥¨d®™ks˚≠§rkQìr‡Ù®ÕúmÇ@‚≠4 ≥F≠Z¡¶™l)¸äñ«a:“riÿ4°8¢‚±⁄krqäîØÂU§l…∞∞†9GÉœ∏œ5^3∂}Ä‰U–ß≈b.ivúTûYÕ;a†,Céy”\ZììSî˜Êò—±ÈYT£\n™“F‘´‘§Ô5bÕL∞gµSfñ.Ä–∫îä0Eyu2ãª¡û≠,Ê ’x[Áµ!∑’u‘ªR}≠ò‚¢9Dæ”5ñs{®{¿=h˘b^\0Õ7{1†∆Õ◊ΩwQÀÈS8+ÊïjiŸ⁄^;Të≈ÅÕKXÌR`˙WjI+#ÕrîùŸ]‡9§∑∂Ê¨‡ÛF•;â\"6\\\Z]£i•|äp…^îác>X§Rv˜´ V!∏sSÌÔä\\J.U»ÒÈAÈN9ìì⁄ÇH˙\n@AÔDÄÌ?Œ©£bm°≥B‘,hR\Zz“q¿Ê•ç ûfß$jÉÅG9‰\nq\'(π£4–N)§úT±¢ê\'Zj\\+6:{UY.‹*∞‚ë•GúÉZ$=M xÕ’<9ßÊêò≠(„4Çù¯S\0äw~¥üÖ(˙Påfî\ZoÈ@8\0Ó‹\ZÀπ∑êŒ]O®:tÊÇÌBvôc´+≠A¿†(É˙P›¡∞…Õ8ÙÎÕ4c·@ÜisŒ3JE\0Ù¿k.Óµ⁄´d’¨ı¶n¶òöL¨-¬ö_,)‚¨ÌR≈>bylgõ‘I\ngëOÇÛŒìjÁñM:7}˝Õ:5Äí)˚†Æ\\R}iÃÿ≈ÙØ–\nÃ° Iô “®h„&Äƒ”îÒMa≈	”≠qŸÁ4π»¶jp©\Z\Z«öElé*óÿ∏5R‡÷©+Åiâ⁄Eg√nÎrXû*˚ı§«9ÔB–‰ÌÕ4∑Ω∫‘…¥‡u•`‘ë[$Êù∏öâ:riÙö\ZcãbòÕJH≈BÁû)äÚ[	?zHÏˆÕø<Uò˘©qWÕ–5\'¶)€Ω©)ZB\r.q⁄ì•\rú\Z\0çÆù∏ÊÑπV$c\rYÔtËÜÌNäA=∆WåUÚÅ®GJ\\‚ëx∏©Ï˙—ª⁄ê(\0˙P∑zäB˛ÇÇih\rG»ÈN\rÍ)ã–“éGh·∆2E#0ìΩ4ì@ÅÂ\0t™∆FpH©&î„≠d-Ã—o»‚Æ*‚5ÌÁ-Ú∑QVwıõßñu.ŸÊ¥qJHmä]Gjc0Ï)Hˆ®wRHC∑™ÆMBnAlcèZä˙VéTsT-nZwUaT£}E{ √m4∞ÊöøvÇHSÅSaÉ8≈TÊ©˘°§€ö±\"ã>AÊê):R~6\r‘BU«•SÜIæc≈iÚÙ¶ÅﬂIÿ±än3JGörF\rHÜ3Äjúí˛˜ß;ú>)Ø∞…–—*ñ•≈@áöVò(§∆âXåUv`N(2Ü^*4?7=jG±$X\0‘¿Zßüö•\r«Z∂Ñ§X„j#*çÿ™ì›y`‰öÆ”∆ÒuÁ÷©AÖÓlØ `ÒN«Z©hIÑd’ë¡≈KVcEi,cw-ﬁñ⁄Ã@ƒÁìVqFhª¸tÊóÙœ∆£yÄ8ÑN¿¡•¡‡Ê´Gt¨˚\rSEò¡ÎöNùÈπœzçü`¶\"p	4Ïcêjã] ë«≠YG†ä,=	pO~i≠“å”É@ÖöçÌéTSî”¡ÁØZ¢t‚®“§U>¥¿yßn u≈K¨:”\04åÿ¶Ü4–±yäTÚ\rVé≈bór’ºìŒi§ù›i¶–öD™ßåßm*íGZSöùJ±öˆÆ≥ñZµ;E?4É≈;àìÅö@ÁÒ•,qû’#–Nq“õìÈN‹iõéi\0π8®dìgZê±≈Ríum4÷†1Ê\r(≈X\'+≈gôÊ»*Ÿî’4-áÖÕD&^˝ju˘ó™´⁄ñrA©\Z#Â»*Ã\\åëUL>[’∏…¿˙Pˆ»á≠)bJçú≠HßrÙ≠*\\ ìèZåŸπçqìä≥/ zUà$»\0äª¥¥w$∂]ë\0G5`tÈLVîÌŸ¨^¨–wj:ä7{Qª•!ÿkú.k4^™Œ€áJ”›ëÉT%∞Wva‘’∆›E∞ÿ&Kãå®ÈZ|b®YŸãcûıwµ)y\rPΩú≈é:öæ[#öØsôy¢$¥Söˆ6çTéMh€„ ^*üÿï=≈_Sµ@Ù™ì]aŸ‚öH•.)ªÅ®BbÄ)‹\n@ﬁ‘°áqLBÄ3Q»˚F*R’ì©Õ,l\n3BWc,I$ã œCVók+◊ñuB+imUIXDﬂ-FqöP¬ê∞Õ@…ÅJ~¥)£r„äWà¯Œ(‡\ZLåûh%E=È}≥LV‚TP^\r3•$c≠5à§\02:’I¨∑æ‡x´ä@†ëäw∞XÃ~Y,M#8˜´ì¡¨Üìu–Z®∂…ëØ:–‰(‡’I.B.ZèŒbô\'≠&òÓ∂ﬂtÑw´(8™ê®g…´É\0RaºÉå“¬r¥Ê\\©^+)Rx≠®MYìN2¥€sÇh∏·söÇ˝Á\'ö•™SUzRÁ∂jìjg5›${É˛µùÆhëx($’K7f π…Í◊^ÙûÄ/“ùM«=iH8‚Åá9†–8§‰˜‚êÄöQÏ)∏9Êúı¶«A«4•\'4á?ç öh$ûîß8ÎH:”áÉKÇi\0•ÁQp∞ß9®fÖfaúTçí)7\ZÕ#ìp^jÿ¶ÚOZym6Ó$Ä\ZfpﬁÙ£4ﬂõu &\rÖ®ﬁp†úPÔµ	™ﬁ£o\rBW(∑Î\'#≠=è=*çõáëät´¨M7£†Ù¶<∏b1ìJÄjÅπŸ9)n¥∑}§T€´9.D◊\0(ÈZ„•\rXZ∏‚õìÈQÀ.—RÃ„±Í.ù≥ZSI˚∂˙W!svﬂhu\r…5pin%\'°–$û|æ’<≥ÑB¿4v€ªûıbw>Á5£≥&÷.¬ÿiNFMC\0©á´ëS$âï<\ZÖ¡Y√\n ≤ºJac»<Vì §Ü‹+{YÑ∂%ï≥Z© Ê¨êÚ?:§$f2=:”éƒu.‹≥…⁄p{U5ñdÉÊ≠√\"ëÇF*∆ÿÿv≈M“–∏∂-Å>PfÎﬁØn˜™—îQ¡\'òæµõ‘w$›œZ7{‘aó‘RÜdR\rI3öB}È§èZäYB˛îX5,Êù◊ú÷q∫d√‚ÆG2»°Ö6ÄûÇ}ÈõÄ†ëÎR=Åö¢34í0\0‚≥ñÚ1++U%rzö±Ã‡j]∆≤ÌeGúÏ<\n—z“j√õé¥÷cÎHƒcäfG≠lz∂qRqQ†Z{0Ë{	Õ§#≠3<–Ã7&+.]4ê≈O&¥«AÕ”N¿gÿ[5æwı|üŒö√û¥Ñı•\'}Fùá˘Ui≠C±jîS…»ÎI0πJﬁÃC)nµp1«4“}È≠í8°ªÖ≈yp\rTg,jFj\"Öa6Cu Hû8Æ2y.o‰ê}–xÆ£Sﬁb*ΩÎ:¬2Ñ‰UrsX®Kï2XL†\'ä—ÖXÄ1Q≈ﬂìZQ ⁄ÆM\"7\ZÌ\0‘π‚ôœ„HƒÙ¨•«cá:±ø~W?Ô”ˇ\0≥uº`2ˇ\0ﬂbä+Õˆı;û„£–>≈≠Ö∆Â«˚‚¢6ZŒrvÁ˝ÒE˛±S∏ï\Z}ÖkI–Éˇ\0¸Îä:è˚ÏQE5^ßq:4Ô∞5µ„#˛˚¢„Z∆xˇ\0æ≈P´œ∏{\n}Ü˝ØZ∑˝ˆ)ﬂo÷@Ë?Ô±E˝º˚á’Èˆ˚GXˇ\0‚Ö6MCWa»¥(¢èo>‚˙Ω>√£™≤‡é?ﬁ¯ıMV5¬é?ﬁQO€œ∏{\n}â∑´dqˇ\0è\nµ´ﬂ¯¢ä=º˚ìÏ)ˆ˝µ™7ˇ\0«ÖUkÀˆê∂9˙ä(£€œ∏„BübH5MFÚéﬁ`¯èSˇ\0«®¢è¨T}A–ßÿcxìRÙ˝h%‘W≠SUÁ‹_WßÿpÒF£ÿ~µ¯õPoˇ\0]QÌÊ¬übEÒUÚ®~¥£≈wÉ™˛¥QO€LóáßÿpÒ}ÿ˛÷û<er)÷ä*Ω¥Å·Èˆ¯Lg»˘)Oå¶?ÚŒä(ˆ“%·Èˆ|c&’‘É∆MèıtQT™»ü´”Ï(ÒÅ«1”ø·/˛Yö(¶ÍH_W¶ Òb˜åöC‚¥«‹9¢ä=§ât F˛%äD9åÊ´≈ÆD	;O&ä*£VH„Ò*rT’∏¸G7ÂE^“Or\"a‚fø€∞0„wÂE\\^ \'ˇŸ'),
('Maan','Singh','Male','Indore','maan@gmail.com','6655447788','B-','157','142','maan101','maanpass','52','âPNG\r\n\Z\n\0\0\0\rIHDR\0\0\0~\0\0\0~\0\0\0‚#•à\0\0\0sBIT|dà\0\0\0sRGB\0ÆŒÈ\0\0\0gAMA\0\0±è¸a\0\0\0	pHYs\0\0ƒ\0\0ƒï+\0\0{IDATx^ÌùLœ«≈JÅü \ZD∞Dç`â\Z1ñÿçQK4∂hbèb√ÿ\"jlA@ç∆\Z5à¢\"`\"F@≈àää\r[,8ˇ}ÛG(∑w∑∑3ü‰ÂfÊv˜nÁª3;≥3Û÷åJw‘√Og·9Eœ)BxN¬säûSÑú\"ÑÁ!<ß·9Eœ)BxN¬säûSÑú\"ÑÁ’LƒxÛÊ\ry˙Ù)y˚ˆ-˘ÙÈ˘˘Û\'±≤≤\"666ƒﬁﬁûxxxê\r\Z‡÷ì˛◊Ø_$::öƒƒƒêÁœüìwÔﬁ·7Â¡à∑∑7ô?>È€∑/~√1 º©!ïj:~¸x∏`Îd“E@7oﬁåG„ì~Â ï‘‹‹\\´†µµˆÌ€”‘‘T<2_òåˇ˛•˛˛˛Z‘’vÏÿÅø¬&!¸ã/®‘H”*ö\\\Z\Zäø∆&—∏kﬁº9k©ÎõŸ≥gì≠[∑bL›(æﬂπsgÉàl€∂çı∏Äï{Ö^©J6Ñ›πsˇÅzQlUüóóG§V7∆¸nNN∆‘âb´˙êêû‹‹\\ã1u¢»üùùM:uÍÑ1„–£GrÎ÷-å©Eñ¯ÂÀóc»x§ßßì{˜ÓaL}(R¯ÑÑó`H}(N¯‰‰dR\\\\å1„rÍ‘)©≈	üôôâ!„STTƒLç(NxË∆)Ö?~ê¸¸|å©≈	_XXà!„û˜ÔﬂcL](N¯ÔﬂøcH(Ìˇ»Ö‚Ño‹∏1ÜîAì&M0§.\'|Àñ-1§¨≠≠1§.\'|ªvÌ0d|†ˆ˘Ôøˇ0¶.\'ºóóÜåOã-HÎ÷≠1¶.\'|Ø^Ωsü˜ÛÛ√ê˙Pú$((c∆eŒú9RäÄπÔ∆∆’’ï¯¯¯`L}(Rx®bç}Øü;wÆ™Wﬁ(vNJJä—VºÿŸŸ±%YjFë%Ë”ß	ƒòaŸø?ÜTîx•RRR¬Vª¿ﬂ4î≠]ª]›(~^˝ã/à≥≥3∆ÙÙ&.]∫Ñ1u£ÿ™^ÉììπˇæﬁZCáÂFt@Ò¬]∫ta„Ù˙zúANü>ç1N`æ	1zÙËJ˜e]Ï–°Cxdæ09·Ågœû—^Ωzi≤&fmmMgÃòÅG„ì^√›ªwiXXmÿ∞°VÅ+öõõ›πs\'-,,ƒ#ãI¨ñ≠	$--çµ`∫∏I±¥¥$ééé§Cá¨≈nffÜ[T#º†vòD´^ ?BxN¬säûSå÷∏ÉüÖuËgœû%ÃA!x£Ñt%µæ5ˇßi”¶Ã;¶ØØ/0`\0Ûòi“ÄÜ‰˜ÔﬂtÒ‚≈‘≈≈•¥mä@cbb¨LÉ\nøb≈\nZØ^=≠i™÷Æ];öîîÑgh:D¯/_æ–n›∫iÕ8µÿ“•KÒlMΩÂ ≠•FÉãne¶Ä^w0é£y¬””SQk¸´Bo›9/ï\0åÒ√Éÿ§≈√ Ωptt¨TÚd´V≠¬úP&z~„∆çZ3É7˚¸˘3ÊàÚê]xxâ@M««’n#Géƒ\\Q≤ﬂ„„„„ŸX∏Äê„«è+÷yíÏ¬oÿ∞C ..C BV·_æ|©(ÁEJ@©≥weÌ«\'%%ëÄÄ\0å	\0°≥lŸ2Ê\rª§§Ñ\rˆÄ≥XÍÔÔOö5kÜ[\ZYÖﬂ≥g	√ò†~˝˙LXxÔ¨˚ó\ZΩ‰Î◊ØÃìÃûêIFåa∞C^.-ZTÆUÀ´ıÓ›õÓ›ªó>xÄΩOG–˚III°´WØ.›f\nYÖ<xpπ‡Õ¶NùJ?~¸àπQ;íììi€∂mŸq§öSıá¨¬ze´RÊÎ?|¯sA7∂oﬂŒéÇ)˙AV·+f6sÊL<{˘(((`«ˆÙÙƒ˘ëMx©±R)S‘nKñ,¡≥ó∏e@’ÔÁÁá)Ú\"õWØ^’ö9jµi”¶·ôÎèoﬂæ±ﬂö7o¶»ál¬Ø_øæRÊ®’˙ˆÌãg≠†g\0øyÊÃLëŸÑü0aB•R´ÂÁÁ„YÜ9sÊ–fÕöaLdﬁ««Gk&©Õå5∑~[ŒóÀÚ‰ﬁ‰–±cG67^ÕXYYë\'Oû[[[L˘7∞˝ÖÿJ^xjÁ‚‚B˙ıÎ«ºz’∆3ˆ∫uÎÿ{oa<ûÍì_G§ì£R¶î+j¥â\'‚ˇõk◊ÆQ©0∞˝$°Ë¿Åô7ooÔ“„A_]*4∏Gı¿v∞Obb\"¶ËÜ,¬_ø~ΩÙd‘l©©©x∆US\\\\\\*Ó∏q„ÿ,©§”sÁŒ—Éñæ∑ˆ‚≈ã‘ŸŸôm∑oﬂ>ñˆ/∫vÌJ«åÉ1›êE¯¯¯¯r§V˚YYY¥AÉ‘ﬁﬁû¶ßß≥¥»»»“˝5ãI†˛ÊÕˆΩÊI]pp0ãW«¶Mõ®ôª;Îå,¬/X∞†Ù‰‘jP:´C∫è≥Ì \n8}˙tñœ8 ¡“58ŸŸŸÏÇÅGø‡‘±*¿ıÏ\'≤•ˇ˛Ï©Ÿ`\0™*‡\0€Ãù;S˛?˙i∑oﬂfa®†ƒkF‡\r\ZD•>|†ç7f’yU<}˙îSjDcJ›ëEx;;ª“R´ÖÜÜ‚ŸñÁ—£GÏ˚äÉ*Àó/ßÓÓÓÙÔﬂø‘∆∆Ü5ÿ∂[∂l°¥Q£FÂÜmãää®ππ9+H⁄x˝˙5€ÜsuE·5ô£fÉá(⁄ò<y2˚æ\"êƒ÷\r¬˜–Ë∆éÀû¸¡ÿTÔP}óe˜Ó›l{®%*ÚÓ›;va\\æ|SÍéŒ¬√	i2GÕ˜kmÄÎ4òN›µ≤¿#lMª\0V‘vÔﬁùnÿ∞Å+66ñﬁ∏qÉï¯≤Æ◊?~Ãæü2e\n¶îGS‚oﬁºâ)uGg·”““J3GÕ+É™‚”ßOl___L°¨äá¥#Gé∞¯ê!C®´´+\0ˇ\0£Fçba\0⁄∞˝§Iì0•2πππl9¸ÙÈ¸‰Óœü?Dj‹©\n¬uì%>L¢¢¢†ê`je`2%xÃ\0ªR+ù=]ì∫jdˆÏŸl π‘Û!“≈@§Íö>úHU<˘¯Ò#ëJ=9vÏ=z4ë˙Ël]BUH%ùÙÓ›ª⁄ˇQc@xAıhJ„øÄ∆ô∆”á∆[∆˘ÛÁŸ\0§i¨l¶kA\Zx	˘0?œ““c∫!ÑØ–’Çèãã√îÍô5kÓÒ–øáÓﬂ–ÌÉ˚4Ã∞Å¡ÿugff‚û’„‰‰Te#≥∂·kt±*6‡™#//èJUzi)á˚;L•jﬁº9ãCüF€†-P‡‚É˝`@dùWØf¿C¯ƒÖO777L≠‡’⁄Aö—9´[€wËÇO˝ƒƒD\"’ò¢B¯Z–¶Mˆf¨£GèbäaÄ‡ê˘ƒâ¨a(B¯Z†iU√gœû=1Uˇì¨¨,6∂/ º†Ê@+‹¬¬¬`Né†A	2¡‹;9¬◊x√EUœ”Â‰’´WLtéï!|ÄiœòVü≥mo›∫≈D_∏p!¶»ãæé‰‰‰0a¸˝˝eØˆaÙ\ré]ˆëÆ‹·uDÛ§Ó‰…ìòRw`^ﬂ¬Ò¢££1U?·e\0\\õÅX^^^5öóW·åääb«h›∫5´Êıç^&`BTÕ ^´V≠hxx8õP	cË⁄Ä	ªvÌ¢√Ü\rc˚¿L\\}óÚ≤·eÓ˜k÷¨°¨€¢j3ò4ikkKŸ–∂°pÙà‘#˘˘˘Ï]Ù‡˙D∫(òkXê·‡‡@‹››ô+c ÑÁÒN\ZN¬säûSÑú\"ÑÁ!<ß·9Eœ)BxN¬säûSÑú\"ÑÁ!<ß·9Eœ%Ñ¸≈ásFV3s\0\0\0\0IENDÆB`Ç');

/*Table structure for table `userlog` */

DROP TABLE IF EXISTS `userlog`;

CREATE TABLE `userlog` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Username` varchar(20) DEFAULT NULL,
  `Password` varchar(20) DEFAULT NULL,
  `empid` int(11) DEFAULT NULL,
  PRIMARY KEY (`Id`),
  UNIQUE KEY `Id` (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

/*Data for the table `userlog` */

insert  into `userlog`(`Id`,`Username`,`Password`,`empid`) values 
(1,'adesh_vyas','cool',101),
(2,'dev','not_cool',102),
(3,'lalita','12345',103),
(4,'admin','admin',0);

/*Table structure for table `vaccine` */

DROP TABLE IF EXISTS `vaccine`;

CREATE TABLE `vaccine` (
  `pat_id` varchar(50) NOT NULL,
  `pat_name` varchar(50) DEFAULT NULL,
  `doctor_id` varchar(50) NOT NULL,
  `doctor_name` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `vaccine_type` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pat_id`,`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vaccine` */

insert  into `vaccine`(`pat_id`,`pat_name`,`doctor_id`,`doctor_name`,`date`,`vaccine_type`) values 
('aaki101','Aakarsh Mandloi','thomas101','Thomas','15/12/2020','TDC'),
('dev101','Dev Vyas','thomas101','Thomas','17/12/2020','MMR');

/*Table structure for table `vaccine_status` */

DROP TABLE IF EXISTS `vaccine_status`;

CREATE TABLE `vaccine_status` (
  `pat_id` varchar(50) NOT NULL,
  `pat_name` varchar(50) DEFAULT NULL,
  `doctor_id` varchar(50) NOT NULL,
  `doctor_name` varchar(50) DEFAULT NULL,
  `date` varchar(50) DEFAULT NULL,
  `vaccine_type` varchar(50) DEFAULT NULL,
  `status` varchar(50) DEFAULT NULL,
  `date_of_vaccination` varchar(50) DEFAULT NULL,
  `organisation` varchar(50) DEFAULT NULL,
  `network` varchar(50) DEFAULT NULL,
  `enterprise` varchar(50) DEFAULT NULL,
  `location` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`pat_id`,`doctor_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `vaccine_status` */

insert  into `vaccine_status`(`pat_id`,`pat_name`,`doctor_id`,`doctor_name`,`date`,`vaccine_type`,`status`,`date_of_vaccination`,`organisation`,`network`,`enterprise`,`location`) values 
('aaki101','Aakarsh Mandloi','thomas101','Thomas','15/12/2020','TDC','Done ','NA','Test Laby','Someplace near','BosNet','San Jose');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
