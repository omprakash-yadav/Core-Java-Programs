class Test5{
public static void main(String[] ars){

System.out.println();
Student s1=new Student();
Student s2=new Student();
Student s3=new Student();

System.out.println(s1.Sname+" "+s1.roll+" "+s1.clg);
System.out.println(s2.Sname+" "+s2.roll+" "+s2.clg);
System.out.println(s3.Sname+" "+s3.roll+" "+s3.clg);
}
}
class Student{
String Sname;
int roll;
static String clg="jlc";
}