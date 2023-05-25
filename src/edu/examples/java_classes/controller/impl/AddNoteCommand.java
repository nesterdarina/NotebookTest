package edu.examples.java_classes.controller.impl;

import edu.examples.java_classes.controller.Command;
import edu.examples.java_classes.logic.LogicException;
import edu.examples.java_classes.logic.LogicProvider;
import edu.examples.java_classes.logic.NoteBookLogic;

public class AddNoteCommand implements Command {
	private final NoteBookLogic logic = LogicProvider.getInstance().getNoteBookLogic();
	
	@Override
	public String execute(String request) {
		String[] params = request.split("\\s+");
		
		String title = params[1].split("=")[1];
		String content = params[2].split("=")[1];
		
		String response = "";
		
		try {
			logic.add(title, content);
			response = "Your note was added in notebook.";
		} catch (LogicException e) {
			// log
			response = "Error!!!";
		}
		
		return response;
	}
}