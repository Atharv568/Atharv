import java.util.*;
public class reverseString {
    public static void reverseString(String name, int i){
        if(i<0){
            return;
        }
        System.out.print(name.charAt(i));
        reverseString(name, i-1);

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name=sc.next();
        reverseString(name, name.length()-1);
        sc.close();
    }
}
