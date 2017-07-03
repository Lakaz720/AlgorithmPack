
public class MaxSubarrProb {
	public int[] MaxSubarrProb(int A[], int low, int high){
		/*A solution using divide-and-conquer*/
		
		int mid = (low+high)/2;
		
		if(high == low){
			
			int result[] = {low, high, A[low]};
			return result;
			
		}else{
			
			int left[] = MaxSubarrProb(A, low, mid);
			//System.out.println("left result =>");
			
			int right[] = MaxSubarrProb(A, mid+1, high);
			//System.out.println("right result =>");
			
			int cross[] = MaxCrossSubarrProb(A, low, high, mid);
			//System.out.println("cross result =>");
			
			if(left[2]>=right[2]&&left[2]>=cross[2])return left;
			else if(right[2]>=left[2]&&right[2]>=cross[2])return right;
			else return cross;
		}
	}
	
	public int[] MaxCrossSubarrProb(int A[], int low, int high, int mid){
		
		int sum_left= Integer.MIN_VALUE;
		int sum_right= Integer.MIN_VALUE;
		int sum = 0;
		int max_left = low, max_right = high;
		
		for(int i=mid;i>low-1;i--){
			//배열이 0부터 시작해야 하므로 low에서 -1을 해줘서 A[0]도 계산할 수 있도록 한다.
			sum = sum+A[i];
			if(sum>sum_left){
				sum_left=sum;
				max_left=i;
			}
		}
		
		sum =0;
		
		for(int i=mid+1;i<high+1;i++){
			sum = sum+A[i];
			if(sum>sum_right){
				sum_right=sum;
				max_right=i;
			}
		}
		
		int result[] ={max_left, max_right, (sum_right+sum_left)};
		
		return result;
	}
}
