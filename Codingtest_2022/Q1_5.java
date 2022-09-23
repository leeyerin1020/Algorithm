package cotest_2022;
import java.util.*;
public class Q1_5 {
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String string= scanner.next();
		char[] str= string.toCharArray();
		int first=0;
		int last=str.length-1;
		while(first<last) {
			if(!Character.isAlphabetic(str[first])) first++;
			else if(!Character.isAlphabetic(str[last])) last--;
			else {
				char temp=str[first];
				str[first]=str[last];
				str[last]=temp;
				last--;
				first++;
			}
		}
	
		System.out.println(str);
		return;
	}

}
