public class CheckSorteing {
    static boolean flag =false;
    public static void checkSorting(int arr[], int i){
    if(i==arr.length-1){
        if(flag){
            System.out.print("Array is not sorted ");
        } else {
            System.out.print("Array is sorted");
        }
        return;
    }
    if(arr[i]>arr[i+1]){
       flag =true;      
    }
    checkSorting(arr, i+1);
 }  
  public static void main(String args[]){
  int arr []= {1,2,3,6,5};
  checkSorting(arr, 0);
 }
}
