class Test2
{
	public static void main(String[] arg)
	{
		B b1 = new B();
		Class refb = b1.getClass();
		System.out.println(refb.getName());
		A a1 = new A();
		Class refa = a1.getClass();
		System.out.println(refa.getName());
	}
}
interface inter1
{
}
class A implements inter1{
}
class B extends A{
}