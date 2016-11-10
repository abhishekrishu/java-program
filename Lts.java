class Student8{
   int rollno;
   String name;
   static String college ="LTS";
static String city=" NOIDA Sector 4";
static String state=" Uttar Pradesh";
   
   Student8(int r,String n){
   rollno = r;
   name = n;
   }
 void display (){System.out.println(rollno+"\t"+name+"\t"+college+"\t"
+city+"\t"+state);}

 public static void main(String args[]){
 Student8 s1 = new Student8(10010,"Kapil");
 Student8 s2 = new Student8(20010,"Abhishek");
Student8 s3 = new Student8(30010,"Mohit");
Student8 s4 = new Student8(40010,"Aakanksha");
Student8 s5 = new Student8(50010,"Meenakshi");
 s1.display();
 s2.display();
 s3.display();
 s4.display();
 s5.display();
 }
}
