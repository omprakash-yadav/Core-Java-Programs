class Lab296{
public static void main(String[] arg)
{
Hello h=new  Hello();
int a= h.add(10,20);
System.out.println(a);
h.add(100,20);
}
}
class Hello{
int add(int a,int b){
System.out.println("add(int,int)");
return a+b;
}
//void add(int a,int b){
//System.out.println("add(int,int)");
//}
}
