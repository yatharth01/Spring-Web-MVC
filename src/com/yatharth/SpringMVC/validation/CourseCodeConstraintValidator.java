package com.yatharth.SpringMVC.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	public String courseprefix;
	
	
	@Override
	public void initialize(CourseCode theCourseCode)
	{
		courseprefix= theCourseCode.value();
	}
	
	
	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidator) {
		
		boolean result;
		
		if(theCode!=null)
		result= theCode.startsWith(courseprefix);
		
		else
		result=true;
		
		return result;
	}

	
	
}
