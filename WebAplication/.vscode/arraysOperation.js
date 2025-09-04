var num1=[10,20,30,40,50,3,5,7,9];  // literal style array declaration and initialization
var num2 = new Array(10,20,30,40,50);  // constructor style array declaration and initialization
document.writeln("num1: " + num1 + "<br>"); // by default separated by comma and consider as string 
document.writeln("num1: " + num1.join(" ")+ "<br>");
num1.push(60); // add element at the end of array
num1.unshift(5); // add element at the beginning of array
document.writeln("num1: " + num1.join(" ")+ "<br>");
num1.pop(); // remove last element of array
num1.shift(); // remove first element of array
document.writeln("num1: " + num1.join(" ")+ "<br>");
document.writeln("<br/> Get element from array one by one<br/>")
for(var i=0;i<num1.length;i++){
    document.writeln("num1["+i+"] = " + num1[i] + "<br>");
}
document.writeln("<br/> For of of loop<br/>");
for(var n of num1){
    document.writeln("num1: " + n + "<br>");
}
document.writeln("<br/> For for each function<br/>");
num1.forEach(ele=>document.writeln("num1: " + ele + "<br>"));
document.writeln("<br/> Array filter method<br/>");
num1.filter(ele=>ele%2==0).forEach(ele=>document.writeln("Even number: " + ele + "<br>"));