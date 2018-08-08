package com.lamda;

import java.util.List;
import java.util.Optional;
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
		
		List<Person> persons = Person.getPersons();
		
		System.out.println("List of all persons");
		persons.forEach(p -> System.out.println(p));
		
		persons.sort((p1,p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
		
		System.out.println("List of sorted persons");
		persons.forEach(p -> System.out.println(p));
		//persons.forEach(System.out::println);
		
		Creature c = new Creature();
		c.move();
		
		Optional<Integer> iop = Optional.empty();
		iop.ifPresent(System.out::println);
		
	}
	
	
}
