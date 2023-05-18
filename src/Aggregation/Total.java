package Aggregation;

public class Total {
public void totalsalary() {
	Employee1 t1 = new Employee1();
	t1.getsalarydetails();
	Employee2 t2 = new Employee2();
	t2.hra(t1.basicpay);
	t2.pf(t1.basicpay);
	int total=((t1.basicpay)+(t2.hra)-(t2.pf)-(t1.deduction)+(t1.bonus));
	System.out.println("Total Salary = " + total);
}
public static void main(String args[]) {
	Total t3= new Total();
	
	t3.totalsalary();
	
}
}
