
public class BubbleSort {

	public int[] BubbleSort(int A[]){
	
		int temp=0;
		
		for(int i=0;i<A.length;i++){
			for(int j=A.length-1;j>i;j--){ 
				/* Changed i from i+1, 
				 * Because array A started 0 not 1. */
				if(A[j]<A[j-1]){
					temp=A[j];
					A[j]=A[j-1];
					A[j-1]=temp;
				}
			}
		}
		
		return A;
	}
	
}
