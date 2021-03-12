--1--
Use ICT_Tutorial_Assignment1;
select	Student_ID, 
		Student_FirstName, 
		Student_LastName,
		Year(getdate())-Year(Student_Birthday) as age
from Student
where CharIndex('hotmail', [Student_Email]) > 0
go


--2--
Use ICT_Tutorial_Assignment1;
select	Student_FirstName + ' '+ Student_LastName as [Name],
		Year(getdate())-Year(Student_Birthday) as age
from Student
where Year(getdate())-Year(Student_Birthday) > 20
go


--3--
Use ICT_Tutorial_Assignment1;
SELECT s.Student_FirstName + ' ' + s.Student_LastName as Full_Name,
s.Student_Email,
s.Student_Phone
FROM Student s 
LEFT JOIN Payment p
ON s.Student_ID = p.Student_ID
WHERE p.Transaction_ID IS NULL;


--4--
Use ICT_Tutorial_Assignment1;
select s.Student_ID, pe.Exam_ID,
s.Student_FirstName + ' ' + s.Student_LastName as Full_Name,
e.Score
from Student s 
JOIN PracticeExam pe ON s.Student_ID = pe.Student_ID
JOIN ExamScore e ON pe.Exam_ID = e.Exam_ID;


--5--
Use ICT_Tutorial_Assignment1;
select TOP 1 s.Student_FirstName + ' ' + s.Student_LastName as Full_Name,
e.Score
from Student s 
JOIN PracticeExam pe on s.Student_ID = pe.Student_ID
JOIN ExamScore e on pe.Exam_ID = e.Exam_ID
order by e.Score DESC;


--6--
Use ICT_Tutorial_Assignment1;
select TOP 1 i.Instructor_FirstName + ' ' + i.Instructor_LastName as Instructor_FullName,
c.Course_Amount
from Instructor i
JOIN Course c ON i.Instructor_ID = c.Instuctor_ID
order by c.Course_Amount DESC;


--7--
USE ICT_Tutorial_Assignment1;
SELECT TOP 5 s.Student_FirstName + ' ' + s.Student_LastName as Full_Name,
c.Course_Amount
FROM Student s
JOIN EnrollCourse ec ON s.Student_ID = ec.Student_ID
JOIN Course c ON ec.Course_ID = c.Course_ID
ORDER BY c.Course_Amount DESC;


--8--
USE ICT_Tutorial_Assignment1;
SELECT c.Course_ID, ev.Course_ID
FROM Course c
LEFT JOIN ElearningVideo ev ON c.Course_ID = ev.Course_ID
WHERE ev.Course_ID IS NULL;