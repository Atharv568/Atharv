import java.util.*;
class replacingString {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the String : ");
        String name= sc.next();
        
        String name2 = name.replace('e', 'i');
        System.out.print("The changed String is : ");
        System.out.println(name2);
        System.out.print("The letter is Changed");
   sc.close();
    }


}
