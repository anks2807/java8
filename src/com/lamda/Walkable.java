package com.lamda;

@FunctionalInterface
public interface Walkable{
	
	void walk();
	
	default void move() {
		System.out.println("I can walk");
	}
	
	@Override
	boolean equals(Object obj);
	
	@Override
	String toString();
	

}
