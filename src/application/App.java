package application;

public class App {

	public static void main(String[] args) {
		/* Coding challenge
		 * Create a program that outputs
		 * 
		 * 
		 * Options:
		 * 1. View database
		 * 2. Add new item
		 * 3. Delete item
		 * 4. Quit program
		 * 
		 * Store the menu options in an array.
		 * The array should be inside of a class "Menu".
		 * To output the menu, call a method called display().
		 * The numbers for the menu should be generated programmatically.
		 */

		Menu menu1 = new Menu();
		menu1.display();
		
		/* Second coding challenge
		 * In the Menu class, create a get method that
		 * returns a string similar to the options in the
		 * first challenge.  
		 * Call the method from main and print out the string.
		 */
		
		System.out.println(menu1.get());
	}

}
