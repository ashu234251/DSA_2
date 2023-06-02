package in.controller;

public class Problem6
{
	public static void main(String[] args)
	{
		int[] nums= {-1,0,3,5,9,12};
		int l=-1;
		int r=nums.length;
		int n=9;
		int m;
		while(l+1<r)
		{
			m=l+(r-l)/2;
			if(predicate(nums[m],n)==0)
				l=m;
			else
				r=m;
		}
		System.out.println("Index of "+n+" is: "+r);
	}
	public static int predicate(int m,int n)
	{
		if(m<n)
			return 0;
		else
			return 1;
	}
}
