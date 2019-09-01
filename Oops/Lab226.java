class Test6{
static int c=50;
public static void main(String[] arg)
{
System.out.println(Demo.a);
System.out.println(new Demo().a);
Demo d1=null;
System.out.println(d1.a);
Demo d2= new Demo();
System.out.println(d2.a);
System.out.println(c); 
}
}
class Demo{
static int a=20;
}