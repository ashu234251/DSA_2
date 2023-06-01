package in.controller;

import java.util.Arrays;

public class Problem1 
{
	public static void main(String[] args) 
	{
		int[]nums= {1,4,5,6,3,2};
		Arrays.sort(nums);
		int max=0;
		for(int i=0;i<nums.length;i+=2)
		{
			max=max+nums[i];
		}
		System.out.println("Maximized Sum is: "+max);
	}

}
