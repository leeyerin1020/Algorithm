package Unit4;// 내 방법이 틀린건지 궁금하다
import java.util.*;
public class cotest4_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		int n= scanner.nextInt();
		//해시맵을 이용해서 key, value로 
		HashMap<Character, Integer> map= new HashMap<>();
		String str= scanner.next();
		for(char x: str.toCharArray()) {
			map.put(x, map.getOrDefault(x,0)+1);//for-each문을 돌면서 해시맵에 put해준다
		}
		//put함수-> 키값, value값 각각 넣어준다
		//map.getOrDefault-> 이함수 중요하다!
		//x의 value값을 가져오거나 없는 경우(즉,새롭게 key로 등록되는 경우 0이라는 default값으로)
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
		 * 내가 푼 방법 -
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
