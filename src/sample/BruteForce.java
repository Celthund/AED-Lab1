package sample;

public class BruteForce {
	
	public static int maximumSubArray (int[] a, int first, int last) {
	    int maxSum = a[0]; //assume-se o array n�o vazio
	    for (int i = first; i <= last; i++) {
            int sum = 0;
	        for (int j = i; j <= last; j++) {
	        	sum += a[j];
	        	if (sum > maxSum) maxSum = sum;
	        }
	    }
	    return maxSum;
	}
}
