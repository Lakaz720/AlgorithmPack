
public class PriorityQueues {
	
	public int HeapMax(int A[]){
		return A[0];
	}
	
	public int Parent(int inode){
		return inode/2;
	}
	
	public int Left(int inode){
		return 2*inode;
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
	
	public int[] DecSizeHeap(int A[]){
		
		int result[] = new int[A.length-1];
		
		for(int i =0;i<result.length;i++){
			result[i]=A[i];
		}
		
		return result;
	}
	
	public int[] IncSizeHeap(int A[], int key){
		int result[] = new int[A.length+1];
		
		for(int i=0;i<result.length-1;i++){
			result[i]=A[i];
		}
		result[result.length-1]=key;
		
		return result;
	}
	
	public int HeapExtMax(int A[]){
		
		int max=0;
		if(A.length<0){
			System.out.println("heap underflow");
		}
		max=A[0];
		A[0]=A[A.length-1];
		A=DecSizeHeap(A);
		MaxHeapify(A,0);
		
		return max;
	}
	
	public void HeapIncKey(int A[], int i, int key){
		if(key<A[i]){
			System.out.println("new key is smaller than current key");
		}
		
		A[i]=key;
		while(i>0&&A[Parent(i)]<A[i]){
			int temp = A[i];
			A[i]=A[Parent(i)];
			A[Parent(i)]=temp;
			i=Parent(i);
		}
	}
	
	public void PriorityQueues(int A[]){
		
		
		
	}

}
