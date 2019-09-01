class Pelondrom{
    public static void main(String[] arg){
        Operation.reverse("");
        Operation.reverse("welcome hi");


    }
}
class Operation{
    static void reverse(String s1){
        if(s1!=null && s1.isEmpty()!=true){
        String res="";
        int s=0;

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)==' ' || i == s1.length()-1 ){ 
                int e=i-1;
                 for(int j=e; j>=s;j--){
                     res=res+s1.charAt(j);   
                 }
                 s=i;
                 System.out.println(" i:" + i + " e:" + e + " s:" + s + " length:" + s1.length());
            }
        }
        // for(int i=s1.length()-1; i>=3;i--){
        //   res=res+s1.charAt(i);
        // }
        System.out.println("result: " + res);
    }
    
 }
}