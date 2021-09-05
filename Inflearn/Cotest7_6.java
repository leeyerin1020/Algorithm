package unit7;
//부분집합 구하기(DFS)
import java.util.*;
public class Cotest7_6 {
	static int n;
	static int[] ch;// 그 원소를 넣을지 말지를 표시하기위한 배열
	public void DFS(int L) {
		if(L==n+1) {// n+1에 다다르면 원소를 출력한다
			for(int i=1; i<=n; i++) {
				if(ch[i]==1)System.out.print(i+" ");
			}
			System.out.println(" ");
		}
		else {
			ch[L]=1;// 이진트리 형태로 넣을지 말지를 선택하면서 계속 내려가는 형태임!
			DFS(L+1);//왼쪽 자식!
			ch[L]=0;
			DFS(L+1);//오른쪽 자식!
		}
	}
	
	
	public static void main(String[] args) {
		Cotest7_6 c= new Cotest7_6();
		n=3;
		ch= new int[n+1];
		c.DFS(1);
	}
}
