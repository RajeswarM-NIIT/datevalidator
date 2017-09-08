package com.niit.admission;

public class AdmissionProcess {
	public boolean isCandidateElligibleForCourse(int marks10, int marks12, int marksGraduation) throws EligibilityException{
		boolean result=false;
		if(marks10<0 || marks12<0 || marksGraduation<0 || marks10>100 || marks12>100 || marksGraduation>100)
			throw new EligibilityException("Out of range Marks");
		else if(marks10>=60 && marks12>=60 && marksGraduation>=60)
			result=true;
		return result;
	}

}
