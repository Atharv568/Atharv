import java.util.Scanner;

public class powerOfxlogn {
    public static int powerX(int x, int n){
        if (x==0){
            return 0;
        }
        if (n==0){
            return 1;
        }
        if(n%2==0){
            return powerX(x, n/2)*powerX(x, n/2);
          
        }else {
            return powerX(x, n/2)*powerX(x, n/2)*x;
            
        }
    }
    public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter the power: ");
        int n= sc.nextInt();
        System.out.print("Enter the base: ");
        int x= sc.nextInt();
        int ans =powerX(x,n);
        System.out.print(ans);
     sc.close();
    }
}
