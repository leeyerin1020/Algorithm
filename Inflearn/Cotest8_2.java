package unit8;
import java.util.*;
//time exceed !

class Cotest8_2 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int c=scanner.nextInt();
		int n=scanner.nextInt();
		int[] list= new int[n];
		for(int i=0; i<n; i++) {
			list[i]=scanner.nextInt();
		}
		Queue<Integer> queue= new LinkedList<>();
		queue.add(list[0]);
		queue.add(0);
		for(int i=1; i<n; i++) {
			int size= queue.size();
			for(int j=0; j<size; j++) {
				int temp=queue.poll();
				
				int sum=0;
				sum=temp+list[i];
				queue.add(sum);
				sum=0;
				sum=temp;
				queue.add(sum);
			}
		}
		int size= queue.size();
		int max=0;
		for(int i=0; i<size; i++) {
			int temp=queue.poll();
			if(temp>max&& temp<c) {
				max=temp;
			}
		}
		System.out.println(max);
		//강사님은 또 다시 재귀함수의 호출로 구현하심
		/*
		 * public void DFS(int L, int sum, int[] arr){
		 * if(sum>c) return;
		 * if(L==n){
		 * 	answer=Math.max(answer, sum)// max함수 이용하여 최대값 구함
		 * }
		 * else{
		 * 	DFS(L+1, sum+arr[L], arr);
		 * 	DFS(L+1, sum, arr);
		 * 	}
		 * }
		 */
		
		
	}

}
