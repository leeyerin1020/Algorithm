package Unit6;
//���� ����
import java.util.*;
public class cotest6_1{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		//sort�Լ� �̿��ϰ� �; arraylist �����!
		ArrayList<Integer> list= new ArrayList<>();
		for(int i=0; i<n; i++) {
			list.add(scanner.nextInt());
		}
		Collections.sort(list);// �������� �����ϴ� �Լ�
		for(int x: list) {
			System.out.print(x+" ");
		}
		scanner.close();
	
	}
	

}
