package cotest_2022;
import java.util.*;

public class Q1_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num=scanner.nextInt();//이렇게 하면 그다음을 enter를 읽는데?
		scanner.next();
		for(int i=0; i<num;  i++) {
			String str= scanner.nextLine();
			System.out.println(str);
			char[] c= str.toCharArray();
			for(int k=c.length-1; k>=0; k--) {
				System.out.print(c[k]);
			}
			System.out.println();
		}
	}
}
