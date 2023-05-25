package edu.examples.java_classes.input.command.impl;

import edu.examples.java_classes.controller.Controller;
import edu.examples.java_classes.input.command.Command;

public class ConsoleFindItemByContent implements Command {
	private Controller controller = Controller.getInstance();
	
	@Override
	public void execute() {
		
		String request = "FIND_BY_CONTENT content='kkkkk'";
		
		//----------------------------------------------
		
        String response;
		
		response = controller.doAction(request);
		
		//----------------------------------------------------------
		
		System.out.println(response);

	}

}
