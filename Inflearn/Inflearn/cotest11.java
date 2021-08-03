import java.util.Scanner;
public class cotest11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str=scanner.next();
		char[] list=str.toCharArray();
		String answer="";
		for(int i=0;i<str.length();i++) {
			int num=1;
			/*
			if(i==str.length()-1) {answer+=list[i]; break;}
			이 부분을 강의에선, 
			처음 문자열에 "" 빈 문자 하나를 더하면서 시작해서 해결해줌!
			*/
			for(int k=i+1;k<str.length();k++) {
				if(list[i]==list[k]) {
					num++;
				}
				else {
					break;
				}
			}
			answer+=list[i];
			i+=(num-1);
			if(num!=1) {
			answer+=num;
			}
		}
		System.out.println(answer);
	}
}
