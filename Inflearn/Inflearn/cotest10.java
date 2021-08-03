import java.util.Scanner;
public class cotest10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s=scanner.next();
		char t=scanner.next().charAt(0);
		String answer="";
		char[] list = s.toCharArray();
		int num=0;
		/*
		 * 어떤 값이 최소인지 비교하기 위해서 함수를 이용함
		 * Math.min(answer[i], p)
		 * 이렇게 Math 클래스의  min 함수 이용!
		 */
		for(int i=0;i<s.length();i++) {
			int min=100;
			for(int k=0;k<s.length();k++) {
				if(list[k]==t) {
					if((k-i)>=0) {
						if(min>(k-i)) {
							min=(k-i);
						}
					}
					else if((k-i)<0) {
						if(min>(i-k)) {
							min=(i-k);
						}
					}
					 
				}
			}
			answer+=min;
			answer+=" ";
		}

		System.out.println(answer);
	}
}