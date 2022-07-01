package org.corejavapart2.com;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yy");
		System.out.println(sdf.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));
	}

}
