import java.util.Scanner;
public class cotest12_1 {
   public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    int N= scanner.nextInt();
	    String s= scanner.next();
	    String answer="";
	    /*���ڿ��� �����ϳ��ϳ��� �����ؾ��Ѵٰ� �����ؼ� charArray�� �ٲ��ְ� �׷��µ�
	             �׷� �ʿ� ���� substring �̿��ϸ� ���ϴ�.. 
	      && replace�Լ� �̿�� Ư�� ���ڸ� �ٸ� ���ڷ� �ٲ� �� �ִ�.
	    */
	    for(int i=0; i<N; i++) {
	    	String temp= s.substring(0,7).replace('#', '1').replace('*', '0');
	    	int num= Integer.parseInt(temp,2);
	    	answer+=(char)num;
	    	s=s.substring(7);
	    	//7���� �̾Ƴ��ϱ� s��ü�� 7ĭ�� �̴��۾�
	    }
	    System.out.print(answer);
   }
}
