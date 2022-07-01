package org.collections.java;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> a=new ArrayList<String>();
		a.add("Java");
		a.add("Guddu");
		a.add("Jhumki");
		System.out.println(a);
		a.remove(0);
		System.out.println(a.get(0));
		System.out.println(a.contains("Guddu"));
		

	}

}
