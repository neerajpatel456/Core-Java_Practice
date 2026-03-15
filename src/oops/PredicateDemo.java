package oops;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {

//		Predicate<Integer> p = i-> i> 10;
//		System.out.println (p.test(1));
//		System.out.println (p.test(50));
//		System.out.println (p.test(4));
//		System.out.println (p.test(100));
		
		
		
		String[] arr= {"Annat","Amar","Avani","Bhuwan","Laddu"};
		Predicate<String> p= name-> name.charAt(0)=='A';
		   for (String name: arr) {
			   if(p.test(name)){
				   System.out.println(name);
				   
			   }
			   
		   }
		
	}

}

