package Unit6;
//Least Recently Used
import java.util.*;
public class cotest6_4 {
	public static void main(String []args) {
		Scanner scanner= new Scanner(System.in);
		//ArrayList<Integer> list= new ArrayList<>();
		int s= scanner.nextInt();
		int n= scanner.nextInt();
		//배열을 얼마나 잘 쓰는지, 코드를 효율적으로 잘 짜는지 보기때문에 arraylist이런거 대신 배열을 써야한대
		int[] list= new int[s];
		int[] array= new int[n];
		for(int i=0; i<n; i++) {
			array[i]=scanner.nextInt();
		}
		//강사님 방식-> 배열을 이용하여 원소들을 계속 이동시키는 방법!!
	    for(int i=0; i<n; i++) {// 코드 좀 더 깔끔히-> for(int x: array){ 이렇게
	    	int pos=-1;//pos를 통해서 이 리스트에 현재 존재하는지를 체크함
			for(int j=0; j<s; j++) {
				if(list[j]==array[i]) pos=j;
			}
			if(pos==-1) {// 존재하지 않는 경우, 맨앞으로 옮기구, 뒤로보내줘야함
				for(int k=s-1; k>=1; k--) {
					list[k]=list[k-1];
				}// 뒤에서부터 앞으로 오면, 뒤로 땡겨지네...
			}
			else {// 존재하는 경우, 그 index전애들을 한칸씩 뒤로 옮기고, 맨처음에 넣어주지
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
		 * runtime error가 뜨는데 뭐때문이지?
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
