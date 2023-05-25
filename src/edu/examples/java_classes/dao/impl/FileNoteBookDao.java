package edu.examples.java_classes.dao.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import edu.examples.java_classes.dao.DaoException;
import edu.examples.java_classes.dao.NoteBookDao;
import edu.examples.java_classes.entity.Note;

public class FileNoteBookDao implements NoteBookDao {

	@Override
	public void save(Note n) throws DaoException {
		FileWriter writer;

		try {
			writer = new FileWriter("filename");
		} catch (IOException e) {
			throw new DaoException("Notepad data not saved.", e);
		}
	}

	@Override
	public List<Note> allNotes() {
		List<Note> result = new ArrayList<Note>();
		for(Note n : result) {
			System.out.println(n.getId() + " - " + n.getTitle());
		}
			return result;
			
			}

	private String my_notes;

	public List<Note> formNote(String[] sentences) {
		Note n = new Note();
		String title = "";
		String content = "";

		for (String s : sentences) {
			int i;
			for (i = 0; i < sentences.length; i++) {
				if (i % 2 == 0) {

					sentences[i] = title;
					n.setTitle(title);
				} else {
					sentences[i] = content;
					n.setContent(content);
				}
			}
		}
				List<Note> result = new ArrayList<Note>();
							
					int i;
					for (i = 0; i < result.size(); i++) {

						result.add(new Note(title, content));
					}
				
					return result;
		
	}
	

	private String readAllFile() throws IOException, FileNotFoundException {
		InputStreamReader reader = new InputStreamReader(new FileInputStream(my_notes), "UTF-8");
		BufferedReader breader = new BufferedReader(reader);

		String line;
		StringBuilder text = new StringBuilder();
		while ((line = breader.readLine()) != null) {
			text.append(line);
		}

		return text.toString();
	}

	private static final String SENTENCE_DEVIDER = "\\.\\s+";

	private String[] textToSentences(String allText) {
		allText.trim();
		return allText.toString().split(SENTENCE_DEVIDER);
	}
}
