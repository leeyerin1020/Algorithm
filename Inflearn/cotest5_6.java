package Unit5;
import java.util.*;
public class cotest5_6{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int k=scanner.nextInt();
		/*문제가 원형큐를 이용해야하는 것 같았는데 생각이 안나서 -> 빼고 다시 뒤에 넣어주고 이런식으로 귀찮게 원형큐처럼 해줌!
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
