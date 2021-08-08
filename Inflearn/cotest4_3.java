//time exceed-> strig에 +연산으로 이어붙이는 것보다 arraylist이용하는것이 빠른가봄
package Unit4;
import java.util.*;
public class cotest4_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int k= scanner.nextInt();
		scanner.nextLine();//  이거 안해주면 엔터같은거 가져오는듯..(nextLine여서 그런듯?)
		String[] s= scanner.nextLine().split(" ");
	
		HashMap<String, Integer> map= new HashMap<>();
		for(int i=0; i<k-1; i++) {
			map.put(s[i], map.getOrDefault(s[i],0)+1);
		}
		int lt=0;
		ArrayList<Integer> answer= new ArrayList<>();
		//String answer="";
		for(int rt=k-1; rt<n; rt++) {
			map.put(s[rt], map.getOrDefault(s[rt], 0)+1);
			//answer+=map.size()+" ";-> 시간 단축위해 arraylist이용함!
			answer.add(map.size());
			map.put(s[lt], map.get(s[lt])-1);
			if(map.get(s[lt])==0) map.remove(s[lt]);
			lt++;
		}
		
		for(int i=0; i<answer.size(); i++) {
			System.out.print(answer.get(i)+" ");
		}
	}

}
/*
int j=0;
int num=0;
for(int i=0; i<list.length ; i++) {
	j++;
	map.put(list[i],map.getOrDefault(list[i],0)+1);

	if(j%k==0) {
		int value=map.get(list[num])-1;
		map.put(list[num],value);
		if(value>=0) {
		answer+=map.size()+" ";
		}
		else {
			map.remove(list[num]);
		}
		num++;
		j=k-1;
	}
}
/*
for(int i=0; i<=list.length-k; i++) {
	HashMap<Integer, Integer> map= new HashMap<>();
	for(int j=i; j<i+k; j++) {
		map.put(list[j],map.getOrDefault(0,0));
	}
	answer+=map.size()+" ";
}
*/
