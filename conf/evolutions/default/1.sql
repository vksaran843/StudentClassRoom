# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table classroom (
  classroom_id                  bigint auto_increment not null,
  classroom_name                varchar(255),
  capacity                      bigint,
  total_divisions               bigint,
  constraint pk_classroom primary key (classroom_id)
);

create table student (
  student_id                    bigint auto_increment not null,
  classroom_seq_id              bigint,
  student_name                  varchar(255),
  father_name                   varchar(255),
  classroom_id                  bigint,
  division                      varchar(255),
  constraint pk_student primary key (student_id)
);

create index ix_student_classroom_id on student (classroom_id);
alter table student add constraint fk_student_classroom_id foreign key (classroom_id) references classroom (classroom_id) on delete restrict on update restrict;


# --- !Downs

alter table student drop constraint if exists fk_student_classroom_id;
drop index if exists ix_student_classroom_id;

drop table if exists classroom;

drop table if exists student;

