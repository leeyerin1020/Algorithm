package Unit6;
//��������
import java.util.Scanner;
public class cotest6_2{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int[] list= new int[n];
		for(int i=0; i<n; i++) {
			list[i]=scanner.nextInt();
		}
	
		for(int j=0; j<n; j++) {// ũ�� n�� �ݺ��ϴ°� �³�??
			for(int i=0; i<n-1; i++) {
				if(list[i]>list[i+1]) {
					int temp=list[i+1];
					list[i+1]=list[i];
					list[i]=temp;
				}
			}
		}
		for(int k=0; k<n; k++) {
			System.out.print(list[k]+" ");
		}
		scanner.close();	
	}

}
