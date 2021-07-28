import java.util.*;
public class cotest13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		ArrayList<Integer> array= new ArrayList<Integer>(10);
		array.add(numbers[i]); 
		출력할 값이 int배열이므로 arraylist를 선언해서 add함수를 통해 더해준다. 
		리스트 값 출력하기 위해선 -> get함수 이용한다!!
		array.get(i) 이렇게 for문 돌리기
		*/
		int N= scanner.nextInt();
		int[] numbers= new int[N];
		for(int i=0; i<N;i++) {
			numbers[i]=scanner.nextInt();
		}
		String answer=""+numbers[0]+" ";
		for(int k=0; k<N-1; k++) {
			if(numbers[k]<numbers[k+1]) {
				answer+=numbers[k+1]+" ";
			}
		}
		System.out.print(answer);
	
	}
}