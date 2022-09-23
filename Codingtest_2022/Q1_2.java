package cotest_2022;
import java.util.*;
public class Q1_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String string= scanner.next();
		char str[]= string.toCharArray();
		for(int i=0; i<string.length(); i++) {
			if(str[i]>90) {
				str[i]=Character.toUpperCase(str[i]);
			}
			else {
				str[i]=Character.toLowerCase(str[i]);
			}
		}
		System.out.println(str);
	}
	
}
