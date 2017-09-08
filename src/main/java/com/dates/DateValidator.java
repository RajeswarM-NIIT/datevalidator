package com.dates;

public class DateValidator {
	int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public boolean checkDate(int dd, int mm, int yyyy){
		boolean result=false;
		if(yyyy%400==0 || (yyyy%100!=0 && yyyy%4==0))
			days[1]=29;
		if(mm>=1 && mm<=12 && dd>=1 && dd<=days[mm-1] &&  yyyy>=1 && yyyy<=9999 )
			result=true;
		else
			result=false;		
		return result;
	}
}