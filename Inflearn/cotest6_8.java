package Unit6;
//�̺а˻�
//lt=0, rt=n-1�̷��� �� �� , mid=(lt+rt)/2 �̷��� �ϸ鼭 �˻� ������ 1/2�� �ٿ����� ���!
import java.util.*;
public class cotest6_8 {
	public static void main(String []args) {
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		int m= scanner.nextInt();
		int[] list= new int[n];
		for(int i=0; i<n; i++) {
			list[i]=scanner.nextInt();
		}
		Arrays.sort(list);
		int lt=0; int rt=n-1;
		int answer=0;
		while(true) {// while(lt<=rt)�̷��� lt�� rt�� �Ѿ�� ��������!!
			int mid= (lt+rt)/2;
			if(list[mid]==m) {
				answer=mid+1;
				break;
			}
			else if(list[mid]>m) {//m���� mid���� �� ū ���, ������ �� ������ ������ mid-1
				rt=mid-1;
			}
			else if(list[mid]<m) {
				lt=mid+1;
			}
		}
		System.out.println(answer);
		/*
		for(int i=0; i<n; i++) {
			if(list[i]==m) {
				System.out.println(i+1);
				break;
			}
		}
		���� Ǭ ����� �̺а˻��� �ƴϰ�, �����˻���!!
		*/
				
	}

}
