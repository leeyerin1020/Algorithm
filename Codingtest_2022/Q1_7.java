package cotest_2022;
import java.util.*;
public class Q1_7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str= scanner.next();
		str=str.toUpperCase();
		int s=0; int l=str.length()-1;
		for(int i=0; i<str.length()/2; i++) {
			if(str.charAt(s)!=str.charAt(l)) {
				System.out.println("NO");
				return;
			}
			else s++; l--;
		}
		System.out.println("YES");
	}

}
