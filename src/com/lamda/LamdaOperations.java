package com.lamda;

import com.model.Person;

/**
 * @author singhala
 * Ope-1: Print List of all Persons
 *
 */
public class LamdaOperations {
	
	public static void main(String[] args) {
		printAllPersons();
	}
	
	public static void printAllPersons() {
		for(Person p : Person.getPersons()) {
			System.out.println(p);
		}
	}
}
