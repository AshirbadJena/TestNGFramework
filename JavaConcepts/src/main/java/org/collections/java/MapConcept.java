package org.collections.java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapConcept {

	public static void main(String[] args) {
		
		HashMap<Integer, String> hm=new HashMap<Integer,String>();
		hm.put(0, "AJ");
		hm.put(1, "JR");
		hm.put(2, "MB");
		hm.put(3, "ICJ");
		hm.put(4, "TJ");
		hm.put(5, "Ashu");
		System.out.println(hm);
		hm.remove(1);
		System.out.println(hm);
		 
	    Set sn=	hm.entrySet();
	     Iterator it=sn.iterator();
	     while(it.hasNext())
	     {
	    	 
	    	 Map.Entry mp=(Map.Entry)it.next();
	    	 System.out.println(mp.getKey());
	    	 System.out.println(mp.getValue());
	     }
	}

}
