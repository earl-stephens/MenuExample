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
	
	String get() {
		String optionsText = "Options: \n";
		for(int j = 0; j < menuOptions.length; j++) {
			/* First attempt
			String number = String.valueOf(j + 1);
			optionsText += (number + ". " + menuOptions[j] + "\n");
			*/
			
			//use of String.format
			optionsText += String.format("%d. %s\n", (j + 1), menuOptions[j]);
		}
		return optionsText;
	};

}
