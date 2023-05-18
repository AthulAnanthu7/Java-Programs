package Inheritence2;

public class Salary2 extends Salary{
	int hra, pf;
	public int hra() {
		
		hra=(5*basicpay)/100;
		System.out.println("hra= " + hra);
		return hra;
	}
	public int pf() {
		pf=(20*basicpay)/100;
		System.out.println("pf= " + pf);
		return pf;
	}
	}



