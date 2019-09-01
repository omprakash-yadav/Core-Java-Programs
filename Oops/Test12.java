class Test12
{
void m1(){
System.out.println("hello m1()");
}
static void m2(){
System.out.println("Hello m2()");
}
public static void main(String[] arg)
{
System.out.println("Hello main()");
new Test12().m1();
new Test12().m2();
//System.out.println(t.main());
}}