import java.util.Scanner;
//�ٵ� �̹��� �� �ָ������ʳ�..? ���� �����ϴµ� �־ �� !
public class cotest5 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		String str=scanner.next();
		int last=str.length()-1;
		int first=0;
		char[] list =str.toCharArray();
		while(first<last) {
			if(!Character.isAlphabetic(list[first])) first++;
			//Character.isAlphabetic()�Լ��� ���� ���ĺ����� �Ǵ�!
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