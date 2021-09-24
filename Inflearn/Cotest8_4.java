package unit8;
import java.util.*;
public class Cotest8_4 {
	static int[] pm;
	static int n,m;
	public void DFS(int L) {
	  	 if(L==m) {
	  		for(int x: pm) System.out.print(x+" ");
	  		System.out.println();
	  	 }
	  	 else {
	  		 for(int i=1; i<=n; i++) {
	  			 pm[L]=i;
	  			 DFS(L+1);
	  		 }
	  	 }
	}
	public static void main(String[] args) {
		Cotest8_4 c= new Cotest8_4();
		Scanner scanner = new Scanner(System.in);
		n= scanner.nextInt();
		m= scanner.nextInt();
		pm= new int[m];
		c.DFS(0);
	}

}
