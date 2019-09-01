class Test{
public static void main(String[] arg)
{
System.out.println("main started");
new Test().m1();
System.out.println("main() eand");
}
public void m1();
m2();
System.out.println("m1() eand");
public void m2()
{
System.out.println("m2() started");
int x=10/0;
System.out.println("m2()end");
}
}