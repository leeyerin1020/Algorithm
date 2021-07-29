//피보나치 수열
import java.util.Scanner;
public class cotest16 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		int sum=0;
		int[] list=new int[N];
		for(int i=0; i<N;i++) {
			if(i==0|i==1) {
				list[i]=1;
				sum=0;
			}
			else {
				sum=(list[i-1]+list[i-2]);
				list[i]=sum;
			}
		}
		for(int j=0; j<N; j++) {
			System.out.print(list[j]+" ");
		}
		
	}
}