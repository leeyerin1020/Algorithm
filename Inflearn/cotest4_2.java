package Unit4;
import java.util.*;
public class cotest4_2 {
	public static void main(String[] args) {
		//강의에선, hashmap으로 만들어준후 그 value값을 --해주면서 0인경우 두개가 같은거니깐 이런 논리 이용함
		Scanner scanner = new Scanner(System.in);
		String st1= scanner.next();
		String st2= scanner.next();
		/*
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
		*/
		//HashMap 안쓰고 푼 방법
		char[] list1= st1.toCharArray();
		char[] list2= st2.toCharArray();
		int[] li1= new int[st1.length()];
		int[] li2= new int[st2.length()];
		for(int i=0; i<st1.length();i++) {
			for(int j=0; j<st2.length(); j++) {
				if(li2[j]!=1 && list2[j]==list1[i]) {
					li2[j]=1;
					break;
				}
			}
		}
		for(int i=0; i<st2.length(); i++) {
			if(li2[i]!=1) {
				System.out.println("NO");
				break;
			}
			else if(i==st2.length()-1) {
				System.out.println("YES");
			}
		}
		
		
	}
}
