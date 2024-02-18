public class MemoryAllo2D {
    public static void main(String args[]){
        int[][] arr2D = {{1,2,3,4},{9,8,5,4}}; // Contigious memory allocation in java of 2D array
        // System.out.println(arr2D.length);
        for(int i=0; i<arr2D.length; i++){
            for(int j=0; j<arr2D[i].length; j++){
                System.out.print(arr2D[i][j] + " ");
            }
            
            System.out.println();
        }
        // System.out.println(arr2D[1][1]);
    }
}
