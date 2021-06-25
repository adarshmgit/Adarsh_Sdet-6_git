package com.practice;

//this is the changes
class Animal{
	void noise() {
		System.out.println("some noise");
	}
}
class Dog extends Animal{
	void noise() {
		System.out.println("bow bow");
	}
}
class Snake extends Animal{
	void noise() {
		System.out.println("buss buss");
	}
}
class Executor{
	static void Exe(Animal a1) {
		a1.noise();
	}
}
 class Mainclass {
	public static void main(String[] args) {
		Dog d1=new Dog();	
		Snake s=new Snake();
		
		Executor.Exe(d1);
		Executor.Exe(s);
		
		
	}
	
}
