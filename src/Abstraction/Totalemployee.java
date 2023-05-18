package Abstraction;

public class Totalemployee extends Employee {
	public void calculatesalary(int hour) {
		
		int payment;
		int paymentperhour = 500;
		payment=(hour*paymentperhour);
		System.out.println(payment);
	}
public static void main(String args[]){
	Employee e=new Contractor();
	e.calculatesalary(8);
	Employee s=new Totalemployee();
	s.calculatesalary(8);
	
}
}
