//���ӵ� �ڿ����� ��
import java.util.Scanner;
public class cotest3_5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int sum=0;
		int answer=0;
		int lt=1;
		//for�� n���� ���� �ʿ� ���� 15/2=7 7+1=8���� for�� �����°���!
		//��¥�� 15�̻� �Ѿ������ �ȵǴ°Ŵϱ�
		for(int i=1; i<n;i++) {
			sum+=i;
			if(sum==n) answer++;
			while(sum>=n) {
				sum-=lt;
				lt++;
				if(sum==n) answer++;
			}
		}
		System.out.print(answer);
	}

}
