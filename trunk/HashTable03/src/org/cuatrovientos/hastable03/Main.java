/**
 * 
 */
package org.cuatrovientos.hastable03;

/**
 * @author BegoLo
 *
 */
public class Main {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		//Crear una instancia de Fleet
		Fleet myFleet = new Fleet("myFleet");
		
		//Crear tres instancias de Commander
		//Commander firstCommander = new Commander("Captain Han Solo",55);
		Commander secondCommander = new Commander("Darth Vaider",40);
		Commander thirdCommander = new Commander("Luke Skywalker",30);
		
		//Crear tres instancias de Ship
		//Ship milleniumFalcon = new Ship(100,100,true,firstCommander);
		Ship superStarDestroyer = new Ship(90,90,true,secondCommander);
		Ship xWingStarfighter = new Ship(50,50,false,thirdCommander);
		
		//Introducir las naves en la Fleet
		myFleet.addShip(new Ship(100,100,true,new Commander("Captain Han Solo",55)));
		myFleet.addShip(superStarDestroyer);
		myFleet.addShip(xWingStarfighter);
		
		//Mostrar naves
		System.out.println("Ships: \n" + myFleet.showAll() );
		
		//Eliminar una nave
		Ship found = myFleet.searchShip(secondCommander);
		if ( null != found ) {
			System.out.println("Commander found: " + found.toString());
			myFleet.removeShip(secondCommander);
			System.out.println("Deleted");
		} else {
			System.out.println("Commander not found");
		} 
		
		System.out.println("\nShow ships after remove: ");
		System.out.println("Ships: \n" + myFleet.showAll() );
		
	}

}
