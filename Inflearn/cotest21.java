//������ �ִ���
import java.util.Scanner;
public class cotest21 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		int[][] list= new int[N][N];
		for(int i=0; i<N; i++) {
			for(int k=0; k<N ;k++) {
				list[i][k]=scanner.nextInt();
			}
		}
		int max=0;
		for(int j=0; j<N; j++) {
			int sum=0;
			int sum2=0;
			for(int m=0; m<N; m++) {
				sum+=list[j][m];
				sum2+=list[m][j];
			}
			/*
			 *�ִ밪-> Math.max() �Լ��� �̿��Ͽ� ���ϱ� 
			 *max= Math.max(max, sum);
			 *max= Math.max(max, sum2);
			 *�̷��� �ϸ� max�� ���� �� �ִ°���!
			 */
			if(sum>sum2) {
				if(max<sum) {
					max=sum;
				}
			}
			else {
				if(max<sum2) {
					max=sum2;
				}
			}		
		}
		int sum=0;
		int sum2=0;
		for(int i=0; i<N; i++) {
			sum+=list[i][i];
		}
		if(max<sum) max=sum;
		
		for(int j=N-1; j>=0; j--) {
			sum2+=list[j][j];
		}
		if(max<sum2) max=sum2;
		System.out.print(max);
		
		
	}
}


