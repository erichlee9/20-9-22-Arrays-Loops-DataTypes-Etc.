package myPack;

import eg2.Animal;

public class Demo1 {

	public static void main(String[] args) {
		//todo auto generated methon stub
		//Classname obj=new Constructor();
		Demo1 d=new Demo1();
		d.helloNonStatic(); //execution)
		d.helloNonStaticAgain();
		helloStatic(); //static method of same class
		
		Calculator.calculatorStatic(); //static method of different class
		Calculator c=new Calculator();
		c.calculatorNonStatic();
		int res=c.add(100, 299);
		System.out.println("result is "+res);
		
		Animal.helloAnimalStatic();
		Animal a=new Animal();
		a.helloAnimalNonStatic();
	}
	
	public void helloNonStatic() {
		System.out.println("Hello from non static block");
	}
	
	public void helloNonStaticAgain() {
		System.out.println("Hello from second non static block");
	}
	
	public static void helloStatic() {
		System.out.println("Hello from helloStatic() method");
	}
	
	//all the classes which falls under java.lang package will be imported directly... eg : String,System etc.
	
	
}