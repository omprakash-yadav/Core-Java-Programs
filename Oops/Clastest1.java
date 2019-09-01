class Clastest1{
static int x;
int y;
static{
System.out.println("static block");
x=10;
System.out.println(x);
}
public static void main(String[] arg)
{
System.out.println("Hello main()");
System.out.println(x);
}
}
