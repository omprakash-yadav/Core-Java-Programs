class Lab459{
public static void main(String[] arg){
	String s1=("happy");
	// String s2=("happy");
	String s2=new String("happy");
   String s3=s2.intern();
	System.out.println(s1);
	System.out.println(s2);
	System.out.println(s3);
	System.out.println(s1==s2);
	System.out.println(s1==s3);
    System.out.println(s2==s3);
    String s4="ok";
    String s5="ok".intern();
    System.out.println(s4==s5);
	System.out.println(s1.equals(s2));
	System.out.println(s1.length());
}
} 
