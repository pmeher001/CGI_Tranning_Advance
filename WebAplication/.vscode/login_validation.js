function validation() {
   // alert("Validation function called");
   var emailId = document.getElementById("emailid").value;
   var password = document.getElementById("password").value;
   if(emailId.length==0){
    //alert("Emailid required")
    document.getElementById("error").innerHTML = "EmailId is required";
     return false;
   }else if(password.length==0){
    //alert("password is required")
     document.getElementById("error").innerHTML = "Password is required";
     return false;
   }else if(emailId=="akash@gmail.com" && password=="abc@123"){
    //alert("successfully login")
     document.getElementById("error").innerHTML = "successfully login";
    return true;
   }else {
    //alert("EmaiId or password is wrong")
     document.getElementById("error").innerHTML = "EmailId or Password is wrong";
    return false;
   }
   
}