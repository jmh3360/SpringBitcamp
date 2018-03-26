select * from board;
alter table SKT ADD model varchar2(20);
drop table SKT;
phoneSeq,thumbnail,model;
select * from user_sequences;

create table mobile(
	seq number primary key,
	thumbnail varchar2(20),
	model varchar2(20)
);
create sequence seq;