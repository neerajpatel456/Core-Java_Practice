package oops;
interface MyInterface{
	void m1();
}

public class Lem {
	public static void main(String[] args) {
		MyInterface l=()-> System.out.println("hii");
		l.m1();
		
	}
}
