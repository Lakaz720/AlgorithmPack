import java.util.Scanner;

public class AlgorithmPack {
	
	enum Option{
		INSERTION,
		MERGE,
		SELECTION,
		BUBBLE,
		HORNERSRULE,
		MAXSUBARRPROB,
		HEAPSORT
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[];
		Option opt;
		
		Scanner scan = new Scanner(System.in);
		
		int A_len=scan.nextInt();
		
		A=new int [A_len];
		
		for(int i =0; i<A_len;i++){
			A[i]=scan.nextInt();
		}
		//new MergeSort().MergeSort(A, 0, A.length-1);
		//A=new InsertionSort().Insertionsort(A);
		//A=new SelectionSort().SelectionSort(A);
		//A=new BubbleSort().BubbleSort(A);
		//int result[] = new MaxSubarrProb().MaxSubarrProb(A, 0, A.length-1);
		A = new HeapSort().Heapsort(A);
		
		
		
		
		for(int i =0; i<A_len;i++){
			System.out.print(A[i]+" ");
		}
		
		/*for(int i =result[0]; i<=result[1];i++){
			System.out.print(A[i]+" ");}
		System.out.println();
		
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);*/
		
		
		//String opt_scan = scan.next();

	}

}
