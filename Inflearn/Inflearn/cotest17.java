//소수(에라토스테네스 체)
import java.util.Scanner;
public class cotest17 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N=scanner.nextInt();
		int num=0;
		int[] list= new int[N+1];
		for(int i=2; i<=N; i++) {
			if(list[i]==0) {
				num++;
				//for(int j=1;)
			}
		}
		System.out.println(num);
	}
}
