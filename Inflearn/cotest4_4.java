package Unit4;
import java.util.*;
public class cotest4_4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s= scanner.next();
		String t= scanner.next();
		HashMap<Character,Integer> Tmap= new HashMap<>();
		HashMap<Character,Integer> Smap= new HashMap<>();
		for(int i=0; i<t.length();i++) {
			Tmap.put(t.toCharArray()[i], Tmap.getOrDefault((t.toCharArray()[i]), 0)+1);
		}
		for(int j=0; j<s.length();j++) {
			Smap.put(s.toCharArray()[j], Smap.getOrDefault((s.toCharArray()[j]), 0)+1);
		}
		int lt=0; int rt=t.length();
		int answer=0;
		boolean b=true;
		while(rt<=s.length()) {
			for(int i=0; i<t.length(); i++) {
				if(Smap.get(s.toCharArray()[lt])!=Tmap.get(s.toCharArray()[lt])) 
					b=false;
			}
			if(b)answer++;
			b=true;
			lt++; rt++;
		}
		System.out.print(answer);
		
	}

}
