import java.util.Scanner;
public class cotest9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str=scanner.next();
		/*
		 * replaceAll�� �̿��Ͽ� "" ���ڸ� ����� ����� ������
		 * Character.isDigit(x)�� �̿��ϸ� ���ڸ� ��� �� ����!
		 * ->x�� for each���� ����Ѱ��� for(char x : str.toCharArray())
		 */
		str=str.replaceAll("[a-zA-Z]","");
		int k=Integer.parseInt(str);
		System.out.println(k);
	}
}