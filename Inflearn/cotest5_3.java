package Unit5;
//이차원배열 k[][]가 있을때
//k.length->행의 길이
//k[0].length-.열의 길이!
import java.util.*;
public class cotest5_3{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		int[][] board= new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				board[i][j]=scanner.nextInt();
			}
		}
		int m=scanner.nextInt();
		int[] moves= new int[m];
		for(int i=0; i<m; i++) {
			moves[i]=scanner.nextInt();
		}
		
		Stack<Integer> stack= new Stack<>();
		int answer=0;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
					if(board[j][moves[i]-1]!=0) {
						int tmp=board[j][moves[i]-1];
						board[j][moves[i]-1]=0;
						if(!stack.isEmpty()&&stack.peek()==tmp) {
							answer+=2;
							stack.pop();
						}
						else stack.push(tmp);
						break;
					}	
			}	
		}
		
		
		System.out.println(answer);
		
	}

}
