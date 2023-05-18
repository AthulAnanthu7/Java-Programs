package athul;

public class program {
	public static void main(String args[]) {
		String s="How are you";
		char tofind='o';
		int count=0;
		for(int i=0; i<s.length(); i++) {
			
			if(s.charAt(i)==tofind) {
				count++;
			}
		}
	System.out.println(count);
	}
	}
