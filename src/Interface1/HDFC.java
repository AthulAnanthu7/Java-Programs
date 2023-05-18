package Interface1;

public class HDFC implements RBI{

	@Override
	public void getdetails(int amount, int duration) {
		// TODO Auto-generated method stub
		int totalamount;
		totalamount=amount+((amount*duration*100)/100);
		System.out.println(totalamount);
	}
public static void main(String args[]) {
	RBI b= new HDFC();
	b.getdetails(5000, 10);
}

	 
	}


