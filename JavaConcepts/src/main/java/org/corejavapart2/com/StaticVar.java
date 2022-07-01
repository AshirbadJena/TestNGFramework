package org.corejavapart2.com;

public class StaticVar {
	//Instance variable
	String name;
	String address;
	static String city="Jajpur";
	 int i=0;
	
	StaticVar(String name,String address)
	{
		this.name=name;
		this.address=address;
		//this.city=city;
		i++;
		System.out.println(i);
		
	}
	
	public void getAddress()
	{
		
		System.out.println(address+"-"+city);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar obj=new StaticVar("Guddu","Bari");
		StaticVar obj1=new StaticVar("Pinky","Behela");
		StaticVar obj2=new StaticVar("Pinky","Behela");
		obj.getAddress();
		obj1.getAddress();


	}

}
