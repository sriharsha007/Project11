package stringcase2;

public class StringFunction1 {

	public static void main(String[] args) {
		
		// Condition 1 where string are equal - 'equals()' //
		
		String name = "my name is harsha";
		
		String name1 = "my name is harsha";
		
		boolean name2 = name.equals(name1);
		
		System.out.println("name2 "+name2);
		
		// Condition 2 where one string is in uppercase - equalsIgnoreCase() //
		
		String pro = "my name is harsha";
		
		String pro1 = "mY nAme Is hArsha";
		
		boolean pro2 = pro.equalsIgnoreCase(pro1);
		
		System.out.println("pro2 "+pro2);
		
		// Condition 3 where string 2 contains elements of string 1 - Contains() //
		
		String bag = "my name is harsha";
		
		String bag1 = "name";
		
		boolean bag2 = bag.contains(bag1);
		
		System.out.println("bag2 "+bag2);
	}

}
