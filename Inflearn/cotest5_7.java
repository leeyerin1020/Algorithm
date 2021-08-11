package Unit5;
//교육과정 설계
import java.util.*;
public class cotest5_7{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1= scanner.next();
		String str2= scanner.next();
		String answer="YES";
		Queue<Character> queue= new LinkedList<>();// 필수과목을 넣을 큐를 만들어준다
		//fifo구조이므로 차례대로 들어가서 처음부터 나오기때문에-> 순서대로 
		for(char x: str1.toCharArray())queue.add(x);
		for(char x: str2.toCharArray()) {
			if(queue.contains(x)) {// queue에 특정 원소가 있는지 확인하는 코드
				if(x!=queue.poll()) {
					answer="NO";
				}
			}
		}
		if(!queue.isEmpty())answer="NO";
		System.out.println(answer);
		/* 내논리는 틀린건가??
		int max=-10;
		boolean b=true;
		for(int i=0; i<str1.length();i++) {
			char x= str1.charAt(i);
			int num=str2.indexOf(x);
			if(num==-1) {
				b=false;
				break;
			}
			else if(num>max) {
				max=num;
				break;
			}
			else {
				b=false;
				break;
			}
			
		}
		if(b) {System.out.println("YES");}
		else {System.out.println("NO");}
		*/
	}
}
