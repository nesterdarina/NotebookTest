package edu.examples.java_classes.input.command;

public enum MenuCommand {
	SHOW_MAIN_MENU(1), SHOW_FIND_MENU(2),

	CREATE_NEW_ITEM(3), FIND_BY_DATE(4), FIND_BY_CONTENT(5),

	NO_MENU_ACTION(-1),  EXIT_CODE(0);

	private int consoleCode;

	private MenuCommand(int code) {
		consoleCode = code;
	}
	
	public int getConsoleCode() {
		return consoleCode;
	}

	public static MenuCommand valueOf(int code) {
		switch (code) {
		case 1:
			return SHOW_MAIN_MENU;
		case 2:
			return SHOW_FIND_MENU;
		case 3:
			return CREATE_NEW_ITEM;
		case 4:
			return FIND_BY_DATE;
		default:
			return NO_MENU_ACTION;
		}
	}

}
