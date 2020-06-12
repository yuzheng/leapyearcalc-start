package com.demo.devops.leapyearcalculator;

public class LeapYearCalc {
	public boolean IsLeapYear(Integer year) {
		return IsTypicalLeapYear(year) && IsCommonYear(year) == false;
	}
	
	private boolean IsCommonYear(Integer year) {
		return year % 100 == 0 && year % 400 != 0;
	}
	
	private boolean IsTypicalLeapYear(Integer year) {
		return year % 4 == 0;
	}
}
