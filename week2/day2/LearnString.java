package week2.day2;

public class LearnString {

	public static void main(String[] args) {

		//way 1:- String Literal
		String name = "Welcome to TestLeaf";
		System.out.println(name); System.out.println(System.identityHashCode(name));

		//way 2:- String Object 
		String name1 = new String("Welcome to TestLeaf");
		System.out.println(name1);
		System.out.println(System.identityHashCode(name1));

/********************************************************************************
								String Methods:- 
*********************************************************************************/

		// length() 
		int countOfString = name.length();
		System.out.println(countOfString);

		// toCharArray() 
		char[] ch = name.toCharArray(); 
		System.out.println(ch[18]);

		// indexOf() 
		int indexOf = name.indexOf('l'); 
		System.out.println(indexOf);

		// charAt() 
		char charAt = name.charAt(3); 
		System.out.println(charAt);

		// substring(singleIndex) 
		String text = name.substring(11);
		System.out.println(text);

		// substring(b_index, e_index) 
		String text1 = name.substring(15, 19);
		System.out.println(text1);

		// split() 
		String[] split = name.split(" "); 
		for (int i = 0; i < split.length; i++) { 
			System.out.println(split[i]); 
		}

		// toLowerCase
		System.out.println(name.toLowerCase());

		// toUpperCase
		System.out.println(name.toUpperCase());

		// trim() 
		System.out.println(name.trim());

		// concat() 
		int a = 10;
		int b = 5;
		String c = "100";
		System.out.println(a + c); 
		System.out.println(name.concat(c));

		// toString 
		String string = Integer.toString(a);

		// replace()
		System.out.println(name.replace(" ", ""));	

/********************************************************************************
						String Reverse Program:- 
*********************************************************************************/


		for (int i = name.length()-1; i >=0; i--) {
			System.out.print(name.charAt(i));			
		}
	}

}
