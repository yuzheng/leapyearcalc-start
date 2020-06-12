package com.demo.devops.leapyearcalculator;

import junit.framework.TestCase;

public class LeapYearCalculatorTest extends TestCase {

	public void testShould_ReturnTrue_When_Given1996() {
		// Arrange
		LeapYearCalc sut = new LeapYearCalc();
		
		// Act
		boolean result = sut.IsLeapYear(1996);
		
		
		// Assert
		assertTrue(result);
	}
	
	public void testShould_ReturnFalse_When_Given2001() {
		// Arrange
		LeapYearCalc sut = new LeapYearCalc();
		
		// Act
		boolean result = sut.IsLeapYear(2001);
		
		
		// Assert
		assertFalse(result);
	}
	
	public void testShould_ReturnTrue_When_Given2000() {
		// Arrange
		LeapYearCalc sut = new LeapYearCalc();
		
		// Act
		boolean result = sut.IsLeapYear(2000);
		
		
		// Assert
		assertTrue(result);
	}
	
	public void testShould_ReturnFalse_When_Given1900() {
		// Arrange
		LeapYearCalc sut = new LeapYearCalc();
		
		// Act
		boolean result = sut.IsLeapYear(1900);
		
		
		// Assert
		assertFalse(result);
	}
}
