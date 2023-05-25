package edu.examples.java_classes.input;

import edu.examples.java_classes.input.command.Command;
import edu.examples.java_classes.input.command.CommandProvider;
import edu.examples.java_classes.input.command.MenuCommand;

public class ConsoleMenu {

//	private CommandProvider provider = CommandProvider.getInstance();

	public void execute() {

		Command command = CommandProvider.getInstance().getCommand(MenuCommand.SHOW_MAIN_MENU);
		command.execute();
//
	}

	/*
	 * private void executeFindMenu() { ConcreteMenu menu =
	 * menuSystem.getMenu(Menu.SEARCH_MENU); int decision; while ((decision =
	 * doChoose(menu)) != menu.getSize()) {
	 * 
	 * switch (decision) { case 0: System.out.println("case 2-1"); break; case 1:
	 * System.out.println("case 2-2"); break; case 2:
	 * System.out.println("case 2-3"); return; } } }
	 * 
	 * private int doChoose(ConcreteMenu m) { int decision;
	 * 
	 * display.printMenu(m); decision = terminal.input(0, m.getSize() - 1);
	 * 
	 * return decision; }
	 */

}