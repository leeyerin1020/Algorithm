import java.util.Scanner;
class cotest3 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str=scanner.nextLine();//next�� nextLine�� ���� Ȯ����!!
	//**next�� ����������� �� �ձ���, nextLine�� ���� �����Ͽ� ���� ���� 
	//1. split�Լ��� �̿��ϴ� ���
	/*
	String[] list=str.split(" ");// split�Լ��� ���� ���ڿ��� ��������� �ɰ���
	int max=-10;
	String answer="";

	for(String x: list) {
		int len=x.length();
		if(len>max) {
			max=len;
			answer=x;
		}
	}
	System.out.println(answer);
	*/
	//2. indexof, substring�� �̿��ϴ� ���
	int pos;
	int max=-10;
	String answer="";
	while((pos=str.indexOf(" "))!=-1) {
		if(max<pos) {
			max=pos;
			answer=str.substring(0,pos+1);
		}
		str=str.substring(pos+1);
		
	}
	System.out.println(answer);
	//�̷���,, �����Ͽ������ �߱���
	/*
	int num=0;
	int max=0;
	String m="";
	String ans="";
	for(char x: str.toCharArray()) {
		if(x==' ') {
			if(num>max) {
				ans=m;
				m="";
				num=0;
			}
		}
		m+=x;
		num++;
	}
	System.out.println(ans);
	*/
	}
}
