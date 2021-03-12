function doIt()
{ // Variables for HTML element DOM references.
    var num1Ref, num2Ref, num3Ref, answerRef; 
    
    // Variables declarations.
    var num1, num2, answer; 
    
    // Get references to DOM elements.
    num1Ref = document.getElementById("num1");
    num2Ref = document.getElementById("num2");
    num3Ref = document.getElementById("num3");

    answerRef = document.getElementById("answer");
    evenoroddRef = document.getElementById("evenorodd")
    // Convert strings to numbers, e.g., "21" to 21.
    num1 = Number(num1Ref.value);
    num2 = Number(num2Ref.value);
    num3 = Number(num3Ref.value);
    
    // Perform addition operation then assignment operation
    answer = num1 + num2 + num3; 

    //check if answer is even or odd
    let evenoroddString = "";
    if(answer %2 ==0) {
        evenoroddString = "(even)";
        evenoroddRef.className = "even";
    }
    else {
        evenoroddString = "(odd)";
        evenoroddRef.className = "odd";
    }
    // Update the "evenorodd" label DOM to show the result using "innerText" property
    evenoroddRef.innerText = evenoroddString;
    // Update "answer" label DOM to show result using "innerText" property. innerText is a property of label tag.
    answerRef.innerText = answer;
    
    if (answer >= 0)
    {
        // Value of answer is positive.
        // Set the class of the answer label to "positive".
        answerRef.className = "positive";
    }
    else
    {
        // Value of answer is not positive, i.e., negative.
        // Set the class of the answer label to "negative".
        answerRef.className = "negative";
    }
}
   

function doMinus(){
    // Variables for HTML element DOM references.
    var num4Ref, num5Ref, num6Ref, answer2Ref; 
    
    // Variables declarations.
    var num1, num2, answer2; 
    
    // Get references to DOM elements.
    num4Ref = document.getElementById("num4");
    num5Ref = document.getElementById("num5");
    num6Ref = document.getElementById("num6");

    answer2Ref = document.getElementById("answer2");
    evenorodd2Ref = document.getElementById("evenorodd2")
    // Convert strings to numbers, e.g., "21" to 21.
    num4 = Number(num4Ref.value);
    num5 = Number(num5Ref.value);
    num6 = Number(num6Ref.value);
    
    // Perform addition operation then assignment operation
    answer = num4 - num5 - num6; 

    //check if answer is even or odd
    let evenoroddString = "";
    if(answer %2 ==0) {
        evenoroddString = "(even)";
        evenorodd2Ref.className = "even";
    }
    else {
        evenoroddString = "(odd)";
        evenorodd2Ref.className = "odd";
    }
    // Update the "evenorodd" label DOM to show the result using "innerText" property
    evenorodd2Ref.innerText = evenoroddString;
    // Update "answer" label DOM to show result using "innerText" property. innerText is a property of label tag.
    answer2Ref.innerText = answer;
    
    if (answer >= 0)
    {
        // Value of answer is positive.
        // Set the class of the answer label to "positive".
        answer2Ref.className = "positive";
    }
    else
    {
        // Value of answer is not positive, i.e., negative.
        // Set the class of the answer label to "negative".
        answer2Ref.className = "negative";
    }
}