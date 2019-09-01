class Test223{
public static void main(String[] arg)
{
Hello d1=new Hello();
Hello d2=new Hello();
System.out.println(d1.b+"\t"+d2.b);
d1.b=99;
System.out.println(d1.b+"\t"+d2.b);

}}
class Hello{
static int b;
}