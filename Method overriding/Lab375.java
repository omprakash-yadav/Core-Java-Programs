class Lab374{
public static void main(String[] arg){
B obj=new B();
obj.show(99);
obj.show("jlc");
}
}
class A{
void show(int ab){
System.out.println("A->show()");
        }
}
class B extends A{
 void show(String ab){
System.out.println("B->SHOW()");
     }
 } 