import java.util.Scanner;

public class ObjArrayMemoryAllo {
    int num; // this variable store in Heap Memory

    public int add(int a, int b) {
        return (a + b);
    } // Addition of this function also store in the Heap Stack

    public static void main(String args[]) {
        Scanner arr = new Scanner(System.in);
        System.out.println("Enter 5 array value");
        int array[] = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = arr.nextInt();
        }
        System.out.println("Your entered value");
        for (int i = 0; i < 5; i++) {
            System.out.println(array[i]);
        }
        System.out.println("your addition value");
        ObjArrayMemoryAllo obj = new ObjArrayMemoryAllo(); // When use this ref variable then the Heap memory variable call
        System.out.println(obj.add(3, 4));
    }
}
