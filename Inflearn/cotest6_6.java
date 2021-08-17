package Unit6;
//장난꾸러기-> 내방법 어디가 틀렸지?
import java.util.*;
public class cotest6_6{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		int[] list= new int[n];
		for(int i=0; i<n; i++) {
			list[i]=scanner.nextInt();
		}
		int[] real= list.clone();
		//배열 전체를 다른 배열에 복사할때 int[]real= list이렇게 해버리면, 
		//list배열이 real 배열을 가리켜서-> list배열이 없어지지!! 따라서 clone이라는 함수를 이용한다!
		
		Arrays.sort(real);
		//int 배열도 Arrays.sort이렇게 , 클래스이용하여 오름차순 정렬 가능함!!
	
		for(int i=0; i<n; i++) {
			System.out.print(real[i]+" ");
			 
		}
		for(int i=0; i<n; i++) {
			if(real[i]!=list[i]) {
				System.out.print(i+1+" ");
			}
		}
		/*
		int index=0;
		int index2=0;
		for(int i=0; i<n-1; i++) {
			if(list[i]>=list[i+1]) {
				index=i;
				break;
			}
		}
		
		for(int j=index; j<n-1; j++) {
			if(list[j]<=list[index]&&list[index]<=list[j+1]) {
				index2=j+1;
			}
		}
		int answer=index+1;

		System.out.print(answer+" "+index2);
	*/
		scanner.close();
	}

}
