package in.controller;

public class Problem4 
{
	public static void main(String[] args)
	{
		int[]flowerBed= {1,0,0,1,1};
		int n=1;
		int capacity=0;
		boolean flag=false;
		
		if(flowerBed[0]==1)
			capacity++;
		
		for(int i=1;i<flowerBed.length;i++)
		{
			if(flowerBed[i]==1)
			{
				capacity++;
				if(flowerBed[i-1]==1)
				{
					flag=true;
					break;
				}
			}
		}
		if(flag==false && capacity>=n)
			System.out.println("true");
		else 
			System.out.println("false");
		
	}

}
