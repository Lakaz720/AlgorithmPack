
public class SelectionSort {
	
	public int[] SelectionSort(int A[]){
		
		/**/

		for(int j = 0; j<A.length;j++){
			int min = j;  //key보다 어차피 작은 것을 찾아야 하므로 미리 min에 넣어준다.
			for(int i=j+1; i<A.length;i++){
				if(A[min]>A[i]){
					min=i; //key보다 작고 남은 수 중 작은 수를 찾는다.
				}
			}
			
			int temp = A[min];
			A[min]=A[j];
			A[j]=temp;
		}
		
		return A;
	}
	
}
