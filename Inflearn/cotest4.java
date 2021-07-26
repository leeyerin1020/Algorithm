import java.util.Scanner;
public class cotest4 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int N=scanner.nextInt();
		String[] list=new String[20];
		for(int i=0;i<N;i++) {
			list[i]=scanner.next();
		}
		for(int i=0;i<N;i++) {
			int length=list[i].length();
			char[] clist= new char[length];
			clist=list[i].toCharArray();
			for(int j=length-1;j>=0;j--) {
			System.out.print(clist[j]);
			}
			System.out.print('\n');
		}
		/*
		 나는 실제로 바꾸진 않고 그냥 print문을 통해서 바꾼척 한건데 실제로 직접 바꾸는 코드는
		 int lt=0, rt=s.length;
		 while(lt<rt){
		 	char tmp=s[lt];
		 	s[lt]=s[rt];
		 	s[rt]=tmp;
		 	lt++;
		 	rt--;
		 	//이런식으로 lt, rt값을 하나씩 증가, 감소시키면서 문자를 직접 바꿔준다
		 }
		 */
	}

}
