class Om{

public static void main(String[] arg){
//public int x=10;	
B ob=new B();
ob.m1();
ob.m2();
}
}
class A{
protected int x=10;

  void m1(){

 }
}
class B extends A{
void m2(){

System.out.println(x);
}
}