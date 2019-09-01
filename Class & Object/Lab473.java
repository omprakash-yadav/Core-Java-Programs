class Lab473{
    public static void main(String[] arg){
        Sttudent stu=new Sttudent();
        String st1=String.valueOf(stu);
        System.out.println(st1);
        Employee em=new Employee();
        String st2=String.valueOf(em);//valueOf-returne the String representation of the object
        System.out.println(st2);
    }   
}
class Sttudent{}
class Employee{
    String eid;
    public String toString(){// toStrint()-returne the current object content.
        return "Eid"+eid;

    }
}