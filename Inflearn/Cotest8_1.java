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
		//���� queue�� �̿��ߴµ�, ������� ����Լ��� �̿��Ͻ�
		/*
		 * public void DFS(int L, int sum, int[] arr){
		 * if(flag) return;// ���� flag�� true�� ���ߴ�-> ��, ���� ������ ��찡 ���Դ� �׷��� �� ���� X
		 * if(sum>total/2) return;// ���� �� Ŀ������-> ���� X
		 * if(L==n){
		 * 	if((total-sum)==sum){
		 * 		answer="YES";
		 * 		flag=true;
		 * 	}
		 * else{// �̷��� ����Լ��� ȣ����
		 * 	DFS(L+1, sum+arr[L], arr);
		 * 	DFS(L+1, sum, arr);
		 * 	}
		 * }
		 */
		System.out.println(answer);
		
	}
}
