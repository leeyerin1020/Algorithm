package cotest_2022;
import java.util.*;

public class Q1_11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str= scanner.next();
		char[] c= str.toCharArray();
		int num=1;
		char k;
		String answer="";
		for(int i=0; i<=c.length-1; i++) {
			if(i==c.length-1) {
				
				if(c[i]==c[i-1]) {
					answer=answer.concat(Integer.toString(++num));
				}
				else {
					answer+=c[i];
				}
			}
			else {
			if(c[i]==c[i+1]) {
				if(num==1)answer+=c[i];
				num++;	
			}
			else {
				if(num!=1) {
					
					answer=answer.concat(Integer.toString(num));
					num=1;
				}
				//string끼리 이어주는 거 잘모르겠네!
				else {
					answer+=c[i];
					num=1;
				}
			}
			}
		}
		System.out.println(answer);
	}
}
