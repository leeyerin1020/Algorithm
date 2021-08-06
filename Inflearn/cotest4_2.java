package Unit4;
import java.util.*;
public class cotest4_2 {
	public static void main(String[] args) {
		//���ǿ���, hashmap���� ��������� �� value���� --���ָ鼭 0�ΰ�� �ΰ��� �����Ŵϱ� �̷� �� �̿���
		Scanner scanner = new Scanner(System.in);
		String st1= scanner.next();
		String st2= scanner.next();
		HashMap<Character, Integer> map1= new HashMap<>();
		for(char x: st1.toCharArray()) {
			map1.put(x, map1.getOrDefault(x, 0)+1);
		}
		HashMap<Character, Integer> map2= new HashMap<>();
		for(char x: st2.toCharArray()) {
			map2.put(x, map2.getOrDefault(x, 0)+1);
		}
		boolean answer=true;
		for(char x: map1.keySet()) {
			if(map1.get(x)!=map2.get(x)) {
				answer=false;
			}
		}
		if(answer) {
			System.out.printf("YES");
		}
		else {
			System.out.printf("NO");
		}
		
		/*�� ����� Ʋ���ǰ�??
		char[] list1= st1.toCharArray();
		char[] list2= st2.toCharArray();
		for(int i=0; i<st1.length();i++) {
			for(int j=0; j<st2.length(); j++) {
				if(list2[j]!=1 && list2[j]==list1[i]) {
					list2[j]=1;
				}
			}
		}
		for(int i=0; i<st2.length(); i++) {
			if(list2[i]==0) {
				System.out.println("NO");
				break;
			}
			else if(i==st2.length()-1) {
				System.out.println("YES");
			}
		}
		*/
		
	}
}
