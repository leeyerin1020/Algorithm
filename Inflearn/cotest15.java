//���� ���� ��
import java.util.Scanner;
public class cotest15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N=scanner.nextInt();
		int[] A= new int[N];
		int[] B= new int[N];
		for(int i=0; i<N;i++) {
			A[i]=scanner.nextInt();
		}
		for(int k=0; k<N;k++) {
			B[k]= scanner.nextInt();
		}
		//ListArray<Character> list[]= new <>ListArray();
		//ListArray ���ȳ���!!
		//��� if�� �ϴ� ��� ����
		//( ? :)�̷������� � ���� �����ϴ� ��쿡�� a �ƴѰ�쿡�� b�̷��� �ϴ� ������ �ִµ�..
		String answer="";
		for(int j=0; j<N; j++) {
			if(A[j]==B[j]) {
				answer+="D"+"\n";
			}
			/*
			 * else if(a�� �̱�� �ִ� ���->1,2,3�� ���ؼ��� ���ָ�)
			 * �������� else�� b�� �̱�ٰ� ó���ϸ� ��
			 */
			else if(A[j]==1) {
				if(B[j]==2) {
					answer+="B"+"\n";
				}
				else {
					answer+="A"+"\n";
				}
			}
			else if(A[j]==2) {
				if(B[j]==3) {
					answer+="B"+"\n";
				}
				else {
					answer+="A"+"\n";
				}
			}
			else if(A[j]==3) {
				if(B[j]==1) {
					answer+="B"+"\n";
				}
				else {
					answer+="A"+"\n";
				}
			}
		}
		System.out.print(answer);
	}
}
