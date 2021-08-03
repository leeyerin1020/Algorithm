//등수구하기
import java.util.Scanner;
public class cotest20 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		int[] list= new int[N];
		for(int i=0; i<N; i++) {
			list[i]= scanner.nextInt();
		}
		int[] rank= new int[N];
		int num=1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(list[i]<list[j]) {
					num++;
				}
			}
			rank[i]=num;
			num=1;
		}
		for(int i=0; i<N; i++) {
		System.out.print(rank[i]+" ");
		}
		
		
}	
}