class Lab477{
    public static void main(String[] arg){
        String str="JLC";
        String str1=str.trim();
        System.out.println(str+"\n"+str1);
        System.out.println(str==str1);
        String str2=" JLC ";
        String str3=str2.trim();
        System.out.println(str2+"\t"+str3);
        System.out.println(str2==str3);
        System.out.println(str2+"\t"+str2.length());
        System.out.println(str3+"\t"+str3.length());

    }
    
}