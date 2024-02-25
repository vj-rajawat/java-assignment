public class DuplicateArrayValue {
    public static void main(String args[]) {
        int[] sorted_array = { 1, 2, 2, 3, 4, 5, 6, 6, 7, 7, 9, 9 };
        int value = 0;
        int length = 0;

        for (int i = 0; i < sorted_array.length; i++) {

            if (value == sorted_array[i]) {
                int remove = sorted_array[i] - sorted_array[i];
                // System.out.println("Duplicate value:" +sorted_array[i]);
            } else {
                
                System.out.println(sorted_array[i]);
                length++;
            }
            
            value = sorted_array[i];

        }
        System.out.println("New array length:" + " " + length);
    }
}
