package Unit5;
//������ ����
import java.util.*;
public class cotest5_4{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Stack<Integer> stack= new Stack<>();
		String str= scanner.next();
		int rt, lt;
		for(char item: str.toCharArray()) {
			//���ڵ� -> if(Character.isDigit())�̷��� �������� �ƴ��� �Ǻ��ϴ� �Լ� ����ϸ� �� ����������!
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
		/* ��Ǯ�� ��� �̻�����!!
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
