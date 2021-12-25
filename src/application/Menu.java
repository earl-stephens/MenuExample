package application;

public class Menu {
	String[] menuOptions = {
		"View database",
		"Add new item",
		"Delete item",
		"Quit program"
	};
	
	void display() {
		System.out.println("Options:");
		for(int i = 0; i < menuOptions.length; i++) {
			System.out.printf("%d. %s\n", (i + 1), menuOptions[i]);
		}
	};

}
