package Unit6;
//Least Recently Used
import java.util.*;
public class cotest6_4 {
	public static void main(String []args) {
		Scanner scanner= new Scanner(System.in);
		//ArrayList<Integer> list= new ArrayList<>();
		int s= scanner.nextInt();
		int n= scanner.nextInt();
		//�迭�� �󸶳� �� ������, �ڵ带 ȿ�������� �� ¥���� ���⶧���� arraylist�̷��� ��� �迭�� ����Ѵ�
		int[] list= new int[s];
		int[] array= new int[n];
		for(int i=0; i<n; i++) {
			array[i]=scanner.nextInt();
		}
		//����� ���-> �迭�� �̿��Ͽ� ���ҵ��� ��� �̵���Ű�� ���!!
	    for(int i=0; i<n; i++) {// �ڵ� �� �� �����-> for(int x: array){ �̷���
	    	int pos=-1;//pos�� ���ؼ� �� ����Ʈ�� ���� �����ϴ����� üũ��
			for(int j=0; j<s; j++) {
				if(list[j]==array[i]) pos=j;
			}
			if(pos==-1) {// �������� �ʴ� ���, �Ǿ����� �űⱸ, �ڷκ��������
				for(int k=s-1; k>=1; k--) {
					list[k]=list[k-1];
				}// �ڿ������� ������ ����, �ڷ� ��������...
			}
			else {// �����ϴ� ���, �� index���ֵ��� ��ĭ�� �ڷ� �ű��, ��ó���� �־�����
				for(int l=pos; l>=1; l--) {
					list[l]=list[l-1];
				}
			}
			list[0]=array[i];
		}
	    for(int i=0; i<s; i++) {
			System.out.print(list[i]+" ");
			}
		/*
		 * runtime error�� �ߴµ� ����������?
		while(n!=0) {
			int tmp=scanner.nextInt();
			if(list.contains(tmp)) {
				if(list.size()==s) {
					int t=list.indexOf(list.get(tmp));
					int tt=list.get(0);
					list.add(0,tmp);
					list.add(t,tt);
				}
				else {
					list.add(0,tmp);
				}
			}
			else {
				if(list.size()==s) {
					list.remove(s-1);
					list.add(0,tmp);
				}
				else {
					list.add(0,tmp);
				}
			}
			n--;
		}
		for(int i=0; i<s; i++) {
		System.out.print(list.get(i)+" ");
		}
		*/
	}

}
