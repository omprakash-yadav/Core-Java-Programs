class Testclass2{
public static void main(String[] arg){
       C c1=new C();
              c1.m1();
              c1.m2();
              c1.m3();
     System.out.println(c1.x);
              System.out.println(c1.y);
                   System.out.println(c1.z);
              
         	}
}

class A{
	int x=10;
      {
  System.out.println("A-->instance block");
      }
	void m1()
	   {
	System.out.println("A->m1()");
	    }
   }

class B extends A{
	int y=20; 
        {
     System.out.println("B-->instance block");
        }
	void m2()
	     {
	System.out.println("B ->m2()");
	      }
  }

class C extends B{
	int z=30;
           {
    System.out.println("C-->instance Block");
             }
	void m3()
	{
   System.out.println("C->m3()");
	}
}

