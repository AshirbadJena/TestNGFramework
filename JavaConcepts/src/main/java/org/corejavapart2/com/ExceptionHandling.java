package org.corejavapart2.com;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a=5;
		int b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
		} catch(Exception e)
		{
			System.out.println("I have catched the error");
		}
		

	}

}
