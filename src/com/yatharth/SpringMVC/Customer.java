package com.yatharth.SpringMVC;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.yatharth.SpringMVC.validation.CourseCode;


public class Customer {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
	@NotNull(message="is required")
    @Min(value=1,message="Must be greater than or equal to 1")
    @Max(value=10,message="Must be less than or equal to 10")
	private Integer freepasses;
    
    @Pattern(regexp="^[a-zA-Z0-9]{5}",message="Can only have 5 digits or characters")
    private String postalCode;
    
    @CourseCode(value="TOPS",message="must start with TOPS")
    private String courseCode;
    
	public String getCourseCode() {
		return courseCode;
	}
	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Integer getFreepasses() {
		return freepasses;
	}
	public void setFreepasses(Integer freepasses) {
		this.freepasses = freepasses;
	}
	
	
	
}
