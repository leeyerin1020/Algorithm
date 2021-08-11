package Unit5;
//쇠막대기
import java.util.*;
	public class cotest5_5{
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			String str= scanner.next();
			Stack<Character> stack= new Stack<>();
			int answer=0;
			char[] list= new char[str.length()];
			stack.push(list[0]);
			for(int i=1; i<list.length; i++) {
				
					
			}
			
			
			/* 이런식으로 pop해가면서 하면 emptysyackexception난다. 없는데 계속 pop하니깐..
			for(char x: str.toCharArray()) {
				char item= stack.pop();
				if(item==')') {
					x++;
					char sec= stack.pop();
					if(sec!='(') {
						answer++;
					}
				}
			}
			*/
			System.out.println(answer);
			
		}
}
