package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.input.command.Command;

public class ConsoleFindItemByDate implements Command{

	@Override
	public void execute() {
		System.out.println("find item by date");
		
		String request = "FIND_BY_DATE date=12.12.2012";
		
	}

}
