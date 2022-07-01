package org.java.loops;

public class LoopConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr=new int[5];
		arr[0]=5;
		arr[1]=6;
		arr[2]=8;
		arr[3]=12;
		arr[4]=2;
		
		int[] arr2= {6,8,6,9,7};
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		//Enhanced for Loop
		String[] name= {"Guddu","Jhumki","Pinky","Rohan"};
		
		for( String s:name)
		{
			System.out.println(s);
		}

	}

}
