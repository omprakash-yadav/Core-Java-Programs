class Testclass{
	public static void main(String[] arg){
		A a1=new A();
		System.out.println(a1.x);
		a1.x=100;
		System.out.println(a1.x);
		a1.m1();

		 System.out.println(a1.y);
		 a1.y=300;
		 System.out.println(a1.y);
		 a1.m2();
	}
}

class B{
	int x=10;
	void m1()
	{
		System.out.println("A->m1()");
	}
}

class A extends B{
	int y=20;
	void m2()
	{
		System.out.println("B ->m2()");
	}
}