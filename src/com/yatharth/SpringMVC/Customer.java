package com.yatharth.SpringMVC;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Customer {

	private String firstName;
	
	@NotNull(message="is required")
	@Size(min=1,message="is required")
	private String lastName;
	
    @Min(value=1,message="Must be greater than or equal to 1")
    @Max(value=10,message="Must be less than or equal to 10")
	private int freepasses;
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
	public int getFreepasses() {
		return freepasses;
	}
	public void setFreepasses(int freepasses) {
		this.freepasses = freepasses;
	}
	
	
	
}
