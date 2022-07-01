package org.multidimensionalArray.java;

public class CiscoInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[][]= {{2,3,5},{7,8,9},{4,1,17}};
		/*int[][] a=new int[3][3];
		a[0][0]=4;
		a[0][1]=9;
		a[0][2]=6;
		a[1][0]=1;
		a[1][1]=17;
		a[1][2]=2;
		a[2][0]=21;
		a[2][1]=7;
		a[2][2]=23;*/
		int min=a[0][0];
		int k=0;
		
		for(int i=0;i<3;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				if(a[i][j]<min)
				{
					 min=a[i][j];				
				}
				
				
			}
			
		}
		
		System.out.println(min);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				
				if(a[i][j]==min)
				{
					System.out.println(j);
					k=j;
				}
			}
		}
		
		for(int i=0;i<3;i++)
		{
			
				if(a[i][k]>min) 
				{
					min=a[i][k];
				}
			
		}
		System.out.println(min);

	}

}
