package in.controller;

import java.util.Arrays;

public class Problem5 
{
	public static void main(String[] args)
	{
		int[]nums= {-11,-2,1,2,3,4,5};
		Arrays.sort(nums);
		int max=Integer.MIN_VALUE;
		for(int i=0;i<nums.length;i++)
		{
			max=Math.max(nums[0]*nums[1]*nums[nums.length-1], nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3]);
		}
		System.out.println("Maximum Product is: "+max);
	}

}
