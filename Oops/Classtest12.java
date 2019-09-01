class Classtest12
{
static long fact=1;
public static void main(String... arg)
{
long r=factorial(5);
System.out.println("factorial is:"+r);
}
static long factorial(int a){
if(a>=1)
{
return fact=a*factorial(--a);
}
else
{
return=1;
}
}
}