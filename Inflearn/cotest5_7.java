package Unit5;
//�������� ����
import java.util.*;
public class cotest5_7{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str1= scanner.next();
		String str2= scanner.next();
		String answer="YES";
		Queue<Character> queue= new LinkedList<>();// �ʼ������� ���� ť�� ������ش�
		//fifo�����̹Ƿ� ���ʴ�� ���� ó������ �����⶧����-> ������� 
		for(char x: str1.toCharArray())queue.add(x);
		for(char x: str2.toCharArray()) {
			if(queue.contains(x)) {// queue�� Ư�� ���Ұ� �ִ��� Ȯ���ϴ� �ڵ�
				if(x!=queue.poll()) {
					answer="NO";
				}
			}
		}
		if(!queue.isEmpty())answer="NO";
		System.out.println(answer);
		/* ������ Ʋ���ǰ�??
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
