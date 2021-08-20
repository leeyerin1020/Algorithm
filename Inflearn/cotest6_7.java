package Unit6;
import java.util.*;
//������� ��ǥ�� ������ ���, ��ǥ�� �����ϴ� Ŭ������ ���� ó�����شٰ� �Ͻ�
class Point implements Comparable<Point>{// Comparable �������̽� implements�Ͽ� ������ �� �̿��Ѵ�.
	public int x, y;
	Point(int x, int y){// ��ǥ �޴� Point ��ü, �ʱ�ȭ���ִ� ������ 
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point o) {// compareTo �Լ��� �� override�������
		if(this.x==o.x) return this.y-o.y;
		else return this.x-o.x;
	}
}
public class cotest6_7 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		//��ǥ��� ��ü�� �޴� arrayList�� �����آa��!
		ArrayList<Point> list= new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x= scanner.nextInt();
			int y= scanner.nextInt();
			list.add(new Point(x,y));
		}
		Collections.sort(list);
		
		/*���� Ǭ ��� �� Ʋ������
		int[][] list= new int[n][2];
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				list[i][j]=scanner.nextInt();
			}
		}
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				if(list[j][0]>list[j+1][0]) {
					int temp=list[j][0];
					int temp2= list[j][1];
					list[j][0]=list[j+1][0];
					list[j][1]=list[j+1][1];
					list[j+1][0]=temp;
					list[j+1][1]=temp2;
				}
			}
		}
		for(int i=0; i<n-1; i++) {
			for(int j=0; j<n-1; j++) {
				if(list[j][0]==list[j+1][0]) {
					if(list[j][1]>list[j+1][1]) {
					int temp= list[j][1];
					list[j][1]=list[j+1][1];
					list[j+1][1]=temp;
				}
			}
		}
		
	}
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				System.out.print(list[i][j]+" ");
			}
			System.out.println();
		}
		*/
	}

}
