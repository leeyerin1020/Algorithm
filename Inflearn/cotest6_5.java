package Unit6;
//중복 확인
import java.util.*;
public class cotest6_5{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		Stack<Integer> stack= new Stack<>();
		String answer="U";
		for(int i=0; i<n; i++) {
			int temp=scanner.nextInt();
			if(stack.contains(temp)) {
				answer="D";
				break;
			}
			stack.push(temp);
			
		}
		scanner.close();
		System.out.println(answer);
	}

}
