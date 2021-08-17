package Unit6;
import java.util.*;
public class cotest6_4{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		LinkedList<Integer> list= new LinkedList<>();
		int s= scanner.nextInt();
		int n= scanner.nextInt();
		int[] array= new int[n];
		for(int i=0; i<n; i++) {
			array[i]=scanner.nextInt();
		}
		
		list.add(array[0]);
		
		for(int i=0; i<n; i++) {
			if(list.size()<5) {
				if(!list.contains(array[i])) {
					list.add(0,array[i]);// 처음에 넣어준다
				}
				else {
					int temp= list.remove(array[i]);
					list.add(0,temp);
				}
			}
			else {
				if(!list.contains(array[i])) {
					list.remove(s-1);
					for(int l=0; l<s-1;i++ ) {
						//list.add
					}
					list.add(0, array[i]);
				}
				else {
					int temp= list.remove(array[i]);
					list.add(0,temp);
				}
			}	
		}
		for(int i=0; i<s; i++) {
			System.out.print(list.get(i)+" ");
		}
	}
}
