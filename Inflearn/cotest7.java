import java.util.Scanner;

public class cotest7 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str=scanner.next();
		int first=0;
		int last=str.length()-1;
		while(first<last) {
			char left=str.charAt(first);
			/*
			 * 나는 각 문자마다 upper, lower해줘서 다 비교해줬는데
			 * 대소문자 구분안한다 하면 그냥 처음부터 그 문장을 uppercase로 바꾼다음에 시작하면됨!!
			 */
			char cap=Character.toUpperCase(left);
			char low=Character.toLowerCase(left);
			if(str.charAt(last)!=cap&&str.charAt(last)!=low) {
				System.out.println("NO");
				return;
			}
			first++;
			last--;
		}
		System.out.println("YES");
		return;
	}
}