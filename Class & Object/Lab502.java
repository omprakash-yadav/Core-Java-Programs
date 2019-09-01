class Lab502{
    public static void main(String[] arg){
        String str1="AB";
        String str2=new String("AB");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str1==str2);

    }
    
}