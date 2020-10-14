package sample;

public class DynamicProgramming {
	
	public static int maximumSubArray (int[] a, int first, int last){
	    int maxSumEndingHere = 0;// soma encontrada num subarray
	    int maxSumSoFar = 0;	  // soma m�xima j� encontrada
	    for (int i = first; i <= last; i++) {
	        maxSumEndingHere = Math.max(maxSumEndingHere + a[i], 0);
	        maxSumSoFar = Math.max(maxSumEndingHere, maxSumSoFar);
	    }
	    return maxSumSoFar;
	}
}
