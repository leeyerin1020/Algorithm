package programmers;
import java.util.*;
public class hash_3 {
	public static int solution(String[][] clothes) {
		int answer=1;
		HashMap<String, Integer> hash= new HashMap<>();
		for(int i=0; i<clothes.length; i++) {
			hash.put(clothes[i][1], hash.getOrDefault(clothes[i][1],0)+1);
		}//getOrDefault�Լ��� ����Ͽ� �ش� ī�װ��� ���� ���� ���������ش�!
		for(String x: hash.keySet()) {
			answer*=(hash.get(x)+1);//�׷��� �ؼ� �� ������ ���� ���� �˾Ƴ���!
		}
        answer-=1;
        
        //key,value ������ �ؽ��� �̿��Ͽ� �� �η��� ��->key�̿�, value�� ���� �̸��� �ƴ�, ������ �־������ν� �ذ�       
      
        return answer;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[][] str1= {{"yellowhat", "headgear"}, 
				{"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};		
		System.out.println(solution(str1));
		
	}
	
	

}
