insert into departments(name) values('department1');
insert into departments(name) values('department2');
insert into departments(name) values('department3');

insert into teachers(name, last_name, department_id) values('teacherName1', 'teacherLastName1', 1);
insert into teachers(name, last_name, department_id) values('teacherName2', 'teacherLastName2', 1);
insert into teachers(name, last_name, department_id) values('teacherName3', 'teacherLastName3', 2);

insert into groups(name, department_id) values('group1', 1);
insert into groups(name, department_id) values('group2', 1);
insert into groups(name, department_id) values('group3', 2);

insert into students(name, last_name, age, group_id) values('studentName1', 'studentLastName1', 11, 1);
insert into students(name, last_name, age, group_id) values('studentName2', 'studentLastName2', 22, 1);
insert into students(name, last_name, age, group_id) values('studentName3', 'studentLastName3', 33, 2);

insert into lessons(name, start_time, duration, teacher_id, group_id) values('math', '2021-01-11 11:11:11', 5400, 1, 1);
insert into lessons(name, start_time, duration, teacher_id, group_id) values('english', '2021-02-12 12:12:12', 5400, 2, 1);
insert into lessons(name, start_time, duration, teacher_id, group_id) values('mechanics', '2021-03-13 13:13:13', 5400, 3, 2);