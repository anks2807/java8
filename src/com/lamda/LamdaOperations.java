package com.lamda;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;

import com.model.GENDER;
import com.model.Person;

/**
 * @author singhala
 * Ope-1: Print List of all Persons
 *
 */
public class LamdaOperations {
	
	public static void main(String[] args) {
		
		
		System.out.println("List of all persons");
		printPersonByGender((p) -> true, p -> System.out.println(p));
		System.out.println("List of Males");
		printPersonByGender((p) -> p.getGender().equals(GENDER.MALE.toString()),p -> System.out.println(p));
		System.out.println("List of Females");
		printPersonByGender((p) -> p.getGender().equals(GENDER.FEMALE.toString()),p -> System.out.println(p));
		
		System.out.println("Count of Male: "+Person.getPersons().stream().filter(p -> p.getGender().equals(GENDER.MALE.toString())).count());;
		
		System.out.println("Count of Male: "+Person.getPersons().stream().filter(p -> p.getGender().equals(GENDER.FEMALE.toString())).count());;
	}
	
	public static void printPersonByGender(Predicate<Person> predicate, Consumer<Person> consumer) {
		for(Person p : Person.getPersons()) {
			if(predicate.test(p)) {
				consumer.accept(p);
			}
		}
	}
}
