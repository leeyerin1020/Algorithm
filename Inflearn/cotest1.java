import java.util.*;
class cotest1 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str;
	char c;
	int num=0;
	str=scanner.nextLine();
	c=scanner.next().charAt(0);//문자 하나를 선택하기 위해선 charAt함수 이용
	str=str.toUpperCase();
	c=Character.toUpperCase(c);
	for(int i=0; i<str.length();i++) {
		if(str.charAt(i)==c) {
			num++;
		}
	}
	System.out.println(num);
	return;
	}
}
