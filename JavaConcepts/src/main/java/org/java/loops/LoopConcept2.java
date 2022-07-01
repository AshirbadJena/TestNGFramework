package org.java.loops;

import java.util.ArrayList;

public class LoopConcept2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr3= {5,10,12,45,19,18,23,16,17,52,36};
		//print all the value which are multiple by 2
		for(int n:arr3)
		{
			if(n%2==0)
			{
				System.out.println(n);
			}
		}
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Ashirbad");
		a.add("Guddu");
		a.add("Jhumki");
		System.out.println(a.get(1));
		a.remove(1);
		System.out.println(a.get(1));

	}

}
