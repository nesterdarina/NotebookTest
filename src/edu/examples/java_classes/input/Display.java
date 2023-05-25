package edu.examples.java_classes.input;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Display {
	
	public void printMenu(ConcreteMenu m) {
		//System.out.println(m.getTitle());
		
		Set<Map.Entry<Integer, String>> items = m.getItems();
		for(Map.Entry<Integer, String> item : items) {
			System.out.println(item.getKey() + " " + item.getValue());
		}
	}

}