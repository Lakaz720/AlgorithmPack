
public class InsertionSort{
	
	public int[] Insertionsort(int A[]){
		
		/**/
		
		for(int j = 1; j<A.length;j++){
			
			int key = A[j]; //Select key
			int i=j-1;      
			while(i>=0&&A[i]>key){ //0���� �����ϹǷ� 0�� ���Խ��״�.
				A[i+1]=A[i];
				i=i-1;
			}
			A[i+1]=key;
		}
		
		return A;
	}

}
