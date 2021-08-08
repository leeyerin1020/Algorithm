package programmers;
import java.util.*;
public class hash_1 {
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        HashMap<String, Integer> hash= new HashMap<>();
        for(int i=0; i<participant.length; i++) {
        	hash.put(participant[i], hash.getOrDefault(participant[i], 0)+1);
        }
        for(int i=0; i<participant.length-1; i++) {
        	hash.put(completion[i], hash.get(completion[i])-1);
        	
        }
        for(int i=0; i<participant.length;i++) {
        	if(hash.get(participant[i])!=0) {
        		answer+=participant[i];
        		break;
        	}
        }
        
        return answer;
    }
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String[] str1=  {"leo", "kiki", "eden"};
		String[] str2= {"eden", "kiki"};
		System.out.println(solution(str1, str2));
		
	}
	
	

}

