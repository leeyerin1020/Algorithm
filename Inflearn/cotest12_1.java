import java.util.Scanner;
public class cotest12_1 {
   public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int N= scanner.nextInt();
	    String s= scanner.next();
	    String answer="";
	    /*문자열의 문자하나하나에 접근해야한다고 생각해서 charArray로 바꿔주고 그랬는데
	             그럴 필요 없이 substring 이용하면 편하다.. 
	      && replace함수 이용시 특정 문자를 다른 문자로 바꿀 수 있다.
	    */
	    for(int i=0; i<N; i++) {
	    	String temp= s.substring(0,7).replace('#', '1').replace('*', '0');
	    	int num= Integer.parseInt(temp,2);
	    	answer+=(char)num;
	    	s=s.substring(7);
	    	//7개씩 뽑아내니깐 s자체를 7칸씩 미는작업
	    }
	    System.out.print(answer);
   }
}
