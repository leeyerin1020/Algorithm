package cotest_2022;
import java.util.*;

public class Q1_10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s= scanner.next();
		char t= scanner.next().charAt(0);
		char[] c= s.toCharArray();
		int[] answer=new int[c.length];
		int p=1000;
		for(int i=0; i<c.length;i++) {
			if(c[i]==t) p=0;
			else 
				p++;
			answer[i]=p;
		}
		p=1000;
		for(int i=c.length-1;i>=0;i--) {
			if(c[i]==t) {
				p=0;
				answer[i]=p;
			}
			else {
				p++;
				if(p<answer[i]) {
					answer[i]=p;
				}
			}			
		}
		for(int i=0; i<c.length;i++) {
			System.out.printf("%d ",answer[i]);
		}
		
	}
}
