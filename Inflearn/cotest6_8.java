package Unit6;
//이분검색
//lt=0, rt=n-1이렇게 둔 후 , mid=(lt+rt)/2 이렇게 하면서 검색 범위를 1/2로 줄여가는 방식!
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
		while(true) {// while(lt<=rt)이렇게 lt가 rt를 넘어가기 전까지만!!
			int mid= (lt+rt)/2;
			if(list[mid]==m) {
				answer=mid+1;
				break;
			}
			else if(list[mid]>m) {//m보다 mid값이 더 큰 경우, 범위를 그 안으로 좁히지 mid-1
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
		내가 푼 방법은 이분검색이 아니고, 순차검색임!!
		*/
				
	}

}
