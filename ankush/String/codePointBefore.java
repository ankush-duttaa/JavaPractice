,Create a Table 
Create Table Userr
( user_id number(10) primary key,
  user_name varchar(20)NOT NULL ,
  user_password varchar(20)NOT NULL,
  user_role varchar(20),
  creation_time TIMESTAMP,
  last_update_time TIMESTAMP
  );
*\
	
	INSERT INTO Userr(user_id,user_name,user_password,user_role,creation_time,last_update_time)
     VALUES(1,'admin','admin123','system administrator',SYSTIMESTAMP,SYSTIMESTAMP);
	
INSERT INTO Userr(user_id,user_name,user_password,user_role,creation_time,last_update_time)
     VALUES(2,'ankush','ankush123','system administrator',SYSTIMESTAMP,SYSTIMESTAMP);
	 
	 INSERT INTO Userr(user_id,user_name,user_password,user_role,creation_time,last_update_time)
     VALUES(3,'pal','pal123','normal user',SYSTIMESTAMP,SYSTIMESTAMP);
	 
	 
	 USER_CREDENRIALS