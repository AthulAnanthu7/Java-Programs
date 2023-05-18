package Aggregation;
import java.util.Scanner;
public class Employee1 {
	int basicpay, deduction,bonus;
	
public void getsalarydetails() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter the basicpay of employee:");
	basicpay=sc.nextInt();
    System.out.println("Enter the deduction amount:");
    deduction=sc.nextInt();
    System.out.println("Enter the bonus amount: ");
    bonus=sc.nextInt();
   
    
}
}
