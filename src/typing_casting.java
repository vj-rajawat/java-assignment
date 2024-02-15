public class typing_casting {

    public static void main(String args[]){
        //There are two type of TypeCasting 
        //1. Widening casting -> It convert small type to large type
        int small = 10; // Define small int
        double convert = small; // Convert small into double automatically
        System.out.println(small);
        System.out.println(convert);

        //2. Narrowing casting -> It convert large type to small type
        double large = 11.98; //  Define double variable
        int myInt = (int) large; // Convert double into small Manually
        System.out.println(large);
        System.out.println(myInt);
    }
}
