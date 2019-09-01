class Lab495{
    public static void main(String[] arg){
        String str="JLC,java Welcome to JLC, java Training center, java No 1 in Training and java Plecement";
        String res[]=str.split("java",7);
        System.out.println("length:"+res.length);
        for(int i=0;i<res.length;i++){
            String st=res[i];
            System.out.println(i+"\t"+st);
        }

    }
    
}