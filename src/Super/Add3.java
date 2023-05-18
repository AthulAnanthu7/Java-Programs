package Super;

public class Add3 extends Add{
public void total() {
	super.a1();
	System.out.println("sum");	
}
public static void main(String args[]) {
	Add3 a3= new Add3();
	a3.total();
}
}
