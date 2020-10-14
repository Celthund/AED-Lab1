package sample;

public class DivideAndConquer {
	
	public static int maximumSubArray (int[] a, int first, int last){
	    if (first == last)
	        return a[first];
	    else {
	        int mid = (first + last) / 2;
	        int maxSum = Math.max(maximumSubArray(a, first, mid),
	        		maximumSubArray(a, mid + 1, last));
	        maxSum = Math.max(maxSum, middleIntercept(a, mid, first, last));
	        return maxSum;
	    }
	}

	public static int middleIntercept (int[] a, int mid, int first, int last){
	    int maxSumL = Integer.MIN_VALUE; // maior soma � esquerda + interm�dio
	    int sumL = 0;	  // soma � esquerda    
	    for (int i = mid; i >= first; i--) {
	        sumL += a[i];
	        maxSumL = Math.max(maxSumL, sumL);
	    }
	    int maxSumR = Integer.MIN_VALUE; // maior soma � direita
	    int sumR = 0;	  // soma � direita 
	    for (int j = mid + 1; j <= last; j++) {
	        sumR += a[j];
	        maxSumR = Math.max(maxSumR, sumR);
	    }
	    return maxSumL + maxSumR;
	}
}
