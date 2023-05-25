package edu.examples.java_classes.logic;

import java.util.Date;
import java.util.List;

import edu.examples.java_classes.entity.Note;

public interface NoteBookLogic {
	void add(Note n) throws LogicException;
	
	void add(String title, String content) throws LogicException;
	
	List<Note> find(String text) throws LogicException;
	
	List<Note> find(Date date) throws LogicException;

	List<Note> allNotes() throws LogicException;
}
