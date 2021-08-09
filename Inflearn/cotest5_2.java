package Unit5;
import java.util.*;
public class cotest5_2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str= scanner.next();
		ArrayList<Character> answer= new ArrayList<>();
		int num=0;
		for(char x: str.toCharArray()) {
			if(x=='(')num++;
			else if(x==')')num--;
			else {
				if(num==0)answer.add(x);
			}
			
		}
		for(char x: answer) {
		System.out.print(x);
		}
	}

}
