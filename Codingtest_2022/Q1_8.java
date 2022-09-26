package cotest_2022;
import java.util.*;

public class Q1_8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str= scanner.nextLine();
		str=str.toUpperCase();
		char[] c= str.toCharArray();
		int s=0; int l=c.length-1;
		//알파벳 이외의 문자는 무시한다는게-> 여러개 있어도 무시되는거니깐.. 이걸 헷갈림
		
		while(s<l) {
			if(!Character.isAlphabetic(c[s])) {
				s++;
			}
			else if(!Character.isAlphabetic(c[l])) {
				l--;
			}
			else {
				if(c[s]!=c[l]) {
					System.out.println("NO");
					return;
				}
				s++; l--;					
			}	
		}
		System.out.println("YES");
		return;
		/*
		 * str=str.toUpperCase().replaceAll("[^A-Z]","")
		 * a~z가 아닌 애들은 모두 ""이걸로 replace하겠다는 의미
		 * 이렇게 해준다음에 
		 * String tmp= new StringBuilder(str).reverse().toString();
		 * reverse 함수 사용하기 위해서 stringbuilder 객체를 선언하는 과정임!
		 * -> new StringBuilder()이렇게 객체 선언한다 + toString 반드시 스트링으로 변환필요!
		 */
	}
}
