class Lab443
{
	public static void main(String[] arg)
	{
		showClassinfo("jlc");
		Student stu=new Student();
		showClassinfo(stu);
		Object obj=new Object();
		showClassinfo(obj);
	}
	static void showClassinfo(Object obj1){
	Class cls = obj1.getClass();
	System.out.println("Class Name:" +cls.getName());
	Class scls=cls.getSuperclass();
	if(scls!=null)
		System.out.println("Super Class:" +scls.getName());
	else
		System.out.println("No Superclass");
	}
}
class Person{
}
class Student extends Person{
}
