package unit8;
import java.util.*;
//time excedd !
class Cotest8_3 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		int m=scanner.nextInt();
		int[] a= new int[n];
		int[] b= new int[n];
		for(int i=0; i<n; i++) {
			a[i]= scanner.nextInt();
			b[i]= scanner.nextInt();
		}
		Queue<Integer> time= new LinkedList<>();
		Queue<Integer> score= new LinkedList<>();
		score.add(a[0]);
		score.add(0);
		time.add(b[0]);
		time.add(0);
		for(int i=1; i<n; i++) {
			int size= time.size();
			for(int j=0; j<size; j++) {
				int temp=time.poll();
				int temp2=score.poll();
				time.add(temp+b[i]);
				time.add(temp);
				score.add(temp2+a[i]);
				score.add(temp2);
			}
		}
		int size= time.size();
		int max=0;
		for(int i=0; i<size; i++) {
			int tmp=time.poll();
			int tmp2=score.poll();
			if(tmp<=m) {
				if(tmp2>max) {
					max=tmp2;
				}
			}
		}
		System.out.println(max);
		/*강사님은 재귀함수로 하심
		 * public void DFS(int L,int sum, int time, int[] arr1,imt[] arr2)
		 * 
		 */
	}

}
