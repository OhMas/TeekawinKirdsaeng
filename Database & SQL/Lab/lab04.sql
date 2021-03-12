USE ICT_Tutorial_Assignment1;

--Teekawin Kirdsaeng 6188077 Sec.1

--Q1
Select count(Student_Address) as Who_Live_in_BKK
From Student
Where CHARINDEX('Bangkok',[Student_Address]) > 0;


--Q2
SELECT COUNT(*) as Summer_child
FROM Student
WHERE MONTH(Student_Birthday) BETWEEN 4 AND 7;

--Q3
SELECT COUNT(c.Course_ID) AS Cnt_Courses,
i.Instructor_FirstName + ' ' + i.Instructor_LastName as Instructor_name
FROM Instructor i 
JOIN Course c
ON i.Instructor_ID = c.Instructor_ID
GROUP BY i.Instructor_FirstName + ' ' + i.Instructor_LastName;

--Q4
SELECT AVG(es.Score) as Avg_Score, c.Course_Name
FROM Student s
JOIN PracticeExam pe ON s.Student_ID = pe.Student_ID
JOIN ExamScore es ON pe.Exam_ID = es.Exam_ID
JOIN EnrollCourse ec ON s.Student_ID = ec.Student_ID
JOIN Course c ON ec.Course_ID = c.Course_ID
GROUP BY c.Course_Name;

--Q5
SELECT SUM(t.Amount) as Tot_Amount, 
s.Student_ID as StudentID,
s.Student_FirstName + ' ' + s.Student_LastName as fullname
FROM Student s
JOIN Payment p ON s.Student_ID = p.Student_ID
JOIN Transaction_Table t ON p.Transaction_ID = t.Transaction_ID
GROUP BY s.Student_ID, s.Student_FirstName + ' ' + s.Student_LastName;
