import java.util.Scanner;
//근데 이문제 좀 애매하지않나..? 문제 이해하는데 있어서 좀 !
public class cotest5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		int last=str.length()-1;
		int first=0;
		char[] list =str.toCharArray();
		while(first<last) {
			if(!Character.isAlphabetic(list[first])) first++;
			//Character.isAlphabetic()함수를 통해 알파벳유무 판단!
			else if(!Character.isAlphabetic(list[last])) last--;
			else {
				char temp=list[first];
				list[first]=list[last];
				list[last]=temp;
				last--;
				first++;
			}
		}
	
		System.out.println(list);
	
	
	}
}