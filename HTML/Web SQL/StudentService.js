DB_user="OhMaz"
DB_pass="10114234492"
DB_name="itcs212[sec16188077]"
host="localhost"

const express = require('express');
const route = express()
const PORT = 3000;

var mysql = require('mysql');
var dbConn=mysql.createConnection({
    host:host,
    user:DB_user,
    password:DB_pass,
    database:DB_name
});

dbConn.connect();

var cors=require('cors');
route.use(cors());

route.post('/personal_info/:id/:firstname/:lastname/:dob/:mobilephone',function(req,res){
    let id =req.params.id,firstname =req.params.firstname,lastname =req.params.lastname,dob =req.params.dob,mobilephone =req.params.mobilephone;
    if(!id){
        return res.status(400).send({error:true,message:'Please provide student id'});
    }
    dbConn.query("INSERT INTO personal_info SET StudentID=?,Firstname=?,Lastname=?,DOB=?,Mobilephone=?",[id,firstname,lastname,dob,mobilephone],function(error,results){
        if(error)throw error;
        return res.send({error:false,data:results.affectedRows,message:'New student has been created successfully.'});
    });
});

route.put('/personal_info/:id/:firstname/:lastname/:dob/:mobilephone',function(req,res){
    let id =req.params.id,firstname =req.params.firstname,lastname =req.params.lastname,dob =req.params.dob,mobilephone =req.params.mobilephone;
    if(!id){
        return res.status(400).send({error:student,message:'Please provide student id'});
    }
    dbConn.query("UPDATE personal_info SET Firstname=?,Lastname=?,DOB=?,Mobilephone=? WHERE StudentID = ?",[firstname,lastname,dob,mobilephone,id],function(error,results){
        if(error)throw error;
        return res.send({error:false,data:results.affectedRows,message:'Student has been updated successfully.'});
    });
});

route.delete('/personal_info/:id',function(req,res){
    let id =req.params.id
    if(!id){
        return res.status(400).send({error:true,message:'Please provide student id'});
    }
    dbConn.query('DELETE FROM personal_info WHERE StudentID = ?',[id],function(error,results){
        if(error)throw error;
        return res.send({error:false,data:results.affectedRows,message:'Student has been deleted successfully.'});
    });
});

route.get('/personal_info/:id',function(req,res){
    let student_id=req.params.id;
    if(!student_id){
        return res.status(400).send({error:true,message:'Please provide student id.'});
    }
    dbConn.query('SELECT * FROM personal_info where StudentID = ?',student_id,function(error,results){
        if(error)throw error;
        return res.send({error:false,data:results[0],message:'Student retrieved'});
    });
});

route.get('/personal_info',function(req,res){
    dbConn.query('SELECT * FROM personal_info',function(error,results){
        if(error)throw error;
        return res.send({error:false,data:results,message:'Student list.'});
    });
});

route.listen(PORT, () => console.log(`Express server currently running on port ${PORT}`));