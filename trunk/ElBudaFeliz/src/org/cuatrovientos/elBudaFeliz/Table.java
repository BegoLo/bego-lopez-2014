package org.cuatrovientos.elBudaFeliz;
/**
 * Represents a table in the restaurant
 * @author BegoLo
 *
 */

public class Table {
	private int num;
	private int chair;
	private String client;
	/**
	 * @param num
	 * @param chair
	 * @param client
	 */
	public Table(int num, int chair) {
		this.num = num;
		this.chair = chair;
		this.client = "";
	}
	/**
	 * @return the num of the table
	 */
	public int getNum() {
		return num;
	}
	/**
	 * @param num the num to set
	 */
	public void setNum(int num) {
		this.num = num;
	}
	/**
	 * @return the chair
	 */
	public int getChair() {
		return chair;
	}
	/**
	 * @param chair the chair to set
	 */
	public void setChair(int chair) {
		this.chair = chair;
	}
	/**
	 * @return the client
	 */
	public String getClient() {
		return client;
	}
	/**
	 * @param client the client to set
	 */
	public void setClient(String client) {
		this.client = client;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Table [num=" + num + ", chair=" + chair + ", client=" + client
				+ "]";
	}
	
}
