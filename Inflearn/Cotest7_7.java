package unit7;
//이진트리 레벨탐색
import java.util.*;
class Node{
	int data;
	Node lt, rt;
	public Node(int val) {// 생성자
		data=val;
		lt=rt=null;
	}
}
public class Cotest7_7 {
	Node root;
	public void BFS(Node root) {
		Queue<Node> Q= new LinkedList<>();// 노드들을 queue에 담아서 
		Q.offer(root);//add해줘도 똑같음
		int L=0;
		while(!Q.isEmpty()) {
			int len=Q.size();//queue의 현재 사이즈
			System.out.print(L+ " : ");
			for(int i=0; i<len; i++) {
				Node cur= Q.poll();//queue에서 node하나를 꺼내서 
				System.out.print(cur.data +" ");
				if(cur.lt!=null) Q.offer(cur.lt);//그 왼쪽,오른쪽 자식을 queue에 넣어준다
				if(cur.rt!=null) Q.offer(cur.rt);
			}
		}
	}
	public static void main(String[] args) {
		Cotest7_7 tree= new Cotest7_7();
		tree.root= new Node(1);
		tree.root.lt= new Node(2);
		tree.root.rt=new Node(3);
		tree.root.lt.lt= new Node(4);
		tree.root.lt.rt= new Node(5);
		tree.root.rt.lt= new Node(6);
		tree.root.rt.rt= new Node(7);
		tree.BFS(tree.root);
	}

}
