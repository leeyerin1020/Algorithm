import java.util.Scanner;
public class cotest9 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str=scanner.next();
		/*
		 * replaceAll을 이용하여 "" 빈문자를 만드는 방법도 있지만
		 * Character.isDigit(x)를 이용하면 숫자만 골라낼 수 있음!
		 * ->x는 for each구문 사용한거임 for(char x : str.toCharArray())
		 */
		str=str.replaceAll("[a-zA-Z]","");
		int k=Integer.parseInt(str);
		System.out.println(k);
	}
}