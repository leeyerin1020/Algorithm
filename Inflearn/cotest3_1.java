//�� �迭 ��ġ��
import java.util.Scanner;
public class cotest3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		int[] n= new int[N];
		for(int i=0; i<N; i++) {
			n[i]=scanner.nextInt();
		}
		int M= scanner.nextInt();
		int[] m=new int[M];
		for(int i=0; i<M; i++) {
			m[i]=scanner.nextInt();
		}
		//�� �迭�� �ѹ��� ������(?)���� �ϴ� ���� �̿��Ͽ� �� �迭�� ��ġ�� ��� �߿�!!
		int p1=0;
		int p2=0;
		int[] answer= new int[M+N];
		int i=0;
		while(p1<N && p2<M) {
			if(n[p1]>m[p2]) {
				answer[i++]=n[p1++];
			}
			else {
				answer[i++]=m[p2++];
			}
		}
		while(p1<N) {answer[i++]=n[p1++];}
		while(p2<M) {answer[i++]=m[p2++];}
		
		//�̷��� while�� �̿��Ͽ� ���� �����ϴ� ���� �迭�� �־��ش�!! 
		//&& ++���� ������? �̿��Ͽ� ����ϰ� �� �� �ִ�
		/*
		int[] answer= new int[M+N];
		for(int i=0; i<M; i++) {
			answer[i]=m[i];
		}
		for(int i=0; i<N; i++) {
			answer[M+i]=n[i];
		}
		while(1) {
			
			
		}
		//�� �迭�� ��ģ �� �����ϴ� ����� ����!!
		for(int i=0; i<M+N; i++) {
			for(int j=i+1; j<M+N; j++) {
				if(answer[i]>answer[j]) {
					int temp=answer[j];
					answer[j]=answer[i];
					answer[i]=temp;;
				}
			}
		}
		for(int i=0; i<M+N; i++) {
			System.out.print(answer[i]+" ");
		}
		*/
	}
}


