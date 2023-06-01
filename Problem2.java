package in.controller;

import java.util.Arrays;

public class Problem2 {

	public static void main(String[] args)
	{
		int[]candyType= {1,1,1,1,1,2,4,5};
		Arrays.sort(candyType);
		int max=0;
		if(candyType.length>0)
			max++;
		
		for(int i=1;i<candyType.length;i++)
		{
			if(max < candyType.length/2)
			{
				if(candyType[i]==candyType[i-1])
					continue;
				else
					max++;
			}
			else
				break;
				
		}
		System.out.println("Maximum number of different types of candies she can eat is: "+max);
	}

}
