import java.util.Scanner;

public class cotest7 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str=scanner.next();
		int first=0;
		int last=str.length()-1;
		while(first<last) {
			char left=str.charAt(first);
			/*
			 * ���� �� ���ڸ��� upper, lower���༭ �� ������µ�
			 * ��ҹ��� ���о��Ѵ� �ϸ� �׳� ó������ �� ������ uppercase�� �ٲ۴����� �����ϸ��!!
			 */
			char cap=Character.toUpperCase(left);
			char low=Character.toLowerCase(left);
			if(str.charAt(last)!=cap&&str.charAt(last)!=low) {
				System.out.println("NO");
				return;
			}
			first++;
			last--;
		}
		System.out.println("YES");
		return;
	}
}