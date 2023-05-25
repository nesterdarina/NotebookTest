package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.input.command.Command;

public class ConsoleNoAction implements Command {

	@Override
	public void execute() {
		System.out.println("No action in progress.");
		
	}

}

