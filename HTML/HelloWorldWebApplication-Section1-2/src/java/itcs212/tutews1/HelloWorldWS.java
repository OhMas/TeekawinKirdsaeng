/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itcs212.tutews1;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import java.text.DecimalFormat;

/**
 *
 * @author My Computer
 */
@WebService(serviceName = "HelloWorldWS")
public class HelloWorldWS {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "squareMethod")
    public String squareMethod(@WebParam(name = "number") final int number) {
        //TODO write your implementation code here:
    int result = number*number;
 String strResult = Integer.toString(result);
 return strResult;    

    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "ConvertercmToInch")
    public String ConvertercmToInch(@WebParam(name = "cm") final double cm) {
        //TODO write your implementation code here:
        double result = cm*0.39;
        String Result = Double.toString(result);
        return Result;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "CelsiusToFahrenheit")
    public String CelsiusToFahrenheit(@WebParam(name = "Celsius") final double Celsius) {
        //TODO write your implementation code here:
        double result=Celsius*9/5+32;
        DecimalFormat x = new DecimalFormat("#0.00");
        return x.format(result);
    
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "getMydetail")
    public String getMydetail(@WebParam(name = "StudentID") final String StudentID) {
        //TODO write your implementation code here:
        String FirstName = "Teekawin";
        String LastName = "Kirdsaeng";
        String MobilePhone = "0972055551";
        String Address = "Bangkok";
        if(StudentID.contains("6188077"))
        {
            return FirstName + "," + LastName+","+MobilePhone+","+Address;
        }
        return "Wrong";
 
    }


}

  