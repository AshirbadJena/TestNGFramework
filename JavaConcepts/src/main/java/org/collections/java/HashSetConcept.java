package org.collections.java;

import java.util.HashSet;

public class HashSetConcept {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		hs.add("USA");
		hs.add("UK");
		hs.add("India");
		hs.add("India");
		System.out.println(hs);
		hs.remove("UK");
		hs.isEmpty();
		hs.size();

	}

}
