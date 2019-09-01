class Primenumbers{
    public static void main(String[] arg){
        int startPoint=1;
        int finalsPoint=100;
        for(int x=startPoint;x<=100;x++){
            boolean isPrimenumber=true;
            for(int i=2; i<x;i++){
                if(x%i==0)
                isPrimenumber=false;
                break;
            } 
            if(isPrimenumber==true){
            System.out.print(x + " ");
            }
        }
    }
}