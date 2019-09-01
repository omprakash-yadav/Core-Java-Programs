class ClasTest2{
public static void main(String[] arg)
{
System.out.println("main() start");
new Demo().read();
Demo.write();
//new Demo().read();
System.out.println("main() Eand");
}
}
class Demo{
void read(){
System.out.println("read()");
write();
}
static void write(){
System.out.println("write()");
}
}