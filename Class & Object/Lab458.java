class Lab458{
public static void main(String[] arg){
	String s1=("happy");
	String s2=new String("happy");
	String s3=new String("happy");
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s1==s2);
	System.out.println(s1==s3);
    System.out.println(s2==s3);
	System.out.println(s1.equals(s2));
	System.out.println(s1.length());
}
} 
