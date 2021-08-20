package Unit6;
import java.util.*;
//강사님은 좌표가 나오는 경우, 좌표를 저장하는 클래스를 만들어서 처리해준다고 하심
class Point implements Comparable<Point>{// Comparable 인터페이스 implements하여 정렬할 때 이용한다.
	public int x, y;
	Point(int x, int y){// 좌표 받는 Point 객체, 초기화해주는 생성자 
		this.x=x;
		this.y=y;
	}
	@Override
	public int compareTo(Point o) {// compareTo 함수를 꼭 override해줘야함
		if(this.x==o.x) return this.y-o.y;
		else return this.x-o.x;
	}
}
public class cotest6_7 {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		int n= scanner.nextInt();
		//좌표라는 객체를 받는 arrayList를 선언해줭함!
		ArrayList<Point> list= new ArrayList<>();
		for(int i=0; i<n; i++) {
			int x= scanner.nextInt();
			int y= scanner.nextInt();
			list.add(new Point(x,y));
		}
		Collections.sort(list);
		
		/*내가 푼 방법 왜 틀렸을까
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
