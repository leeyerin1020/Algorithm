package Unit5;
import java.util.Scanner;
public class cotest5_1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str= scanner.next();
		
		String answer="YES";
		if(str.charAt(0)==')'|| str.charAt(str.length()-1)=='(') {
			answer="NO";
		}
		int num=0, num2=0;
		
		for(char x: str.toCharArray()) {
				if(x=='(') num++;
				else num2++;
		}
		
		if(num!=num2) {answer="NO";}
		System.out.println(answer);
		
	
	}

}
