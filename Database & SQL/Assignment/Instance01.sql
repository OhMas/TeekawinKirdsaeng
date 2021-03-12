
INSERT INTO Student (Student_ID, Student_FirstName, Student_LastName, Student_Address, Student_Birthday, Student_Email, Student_Phone, Student_UserID, Student_Password)
VALUES (6188077, 'TEEKAWIN', 'KIRDSAENG', 'Bangkok', '1999-11-10', 'Ohm@hotmail.com', 0972055551, 'OhMaz', '123456'),
 (6188135, 'WANWISA', 'LAOWSIRIWONG', 'Bangkok', '1999-01-01', 'wan@hotmail.com', '0972055551', 'wanaz', '123456'),
 (6188104, 'PODCHAWAT', 'WORATHANAKUL', 'Bangkok', '2000-12-12', 'pod@hotmail.com', '0895154627', 'podmaz', '123456'),
 (6188065, 'PREECHAYA', 'WANNABHOOM', 'Bangkok', '2000-02-02', 'pree@hotmail.com', '0812345678', 'junemaz', '123456'),
 (6188021, 'RUKSAT', 'SOLADDA', 'Bangkok', '2000-03-03', 'poom@hotmail.com', '0832465327', 'pommaz', '123456'),
 (6188144, 'SAKDA', 'RUEANGRIT', 'Bangkok', '1999-05-05', 'sa@hotmail.com', '0826451427', 'aamaz', '123456'),
 (6188030, 'RATTANUNT', 'KUMPEERASART', 'Bangkok', '1999-04-04', 'ratt@hotmail.com', '0952199998', 'rattaz', '123456'),
 (6188044, 'CHULAJAK', 'WATANYOO', 'Bangkok', '1999-02-02', 'jun@hotmail.com', '0854622554', 'Hmaz', '123456'),
 (6188023, 'PRAEWNAPA', 'SUKHARANGSAN', 'Bangkok', '1999-10-10', 'prew@hotmail.com', '0958766442', 'Fmaz', '123456'),
 (6188003, 'AORAVEE ', 'DONNOMPRI', 'Bangkok', '1999-10-10', 'aor@hotmail.com', '0958766411', 'Tttymaz', '123456');

 INSERT INTO Instructor (Instructor_ID, Instructor_FirstName, Instructor_LastName, Instructor_Address, Instructor_Birthday, Instructor_Email, Instructor_Phone, Instructor_UserID, Instructor_Password)
VALUES (0011, 'Pattanasak', 'Mongkolwat', 'Bangkok', '1955-01-02', 'pattanasak.monmahidol.ac.th', 0851645198, 'pattmus', '123456'),
 (0022, 'Supachai', 'Tangwongsan', 'Bangkok', '1955-01-02', 'supachai.twsmahidol.ac.th', 0985466551, 'supmus', '123456'),
 (0033, 'Jarernsri', 'Mitrpanont', 'Bangkok', '1955-01-02', 'jarernsri.mitmahidol.ac.th', 0895744668, 'jarmus', '123456'),
 (0044, 'Chomtip', 'Pornpanomchai', 'Bangkok', '1955-01-02', 'chomtip.pormahidol.ac.th', 0898744550, 'chommus', '123456'),
 (0055, 'Damras', 'Wongsawang', 'Bangkok', '1955-01-02', 'damras.wonmahidol.ac.th', 0851677995, 'dammus', '123456'),
 (0066, 'Worapan', 'Kusakunniran', 'Bangkok', '1955-01-02', 'worapan.kusmahidol.ac.th', 0958744663, 'wormus', '123456'),
 (0077, 'Vasaka', 'Visoottiviseth', 'Bangkok', '1955-01-02', 'vasaka.vismahidol.ac.th', 0895744668, 'vasmus', '123456'),
 (0088, 'Sudsanguan', 'Ngamsuriyaroj', 'Bangkok', '1955-01-02', 'sudsanguan.ngamahidol.ac.th', 0984566888, 'ngmemus', '123456'),
 (0099, 'Charnyote', 'Pluempitiwiriyawej', 'Bangkok', '1955-01-02', 'charnyote.plumahidol.ac.th', 0989988778, 'charyotmus', '123456'),
 (0100, 'Songsri', 'Tangsripairoj', 'Bangkok', '1955-01-02', 'songsri.tanmahidol.ac.th', 0895322334, 'songmus', '123456');

 INSERT INTO Course (Course_ID, Course_Name, Course_Amount, Instuctor_ID)
VALUES (337, 'Human Computer Interaction', '3000', 0011),
(361, 'Management Information Systems', '2900', 0022),
(371, 'Introduction to Software Engineering', '3000', 0033),
(393, 'Database Systems Lab', '2900', 0044),
(413, 'Database Design', '2900', 0055),
(414, 'Information Storage and Retrieval', '3200', 0066),
(420, 'Computer Networks', '3100', 0077),
(424, 'Wireless and Mobile Computing', '3500', 0088),
(443, 'Parallel and Distributed Systems', '3200', 0099),
(451, 'Artificial Intelligence', '3300', 0100);

 INSERT INTO BookStocking (Book_ID, BookName, Author, Remaining, Price, Course_ID)
VALUES (123001, 'Politics of Opportunism', 'R P N Singh', 10, '200', 337),
(123002, 'Malayalam poetry', 'Akkitham Achuthan Namboodri', 20, '250', 361),
(123003, 'The Testaments', 'Margaret Atwood', 30, '190', 371),
(123004, 'Celestial Bodies', 'Jokha Alharthi', 15, '150', 393),
(123005, 'Cheque book', 'Vasdev Mohi', 19, '250', 413),
(123006, 'The Overstory', 'Richard Powers', 11, '166', 414),
(123007, 'The Braille edition of the book Exam Warriors', 'PM Narendra Modi', 56, '450', 420),
(123008, 'Mind-Master', 'Viswanathan Anand and Susan Ninan', 15, '150', 424),
(123009, 'Hemant Karkare: A Daughter’s Memoir', 'Roopa Pai', 14, '130', 443),
(123010, 'Bridgital Nation', 'Vikram Sampath', 16, '350', 451);

INSERT INTO ElearningVideo (Lesson, Details, Course_ID)
VALUES ('Be bold', 'Libba Bray, author of Beauty Queens', 337),
('Choose friends wisely', 'Michele Norris, author of The Grace of Silence: A Family Memoir', 361),
('You are stronger than you think', 'Lauren Willig, author of The Garden Intrigues', 371),
('Devour knowledge', 'Judith Viorst, author of Alexander and the Terrible, Horrible, No Good, Very Bad Day', 393),
('Home is truly sweet', 'Sibella Court, author of Nomad: A Global Approach to Interior Style', 413),
('Keep an open mind', 'Meg Cabot, author of The Princess Diaries', 414),
('Follow your passion', 'Uma Krishnaswami, author of The Grand Plan to Fix Everything', 420),
('Always pay attention', 'Tamora Pierce, author of Mastiff: The Legend of Beka Cooper, Book Three', 424),
('Be extraordinary every day', 'Lisa Tucker, author of The Winters in Bloom', 443),
('Identify with others', 'Joy Fielding, author of the forthcoming Now You See Her', 451);

INSERT INTO Seat (Seat_ID, SeatRow, Number, Course_ID, Student_ID)
VALUES (11110, 10, 30, 337, 6188077),
(11111, 11, 31, 361, 6188135),
(11112, 12, 32, 371, 6188104),
(11113, 13, 33, 393, 6188065),
(11114, 14, 34, 413, 6188021),
(11115, 15, 35, 414, 6188144),
(11116, 16, 36, 420, 6188030),
(11117, 17, 37, 424, 6188044),
(11118, 18, 38, 443, 6188023),
(11119, 19, 39, 451, 6188003);

INSERT INTO EnrollCourse (Student_ID, Course_ID)
VALUES (6188077, 337),
(6188135, 361),
(6188104, 371),
(6188065, 393),
(6188021, 413),
(6188144, 414),
(6188030, 420),
(6188044, 424),
(6188023, 443),
(6188003, 451);

INSERT INTO Transactions (Transaction_ID, Amount)
VALUES (11100, '72000'),
(11111, '71000'),
(11122, '73000'),
(11133, '75000'),
(11144, '80000'),
(11155, '76000'),
(11166, '79000'),
(11177, '71000'),
(11188, '75000'),
(11199, '72000');

INSERT INTO Payment (Student_ID, Transaction_ID)
VALUES (6188077, 11100),
(6188135, 11111),
(6188104, 11122),
(6188065, 11133),
(6188021, 11144),
(6188144, 11155),
(6188030, 11166),
(6188044, 11177),
(6188023, 11188),
(6188003, 11199);

INSERT INTO ExamScore (Exam_ID, Score)
VALUES (7700, '78'),
(7701, '80'),
(7702, '72'),
(7703, '62'),
(7704, '98'),
(7705, '80'),
(7706, '50'),
(7707, '40'),
(7708, '56'),
(7709, '69');

INSERT INTO PracticeExam (Student_ID, Exam_ID)
VALUES (6188077, 7700),
(6188135, 7701),
(6188104, 7702),
(6188065, 7703),
(6188021, 7704),
(6188144, 7705),
(6188030, 7706),
(6188044, 7707),
(6188023, 7708),
(6188003, 7709);

INSERT INTO CheckAttendence (Student_ID, Attend_Week, Attend_Day, Attend_Status)
VALUES (6188077, 1, '2021-01-10', 'Present'),
(6188135, 1, '2021-01-10', 'Present'),
(6188104, 2, '2021-01-10', 'Late'),
(6188065, 3, '2021-01-10', 'Present'),
(6188021, 4, '2021-01-10', 'Absent'),
(6188044, 1, '2021-01-10', 'Late'),
(6188030, 2, '2021-01-10', 'Present'),
(6188044, 3, '2021-01-10', 'Present'),
(6188023, 4, '2021-01-10', 'Absent'),
(6188003, 1, '2021-01-10', 'Excused');

 

 

