package Inheritence;

public class Add2 extends Add1{
 void checkDivisibily() {
	 int res= m1();
	if(res%10==0) {
		System.out.println("It is divisible by 10");
	}
	else {
		System.out.println("It is not divisible by 10");
	}
 }
 public static void main(String args[]) {
	 Add2 d1=new Add2();
	 d1.checkDivisibily();
 }
}
