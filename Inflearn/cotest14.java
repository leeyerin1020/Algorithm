import java.util.Scanner;
public class cotest14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N=scanner.nextInt();
		int[] list=new int[N];
		for(int i=0; i<N;i++) {
			list[i]=scanner.nextInt();
		}
		int max=-100;
		int cnt=0;
		for(int i=0; i<N; i++) {
			if(list[i]>max) {
				max=list[i];
				cnt++;
			}
			
		}
		//��¥�� ��ó������ �Ź� ���� �ʿ� ����
		//�׳� max�� ������ �� �����ֱ�
		/*
		 * ���� for���� time exceed��!
		for(int i=0; i<N;i++) {
			list[i]=scanner.nextInt();
		}
		int num=0;
		for(int i=0; i<N; i++) {
			for(int k=0; k<i; k++) {
				if(list[k]>=list[i])
					num++;
			}
			if(num==0)
				cnt++;
			num=0;
		}
		*/
	
		System.out.print(cnt);
	}
}

