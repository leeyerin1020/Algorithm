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
		 ���� ������ �ٲ��� �ʰ� �׳� print���� ���ؼ� �ٲ�ô �Ѱǵ� ������ ���� �ٲٴ� �ڵ��
		 int lt=0, rt=s.length;
		 while(lt<rt){
		 	char tmp=s[lt];
		 	s[lt]=s[rt];
		 	s[rt]=tmp;
		 	lt++;
		 	rt--;
		 	//�̷������� lt, rt���� �ϳ��� ����, ���ҽ�Ű�鼭 ���ڸ� ���� �ٲ��ش�
		 }
		 */
	}

}
