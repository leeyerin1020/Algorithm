import java.util.*;

public class cotest6 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str=scanner.next();
		char[] list= str.toCharArray();
		char x=list[0];
		String answer="";
		/*
		 * ���ǿ���, indexOf��� �Լ��� �̿���
		 * indexOf(str.charAt(i))�̷��� �ϸ� str�� i�ε����� ���ڿ� ���� ���ڰ� str�� ��� ��ġ���� ó����������
		   for(int i=0; i<str.length();i++){
		   	if(str.indexOf(charAt(i))==i)�̷��� ó�� �����ߴ����� ������ �ľ��Ѵ�.
		   }
		 */
		for(int i=0;i<str.length()-1;i++) {
			for(int k=i+1;k<str.length();k++) {
				if(list[i]==list[k]) {
					list[k]=' ';
				}
			}
		}
		for(int i=0;i<str.length();i++) {
			if(list[i]!=' ') {
				answer+=list[i];
			}
		}
		System.out.println(answer);
	}
}
