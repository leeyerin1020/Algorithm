import java.util.*;

public class _1330{

	public static void main(String[] args) {
		int A;
		int B;
		Scanner scanner = new Scanner(System.in);
		A=scanner.nextInt();
		B=scanner.nextInt();
		
		if(A>B) System.out.println('>');
		else if(A<B) System.out.println('<');
		else System.out.println("==");
	}
}
