class Lab373{
public static void main(String[] arg){
Hello a=new Hai();
a.m1();
a.m2();
}
}
class Hello{
 void m1(){
System.out.println("Hello->m1()");
}
 static void m2(){
System.out.println("Hello->m2()");
}

}
class Hai extends Hello{
  static void m2()
{
System.out.println("Hai->mStatic()");
}
 void m1(){
System.out.println("Hai->m3()");
}  
}
