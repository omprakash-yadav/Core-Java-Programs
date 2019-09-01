class Lab262{
public static void main(String[] arg)
{
Student s1=new Student(99,"shirinivasan");
//s1.sid=99;s1.name="omprakash";
s1.show();
Student s2=new Student(100,"deepak");
s2.show();
}
}
class Student{
int sid;
String name;
Student(int id,String n){
System.out.println("student two argument  constructor");
sid=id;
name=n;
}
void show(){
System.out.println(sid+"\t"+name);
}
}