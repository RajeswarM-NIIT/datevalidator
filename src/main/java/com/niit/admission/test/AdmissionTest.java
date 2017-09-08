package com.niit.admission.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.niit.admission.AdmissionProcess;
import com.niit.admission.EligibilityException;


public class AdmissionTest {
	
	AdmissionProcess admissionProcess;
	
	@Before
	public void preAdmissionProcess(){
		admissionProcess=new AdmissionProcess();
	}
	
	@After
	public void postAdmissionProcess(){
		admissionProcess=null;
	}
	
	@Test
	public void testIsCandidateElligible() throws EligibilityException {
		assertEquals("testIsCandidateElligible() : Candidate is not elligible",true,admissionProcess.isCandidateElligibleForCourse(70,80,75));
	}
	
	@Test
	public void testIsCandidateElligible1() throws EligibilityException {
		assertEquals("testIsCandidateElligible1() : Candidate is not elligible",false,admissionProcess.isCandidateElligibleForCourse(57,80,75));
	}

	@Test
	public void testIsCandidateElligible2() throws EligibilityException {
		assertNotEquals("testIsCandidateElligible2() : Candidate is not elligible",false,admissionProcess.isCandidateElligibleForCourse(100,80,75));
	}
	
	@Test(expected=EligibilityException.class)
	public void testIsCandidateElligibleFailure() throws EligibilityException {
		assertEquals("testIsCandidateElligibleFailure() : Candidate is not elligible",false,admissionProcess.isCandidateElligibleForCourse(-10,80,75));		
	}
	
	@Test(expected=EligibilityException.class)
	public void testIsCandidateElligibleFailure1() throws EligibilityException {
		assertEquals("testIsCandidateElligibleFailure1() : Candidate is not elligible",false,admissionProcess.isCandidateElligibleForCourse(60,90,175));		
	}
	
	
}
