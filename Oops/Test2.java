class Test2{
static int x;
int y;
static{
System.out.println("Static Block");
System.out.println(x);
System.out.println(y);
}
public static void main(String[] arg){
System.out.println("Hello main");
//System.out.println(new Test2().y);
//System.out.println(Test2.y);
}
}