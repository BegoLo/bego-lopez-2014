package org.cuatrovientos.hashtable2;


/**
 * Solo tiene un método main, donde se instancia Contacts, se crean varios Customer 
 * y se meten en la lista de contactos. Luego se prueba a buscar un Customer por su dni, 
 * se muestran todos los Customer de la lista, se elimina un Customer y se vuelven a 
 * mostrar todos.
 * @author BegoLo
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//preguntaria quien sería el dueño de la lista
		Contacts contactsList = new Contacts("Bego");
		
		//controlar si quiere meter varias personas (¿Otro(S/N)?) --> while
		contactsList.addCustomer(new Customer("12456398A","sdfsadf","sdfasdf@hotmail.com"));
		contactsList.addCustomer(new Customer("123456789G","sgsg","dfgsdg@gmail.com"));
		
		System.out.println("Customers: \n" + contactsList.showAll() );
		
		//Preguntamos por el dni
		Customer found = contactsList.searchCustomer("12456398A");
		if ( null != found ) {
			System.out.println("Customer found: " + found.toString());
		} else {
			System.out.println("Customer not found");
		} 
		
		//preguntar por alguien para eliminar y preguntar si está seguroo
		contactsList.removeCustomer("123456789G");
		System.out.println("\nShow customers after remove: ");
		System.out.println("Customers: \n" + contactsList.showAll() );
	}
}
