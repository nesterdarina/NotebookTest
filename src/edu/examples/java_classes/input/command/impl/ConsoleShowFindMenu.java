package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.input.ConcreteMenu;
import edu.examples.java_classes.input.Display;
import edu.examples.java_classes.input.InputTerminal;
import edu.examples.java_classes.input.Menu;
import edu.examples.java_classes.input.MenuBuilder;
import edu.examples.java_classes.input.MenuSelectionSystem;
import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.input.command.CommandProvider;
import edu.examples.java_classes.input.command.MenuCommand;

public class ConsoleShowFindMenu implements Command {

	private MenuSelectionSystem menuSystem = MenuBuilder.getInstance().getMenuSystem();
	private Display display = MenuBuilder.getInstance().getDisplay();
	private InputTerminal terminal = MenuBuilder.getInstance().getTerminal();
	
	@Override
	public void execute() {
		ConcreteMenu menu;
		CommandProvider provider = CommandProvider.getInstance();

		menu = menuSystem.getMenu(Menu.SEARCH_MENU);
		int decision;
		while ((decision = doChoose(menu)) != MenuCommand.EXIT_CODE.getConsoleCode()) {

			Command command = provider.getCommand(MenuCommand.valueOf(decision));
			command.execute();

		}
		
	}
	

	private int doChoose(ConcreteMenu m) {
		int decision;

		display.printMenu(m);
		decision = terminal.input();

		return decision;
	}

}