class Lab376{
public static void main(String[] arg){
B obj=new B();
obj.show();
//obj.show();
}
}
class A{
 C show(){
System.out.println("A->show()");
  return new C();
        }
}
class B extends A{
 D show(){
System.out.println("B->SHOW()");
 return new D();
     }
 } 
class C{}
class D extends C{}