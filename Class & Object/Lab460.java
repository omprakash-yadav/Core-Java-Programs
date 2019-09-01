import java.util.Scanner;
class Lab460{
    public static void main(String[] arg){
        String st1="JLC";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter jlc String");
        String st3=sc.nextLine();
        System.out.println("Re enter jlc String");
        String St4=sc.nextLine();
        String st5=st3.intern();
        String st6=st4.intern();
        System.out.println(st3==st4);
        System.out.println(st5==st6);
        System.out.println(st1==st5);
        System.out.println(st1);
        System.out.println(st3);
        System.out.println(st4);

        
    }
}