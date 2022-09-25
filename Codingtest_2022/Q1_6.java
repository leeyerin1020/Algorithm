package cotest_2022;
import java.util.*;

public class Q1_6 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str= scanner.nextLine();
		char[] c= str.toCharArray();
		String answer=" ";
		for(int i=0; i<str.length()-1; i++) {
			for(int k=i+1; k<str.length();k++) {
				if(c[i]==c[k]) {
					c[k]=' ';
				}
			}
		}
		for(int i=0; i<str.length();i++) {
			if(c[i]!=' ') {
				System.out.print(c[i]);
			}
		}
		/*
		 * String charAt()함수 이용해서, 각 index에 해당하는 char에 접근이 가능하다.
		 *  str.indexOf(str.charAt(i)) indexOf() 함수 사용하면 String에서 그 문자가 나오는 처음 인덱스를 반환!
		 *  따라서, if(i==str.indexOf(str.charAt(i)))이런식으로 접근 가능!
		 *  answer+=charAt(i) string에 + 통해서 char 바로 붙여줄 수 있네!
		 *  
		 *  for(int i=0; i<str.length(); i++){
		 *  	if(str.indexOf(str.charAt(i))==i) answer+=str.charAt(i);
		 *  
		 */
		
		
	}	
}
