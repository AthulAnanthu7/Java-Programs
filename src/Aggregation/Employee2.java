package Aggregation;

public class Employee2 {
	int hra, pf;
public int hra(int basicpay) {
	
	hra=(5*basicpay)/100;
	System.out.println("hra =" + hra);
	return hra;
}
public int pf(int basicpay) {
	pf=(20*basicpay)/100;
	System.out.println("pf= " + pf);
	return pf;
}
}
