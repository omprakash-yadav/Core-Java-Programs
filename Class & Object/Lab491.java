class Lab491{
    public static void main (String[] arg){
        String str="JLCINDIA";
        byte chArr[]=str.getBytes();
        System.out.println(chArr[0]);
        System.out.println("**char array**");
        for(int i=0; i<chArr.length; i++){
            byte ch=chArr[i];
          System.out.println(i+"\t"+(char)ch);
            }
    }
    
}