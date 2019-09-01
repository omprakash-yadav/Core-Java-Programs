class Lab461{
    public static void main(String[] arg){
        String st1="JLCINDIA";
        String st2="JLC"+"INDIA";
       final String st3="JLC";
       final String st4="INDIA";
        String st5=st3+st4;
        // String st5="Jlc"+st2;
       // System.out.println(st3+"\t"+st4+"\t"+st5);
        System.out.println(st1==st2);
        System.out.println(st1==st5);
        System.out.println(st2==st5);
        System.out.println(st5);
    }
}