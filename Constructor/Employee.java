class Employee{
	int empid;
	String empName;
	Employee(int id,String n){
		this.empid=id;
		this.empName=n;
	}
	void info(){
		System.out.println("id:"+empid+"name:"+empName);
			}
public static void main(String[] arg){
	Employee obj=new Employee(1233,"mohan");
	Employee obj1=new Employee(1213,"omprakash");
	Employee obj2 = new obj1;
	obj.info();
	obj1.info();

}
}

	