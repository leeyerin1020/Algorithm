package Unit5;
import java.util.*;
public class cotest5_6{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		/*������ ����ť�� �̿��ؾ��ϴ� �� ���Ҵµ� ������ �ȳ��� -> ���� �ٽ� �ڿ� �־��ְ� �̷������� ������ ����ťó�� ����!
		Queue<Integer> queue=new LinkedList<>();
		for(int i=1; i<=n; i++) {
			queue.offer(i);
		}
		while(true) {
			if(queue.size()==1) {
				System.out.println(queue.poll());
				break;
			}
			for(int i=1; i<=k-1;i++) {
				int num=queue.poll();
				queue.offer(num);
			}
			queue.remove();
		}
		*/
		
	}

}
