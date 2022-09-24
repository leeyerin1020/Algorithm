package cotest_2022;
import java.util.*;

public class Q1_3 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String string= scanner.nextLine();
		String[] array= string.split(" ");
		// split 함수를 이용해서 string을 분리해준다 -> space를 기준으로
		int max=0;
		int j=0;
		for(int i=0; i<array.length; i++) {
			if(array[i].length()>max) {
				max=array[i].length();
				j=i;
			}
		}
		/*
		String answer="";
		for(String x: array) {
			answer=x;
		}
		array이니깐, for each 구문 사용가능하다
		빈 string을 만들어서 그냥 바로 넣어주는게 더 편하네!
		substring(start, end)-> end-1까지의 string을 추출해준다.
		*/
		
		System.out.println(array[j]);
	}
}
