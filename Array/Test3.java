class Test3{
//static int arr[];
//static String names[];

public static void main(String[] arg){
int arr[];
arr=new int[3];

System.out.println(arr[0]);
System.out.println(arr[1]);
System.out.println(arr[2]);
System.out.println();
arr[0]=10;
arr[1]=11;
arr[2]=12;
for(int i=0; i<arr.length; i++)
System.out.println(arr[0]);
}
}