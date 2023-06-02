package in.controller;

public class Problem3 
{

	public static void main(String[] args)
	{
		int[]nums= {1,3,2,2,5,2,3,7};
		int[]arr=new int[100000];
		for(int i=0;i<nums.length;i++)
		{
			arr[nums[i]]++;
		}
		int max=0;
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]+arr[i+1] > max)
			   max=arr[i]+arr[i+1];
		}
		System.out.println("Length of the longest harmonious subsequence is: "+max);
	}

}
