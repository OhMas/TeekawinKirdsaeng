USE ICT_Tutorial_Assignment1;
--Teekawin Kirdsaeng 6188077 Sec.1--
---Part 1: Write the SQL commands to answer the following 5 questions:--

--Q1
SELECT s.Student_FirstName + ' ' + s.Student_LastName as Full_Name,
COUNT(ec.Course_ID) as Number_Of_Enrolled_Course
FROM Student s
JOIN EnrollCourse ec ON s.Student_ID = ec.Student_ID
GROUP BY s.Student_FirstName + ' ' + s.Student_LastName
HAVING COUNT(ec.Course_ID) > 1;

--Q2
SELECT s.Student_FirstName + ' ' + s.Student_LastName as Full_Name,
t.Amount
FROM Student s
JOIN Payment p ON s.Student_ID = p.Student_ID
JOIN Transactions t ON p.Transaction_ID = t.Transaction_ID
WHERE t.Amount > 50000;

--Q3
SELECT s.Student_FirstName + ' ' + s.Student_LastName as Full_Name,
es.Score
FROM Student s
JOIN PracticeExam pe ON s.Student_ID = pe.Student_ID
JOIN ExamScore es ON pe.Exam_ID = es.Exam_ID
WHERE es.Score > (SELECT AVG(Score) FROM ExamScore)
GROUP BY s.Student_FirstName + ' ' + s.Student_LastName, es.Score;

--Q4
SELECT i.Instructor_FirstName + ' ' + i.Instructor_LastName as Full_Name
FROM Instructor i
LEFT JOIN Course c ON i.Instructor_ID = c.Instuctor_ID
GROUP BY i.Instructor_FirstName + ' ' + i.Instructor_LastName
HAVING COUNT(c.Course_ID) = 0;

--Q5
SELECT s.Student_FirstName, c.Course_Name, SUM(bt.Price) as Price_All_Books
FROM Student s
JOIN EnrollCourse ec ON s.student_ID = ec.Student_ID
JOIN Course c ON ec.Course_ID = c.Course_ID
JOIN BookStocking bt ON c.Course_ID = bt.Course_ID
WHERE s.Student_FirstName = 'TEEKAWIN' AND c.Course_Name = 'Human Computer Interaction'
GROUP BY s.Student_FirstName, c.Course_Name;

--- Part 2: Design your own 5 more questions and write the SQL command to solve your questions--

--Q1: Find all students who pass the the exam which is 60 score from 100. And use DESC to order--
SELECT s.Student_FirstName + ' ' + s.Student_LastName as Student_Who_Pass_Exam,
	   es.Score
FROM Student s
JOIN PracticeExam pe ON s.Student_ID = pe.Student_ID
JOIN ExamScore es ON pe.Exam_ID = es.Exam_ID
WHERE es.Score BETWEEN 60 AND 100
ORDER BY es.Score DESC;

--Q2: Find all Instructor who born in January and February--
SELECT Instructor_FirstName + ' ' + Instructor_LastName as Instructor_FullName,
	   Instructor_Birthday
FROM Instructor
WHERE MONTH(Instructor_Birthday) IN (1,2);

--Q3: Find all Instructors who taught the course that have more than 6000 fees, and show course ID and course name as well.--
SELECT i.Instructor_FirstName + ' ' + i.Instructor_LastName as Instructor_FullName,
	   c.Course_ID,
       c.Course_Name
FROM Instructor i
JOIN Course c ON i.Instructor_ID = c.Instuctor_ID
WHERE c.Course_Amount > 6000;

--Q4: Find all students who have to pay more than 4000 expenses, and use ASE to order.--
SELECT s.Student_FirstName + ' ' + s.Student_LastName as Student_Who_Pay_Amount_More_than_3000,
	   t.Amount
FROM Student s
JOIN Payment p ON s.Student_ID = p.Student_ID
JOIN Transactions t ON p.Transaction_ID = t.Transaction_ID
WHERE t.Amount > 4000
ORDER BY t.Amount ASC;

-- Q5: Find all students who present in January
SELECT s.Student_FirstName + ' ' + s.Student_LastName as Student_Who_Absent,
       ca.Attend_Day,
       ca.Attend_Status
FROM Student s
JOIN CheckAttendence ca ON ca.Student_ID = s.Student_ID
WHERE ca.Attend_Status = 'Present'