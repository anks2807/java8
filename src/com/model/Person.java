package com.model;

import java.util.Arrays;
import java.util.List;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	
	public Person(String firstName, String lastName, int age, String gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	};
	
	public static List<Person> getPersons(){
		return Arrays.asList(new Person("Dave" , "MIller", 34 , GENDER.MALE.toString()),
				new Person("Jennifer" , "Carter", 31 , GENDER.FEMALE.toString()),
				new Person("Alex", "Hales", 42, GENDER.MALE.toString()),
				new Person("Robert", "Adwards", 29, GENDER.MALE.toString()),
				new Person("Micheal", "Palinio", 32, GENDER.MALE.toString()),
				new Person("Josheph", "Root", 33, GENDER.MALE.toString()),
				new Person("Opra", "Winfrey", 27, GENDER.FEMALE.toString()),
				new Person("Seam", "Willing", 31, GENDER.MALE.toString()),
				new Person("Mery", "Jane", 38, GENDER.FEMALE.toString()),
				new Person("Kathy", "Seria", 41, GENDER.FEMALE.toString())
				);
	}
}
