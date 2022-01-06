
var name=prompt("Enter your name");
var rollno=+prompt("Enter Roll No");
var age=+prompt("Enter Age");
var institute=prompt("Enter Institute Name");
var marks1=+prompt("Enter Marks of English");
var marks2=+prompt("Enter Marks of Maths");
var marks3=+prompt("Enter Marks of Physics");
var marks4=+prompt("Enter Marks of Computer");
var marks5=+prompt("Enter Marks of Chemistry");


var a=document.getElementById("name");
a.innerHTML=name;

var b=document.getElementById("rollno");
b.innerHTML="Roll No: "+rollno;

var c=document.getElementById("age");
c.innerHTML="Age: "+age;

var d=document.getElementById("institute");
d.innerHTML=institute;

console.log(a);
console.log(b);
console.log(c);
console.log(d);


var e=document.getElementById("marksenglish");
e.innerHTML=marks1;

var f=document.getElementById("marksmaths");
f.innerHTML=marks2;

var g=document.getElementById("marksphysics");
g.innerHTML=marks3;

var h=document.getElementById("markscomputer");
h.innerHTML=marks4;


var i=document.getElementById("markschemistry");
i.innerHTML=marks5;



var j=document.getElementById("percentage");
j.innerHTML="Percentage: "+(((marks1+marks2+marks3+marks4+marks5)/500)*100)+"%";


var x=(((marks1+marks2+marks3+marks4+marks5)/500)*100);

if(x>=80 && x<=100){
    var k=document.getElementById("grade")
    k.innerHTML="Grade: A+"; 
}

else if(x>=70 && x<=79){
      var k=document.getElementById("grade")
    k.innerHTML="Grade: A"; 
}

else if(x>=60 && x<=69){
      var k=document.getElementById("grade")
    k.innerHTML="Grade: B"; 
}

else if(x>=50 && x<=59){
      var k=document.getElementById("grade")
    k.innerHTML="Grade: C"; 
}

else if(x>=0 && x<=59){
      var k=document.getElementById("grade")
    k.innerHTML="Grade: F"; 
}
