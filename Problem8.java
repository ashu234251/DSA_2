package in.controller;

public class Problem8 
{
	public static void main(String[] args)
	{
		int[] nums= {2,3,4,6,8,9,15};
		int k=3;
		int min=Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i : nums) 
        {
            min = Math.min(min, i);
            max = Math.max(max, i);
        }

        int ans = (max - k) - (min + k);
        System.out.println("Answer is: "+ Math.max(0, ans));
	}
}
