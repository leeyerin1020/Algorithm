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
		int num=0;
		int kk=k;
		int answer=0;
		for(int i=0; i<n; i++) {
			if(list[i]==0) {
				kk--;
				if(kk<0) {
					answer=num;
					break;
				}
				num++;
			}
			num++;	
		}
		
	}

}
