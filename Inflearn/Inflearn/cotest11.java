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
			�� �κ��� ���ǿ���, 
			ó�� ���ڿ��� "" �� ���� �ϳ��� ���ϸ鼭 �����ؼ� �ذ�����!
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
