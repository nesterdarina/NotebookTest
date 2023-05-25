package edu.examples.java_classes.dao;

import java.util.ArrayList;
import java.util.List;

import edu.examples.java_classes.dao.impl.FileNoteBookDao;
import edu.examples.java_classes.entity.Note;

public final class DaoProvider {
	private static final DaoProvider INSTANCE = new DaoProvider();
	
	private DaoProvider() {}
	
	private NoteBookDao noteBookDao = new FileNoteBookDao();
	
	
	public NoteBookDao getNoteBookDao() {
		return noteBookDao;
	}

	public static DaoProvider getInstance() {
		return INSTANCE;
	}

	public static List<Note> allNotes() {
		List<Note> result = new ArrayList<Note>();
		
		return result;
		
	}
	

}