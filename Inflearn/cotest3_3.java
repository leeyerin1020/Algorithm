//최대매출 -> time exceed
import java.util.Scanner;
public class cotest3_3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int k= scanner.nextInt();
		scanner.nextLine();
		int[] list= new int[n];
		
		
		String[] str=scanner.nextLine().split(" ");
		scanner.close();
		for(int i=0; i<n; i++) {
			list[i]= Integer.parseInt(str[i]);
		}
		
		int max=0;
		for(int i=0; i<n-k +1; i++) {
			int sum=0;
			for(int j=i; j<i+k; j++) {
				sum+=list[j];
				//if(max<sum) max=sum;
				max= sum>max ? sum: max;
			}
		}
		System.out.println(max);
		
	}

}
