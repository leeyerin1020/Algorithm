package programmers;
import java.util.*;
public class hash_3 {
	public static int solution(String[][] clothes) {
		int answer=1;
		HashMap<String, Integer> hash= new HashMap<>();
		for(int i=0; i<clothes.length; i++) {
			hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1],0)+1);
		}//getOrDefault함수를 사용하여 해당 카테고리의 옷의 수를 증가시켜준다!
		for(String x: hash.keySet()) {
			answer*=(hash.get(x)+1);//그렇게 해서 각 종류의 옷의 수를 알아낸다!
		}
        answer-=1;
        
        //key,value 구조인 해쉬를 이용하여 그 부류의 옷->key이용, value는 옷의 이름이 아닌, 개수를 넣어줌으로써 해결       
      
        return answer;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] str1= {{"yellowhat", "headgear"}, 
				{"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};		
		System.out.println(solution(str1));

		
		
	}
	
	

}
