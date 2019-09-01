class Lab298{
public static void main(String[] arg)
{
Hello h=new  Hello();
String a= h.add(10,"jlc");
System.out.println(a);
String b= h.add("jlc",30);
System.out.println(b);
}
}
class Hello{
String add(int a,String b){
System.out.println("add(int,string)");
return a+b;
}
String add(String a,int b){
System.out.println("add(String,int)");
return a+b;
}
}
