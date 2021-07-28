//가위 바위 보
import java.util.Scanner;
public class cotest15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N=scanner.nextInt();
		int[] A= new int[N];
		int[] B= new int[N];
		for(int i=0; i<N;i++) {
			A[i]=scanner.nextInt();
		}
		for(int k=0; k<N;k++) {
			B[k]= scanner.nextInt();
		}
		//ListArray<Character> list[]= new <>ListArray();
		//ListArray 기억안난다!!
		//계속 if문 하는 방법 말고
		//( ? :)이런식으로 어떤 조건 성립하는 경우에는 a 아닌경우에는 b이렇게 하는 문법이 있는데..
		String answer="";
		for(int j=0; j<N; j++) {
			if(A[j]==B[j]) {
				answer+="D"+"\n";
			}
			/*
			 * else if(a가 이길수 있는 경우->1,2,3에 대해서만 해주면)
			 * 나머지는 else로 b가 이긴다고 처리하면 됨
			 */
			else if(A[j]==1) {
				if(B[j]==2) {
					answer+="B"+"\n";
				}
				else {
					answer+="A"+"\n";
				}
			}
			else if(A[j]==2) {
				if(B[j]==3) {
					answer+="B"+"\n";
				}
				else {
					answer+="A"+"\n";
				}
			}
			else if(A[j]==3) {
				if(B[j]==1) {
					answer+="B"+"\n";
				}
				else {
					answer+="A"+"\n";
				}
			}
		}
		System.out.print(answer);
	}
}
