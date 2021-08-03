//공통원소구하기-> 주석처리된 코드 오름차순 정렬 맞지 않나??
import java.util.*;
public class cotest3_2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int[]a= new int[n];
		for(int i=0; i<n; i++) {
			a[i]=scanner.nextInt();
		}
		int m= scanner.nextInt();
		int[]b= new int[m];
		for(int i=0; i<m; i++) {
			b[i]=scanner.nextInt();
		}
		int p1=0; int p2=0;
		ArrayList<Integer> answer= new ArrayList();
		// two pointers algorithm-> 먼저 오름차순으로 배열을 정렬해야함!
/*
		for(int i=0; i<n; i++) {
			for(int j=i; j<n; j++) {
				if(a[i]>a[j]) {
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int i=0; i<m; i++) {
			for(int j=i; j<m; j++) {
				if(b[i]>b[j]) {
					int temp=b[i];
					b[i]=b[j];
					b[j]=temp;
				}
			}
		}
*/		
		//오름차순으로 정렬하는 방법-> sort라는 함수 이용...
		Arrays.sort(a);
		Arrays.sort(b);
		
		 while(p1<n && p2<m) {
		 
			if(a[p1]>b[p2]) {
				p2++;
			}
			else if(a[p1]<b[p2]) {
				p1++;
			}
			else {
			answer.add(a[p1]);
			p1++; p2++;
			}
		}
		for(int x: answer) {
		System.out.print(x+" ");
		}
		
		
	}

}
