package Unit4;// �� ����� Ʋ������ �ñ��ϴ�
import java.util.*;
public class cotest4_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int n= scanner.nextInt();
		//�ؽø��� �̿��ؼ� key, value�� 
		HashMap<Character, Integer> map= new HashMap<>();
		String str= scanner.next();
		for(char x: str.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);//for-each���� ���鼭 �ؽøʿ� put���ش�
		}
		//put�Լ�-> Ű��, value�� ���� �־��ش�
		//map.getOrDefault-> ���Լ� �߿��ϴ�!
		//x�� value���� �������ų� ���� ���(��,���Ӱ� key�� ��ϵǴ� ��� 0�̶�� default������)
		int max=0;
		char answer=' ';
		for(char x: map.keySet()) {
			if(max<map.get(x)) {
				max=map.get(x);
				answer=x;
			}
			
		}
		System.out.print(answer);
	
		
		/*
		 * ���� Ǭ ��� -
		int n= scanner.nextInt();
		char[] p= {'A', 'B', 'C', 'D', 'E'};
		String str= scanner.next();
		char[] list = str.toCharArray();
		int max=0;
		char answer=' ';
		
		for(int i=0; i<5; i++) {
			int num=0;
			for(int j=0; j<n; j++) {
				if(list[j]==p[i]) {
					num++;
				}
			}
			
			if(num>max) {
				max=num;
				answer=p[i];
		}
		}
		System.out.print(answer);
		*/
	}

}
