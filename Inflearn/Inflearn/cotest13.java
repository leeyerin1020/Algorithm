import java.util.*;
public class cotest13 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		/*
		ArrayList<Integer> array= new ArrayList<Integer>(10);
		array.add(numbers[i]); 
		����� ���� int�迭�̹Ƿ� arraylist�� �����ؼ� add�Լ��� ���� �����ش�. 
		����Ʈ �� ����ϱ� ���ؼ� -> get�Լ� �̿��Ѵ�!!
		array.get(i) �̷��� for�� ������
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