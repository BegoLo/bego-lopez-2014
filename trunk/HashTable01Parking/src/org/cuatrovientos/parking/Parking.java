/**
 * 
 */
package org.cuatrovientos.parking;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * Represents parking
 * @author BegoLo
 *
 */
public class Parking {
	private String name;
	private int capacity;
	private Hashtable<String,Car> places;
	/**
	 * @param name
	 * @param capacity
	 */
	public Parking(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
		places = new Hashtable<String,Car>(); //inicializamos el hashtable
	}
	/**
	 * add car to our parking
	 * @param car
	 */
	public void addCar (Car car) {
		//controlamos la capacidad del parking
		if (places.size() < capacity) {
			places.put(car.getPlate(), car);
			//Cuando llamemos al método directamente cogera la matricula
		}
	}
	/**
	 * 
	 * @param plate
	 * @return
	 */
	public Car searchCar (String plate) {
		Car car = null;
		car = places.get(plate);
		return car; // return places.get(plate);
	}
	
	/**
	 * remove the car from the parking
	 * @param plate
	 */
	public void removeCar(String plate){
		places.remove(plate);
	}
	/**
	 * Show all cars in the parking
	 * @return
	 */
	public String showAll() {
		String allCars="";
		//primero recogemos todas las claves de los coches en un vector
		Enumeration<String> keys = places.keys();
		//recorremos el vector
		while (keys.hasMoreElements()) {
			//get current key
			String plate = keys.nextElement();
			//show car instance
			allCars = allCars + places.get(plate) + "\n";
		}
		return allCars;
	}
}
