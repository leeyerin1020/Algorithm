//점수계산
import java.util.Scanner;
public class cotest19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		int[] list= new int[N];
		for(int i=0; i<N; i++) {
			list[i]=scanner.nextInt();
		}
		int score=0;
		int num=1;
		/*
		 * 1인 경우 증가시켜가며 score에 누적하고 0을 만나면 그 변수를 0으로 초기화 하는방법!
		 * if(list[i]=0){num=0;}
		 * else{
		 * num++;
		 * score+=num;
		 * }
		 * 나처럼 굳이 앞선 값과 같은지 비교할 필요 없지..
		 */
		for(int i=0; i<N; i++) {
			if(list[i]==0) {;}
			else {
				if(i==0) {;}
				else if(list[i]==list[i-1]) {
					num++;
				}
				else {
					num=1;
				}
				score+=num;
			}
		}
		
		System.out.print(score);
	}
}