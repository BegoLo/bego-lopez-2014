package org.cuatrovientos.elBudaFeliz;

import java.util.Enumeration;
import java.util.Hashtable;
/**
 * Represents a restaurant software to manage the tables
 * @author BegoLo
 *
 */
public class Restaurant {
	private Hashtable<Integer,Table> tables;
	
	public Restaurant(){
		tables = new Hashtable<Integer,Table>();
	}
	
	/**
	 * adds a table into the system
	 * @param table
	 */
	public boolean addTable(Table table) {
		
		if (tables.containsKey(table.getNum())) {
			return false;
		}else{
			tables.put(table.getNum(),table);
			return true;
		}
		
	}
	
	/**
	 * deletes a table from the system
	 * @param index
	 */
	public boolean deleteTable(int index) {
		if (tables.containsKey(index)) {
			tables.remove(index);
			return true;
		}else {
			return false;
		}
	}
	
	/**
	 * Books a table for a costumer
	 * @param index
	 * @param name
	 */
	public boolean bookTable(int index, String name) {
		if ((tables.containsKey(index)) && (tables.get(index).getClient() == "")){
			tables.get(index).setClient(name);
			return true;
		}else{
			return false;
		}
		
	}
	
	/**
	 * frees a table from system
	 * @param index
	 */
	public boolean freeTable(int index) {
		if ((tables.containsKey(index)) && (tables.get(index).getClient() != "")){
			tables.get(index).setClient("");
			return true;
		}else{
			return false;
		}
		
	}
	
	/**
	 * show all the tables from system
	 * @return
	 */
	public String showAll(){
		String result = "";
		Enumeration<Integer>keys=tables.keys();
		while(keys.hasMoreElements()){
			int num = keys.nextElement();
			result=result+tables.get(num)+ "\n";
		}
		return result;
	}
}
