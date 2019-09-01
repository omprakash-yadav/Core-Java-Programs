class Test implements Cloneable
{
	int x;
	public static void main(String[] arg)
	{
		Test t1=new Test(100);
		Test t2=null;
		try{
			 t2=(Test)t1.clone();
		}
		catch(Exception e)
		{
	
			System.out.println(e);
		}
		System.out.println(t1+" "+t2);
		t1.x=50;
		System.out.println(t1+" "+t2);
		 	
	}
	
	Test(int a)
	{
		this.x=a;
	}
	
	public String toString(){
		return (x+"");
	}
}

	
		