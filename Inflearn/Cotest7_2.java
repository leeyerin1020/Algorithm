package unit7;
//재귀함수를 이용한 이진수 출력
import java.util.*;
public class Cotest7_2 {
	public void func(int n) {
		if(n<2) {
			System.out.print(1);
			
			return;
		}
		int k=n/2;
		func(k);
		System.out.print(n%2);
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		Cotest7_2 c= new Cotest7_2();
		c.func(n);
	}

}
