/**
 * 
 */
package org.cuatrovientos.hashtable2;

import java.util.Enumeration;
import java.util.Hashtable;


/**
 * Represents contacts
 * @author BegoLo
 *
 */
public class Contacts {
	private String owner;
	private Hashtable<String,Customer> customers;
	/**
	 * constructor
	 * @param owner
	 */
	public Contacts(String owner) {
		this.owner = owner;
		customers = new Hashtable<String,Customer>();
	}
	/**
	 * add customers to our contacts
	 * @param c
	 */
	public void addCustomer(Customer c){
		customers.put(c.getDni(),c);
	}
	/**
	 * search customers by dni
	 * @param dni
	 * @return
	 */
	public Customer searchCustomer (String dni){
		Customer c = null;
		c = customers.get(dni);
		return c;
	}
	/**
	 * remove costumer by dni
	 * @param dni
	 */
	public void removeCustomer(String dni) {
		customers.remove(dni);
	}
	/**
	 * Show all our contacts
	 * @return
	 */
	public String showAll(){
		String allCustomers="";
		Enumeration<String> keys = customers.keys();
		while (keys.hasMoreElements()) {
			String dni = keys.nextElement();
			allCustomers = allCustomers + customers.get(dni) + "\n";
		}
		return allCustomers;
	}
	
}
