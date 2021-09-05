package unit7;
//����Ʈ�� ����Ž��
import java.util.*;
class Node{
	int data;
	Node lt, rt;
	public Node(int val) {// ������
		data=val;
		lt=rt=null;
	}
}
public class Cotest7_7 {
	Node root;
	public void BFS(Node root) {
		Queue<Node> Q= new LinkedList<>();// ������ queue�� ��Ƽ� 
		Q.offer(root);//add���൵ �Ȱ���
		int L=0;
		while(!Q.isEmpty()) {
			int len=Q.size();//queue�� ���� ������
			System.out.print(L+ " : ");
			for(int i=0; i<len; i++) {
				Node cur= Q.poll();//queue���� node�ϳ��� ������ 
				System.out.print(cur.data +" ");
				if(cur.lt!=null) Q.offer(cur.lt);//�� ����,������ �ڽ��� queue�� �־��ش�
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
