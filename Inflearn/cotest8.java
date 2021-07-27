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
		 * isAlphabetic�Լ��� �̿��Ͽ� ���ĺ��� �ƴѰ͵��� �������־��µ�
		 * ���ǿ���, replaceAll�� �̿��Ͽ� ���ĺ��� �ƴ� �͵��� ""���ڷ� ��ü�Ͽ���.
		 * str=str.toUpperCase().replaceAll("[^A-Z]","")
		 * ���⼭ ^�� ������ �ǹ̷� A-Z�� �ƴ� ���ڸ� �ǹ��Ѵ�. ���Խ�!
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