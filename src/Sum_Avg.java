import java.util.Scanner;

public class Sum_Avg {
    int total;

    public int calculation() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter no. of element in array");
        int array = input.nextInt();
        total = array;
        System.out.println("Enter any" + " " + array + " " + "elements of array");
        int[] sum = new int[array];
        int add = 0;
        for (int i = 0; i < array; i++) {
            sum[i] = input.nextInt();
            add += sum[i];

        }
        return add;
    }

    public int sum() {
        int sum = calculation();
        return sum;
    }

    public float avg() {
        float avg = calculation();
        return (avg / total);
    }

    public static void main(String args[]) {

        // Create object of class
        Sum_Avg obj = new Sum_Avg();
        int sum = obj.sum();
        System.out.println("Sum of two numbers are \t" + sum);
        System.out.println("\n Now for average");

        float avg = obj.avg();
        System.out.printf("Average of two number:%.2f", avg);
    }
}
