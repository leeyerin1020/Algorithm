package Unit6;
//중복 확인-> "해쉬맵" 이용하면, key값,value값 중복되면 안된다는 논리 적용해서 풀 수 있음!!
// Arrays.sort해서 배열을 오름차순으로 정렬한 후 for문 이용해서 같은 숫자 있으면 중복이라는 논리도 !
import java.util.*;
public class cotest6_5{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		Stack<Integer> stack= new Stack<>();
		String answer="U";
		for(int i=0; i<n; i++) {
			int temp=scanner.nextInt();
			if(stack.contains(temp)) {
				answer="D";
				break;
			}
			stack.push(temp);
			
		}
		scanner.close();
		System.out.println(answer);
	}

}
