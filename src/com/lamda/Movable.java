package com.lamda;


public interface Movable {
	
	default void move() {
		System.out.println("I can move");
	}

}
