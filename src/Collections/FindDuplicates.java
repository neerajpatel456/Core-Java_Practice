//You are given a list of integers. Find all duplicate elements using Java Collections.
//
//Example
//
//Input:
//[1,2,3,4,2,5,1,6]
//
//Output:
//[1,2]

package Collections;

import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.HashSet;

public class FindDuplicates {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 2, 5, 1, 6,2,3,5);
		Set<Integer> unique = new HashSet<>();
		Set<Integer> duplicate = new HashSet<>();

		for (Integer num : list) {
			if (!unique.add(num)) {
				duplicate.add(num);

			}
		}
		System.out.println("Duplicate is :"+duplicate);

	}

}
