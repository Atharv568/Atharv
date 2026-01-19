public class keypadComb {
    public static String [] keypad= {".","abc", "def", "ghi", "mno", "pqrs", "tu", "vwx", "yz"};
    
    public static void printComb(String str, int i, String combination){
        if(i==str.length()){
            System.out.println(combination);
            return;
        }
        char currChar = str.charAt(i);
        String mapping = keypad[currChar - '0'];

        for(int j= 0; j<mapping.length(); j++){
            printComb(str, i+1, combination+mapping.charAt(j));
        }
    }   
    public static void main(String args[]){
        String str ="23";
        printComb(str, 0, "");
    } 
}
