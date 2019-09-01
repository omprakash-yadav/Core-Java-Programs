class Classtest{
int x=100;
static int y=20;
static{
       y=30;
       }
      {
      x=200;
       }
Classtest(int a){
x=a;
}
}
class Demo{
public static void main(String[] arg)
{
Classtest t1=new Classtest(300);
}
}