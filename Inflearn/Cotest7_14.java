package unit7;

import java.util.ArrayList;
import java.util.*;

public class Cotest7_14 {
	static int n,m;
	static ArrayList<ArrayList<Integer>> graph;
	//Integer를 인자로 갖는 arraylist 객체를 인자로 갖는 arraylist! 를 선언함
	
	static int[] ch, dis;//check하고 distance즉 level 기록할 배열을 선언해줌
	public void BFS(int v) {
			Queue<Integer> queue= new LinkedList<>();// queue이용..
			ch[v]=1;
			dis[v]=0;
			queue.offer(v);
			while(!queue.isEmpty()) {
				int cv= queue.poll();
				for(int nv : graph.get(cv)) {
					if(ch[nv]==0) {
						ch[nv]=1;
						queue.offer(nv);// graph arraylist에서 자기 다음위치의 노드를 빼서 queue에 넣어준다
						// queue가 비어질때까지 계속해서 노드 돌아가면서 level을 찾는다
						dis[nv]=dis[cv]+1;// dis==level-> 하나 아래 노드이기에 +1해준다.. 배열 이용
					}
				}
			}
		}
	public static void main(String[] args) {
		Cotest7_14 c= new Cotest7_14();
		Scanner scanner= new Scanner(System.in);
		n=scanner.nextInt();
		m=scanner.nextInt();
		graph= new ArrayList<ArrayList<Integer>>();//각 노드별로 갈 수 있는 경로를 추가해주기 위해 arraylist인데 인자를 arraylist를 갖도록 해준다
		ch= new int[n+1];// 그 노드에 갔는지 check하기 위한 배열(이미 그 노드를 갈 수 있는 최단거리 찾았다는 뜻)
		dis= new int[n+1];
		for(int i=0; i<=n; i++) {
			graph.add(new ArrayList<Integer>());//arraylist 객체를 생성하여 graph arraylist에 넣어줌
		}
		for(int i=0; i<m; i++) {
			int a=scanner.nextInt();
			int b= scanner.nextInt();
			graph.get(a).add(b);// a번째 arraylist를 불러와서 b를 넣어준다!(즉, a노드에 b노드로 가는 경로가 있기에 추가해주는 것이다)
		}
		
		c.BFS(1);
		for(int i=2; i<=n; i++) {
			System.out.println(i+" : " +dis[i]);
		}
		
	}

}
