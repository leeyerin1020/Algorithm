package Unit6;
//�峭�ٷ���-> ����� ��� Ʋ����?
import java.util.*;
public class cotest6_6{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int[] list= new int[n];
		for(int i=0; i<n; i++) {
			list[i]=scanner.nextInt();
		}
		int[] real= list.clone();
		//�迭 ��ü�� �ٸ� �迭�� �����Ҷ� int[]real= list�̷��� �ع�����, 
		//list�迭�� real �迭�� �����Ѽ�-> list�迭�� ��������!! ���� clone�̶�� �Լ��� �̿��Ѵ�!
		
		Arrays.sort(real);
		//int �迭�� Arrays.sort�̷��� , Ŭ�����̿��Ͽ� �������� ���� ������!!
	
		for(int i=0; i<n; i++) {
			System.out.print(real[i]+" ");
			 
		}
		for(int i=0; i<n; i++) {
			if(real[i]!=list[i]) {
				System.out.print(i+1+" ");
			}
		}
		/*
		int index=0;
		int index2=0;
		for(int i=0; i<n-1; i++) {
			if(list[i]>=list[i+1]) {
				index=i;
				break;
			}
		}
		
		for(int j=index; j<n-1; j++) {
			if(list[j]<=list[index]&&list[index]<=list[j+1]) {
				index2=j+1;
			}
		}
		int answer=index+1;

		System.out.print(answer+" "+index2);
	*/
		scanner.close();
	}

}
