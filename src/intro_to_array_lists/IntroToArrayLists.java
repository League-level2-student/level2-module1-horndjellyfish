package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		// 1. Create an array list of Strings
		// Don't forget to import the ArrayList class
		ArrayList<String> names = new ArrayList<String>();
		// 2. Add five Strings to your list
		names.add("Michael");
		names.add("Jim");
		names.add("Dwight");
		names.add("Pam");
		names.add("Oscar");
		 //3. Print all the Strings using a standard for-loop
		for (int i = 0; i < names.size(); i++) {
			String name = names.get(i);
			System.out.println(name);
		}
		// 4. Print all the Strings using a for-each loop
		for (String name : names) {
			System.out.println(name);
		}
		// 5. Print only the even numbered elements in the list.
		for (int i = 0; i < names.size(); i++) {
			if (i % 2 == 0) {
				String name = names.get(i);
				System.out.println(name);
			}
		}
		// 6. Print all the Strings in reverse order.
		for (int i = names.size()-1; i >= 0; i--) {
			String name = names.get(i);
			System.out.println(name);
		}
		// 7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < names.size(); i ++) {
			String name = names.get(i);
			if (name.contains("e")) {
				System.out.println(name);
			}
		}
	}
}
