
public class SelectionSort {
	
	public int[] SelectionSort(int A[]){
		
		/**/

		for(int j = 0; j<A.length;j++){
			int min = j;  //key���� ������ ���� ���� ã�ƾ� �ϹǷ� �̸� min�� �־��ش�.
			for(int i=j+1; i<A.length;i++){
				if(A[min]>A[i]){
					min=i; //key���� �۰� ���� �� �� ���� ���� ã�´�.
				}
			}
			
			int temp = A[min];
			A[min]=A[j];
			A[j]=temp;
		}
		
		return A;
	}
	
}
