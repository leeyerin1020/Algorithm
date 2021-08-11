package Unit5;
//후위식 연산
import java.util.*;
public class cotest5_4{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack= new Stack<>();
		String str= scanner.next();
		int rt, lt;
		for(char item: str.toCharArray()) {
			//이코드 -> if(Character.isDigit())이렇게 정수인지 아닌지 판별하는 함수 사용하면 더 간결해진다!
			if(item=='+') {
				rt=stack.pop();
				lt=stack.pop();
				stack.push(rt+lt);
			}
			else if(item=='-') {
				rt=stack.pop();
				lt=stack.pop();
				stack.push(lt-rt);
			}
			else if(item=='*') {
				rt=stack.pop();
				lt=stack.pop();
				stack.push(rt*lt);
			}
			else if(item=='/') {
				rt=stack.pop();
				lt=stack.pop();
				stack.push(lt/rt);
			}
			else {
				stack.push(item-'0');
			}
		}
		System.out.println(stack.pop());
		/* 내풀이 어디가 이상하지!!
		Stack<Character> stack= new Stack<>();
		String str= scanner.next();
		for(char x: str.toCharArray()) {
			if(x=='+') {
				int num1=stack.pop()-'0';
				int num2=stack.pop()-'0';
				stack.push((char)(num1+num2));
			}
			else if(x=='*') {
				int num1=stack.pop()-'0';
				int num2=stack.pop()-'0';
				stack.push((char)(num1*num2));
			}
			else if(x=='-') {
				int num1=stack.pop()-'0';
				int num2=stack.pop()-'0';
				stack.push((char)(num2-num1));
			}
			else if(x=='/') {
				int num1=stack.pop()-'0';
				int num2=stack.pop()-'0';
				stack.push((char)(num2/num1));
			}
			else {
				stack.push(x);
			}
		}
		System.out.println(stack.pop()-'0');
	*/
	}

}
