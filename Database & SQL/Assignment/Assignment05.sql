--Teekawin Kirdsaeng 6188077 Sec.1
Use NEWS_database;

--Question 1: How to show catagory news for each author?
SELECT a.Author_Firstname + ' ' + a.Author_Lastname as Author_Fullname,
c.Category_Name
FROM Author a 
LEFT JOIN News n ON a.Author_ID = n.Author_ID
LEFT JOIN Category c ON n.Category_ID = c.Category_ID
GROUP BY a.Author_Firstname + ' ' + a.Author_Lastname, c.Category_Name;


--Question 2: To display the content or comment of news and other information of news such as Title, Category with user name and user ID
SELECT n.Title, 
c.Category_Name, 
cm.Content, 
u.User_Firstname+' '+u.User_Lastname as User_Fullname,
u.Users_ID as Comment_Writer
FROM Comment cm
JOIN News n ON cm.News_ID = n.News_ID
JOIN Category c ON n.Category_ID = c.Category_ID
JOIN Users u ON cm.Users_ID = u.Users_ID;


--Question 3: How to show Title and with the important including Category name, author fullname(Firstname + Lastname),User fullname, comment and news description?
SELECT n.Title, 
c.Category_Name, 
a.Author_Firstname + ' ' + a.Author_Lastname as Author_Fullname,
u.User_Firstname+' '+u.User_Lastname as User_Fullname,
cm.Content as Comment, 
n.News_Description
FROM Comment cm
JOIN News n ON cm.News_ID = n.News_ID
JOIN Author a ON n.Author_ID = a.Author_ID
JOIN Category c ON n.Category_ID = c.Category_ID
JOIN Users u ON cm.Users_ID = u.Users_ID;