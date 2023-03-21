package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

public class MapExample {

	public static void main(String[] args) {

		HashMap<String, Integer> basket = new HashMap<String, Integer>();

		basket.put("item1", 1);
		basket.put("item2", 5);
		basket.put("item3", 3);
		basket.put("item4", 3);

		System.out.println(basket);

		basket.put("item3", 7);
		System.out.println("****************the new updated item****************");
		System.out.println(basket);

		basket.remove("item2");
		System.out.println(basket);

//		basket.put("item5", null);
//		System.out.println(basket);

		// traversing or iterating through keys on map

		for (String item : basket.keySet()) {
			System.out.println("the name of item is :" + item);
			System.out.println("the quantity of item is :" + basket.get(item));
		}

		// traversing or iterating through values on map

		for (Integer value : basket.values()) {
			System.out.println(value);

		}

		System.out.println("********** using Tree map to add values in sorted manner");
		// using Tree map to add values in sorted manner

		TreeMap<String, Integer> newbasket = new TreeMap<String, Integer>();

		newbasket.put("item1", 1);
		newbasket.put("item2", 5);
		newbasket.put("item3", 3);
		newbasket.put("item4", 3);

		System.out.println(newbasket);
		
		
		String str="clean world green world happy world";
		
		String[] arr=str.split(" ");
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for (String word : arr) {
			
			if(!map.keySet().contains(word)) {
				map.put(word, 1);
			}else {
					map.put(word, map.get(word)+1);
				}
			}
		System.out.println("the resulting map is :" +map);
	}		
	
	}


