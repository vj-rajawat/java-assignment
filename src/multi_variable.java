public class multi_variable {
    static int a = 10; // Static variable
    int b = 20;
    public static void main(String args[]){
         int c = 30;
         multi_variable obj = new multi_variable();
         System.out.println(c); // Print local variable
         System.out.println(multi_variable.a); // Call static variable inside the class
         System.out.println(obj.b); // Print instance variable inside the call
    }
}
