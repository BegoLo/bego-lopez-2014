/**
 * 
 */
package org.cuatrovientos.parking;

/**
 * @author BegoLo
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Parking parking = new Parking("MyParking",2);
		Car sampleCar = new Car("666Evil","Opel Corsa","Red");
		Car otherSampleCar = new Car("042Evil","Ferrari","Yellow");
		
		parking.addCar(sampleCar);
		parking.addCar(otherSampleCar);
		
		System.out.println("Parking cars: \n" + parking.showAll() );
		
		Car found = parking.searchCar("666Evil");
		if ( null != found ) {
			System.out.println("Car found: " + found.toString());
		}
		
		parking.removeCar("666Evil");
		System.out.println("\nShow parking after remove: ");
		System.out.println("Parking cars: \n" + parking.showAll() );
		
	}

}
