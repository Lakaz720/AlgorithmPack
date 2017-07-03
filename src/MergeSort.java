
public class MergeSort {

	public void MergeSort(int A[], int p, int r){
		
		if(p<r){
			int q=(p+r)/2;
			MergeSort(A,p,q);
			MergeSort(A,q+1,r);
			Merge(A,p,q,r);
		}
		
		
		
	}
	
	public void Merge(int A[], int p, int q, int r){
		
		/*
		 * just merge.
		 * 
		 * p: start point
		 * q: subarray n1=A[p..q] n2=A[q+1..r]
		 * r: end point
		 * 
		 * if you want initial array, 
		 * p: 0
		 * r: A.length
		 *  
		 * */
		
		int n1 = q-p+1; 
		int n2 = r-q;
		
		//System.out.println(n1+"    "+n2);
		int L[]= new int[n1+1];
		int R[]= new int[n2+1];
		int i, j;
		
		for(i=0;i<n1;i++){
			L[i]=A[p+i];
		}
		for(j=0;j<n2;j++){
			R[j]=A[q+j+1];
		}
		
		L[n1]=Integer.MAX_VALUE;
		R[n2]=Integer.MAX_VALUE;
		
		i=0;
		j=0;
		
		for(int k=p;k<=r;k++){
			if(L[i]<=R[j]){
				A[k]=L[i];
				i++;
			}
			else{
				A[k]=R[j];
				j++;
			}
		}
		
		System.out.print("동작확인 : ");
		for(int o=0;o<A.length;o++){System.out.print(A[o]+" ");}
		System.out.println("");
	}
	
	
	
}
