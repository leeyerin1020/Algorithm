package unit7;
//송아지 찾기-> 최단 경로 찾기
import java.util.*;
public class Cotest7_8 {
	int answer=0;
	int[] dis= {1,-1,5};//앞으로 +1, 뒤로 -1, 앞으로 +5 인 세가지 경우
	int[] ch;// 있는지 없는지 인덱스 값으로 체크하고 & 1,0을 대입해준다!
	Queue<Integer> Q= new LinkedList<>();//queue에 대입해서 그 자식노드로 계속 연결!
	public int BFS(int s, int e) {
		ch= new int[10001];//ch가 현재 좌표를 의미..
		ch[s]=1;
		Q.offer(s);
		int L=0;
		while(!Q.isEmpty()) {
			int len=Q.size();
			for(int i=0; i<len; i++) {
				int x=Q.poll();
				for(int j=0; j<3; j++) {
					int nx= x+dis[j];
					if(nx==e) return L+1;
					if(nx>=1&& nx<=10000 && ch[nx]==0) {
						ch[nx]=1;
						Q.offer(nx);
					}
				}
			}
			L++;
		}
		return 0;
		
	}
	public static void main(String[] args) {
		Cotest7_8 c= new Cotest7_8();
		Scanner scanner= new Scanner(System.in);
		int s= scanner.nextInt();
		int e= scanner.nextInt();
		System.out.println(c.BFS(s,e));
	}
}
