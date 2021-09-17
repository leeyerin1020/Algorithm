package unit8;
import java.util.*;

class Cotest8_1 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n=scanner.nextInt();
		int[] list=new int[n];
		for(int i=0; i<n; i++) {
			list[i]=scanner.nextInt();
		}
		Queue<Integer> queue= new LinkedList<>();
		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=list[i];
		}
		queue.add(list[0]);
		queue.add(0);
		for(int i=1; i<n; i++) {
			int size= queue.size();
			for(int j=0; j<size; j++) {
				int temp= queue.poll();
				queue.add(temp+list[i]);
				queue.add(temp);
			}
		}
		String answer="NO";
		int size= queue.size();
		for(int j=0; j<size; j++) {
			int temp=queue.poll();
			if(temp==sum-temp) answer="YES";
		}
		//나는 queue를 이용했는데, 강사님은 재귀함수를 이용하심
		/*
		 * public void DFS(int L, int sum, int[] arr){
		 * if(flag) return;// 만약 flag가 true로 변했다-> 즉, 조건 만족한 경우가 나왔다 그러면 더 진행 X
		 * if(sum>total/2) return;// 합이 더 커버려도-> 진행 X
		 * if(L==n){
		 * 	if((total-sum)==sum){
		 * 		answer="YES";
		 * 		flag=true;
		 * 	}
		 * else{// 이렇게 재귀함수를 호출함
		 * 	DFS(L+1, sum+arr[L], arr);
		 * 	DFS(L+1, sum, arr);
		 * 	}
		 * }
		 */
		System.out.println(answer);
		
	}
}
