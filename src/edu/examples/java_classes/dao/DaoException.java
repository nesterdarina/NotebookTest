package edu.examples.java_classes.dao;

public class DaoException extends Exception {
	static final long serialVersionUID = -736641441840682240L;

	public DaoException() {
	}

	public DaoException(String message) {
		super(message);
	}

	public DaoException(Exception e) {
		super(e);
	}

	public DaoException(String message, Exception e) {
		super(message, e);
	}

}
