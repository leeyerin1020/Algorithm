package unit7;
//�κ����� ���ϱ�(DFS)
import java.util.*;
public class Cotest7_6 {
	static int n;
	static int[] ch;// �� ���Ҹ� ������ ������ ǥ���ϱ����� �迭
	public void DFS(int L) {
		if(L==n+1) {// n+1�� �ٴٸ��� ���Ҹ� ����Ѵ�
			for(int i=1; i<=n; i++) {
				if(ch[i]==1)System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		else {
			ch[L]=1;// ����Ʈ�� ���·� ������ ������ �����ϸ鼭 ��� �������� ������!
			DFS(L+1);//���� �ڽ�!
			ch[L]=0;
			DFS(L+1);//������ �ڽ�!
		}
	}
	
	
	public static void main(String[] args) {
		Cotest7_6 c= new Cotest7_6();
		n=3;
		ch= new int[n+1];
		c.DFS(1);
	}
}
