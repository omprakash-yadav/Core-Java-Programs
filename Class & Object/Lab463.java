class Lab463{
    public static void main(String[] arg){
        // String st1="JLCINDIA";
        // String st2="JLC"+"INDIA";
         String st1="JLC99";
         String st2="JLC";
         int ab=99;
        String st3=st2+ab;
        String st4="JLC"+99;
        // String st5="Jlc"+st2;
       // System.out.println(st3+"\t"+st4+"\t"+st5);
        System.out.println(st1==st3);
        System.out.println(st1==st4);
        System.out.println(st3==st4);
        System.out.println(st1);
        System.out.println(st2);
        System.out.println(st3);
    }
}