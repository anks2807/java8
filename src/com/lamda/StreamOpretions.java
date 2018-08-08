package com.lamda;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.model.Person;

public class StreamOpretions {

	public static void main(String[] args) {
		List<Person> persons = Person.getPersons();
		//persons.forEach(System.out::println);
		Optional<String> optional = persons.stream().filter((p) -> p.getFirstName().startsWith("A")).map((p) -> p.getFirstName().toUpperCase()).reduce((p1,p2) -> (p1+"@"+p2));		
		//optional.ifPresent(System.out::println);
		
		List<Person> personList= persons.stream().filter((p) -> p.getFirstName().startsWith("A")).collect(Collectors.toList());
		//personList.forEach(System.out::println);
		
		List<Person> personList2 = persons.stream().filter(distinctByKey(p -> p.getAge())).collect(Collectors.toList());
		//personList2.forEach(System.out::println);
		
		Optional<Person> option = persons.stream().max(Comparator.comparing(Person::getAge));
		option.ifPresent(System.out::println);


	}
	
	public static <T>Predicate<T> distinctByKey(Function<? super T, Object> key){
		Map<Object, Boolean> map = new ConcurrentHashMap<>();
		return t -> map.putIfAbsent(key.apply(t), Boolean.TRUE) == null;
	}
	
	

}
