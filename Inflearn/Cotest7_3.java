package unit7;
//���丮��
import java.util.*;
public class Cotest7_3 {
	//�Լ��� return �޴� ����Լ�-> ���丮�� ���..!
	public int func(int n) {
		if(n==1) return 1;
		else {
			return n*func(--n);
		}
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		Cotest7_3 t= new Cotest7_3();
		System.out.println(t.func(7));
	}
}
