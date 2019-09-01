class Test{
void m1(){
System.out.println("Hello.m1()");
}
static void m2(){
System.out.println("Hello.m2()");
}
public static void main(String[] arg){
System.out.println("Hello main()");
Test.m1();
Test.m2();
}
}