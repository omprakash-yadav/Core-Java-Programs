class Lab374{
public static void main(String[] arg){
B obj=new B();
obj.show();
obj.SHOW();
}
}
class A{
void show(){
System.out.println("A->show()");
        }
}
class B extends A{
 void SHOW(){
System.out.println("B->SHOW()");
     }
 } 