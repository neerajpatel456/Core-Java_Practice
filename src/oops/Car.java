package oops;

interface Vehical{
	void start();
	default void clean() {
		System.out.println("Cleanning is done");
	}
	default void repering() {
		 System.out.println("Your car is Repering mood");
	 }
}

public class Car implements Vehical {
	 public void start() {
		 System.out.println("Car is Start");
	 }
	
	 public static void main(String[] args) {
		Car c= new Car();
		c.start();
		c.clean();
		c.repering();
	}

}
