class Testclass4{
     public static void main(String[] arg){
       C c1=new C();
System.out.println(c1.x);
System.out.println(c1.y);
    }
}
class A{
    int x;
 //A(){
//System.out.println("A() constructor");
   //}
A(int a){
  //this.x=a;
System.out.println("A(int) cons");
this.x=a;
       }
}
class C extends A{
     int y=10;
}