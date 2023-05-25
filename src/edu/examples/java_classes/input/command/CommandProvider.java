package edu.examples.java_classes.input.command;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import edu.examples.java_classes.input.command.impl.ConsoleCreateNewItem;
import edu.examples.java_classes.input.command.impl.ConsoleFindItemByDate;
import edu.examples.java_classes.input.command.impl.ConsoleNoAction;
import edu.examples.java_classes.input.command.impl.ConsoleShowFindMenu;
import edu.examples.java_classes.input.command.impl.ConsoleShowMainMenu;

public final class CommandProvider {
	private static final CommandProvider instance = new CommandProvider();
	
	private Map<MenuCommand, Command> commands = new LinkedHashMap<>();
	
	
	private CommandProvider() {
		commands.put(MenuCommand.SHOW_MAIN_MENU, new ConsoleShowMainMenu());
		commands.put(MenuCommand.SHOW_FIND_MENU, new ConsoleShowFindMenu());
		commands.put(MenuCommand.CREATE_NEW_ITEM, new ConsoleCreateNewItem());
		commands.put(MenuCommand.FIND_BY_DATE, new ConsoleFindItemByDate());
		commands.put(MenuCommand.NO_MENU_ACTION, new ConsoleNoAction());
	}
	
	public Command getCommand(MenuCommand commandName) {
		return commands.get(commandName);
	}

	public static CommandProvider getInstance() {
		return instance;
	}
	
	

}
