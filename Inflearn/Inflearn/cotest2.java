import java.util.*;
class cotest2{
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		String str;
		str=scanner.next();
		char[] list=new char[100];// ���� list�� ���� �� ���ڿ� ����������
		//String str="";�̷��� ���鹮�ڿ� ������ �� +������ �̿��Ͽ� �� ���� �߰��ϴ� ����� ����
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
