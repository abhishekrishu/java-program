class Student3
{
int id;
String name;

void insert(int i,String s){
id=i;
name=s; 
}
void display()
{
System.out.println(id+" "+name);
}

public static void main(String args[]){
Student3 s1=new Student3();
Student3 s2=new Student3();
s1.insert(12,"abhi");
s2.insert(13,"abhishek");
s1.display();
s2.display();
}
}