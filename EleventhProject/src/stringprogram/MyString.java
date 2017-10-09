package stringprogram;

public class MyString {

	public static void main(String[] args) {
		String sentence1 = "My name is Sriharsha Reddy";         // to define a string //
		System.out.println(sentence1);                           //to print the string //

		int sentence2 = sentence1.length();			   // length() function is used to define length //
		System.out.println(sentence2);                 // print the length of the string //
		
		System.out.println(sentence1.replace('a', 'z')); // replaces the old character with new character//
	
		String sentence3 = sentence1.toLowerCase();      //converts all letters into lower case //
		System.out.println(sentence3);
		
		String sentence4 = sentence1.toUpperCase();      //converts all letters into lower case //
		System.out.println(sentence4);
		
		System.out.println(sentence1.indexOf('h'));      // tells you the index of a character in the string //
		
		
	}

}
