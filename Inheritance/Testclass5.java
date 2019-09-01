class Testclass5{
       public static void main(String... arg){
     C c1=new C();
      c1.show();

}
}
class A{
    int x=10;
      void m1(){
             this
     System.out.println("A-->m1()");
                }
}
class B extends A{
      int y=20;
         void m2(){
                this.y;
              System.out.println("B-->m2()");
                 }
}
class C extends B{
int z=30;
 void show(){
   int x=100;int y=200;int z=300;
       System.out.println(x);
          System.out.println(y);
             System.out.println(z);
        System.out.println(this.x);
          System.out.println(this.y);
             System.out.println(this.z);
}
}