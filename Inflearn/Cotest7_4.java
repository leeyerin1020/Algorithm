package unit7;
//피보나치 재귀
import java.util.*;
public class Cotest7_4 {
	int sum=0;
	public void func(int n) {
		if(n>=1)System.out.print("1"+" ");
		int a=0;
		int b=1;
		while(n>1) {
			System.out.print((a+b) +" ");
			int c=b;
			b=a+b;
			a=c;
			n--;
			
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		Cotest7_4 c= new Cotest7_4();
		c.func
		(n);
	}

}
