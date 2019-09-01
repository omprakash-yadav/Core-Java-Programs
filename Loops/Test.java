class Test3
{
public static void main(String[]args)
{
int n=5;
for(int row=1; row>=n; row--)
{
for(int sp=1; sp<=n-row;sp++)
{
System.out.print(" ");
}
for(int st=1;st<=(2*row)-1;st++)
{
System.out.print("*");
}
System.out.println( );
}
}
}