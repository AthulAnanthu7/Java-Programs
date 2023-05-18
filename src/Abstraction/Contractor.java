package Abstraction;

public class Contractor extends Employee {
	public void calculatesalary(int hour) {
		int payment;
		int paymentperhour = 500;
		payment = (hour * paymentperhour);
		System.out.println(payment);
	}
}
