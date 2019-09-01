class Demo1{
public static void main(String[] arg){
Student s1= new Student();
//s1.Student();

}
}
class Student{
    String name;
    String rol; 
     int mark;
   Student()
        {
 System.out.println("int argument constructor");
}
Student(){
   System.out.println("no argument constructor");

  }
}