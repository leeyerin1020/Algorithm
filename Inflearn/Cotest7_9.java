package unit7;
import java.util.*;
/*
class Node{
	int data;
	Node lt, rt;
	public Node(int val) {// 생성자
		data=val;
		lt=rt=null;
	}
}
*/
//최단 경로 -> bfs로 푸는거래..
public class Cotest7_9 {
	Node root;
	public int DFS(int L, Node root) {
		
	}
	
	public static void main(String args[]) {
		Cotest7_9 tree= new Cotest7_9();
		tree.root= new Node(1);
		tree.root.lt= new Node(2);
		tree.root.rt=new Node(3);
		tree.root.lt.lt= new Node(4);
		tree.root.lt.rt= new Node(5);
		tree.root.rt.lt= new Node(6);
		tree.root.rt.rt= new Node(7);
		tree.DFS(tree.DFS(0,tree.root));
	}

}
