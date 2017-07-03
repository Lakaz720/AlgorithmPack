
public class HeapSort {
	
	
	public int Parent(int inode){
		return inode/2;
	}
	
	public int Left(int inode){
		return (2*inode);
	}
	
	public int Right(int inode){
		return (2*inode)+1;
	}
	
	public void MaxHeapify(int A[], int inode){
		
		int left = Left(inode)+1;
		int right = Right(inode)+1;
		
		int larg = 0;
		
		/*아래처럼하면 l과 r도 inode보다 클 경우 비교가됨. 처음에 l을 넣기떄문에 비교됨.*/
		if(left<=A.length-1&&A[left]>A[inode]){
			larg = left;
		}
		
		else larg = inode;
		
		if(right<=A.length-1&&A[right]>A[larg]){
			larg = right;
		}
		
		if(larg!=inode){
			int temp =A[inode];
			A[inode]=A[larg];
			A[larg]=temp;
			
			MaxHeapify(A, larg);
		}
		
	}
	
	public void BuildMaxHeap(int A[]){
		//int heap_temp[] = new int[A.length];
		
		for(int i=(A.length/2)-1;i>=0;i--){
			MaxHeapify(A,i);
			for(int k=0;k<A.length;k++){
				System.out.print(A[k]+" ");
			}System.out.println("   p : "+i+"");
		}
	}
	
	public int[] SizeHeap(int A[]){
		
		int result[] = new int[A.length-1];
		
		for(int i =0;i<result.length;i++){
			result[i]=A[i];
		}
		
		return result;
	}
	
	

	public int[] Heapsort(int A[]){
		
		BuildMaxHeap(A);
		
		int result[] = new int[A.length];
		
		for(int i = A.length-1;i>=0;i--){
			
			int temp = A[i];
			A[i]=A[0];
			A[0]=temp;
			
			for(int k=0;k<A.length;k++){
				System.out.print(A[k]+" ");
			}System.out.println("   sort : "+A[i]+"");
			
			result[i]=A[i];
			
			A=SizeHeap(A);
			
			MaxHeapify(A, 0);
		}
		
		return result;
		
	}
	
}
