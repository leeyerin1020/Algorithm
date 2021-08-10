//괄호문자제거-> 괄호관련 문제는 거의 stack을 이용한다
package Unit5;
import java.util.*;
public class cotest5_2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str= scanner.next();
		Stack<Character> stack= new Stack<>();
		String answer="";
		for(char x: str.toCharArray()) {
			if(x==')') {
				while(stack.pop()!='(');// while문 조건을 이렇게 주면 -> '('인 경우까지 pop하고 종료되지!
			}// while문 하고서 '('이거 빼려고 또 pop할 필요 없다는 의미임!
			else stack.push(x);
		}
		for(int i=0; i<stack.size();i++) {
			System.out.print(stack.get(i));
		}
		
		/*-> 스택 이용하지 않은 내방법
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
		*/
	}

}
