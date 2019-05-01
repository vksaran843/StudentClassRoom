
# --- !Ups


create sequence class_1_seq START WITH 1 INCREMENT BY 1;
create sequence class_2_seq START WITH 1 INCREMENT BY 1;
create sequence class_3_seq START WITH 1 INCREMENT BY 1;
create sequence class_4_seq START WITH 1 INCREMENT BY 1;
create sequence class_5_seq START WITH 1 INCREMENT BY 1;
create sequence class_6_seq START WITH 1 INCREMENT BY 1;
create sequence class_7_seq START WITH 1 INCREMENT BY 1;
create sequence class_8_seq START WITH 1 INCREMENT BY 1;
create sequence class_9_seq START WITH 1 INCREMENT BY 1;
create sequence class_10_seq START WITH 1 INCREMENT BY 1;
create sequence class_11_seq START WITH 1 INCREMENT BY 1;
create sequence class_12_seq START WITH 1 INCREMENT BY 1;


insert into CLASSROOM(CLASSROOM_ID,CLASSROOM_NAME,CAPACITY,TOTAL_DIVISIONS) values(1,'CLASS_1',60,5);
insert into CLASSROOM(CLASSROOM_ID,CLASSROOM_NAME,CAPACITY,TOTAL_DIVISIONS) values(2,'CLASS_2',60,5);
insert into CLASSROOM(CLASSROOM_ID,CLASSROOM_NAME,CAPACITY,TOTAL_DIVISIONS) values(3,'CLASS_3',60,5);
insert into CLASSROOM(CLASSROOM_ID,CLASSROOM_NAME,CAPACITY,TOTAL_DIVISIONS) values(4,'CLASS_4',60,5);
insert into CLASSROOM(CLASSROOM_ID,CLASSROOM_NAME,CAPACITY,TOTAL_DIVISIONS) values(5,'CLASS_5',60,5);
insert into CLASSROOM(CLASSROOM_ID,CLASSROOM_NAME,CAPACITY,TOTAL_DIVISIONS) values(6,'CLASS_6',60,5);
insert into CLASSROOM(CLASSROOM_ID,CLASSROOM_NAME,CAPACITY,TOTAL_DIVISIONS) values(7,'CLASS_7',60,5);
insert into CLASSROOM(CLASSROOM_ID,CLASSROOM_NAME,CAPACITY,TOTAL_DIVISIONS) values(8,'CLASS_8',60,5);
insert into CLASSROOM(CLASSROOM_ID,CLASSROOM_NAME,CAPACITY,TOTAL_DIVISIONS) values(9,'CLASS_9',60,5);
insert into CLASSROOM(CLASSROOM_ID,CLASSROOM_NAME,CAPACITY,TOTAL_DIVISIONS) values(10,'CLASS_10',60,5);
insert into CLASSROOM(CLASSROOM_ID,CLASSROOM_NAME,CAPACITY,TOTAL_DIVISIONS) values(11,'CLASS_11',60,5);
insert into CLASSROOM(CLASSROOM_ID,CLASSROOM_NAME,CAPACITY,TOTAL_DIVISIONS) values(12,'CLASS_12',60,5);


# --- !Downs

delete from CLASSROOM;
drop sequence class_1_seq ;
drop sequence class_2_seq ;
drop sequence class_3_seq ;
drop sequence class_4_seq ;
drop sequence class_5_seq ;
drop sequence class_6_seq ;
drop sequence class_7_seq ;
drop sequence class_8_seq ;
drop sequence class_9_seq ;
drop sequence class_10_seq ;
drop sequence class_11_seq ;
drop sequence class_12_seq ;


