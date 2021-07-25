import java.util.*;
class cotest2{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str;
		str=scanner.next();
		char[] list=new char[100];// 나는 list로 만들어서 각 문자에 접근했지만
		//String str="";이렇게 공백문자열 만들어둔 후 +연산자 이용하여 각 문자 추가하는 방법도 있음
		//str+=character.toUpperCase(x);
		list=str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if(list[i]>90) {
				list[i]=Character.toUpperCase(list[i]);
			}
			else
			list[i]=Character.toLowerCase(list[i]);
		}
		System.out.println(list);
	}
	

}
