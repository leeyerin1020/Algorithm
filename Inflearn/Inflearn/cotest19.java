//�������
import java.util.Scanner;
public class cotest19 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		int[] list= new int[N];
		for(int i=0; i<N; i++) {
			list[i]=scanner.nextInt();
		}
		int score=0;
		int num=1;
		/*
		 * 1�� ��� �������Ѱ��� score�� �����ϰ� 0�� ������ �� ������ 0���� �ʱ�ȭ �ϴ¹��!
		 * if(list[i]=0){num=0;}
		 * else{
		 * num++;
		 * score+=num;
		 * }
		 * ��ó�� ���� �ռ� ���� ������ ���� �ʿ� ����..
		 */
		for(int i=0; i<N; i++) {
			if(list[i]==0) {;}
			else {
				if(i==0) {;}
				else if(list[i]==list[i-1]) {
					num++;
				}
				else {
					num=1;
				}
				score+=num;
			}
		}
		
		System.out.print(score);
	}
}