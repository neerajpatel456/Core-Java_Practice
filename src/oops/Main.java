package oops;

interface Animal {
	void sound();

	void eat();
//	void Run();
}

class Dog implements Animal {

	public void sound() {
		System.out.println("Bark");
	}

	public void eat() {
		System.out.println("YES dog eat a egg");
	}
}
 class Cat implements Animal{
	public void sound() {
		System.out.println("meaaauuu");
	}
	public void eat() {
		System.out.println("i want some milk");
	}
}

public class Main {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.sound();
		
		Cat c= new Cat();
		c.eat();
		c.sound();
	}

}
