//두 배열 합치기
import java.util.Scanner;
public class cotest3_1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N= scanner.nextInt();
		int[] n= new int[N];
		for(int i=0; i<N; i++) {
			n[i]=scanner.nextInt();
		}
		int M= scanner.nextInt();
		int[] m=new int[M];
		for(int i=0; i<M; i++) {
			m[i]=scanner.nextInt();
		}
		//두 배열을 한번에 포인터(?)역할 하는 변수 이용하여 한 배열로 합치는 방법 중요!!
		int p1=0;
		int p2=0;
		int[] answer= new int[M+N];
		int i=0;
		while(p1<N && p2<M) {
			if(n[p1]>m[p2]) {
				answer[i++]=n[p1++];
			}
			else {
				answer[i++]=m[p2++];
			}
		}
		while(p1<N) {answer[i++]=n[p1++];}
		while(p2<M) {answer[i++]=m[p2++];}
		
		//이렇게 while문 이용하여 조건 성립하는 동안 배열에 넣어준다!! 
		//&& ++후위 연산자? 이용하여 깔끔하게 할 수 있다
		/*
		int[] answer= new int[M+N];
		for(int i=0; i<M; i++) {
			answer[i]=m[i];
		}
		for(int i=0; i<N; i++) {
			answer[M+i]=n[i];
		}
		while(1) {
			
			
		}
		//두 배열을 합친 후 정렬하는 방법은 별로!!
		for(int i=0; i<M+N; i++) {
			for(int j=i+1; j<M+N; j++) {
				if(answer[i]>answer[j]) {
					int temp=answer[j];
					answer[j]=answer[i];
					answer[i]=temp;;
				}
			}
		}
		for(int i=0; i<M+N; i++) {
			System.out.print(answer[i]+" ");
		}
		*/
	}
}


