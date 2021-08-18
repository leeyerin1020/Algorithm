package Unit6;
import java.util.*;
public class cotest6_7 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		int[][] list= new int[n][2];
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				list[i][j]=scanner.nextInt();
			}
		}
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				if(list[j][0]>list[j+1][0]) {
					int temp=list[j][0];
					int temp2= list[j][1];
					list[j][0]=list[j+1][0];
					list[j][1]=list[j+1][1];
					list[j+1][0]=temp;
					list[j+1][1]=temp2;
				}
			}
		}
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				if(list[j][0]==list[j+1][0]) {
					if(list[j][1]>list[j+1][1]) {
					int temp= list[j][1];
					list[j][1]=list[j+1][1];
					list[j+1][1]=temp;
				}
			}
		}
		
	}
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(list[i][j]+" ");
			}
			System.out.println();
		}
	}

}
