package javaprograms;

public class prefixSumValidSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums[]= {10,4,-8,7};
		System.out.println(waysToSplitArray(nums));	
	}

	private static int waysToSplitArray(int[] nums) {
		// TODO Auto-generated method stub
		int n=nums.length;
		long prefix[]=new long[n];
		prefix[0]=nums[0];
		for(int i=1;i<n;i++)
			prefix[i]=prefix[i-1]+nums[i];
		int ans=0;
		for(int i=0;i<n-1;i++) {
			long left=prefix[i];
			long right=prefix[n-1]-prefix[i];
			if(left>=right)
				ans++;
		}
		return ans;
	}

}
