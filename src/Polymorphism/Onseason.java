package Polymorphism;

public class Onseason extends Offseason {
public int discount(int total) {
	return(15*total)/100;
}
public static void main(String args[]) {
	Onseason m=new Onseason();
	Offseason d=new Offseason();
	System.out.println(m.discount(2000));
	System.out.println(d.discount(2000));
			}
}
