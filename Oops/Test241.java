class Test241{
public static void main(String[] arg){
Hello h=new Hello();
System.out.println("main:"+Hello.a);
}
}
class Hello{
static int a;
{
a=20;
System.out.println("initialized:"+a);

}
}  