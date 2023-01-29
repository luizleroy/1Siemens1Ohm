-- Model

CREATE TABLE Students (
    ID int,
    Name VARCHAR,
    Value TINYINT
);

CREATE TABLE Notes (
    Grade TINYINT,
    Min_Value TINYINT,
    Max_Value TINYINT
);

INSERT INTO Notes (Grade, Min_Value, Max_Value)
VALUES (1, 0, 9),(2,10,19),(3,20,29),(4,30,39),(5,40,49),(6,50,59),(7,60,69),(8,70,79),(9,80,89),(10,90,100);

-- REPORT

select * from (
SELECT Students.ID, Students.Name, Students.Value, Notes.Grade from Students,Notes
group by Students.Value, Notes.min_value, Notes.max_value HAVING value BETWEEN min_value and max_value AND grade > 7
order by grade DESC, name ASC) as tmp
union ALL
select * from (
SELECT Students.ID, null as Name, Students.Value, Notes.Grade FROM Students,Notes
group by Students.Value, Notes.min_value, Notes.max_value HAVING value BETWEEN min_value and max_value AND grade < 8
order by grade ASC, name ASC) AS tmp2

-- LITtLE EXAMPLE TO TEST
/*INSERT INTO Notes (Grade, Min_Value, Value)
VALUES (6, 'Roy', 90);*/