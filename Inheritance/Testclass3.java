class Testclass3{
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
static int s=5;
      {
  System.out.println("A-->instance block");
      }
 static{
 System.out.println("A-->static block");
 System.out.println(s);
         } 

	void m1()
	   {
	System.out.println("A->m1()");
	    }
   }

class B extends A{
	int y=20;
 static int s1=6; 
        {
     System.out.println("B-->instance block");
        }
 static{
  System.out.println("B-->static block");
  System.out.println(s1);
      }
	void m2()
	     {
	System.out.println("B ->m2()");
	      }
  }

class C extends B{
	int z=30;
 static int s2=7;
           {
    System.out.println("C-->instance Block");
             }
 static{
   System.out.println("C-->static block");
 System.out.println(s2);
       }
	void m3()
	{
   System.out.println("C->m3()");
	}
}

