public class factorialRec {
    public static void factorial(int i,int n,int prd){
        if(i==5){
            prd=i*prd;
            System.out.print(prd);
            return;
        }
        prd=i*prd;
        factorial(i+1,n,prd);
    }
    public static void main(String args[]){
        factorial(1,5,1);
    }
}
