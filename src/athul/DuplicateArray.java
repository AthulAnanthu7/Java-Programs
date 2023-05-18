package athul;
import java.util.Scanner; 

public class DuplicateArray {
public static void main(String args[]) {
	int ar[]= {1,2,5,5,6};
	System.out.println("Enter number to check");
	Scanner s= new Scanner(System.in);
	int c=s.nextInt();
	int count=0;
	for(int i=0; i<ar.length; i++ ){
	if(ar[i]==c) {
		count++;
		continue;	
	}
	}
	if(count>1) {
		System.out.println("Duplicate element");
	}else {
		System.out.println("Not Duplicate element");
	}
}
}
