package com.practice;

class Cat {
	void noise() {
		System.out.println("meow meow");
	}
}
class Dogs extends Cat{
	void noise() {
		System.out.println("bow bow");
	}
}
class Cow extends Cat{
	void noise() {
		System.out.println("boooo bow");
	}
}
public class Ops{
	public static void main(String[] args) {
		Cat c=new Cow();
		c.noise();
	}    
}

