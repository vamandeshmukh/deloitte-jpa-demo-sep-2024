package com.deloitte.demo.doubts;

// polymorphism -
// types - 
// 1. method overriding 
// 2. method overloading 

//method overriding 
// method from super class / super interface is 
// re-implemened in sub class with enhanced logic
// used with non-static methods only 

//method overloading
// methods with the same name but different args 
// with static and non-static methods 
// static - only within one class 
// non-static with one class or super-sub classes 

public class PolyDemo {
	
	public static void main(String[] args) {
		
		SmartPhone ph1 = new SmartPhone();
		ph1.call();
	}
}


class Phone {
	void call () {
		System.out.println("calling...");
	}
}

class SmartPhone extends Phone {

	@Override
	void call () {
		System.out.println("calling with true caller...");
	}

	
}
