import java.util.*;
public class cotest8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str=scanner.nextLine();
		str=str.toUpperCase();
		int left=0;
		int right=str.length()-1;
		char[] list= str.toCharArray();
		/*
		 * isAlphabetic함수를 이용하여 알파벳이 아닌것들을 제외해주었는데
		 * 강의에선, replaceAll을 이용하여 알파벳이 아닌 것들은 ""빈문자로 대체하였다.
		 * str=str.toUpperCase().replaceAll("[^A-Z]","")
		 * 여기서 ^는 부정의 의미로 A-Z가 아닌 문자를 의미한다. 정규식!
		 */
		while(left<right) {
			if(!Character.isAlphabetic(list[left])) {
				left++;
			}
			else if(!Character.isAlphabetic(list[right])){
				right--;
			}
			else {
				if(list[left]!=list[right]) {
					System.out.println("NO");
					return;
				}
				left++;
				right--;
			}
			
				
			}
		System.out.println("YES");
		
		}

	
}