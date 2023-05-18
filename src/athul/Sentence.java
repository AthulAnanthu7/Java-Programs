package athul;
import java.util.Scanner;

public class Sentence {
public void count1() {
	
	Scanner sc= new Scanner(System.in);
	//String s="How are you";
	String s=sc.nextLine();
	 char tofind=sc.nextLine().charAt(0);
		int count1=0;
		
for(int i=0; i<s.length(); i++) {
	if(s.charAt(i)==tofind) {
		count1++;
	}	
}
System.out.println(count1);		
 }	
	public void count2() {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		int count2=0;
		for(int i=0; i<s.length(); i++) {
			if(char(s.charAt(i)));
			count2++;
		
		}
		
	}
public static void main(String args[]) {	
Sentence d1= new Sentence();
d1.count1();
}
}