package com.dates;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;



public class DateTest {

	private DateValidator dateValidator;
	
	@Before
	public void preAdmissionProcess(){
		dateValidator=new DateValidator();
	}
	
	@After
	public void postAdmissionProcess(){
		dateValidator=null;
	}
	
	@Test
	public void testDateWithWrongDate1() {
		assertEquals("testDateWithWrongDate1() : Worng date - out of range",false,dateValidator.checkDate(-1,12, 1990));		
	}
	
	@Test
	public void testDateWithWrongDate2() {
		assertNotEquals("testDateWithWrongDate2() : Worng date - out of range",true,dateValidator.checkDate(40,12, 1990));		
	}

	@Test
	public void testDateWithWrongDate3() {
		assertEquals("testDateWithWrongDate3() : Worng date for the month",false,dateValidator.checkDate(31,11, 1990));		
	}
	
	@Test
	public void testDateWithWrongDate4() {
		assertNotEquals("testDateWithWrongDate4() : Worng date for the month",true,dateValidator.checkDate(31,04, 1990));		
	}
	
	@Test
	public void testDateForWrongFEB_DayAsPerYear1() {
		assertEquals("testDateForWrongFEB_DayAsPerYear1() : Worng date for Feb as per year",false,dateValidator.checkDate(29,2, 1991));		
	}
	
	@Test
	public void testDateForWrongFEB_DayAsPerYear2() {
		assertNotEquals("testDateForWrongFEB_DayAsPerYear2() : Worng date for Feb as per year",true,dateValidator.checkDate(29,2, 2001));		
	}
	
	@Test
	public void testDateForCorrectFEB_DayAsPerYear1() {
		assertEquals("testDateForCorrectFEB_DayAsPerYear1() : Worng date for Feb as per year",true,dateValidator.checkDate(29,2, 2003));		
	}	

	@Test
	public void testDateForCorrectFEB_DayAsPerYear2() {
		assertNotEquals("testDateForCorrectFEB_DayAsPerYear2() : Worng date for Feb as per year",false,dateValidator.checkDate(29,2, 2004));		
	}
	
	@Test
	public void testDateWithWrongMonth1() {
		assertEquals("testDateWithWrongMonth1() : Worng month",false,dateValidator.checkDate(29,22, 2004));		
	}
	
	@Test
	public void testDateWithWrongMonth2() {
		assertNotEquals("testDateWithWrongMonth2() : Worng month",true,dateValidator.checkDate(29,22, 2004));		
	}
	
	@Test
	public void testDateWithCorrectMonth1() {
		assertEquals("testDateWithCorrectMonth1() : Worng month",true,dateValidator.checkDate(29,10, 2004));		
	}
	
	@Test
	public void testDateWithCorrectMonth2() {
		assertNotEquals("testDateWithCorrectMonth2() : Worng month",false,dateValidator.checkDate(29,10, 2004));		
	}
	
	@Test
	public void testDateForWrongYear1() {
		assertEquals("testDateForWrongYear1() : Worng year",false,dateValidator.checkDate(29,10,-2004));		
	}
	
	@Test
	public void testDateForWrongYear2() {
		assertNotEquals("testDateForWrongYear2() : Worng year",true,dateValidator.checkDate(29,10,-2004));		
	}
	
	@Test
	public void testDateForCorrectYear1() {
		assertEquals("testDateForCorrectYear1() : Worng year",true,dateValidator.checkDate(29,10,2004));		
	}
	
	@Test
	public void testDateForCorrectYear2() {
		assertNotEquals("testDateForCorrectYear1() : Worng year",false,dateValidator.checkDate(29,10,2004));		
	}
}
