package cotest_2022;
import java.util.*;

public class Q1_9 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str= scanner.next();
		str=str.replaceAll("[a-zA-Z]","");
		System.out.println(str);
		char[] c= str.toCharArray();
		for(int i=0; i<c.length; i++) {
			if(i==0) {
				if(c[i]=='0');
			}
			else System.out.print(c[i]);
		}
		
		}
}
