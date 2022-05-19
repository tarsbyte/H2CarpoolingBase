INSERT INTO SOCIALMEDIAS(mediasID) VALUES (1);
INSERT INTO SOCIALMEDIAS(mediasID) VALUES (2);
INSERT INTO SOCIALMEDIAS(mediasID) VALUES (3);
INSERT INTO SOCIALMEDIAS(mediasID) VALUES (4);
INSERT INTO SOCIALMEDIAS(mediasID) VALUES (5);


INSERT INTO USERRATES(rateID, punctuality, politeness, safety, type) VALUES (1,9.2,3.5,7.8, 1);
INSERT INTO USERRATES(rateID, punctuality, politeness, safety, comfort, price, type) VALUES (2,4.2,7.5,6.8,2.5,5.6, 2);
INSERT INTO USERRATES(rateID, punctuality, politeness, safety, type) VALUES (3,7.2,8.5,5.8, 1);
INSERT INTO USERRATES(rateID, punctuality, politeness, safety, type) VALUES (4,3.2,6.5,7.8, 1);
INSERT INTO USERRATES(rateID, punctuality, politeness, safety, type) VALUES (5,8.2,5.5,8.8, 1);

INSERT INTO STATS(statsID, rides_taken, rides_given, rateID) VALUES (1,22,3,1);
INSERT INTO STATS(statsID, rides_taken, rides_given, rateID) VALUES (2,12,23,2);
INSERT INTO STATS(statsID, rides_taken, rides_given, rateID) VALUES (3,32,43,3);
INSERT INTO STATS(statsID, rides_taken, rides_given, rateID) VALUES (4,12,32,4);
INSERT INTO STATS(statsID, rides_taken, rides_given, rateID) VALUES (5,42,13,5);

INSERT INTO CREDENTIALS(credentialsID, username, password, email) VALUES(1,'alibaba','alibaba','kot@gmail.com');
INSERT INTO CREDENTIALS(credentialsID, username, password, email) VALUES(2,'aladyn','alib1','piotr@gmail.com');
INSERT INTO CREDENTIALS(credentialsID, username, password, email) VALUES(3,'saladyn','alib2','sted@gmail.com');
INSERT INTO CREDENTIALS(credentialsID, username, password, email) VALUES(4,'sindbad','alids','stef@gmail.com');
INSERT INTO CREDENTIALS(credentialsID, username, password, email) VALUES(5,'zygrfyd','alib2sd','kotylion@gmail.com');

INSERT INTO USERS(userID,description,phone_number,credentialsID, statsID, mediasID) VALUES (1,'Lubię koty','1434352',1,1,1);
INSERT INTO USERS(userID,description,phone_number,credentialsID, statsID, mediasID) VALUES (2,'Lubię psy','1434462',2,2,2);
INSERT INTO USERS(userID,description,phone_number,credentialsID, statsID, mediasID) VALUES (3,' ','1434752',3,3,3);
INSERT INTO USERS(userID,description,phone_number,credentialsID, statsID, mediasID) VALUES (4,' ','1433752',4,4,4);
INSERT INTO USERS(userID,description,phone_number,credentialsID, statsID, mediasID) VALUES (5,' ','1454352',5,5,5);

INSERT INTO OFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (1,' ',2,11,'14:00:00','Kraków','Warszawa','04:00:00',CURRENT_DATE,CURRENT_DATE,1);
INSERT INTO OFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (2,' ',3,20,'12:00:00','Kraków','Warszawa','04:00:00',CURRENT_DATE,CURRENT_DATE,2);
INSERT INTO OFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (7,' ',1,15,'14:30:00','Kraków','Poznań','05:00:00',CURRENT_DATE,CURRENT_DATE,3);
INSERT INTO OFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (3,' ',2,17,'13:00:00','Kraków','Rzeszów','02:00:00',CURRENT_DATE,CURRENT_DATE,4);
INSERT INTO OFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (4,' ',3,12,'12:00:00','Kraków','Warszawa','05:00:00',CURRENT_DATE,CURRENT_DATE,5);
INSERT INTO OFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (5,' ',2,14,'06:00:00','Kraków','Toruń','06:00:00',CURRENT_DATE,CURRENT_DATE,1);
INSERT INTO OFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (6,' ',1,18,'04:00:00','Kraków','Warszawa','04:00:00',CURRENT_DATE,CURRENT_DATE,2);

INSERT INTO HISTORICALOFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid, took_place) VALUES (11,' ',2,11,'17:00:00','Kraków','Warszawa','02:00:00',CURRENT_DATE,CURRENT_DATE,1, true);
INSERT INTO HISTORICALOFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid, took_place) VALUES (12,' ',3,20,'18:00:00','Kraków','Warszawa','4:00:00',CURRENT_DATE,CURRENT_DATE,2, false);
INSERT INTO HISTORICALOFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid, took_place) VALUES (17,' ',1,15,'14:30:00','Kraków','Poznań','05:00:00',CURRENT_DATE,CURRENT_DATE,3, false);
INSERT INTO HISTORICALOFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid, took_place) VALUES (13,' ',2,17,'21:00:00','Kraków','Rzeszów','02:00:00',CURRENT_DATE,CURRENT_DATE,4, true);
INSERT INTO HISTORICALOFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid, took_place) VALUES (14,' ',3,12,'12:00:00','Kraków','Warszawa','05:00:00',CURRENT_DATE,CURRENT_DATE,5, false);
INSERT INTO HISTORICALOFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid, took_place) VALUES (15,' ',2,14,'09:00:00','Kraków','Toruń','06:00:00',CURRENT_DATE,CURRENT_DATE,1, true);
INSERT INTO HISTORICALOFFERS(offerID,description,num_Of_Passengers,price,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid, took_place) VALUES (16,' ',1,18,'05:00:00','Kraków','Warszawa','04:00:00',CURRENT_DATE,CURRENT_DATE,2, true);

INSERT INTO HISTORICALPAYMENTS(payID, time, date, driverID, clientID, payment_value, offerID) VALUES(1,'12:00:00',CURRENT_DATE, 1, 2, 12.5, 11);
INSERT INTO HISTORICALPAYMENTS(payID, time, date, driverID, clientID, payment_value, offerID) VALUES(2,'12:00:00',CURRENT_DATE, 3, 2, 22.5, 12);
INSERT INTO HISTORICALPAYMENTS(payID, time, date, driverID, clientID, payment_value, offerID) VALUES(12,'12:00:00',CURRENT_DATE, 1, 2, 15.5, 13);
INSERT INTO HISTORICALPAYMENTS(payID, time, date, driverID, clientID, payment_value, offerID) VALUES(14,'12:00:00',CURRENT_DATE, 4, 2, 14.7, 17);
INSERT INTO HISTORICALPAYMENTS(payID, time, date, driverID, clientID, payment_value, offerID) VALUES(15,'12:00:00',CURRENT_DATE, 1, 4, 19.5, 16);

INSERT INTO MESSAGES(msgID, text, time, date, authorID, receiverID)  VALUES(1,'Jest miejsce dla kota ?','12:00:00',CURRENT_DATE, 1, 2);
INSERT INTO MESSAGES(msgID, text, time, date, authorID, receiverID)  VALUES(11,'Jest.','12:01:00',CURRENT_DATE, 2, 1);
INSERT INTO MESSAGES(msgID, text, time, date, authorID, receiverID)  VALUES(12,'Jest miejsce dla psa ?','14:30:00',CURRENT_DATE, 1, 2);
INSERT INTO MESSAGES(msgID, text, time, date, authorID, receiverID)  VALUES(136,'Nie, dla psa nie.','18:01:00',CURRENT_DATE, 2, 1);

INSERT INTO BOOKEDOFFERS(offerID,description,num_Of_Passengers,price,paid,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (1,' ',2,10,false,'14:00:00','Kraków','Warszawa','04:00:00',CURRENT_DATE,CURRENT_DATE,1);
INSERT INTO BOOKEDOFFERS(offerID,description,num_Of_Passengers,price,paid,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (2,' ',3,20,true,'12:00:00','Kraków','Warszawa','04:00:00',CURRENT_DATE,CURRENT_DATE,2);
INSERT INTO BOOKEDOFFERS(offerID,description,num_Of_Passengers,price,paid,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (7,' ',1,15,false,'14:30:00','Kraków','Poznań','05:00:00',CURRENT_DATE,CURRENT_DATE,3);
INSERT INTO BOOKEDOFFERS(offerID,description,num_Of_Passengers,price,paid,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (3,' ',2,17,true,'13:00:00','Kraków','Rzeszów','02:00:00',CURRENT_DATE,CURRENT_DATE,4);
INSERT INTO BOOKEDOFFERS(offerID,description,num_Of_Passengers,price,paid,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (4,' ',3,12,true,'12:00:00','Kraków','Warszawa','05:00:00',CURRENT_DATE,CURRENT_DATE,5);
INSERT INTO BOOKEDOFFERS(offerID,description,num_Of_Passengers,price,paid,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (5,' ',2,14,false,'06:00:00','Kraków','Toruń','06:00:00',CURRENT_DATE,CURRENT_DATE,1);
INSERT INTO BOOKEDOFFERS(offerID,description,num_Of_Passengers,price,paid,arrival_time,start_location,destination_location,ride_duration,ride_end_date,ride_start_date,userid) VALUES (6,' ',1,18,true,'04:00:00','Kraków','Warszawa','04:00:00',CURRENT_DATE,CURRENT_DATE,2);


CREATE SCHEMA test_schema AUTHORIZATION sa;

