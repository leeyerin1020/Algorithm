package cotest_2022;
import java.util.*;

public class Q1_1 {
		public int Solution(String string, char c) {
			int answer=0;
			string=string.toUpperCase();
			c=Character.toUpperCase(c);
			
			for(int i=0; i<string.length(); i++) {
				if(string.charAt(i)==c) {
					answer++;
				}
			}
			
			return answer;
		}
		public static void main(String[] args) {
		Q1_1 T= new Q1_1();
		Scanner scanner = new Scanner(System.in);
		String string= scanner.next();
		char c= scanner.next().charAt(0);
		System.out.print(T.Solution(string, c));	
		}	
	
}
