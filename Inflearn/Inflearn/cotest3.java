import java.util.Scanner;
class cotest3 {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	String str=scanner.nextLine();//next와 nextLine의 차이 확실히!!
	//**next는 공백기준으로 그 앞까지, nextLine은 공백 포함하여 한줄 전부 
	//1. split함수를 이용하는 방법
	/*
	String[] list=str.split(" ");// split함수를 통해 문자열을 공백단위로 쪼개줌
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
	//2. indexof, substring을 이용하는 방법
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
	//이런식,, 컴파일에러라고 뜨긴함
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
