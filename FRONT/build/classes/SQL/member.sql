

create database jspweb


create table jspweb.member(
	mno int primary key auto_increment ,
    mid varchar(20) not null ,
    mpassword varchar(10) not null , 
    mname varchar(10)  ,
    memail varchar(30) ,
    mphone varchar(20) ,
    maddress varchar(100)   
)

create table jspweb.board(

    bno int primary key auto_increment , 
    btitle varchar(100) not null , 
    bcontents varchar(5000) ,
    bwriter varbinary(10) ,
    bdate varchar(10) not null ,
    bcount int 
    
)