//������ұ��ϱ�-> �ּ�ó���� �ڵ� �������� ���� ���� �ʳ�??
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
		// two pointers algorithm-> ���� ������������ �迭�� �����ؾ���!
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
		//������������ �����ϴ� ���-> sort��� �Լ� �̿�...
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
