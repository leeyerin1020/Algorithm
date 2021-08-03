//연속부분수열 -> 어렵다..!
//two pointer 알고리즘 & sliding window-> O(n^2)을 O(n)으로 바꾸는 거임!
//시간 복잡도를 줄이는 방법
import java.util.Scanner;
public class cotest3_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int m= scanner.nextInt();
		int[] list= new int[n];
		for(int i=0; i<n; i++) {
			list[i]=scanner.nextInt();
		}
		/*
		int lt=0; 
		int sum=0;
		int answer=0;
		for(int rt=0; rt<n; rt++) {
			sum+=list[rt];
			if(sum==m){ 
				answer++;
			}
				while(sum>=m) {
					sum-=list[lt++];
					if(sum==m) {
						answer++;
					}
				}//while문 이용하여 작은 경우에는 lt를 앞으로 이동시키면서..
			
		}
		System.out.print(answer);
		*/
		int answer=0;
		for(int i=0; i<n;i++) {
			int sum=0;
			for(int j=i; j<n; j++) {
				if(sum<m) {
					sum+=list[j];
				}
				else {
					if(sum==m) {answer++; break;}
					break;
				}
			}
		}
		
		System.out.print(answer);
	}

}
