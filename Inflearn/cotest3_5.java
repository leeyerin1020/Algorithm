//연속된 자연수의 합
import java.util.Scanner;
public class cotest3_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int sum=0;
		int answer=0;
		int lt=1;
		//for문 n까지 돌릴 필요 없이 15/2=7 7+1=8까지 for문 돌리는거임!
		//어짜피 15이상 넘어가버리면 안되는거니깐
		for(int i=1; i<n;i++) {
			sum+=i;
			if(sum==n) answer++;
			while(sum>=n) {
				sum-=lt;
				lt++;
				if(sum==n) answer++;
			}
		}
		System.out.print(answer);
	}

}
