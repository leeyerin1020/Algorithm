package unit7;

import java.util.ArrayList;
import java.util.*;

public class Cotest7_14 {
	static int n,m;
	static ArrayList<ArrayList<Integer>> graph;
	//Integer�� ���ڷ� ���� arraylist ��ü�� ���ڷ� ���� arraylist! �� ������
	
	static int[] ch, dis;//check�ϰ� distance�� level ����� �迭�� ��������
	public void BFS(int v) {
			Queue<Integer> queue= new LinkedList<>();// queue�̿�..
			ch[v]=1;
			dis[v]=0;
			queue.offer(v);
			while(!queue.isEmpty()) {
				int cv= queue.poll();
				for(int nv : graph.get(cv)) {
					if(ch[nv]==0) {
						ch[nv]=1;
						queue.offer(nv);// graph arraylist���� �ڱ� ������ġ�� ��带 ���� queue�� �־��ش�
						// queue�� ����������� ����ؼ� ��� ���ư��鼭 level�� ã�´�
						dis[nv]=dis[cv]+1;// dis==level-> �ϳ� �Ʒ� ����̱⿡ +1���ش�.. �迭 �̿�
					}
				}
			}
		}
	public static void main(String[] args) {
		Cotest7_14 c= new Cotest7_14();
		Scanner scanner= new Scanner(System.in);
		n=scanner.nextInt();
		m=scanner.nextInt();
		graph= new ArrayList<ArrayList<Integer>>();//�� ��庰�� �� �� �ִ� ��θ� �߰����ֱ� ���� arraylist�ε� ���ڸ� arraylist�� ������ ���ش�
		ch= new int[n+1];// �� ��忡 ������ check�ϱ� ���� �迭(�̹� �� ��带 �� �� �ִ� �ִܰŸ� ã�Ҵٴ� ��)
		dis= new int[n+1];
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());//arraylist ��ü�� �����Ͽ� graph arraylist�� �־���
		}
		for(int i=0; i<m; i++) {
			int a=scanner.nextInt();
			int b= scanner.nextInt();
			graph.get(a).add(b);// a��° arraylist�� �ҷ��ͼ� b�� �־��ش�!(��, a��忡 b���� ���� ��ΰ� �ֱ⿡ �߰����ִ� ���̴�)
		}
		
		c.BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i+" : " +dis[i]);
		}
		
	}

}
