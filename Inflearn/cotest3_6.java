package Unit3;
//�ִ� ���� ���Ӻκм���-> ����, ���俩�� time exceed ���õ�..?
import java.util.Scanner;
public class cotest3_6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int k= scanner.nextInt();
		
		int[] list= new int[n];
		for(int i=0; i<n; i++) {
			list[i]=scanner.nextInt();
		}

		int max=0;
		for(int i=0; i<n; i++) {
			int num=0;
			int kk=k;
			for(int j=i; j<n; j++) {
				if(list[j]==1) {
					num++;
				}
				else if(list[j]==0 && kk>0) {
					num++;
					kk--;
				}
				else {
					if(num>max) max=num;
					break;
				}
			}
		}
		System.out.println(max);
		
	}

}
