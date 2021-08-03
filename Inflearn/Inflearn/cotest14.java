import java.util.Scanner;
public class cotest14 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N=scanner.nextInt();
		int[] list=new int[N];
		for(int i=0; i<N;i++) {
			list[i]=scanner.nextInt();
		}
		int max=-100;
		int cnt=0;
		for(int i=0; i<N; i++) {
			if(list[i]>max) {
				max=list[i];
				cnt++;
			}
			
		}
		//어짜피 맨처음부터 매번 비교할 필욘 없지
		//그냥 max를 정의한 후 비교해주기
		/*
		 * 이중 for문은 time exceed임!
		for(int i=0; i<N;i++) {
			list[i]=scanner.nextInt();
		}
		int num=0;
		for(int i=0; i<N; i++) {
			for(int k=0; k<i; k++) {
				if(list[k]>=list[i])
					num++;
			}
			if(num==0)
				cnt++;
			num=0;
		}
		*/
	
		System.out.print(cnt);
	}
}

