/**
 * 
 */
package org.cuatrovientos.hastable03;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * @author BegoLo
 *
 */
public class Fleet {
	private String fleetName;
	private Hashtable<Commander,Ship> ships;
	/**
	 * @param fleetName
	 */
	public Fleet(String fleetName) {
		this.fleetName = fleetName;
		ships = new Hashtable<Commander,Ship>();
	}
	
	public void addShip(Ship ship) {
		ships.put(ship.getCommander(), ship);
	}
	
	public Ship searchShip (Commander commander) {
		return ships.get(commander);
	}
	
	public void removeShip(Commander commander) {
		ships.remove(commander);
	}
	
	public String showAll() {
		String allShips = "";
		Enumeration<Commander> keys = ships.keys();
		while (keys.hasMoreElements()) {
			Commander commander = keys.nextElement();
			allShips = allShips + ships.get(commander) + "\n";
		}
		return allShips;
	}
}
