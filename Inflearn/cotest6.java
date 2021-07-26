import java.util.*;

public class cotest6 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str=scanner.next();
		char[] list= str.toCharArray();
		char x=list[0];
		String answer="";
		/*
		 * 강의에선, indexOf라는 함수를 이용함
		 * indexOf(str.charAt(i))이렇게 하면 str의 i인덱스의 문자와 같은 문자가 str의 어느 위치에서 처음나오는지
		   for(int i=0; i<str.length();i++){
		   	if(str.indexOf(charAt(i))==i)이렇게 처음 등장했는지의 유무를 파악한다.
		   }
		 */
		for(int i=0;i<str.length()-1;i++) {
			for(int k=i+1;k<str.length();k++) {
				if(list[i]==list[k]) {
					list[k]=' ';
				}
			}
		}
		for(int i=0;i<str.length();i++) {
			if(list[i]!=' ') {
				answer+=list[i];
			}
		}
		System.out.println(answer);
	}
}
