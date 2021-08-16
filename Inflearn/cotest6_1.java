package Unit6;
//선택 정렬
import java.util.*;
public class cotest6_1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		//sort함수 이용하고 싶어서 arraylist 사용함!
		ArrayList<Integer> list= new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(scanner.nextInt());
		}
		Collections.sort(list);// 오름차순 정렬하는 함수
		for(int x: list) {
			System.out.print(x+" ");
		}
		scanner.close();
	
	}
	

}
