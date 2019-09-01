class Lab490{
    public static void main(String[] arg){
        String str="JLCINDI";
        int len=str.length();
        System.out.println(str);
        System.out.println(str.charAt(0));
        System.out.println(".................");
        System.out.println(str.charAt(3));
        System.out.println(".................");
        System.out.println(str.charAt(4));
        System.out.println(".................");
        System.out.println();
        for(int i=0;i<len;i++)
        {
            System.out.println(i+"\t"+str.charAt(i));
        }

        
    }
}