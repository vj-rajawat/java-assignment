import java.util.Scanner;
class Employee {
    int emp_code;
    String name, email;
    long phone;

}
public class Emply_data {
    
    public static void main(String args[]){
        // String name, email;
        // int employe_code, phone;
        Employee emp[] = new Employee[5];
        for(int i=0; i<5; i++){
            emp[i] = new Employee();
            Scanner Sc = new Scanner(System.in);
            System.out.println("Enter employe name");
            emp[i]. name = Sc.nextLine();
            System.out.println("Enter email");
            emp[i]. email = Sc.nextLine();
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("Enter employe code");
            emp[i]. emp_code = inputScanner.nextInt();
            System.out.println("Enter phone");
            emp[i]. phone = inputScanner.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("Name:" +emp[i].name +" " + "Email:" +emp[i].email +" "+ "Code: " +emp[i].emp_code +" " + "Phone: "+emp[i].phone +"\n\n");
        }
        // System.out.println("vijay is back in new avtar");
        
    }
}
