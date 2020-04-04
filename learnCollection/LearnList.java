package learnCollection;

import java.util.ArrayList;
import java.util.List;

public class LearnList {

	public static void main(String[] args) {

		// java 1.2 - Collection 

		//		ArrayList obj1 = new ArrayList();
		//		obj1.add(5);
		//		obj1.add(10);
		//		obj1.add("5");
		//		
		//	Problem statement is ---> 5 + 10 = 15 + "5" -> 155


		// Generic - Scope restriction of data (dataType)


		// Java 1.5 - introduce Generic <dataType>
		ArrayList<String> object = new ArrayList<String>();


		// Java 1.7 
		List<String> mentors = new ArrayList<>();
		mentors.add("Babu");
		mentors.add("Sarath");
		mentors.add("Hari");
		mentors.add("Balaji");
		mentors.add("Sam");
		mentors.add("123456");

		//for count:- size()
		System.out.println(mentors.size());

		// pick single item:- get(index)
		//	System.out.println(mentors.get(2));

		// pick all items:- loops
		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
		}
		System.out.println("********************************");

		// Adding new item in existing List
		mentors.add("Divya");

		// pick all items:- loops
		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
		}

		// Adding Duplicate items in existing List
		mentors.add("Balaji");
		System.out.println("********************************");

		// pick all items:- loops
		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
		}
		System.out.println("********************************");

		// removing item from the list:- 2ways using "itemName" and "indexNumber"
		//mentors.remove("Balaji");
		mentors.remove(4);

		// pick all items:- loops
		for (int i = 0; i < mentors.size(); i++) {
			System.out.println(mentors.get(i));
		}
		System.out.println("********************************");

		// Validating whether given item is available in existing list:- contains(itemName)
		System.out.println(mentors.contains("Gopi"));
		System.out.println("********************************");

		// remove all the items in the list:- clear()
		mentors.clear();

		// Validating whether  the list is empty or not:- isEmpty()
		System.out.println(mentors.isEmpty());




	}

}



















