public class placeTiles {
    public static int placeTile(int n, int m){
       if(n==m){
          return 2;
       }
       if(n<m){
        return 1;
       }
       //verticallyplaced
       int vertPlacemnets= placeTile(n-m, m);
       //horizontalPlaced
       int hortPlacements= placeTile(n-1, m);
       return vertPlacemnets + hortPlacements;
    }
    public static void main (String args[]){
        int n= 4, m=3;
        System.out.println(placeTile(n, m));
    }
}
