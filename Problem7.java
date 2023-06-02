package in.controller;

public class Problem7 
{
	public static void main(String[] args)
	{
		int[]nums= {1,2,2,3,5,4};
		boolean flag=false;
		
		boolean x=nums[0]<nums[nums.length-1];
		
		for(int i=0;i<nums.length-1;i++)
		{
			if(nums[i]==nums[i+1])
				continue;
			else if((nums[i]<nums[i+1])!=x)
			{
				flag=true;
				break;
			}	
		}
		if(flag==true)
			System.out.println("false");
		else
			System.out.println("true");
	}

}
