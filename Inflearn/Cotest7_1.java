package unit7;
//����Լ�(����������)
/*
 * ����Լ�-> ���ñ����� �Լ��� ����ȴٰ� �����ϸ� ��
 * func(3)-> func(2)-> func(1)-> func(0) �̷��� �켱 ����� �� 
 * 0�̸� if ���� �ɷ��� return �ǰ� �������� �Լ� ȣ��� �� ������ �ٺ��� ����Ǿ� �Լ� ������ �Ϸ��Ѵ�! 
 */ 
import java.util.*;
public class  Cotest7_1{
	public void func(int n) {
		if(n==0)return;
		else {
		func(n-1);
		System.out.print(n+" ");
		// �̷��� func(n-1) �Ʒ��ٿ� print�ؾ�  1, 2, 3,�̷��� ���°Ű� 
		//func(n-1) ���� print���ָ� 3, 2, 1�̷��� �ȴ�!
		}
	}
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		
		Cotest7_1 c= new Cotest7_1();// Ŭ���� ��ü? ���� �Լ� ȣ���ؾ���
		c.func(n);
	}

}
