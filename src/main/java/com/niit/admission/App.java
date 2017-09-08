package com.niit.admission;

/**
 * Hello world!
 *
 */
public class App {
	public static void main( String[] args )
    {
    	try{
    		System.out.println(new AdmissionProcess().isCandidateElligibleForCourse(20, -30, 100));
    	}
    	catch(EligibilityException excemption){
    		System.out.println(excemption.getMessage());
    	}
       
    }
}
 