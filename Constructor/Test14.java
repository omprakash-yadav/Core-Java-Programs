class Test{
public static void main(String[] arg)
{
Student s1=new Student("omprakash",100,80,7764);
//s1.Student();
//Student s2=new Student()
System.out.println(s1.name+" "+s1.roll+" "+s1.res+" "+s1.mob);
}
}
class Student
{
String name;
int roll;
int res;
long mob;
	Student(){
System.out.println("constructor");
}

	Student(String n,int ro,int re,long mo){
System.out.println("constructor string int long");
name=n;
roll=ro;
res=re;
mob=mo;
}
}

	