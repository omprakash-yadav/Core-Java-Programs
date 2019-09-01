class Lab260{
public static void main(String[] arg)
{
Student s1=new Student();
s1.sid=99;s1.name="omprakash";
s1.show();
Student s2=new Student();
s2.show();
}
}
class Student{
int sid;
String name;
Student(){
System.out.println("stedent defoult constructor");
}
void show(){
System.out.println(sid+"\t"+name);
}
}