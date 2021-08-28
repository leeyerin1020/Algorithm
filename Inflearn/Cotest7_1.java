package unit7;
//재귀함수(스택프레임)
/*
 * 재귀함수-> 스택구조로 함수가 저장된다고 생각하면 됨
 * func(3)-> func(2)-> func(1)-> func(0) 이렇게 우선 저장된 후 
 * 0이면 if 문에 걸려서 return 되고 나머지는 함수 호출된 그 이후의 줄부터 실행되어 함수 수행을 완료한다! 
 */ 
import java.util.*;
public class  Cotest7_1{
	public void func(int n) {
		if(n==0)return;
		else {
		func(n-1);
		System.out.print(n+" ");
		// 이렇게 func(n-1) 아랫줄에 print해야  1, 2, 3,이렇게 가는거고 
		//func(n-1) 위에 print해주면 3, 2, 1이렇게 된다!
		}
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		
		Cotest7_1 c= new Cotest7_1();// 클래스 객체? 만들어서 함수 호출해야지
		c.func(n);
	}

}
