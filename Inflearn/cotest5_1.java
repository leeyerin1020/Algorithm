//올바른 괄호
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
		/*
                           괄호, 대괄호 나오는 문제는 대부분 Stack을 이용한다!
            Stack<Character> stack= new Stack<>();// 스택을 선언함
            stack.push(x), stack.pop(x), stack.isEmpty함수를 이용하여 처리해준다!
            -> '('인 경우 push해주고 else인 경우 isEmpty여부 확인하여 pop or return 이런식으로! 
		 */
	
	}

}
