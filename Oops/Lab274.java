class Lab274{
public static void main(String[] arg)
{
Hello h=null;
//h.show();
h=new Hello();
h.show();
Hello.show();

}
}
class Hello{
static void show(){
System.out.println("instance show");
}
}