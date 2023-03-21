package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<String> set = new HashSet<String>();
		set.add("jam");
		set.add("sum");
		set.add("fathima");
		set.add("nora");
		set.add("ayaz");

		System.out.println(set);

		HashSet<String> set1 = new HashSet<String>();

		set1.add("Jake");
		set1.add("Lily");
		set1.add("Naina");
		set1.add("Naina");
		set1.add(null);
		System.out.println("The set is " + set1);

		// sorted set

		TreeSet<String> set2 = new TreeSet<String>();

		set2.add("jam");
		set2.add("sum");
		set2.add("fathima");
		set2.add("nora");
		set2.add("ayaz");
		set2.add("ayaz");

		System.out.println(set2);
		
		//convert set to list
		
		ArrayList<String> list =new ArrayList<String>(set2);
		System.out.println(list);

	}

}
