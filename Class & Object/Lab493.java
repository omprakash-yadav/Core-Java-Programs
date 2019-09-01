class Lab493{
    public static void main(String[] arg){
      char cArr[]={'J','L','C','I','N','D','I','A'};
      char bArr[]={65,66,67,97,98,99,49,50};
      String str1=new String(cArr,3,1);
      String str2=new String(bArr,3,4);
      System.out.println("str1:"+str1);
      System.out.println("str2:"+str2);  
    }
}