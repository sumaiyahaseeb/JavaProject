package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] names = {"sumaiya","shiza","haya","alina"};
		System.out.println(names[1]);
		
		ArrayList<String> list =new ArrayList<String>();
		list.add("sumaiya");
		list.add("ayaz");
		list.add("haseeb");
		list.add("shiza");
		
		System.out.println(list);
		System.out.println(list.size());
		System.out.println("the first name in the list is "+list.get(0));
		System.out.println("the last name in the list is "+list.get(list.size()-1));
		
		//updating and adding name in the list from index
		
		list.add(1, "fathima");
		System.out.println(list);
		
		//removing the name from list from index
		
		list.remove(3);
		System.out.println(list);
		System.out.println(list.size());
		
		//traversing through a list using for loop
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("*************************************");
		//traversing through a list using for each loop
		
		for(String val:list) {
			System.out.println(val);
		}
		System.out.println("****************iteratorclass*************");
		
		//traversing using the iterator class
		
		Iterator itr=list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//sorting list using collections
		System.out.println("****************************sorting ******************");
		
		Collections.sort(list);
		System.out.println(list);
		
		//sorting in reverse order using list
		System.out.println("****************************sorting reverse******************");
		
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		
		
		
	}

}
