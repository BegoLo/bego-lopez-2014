package org.cuatrovientos.elBudaFeliz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//variable for new tables
		String name = "";
		Table table = null;
		int index = 0;
		int num = 0; //chairs
		String text = "";
		//variable for restrictions
		boolean x = true;
		
		Scanner reader = new Scanner(System.in);
		String option ="";
		
		Restaurant myRestaurant = new Restaurant();
		
		do{
			System.out.println("----------------Restaurant------------------");
			System.out.println("Select one option:\n");
			System.out.println("1. Add new table");
			System.out.println("2. Remove table");
			System.out.println("3. Book table");
			System.out.println("4. Make free table");
			System.out.println("5. Show all tables");
			System.out.println("6. Exit");
			System.out.print("Option");
			option = reader.nextLine();
			
			switch(option){
				case "1":
					System.out.println("Please, enter the table number:");
					text = reader.nextLine();
					index = Integer.parseInt(text);
					System.out.println("Please, enter a chairs number:");
					text=reader.nextLine();
					num=Integer.parseInt(text);
					table = new Table(index,num);
					x = myRestaurant.addTable(table);
					if (x == false){
						System.out.println("This table already exist");
					}
					break;
				case "2":
					System.out.println("Please, enter the table number which you want delete:");
					text = reader.nextLine();
					index = Integer.parseInt(text);
					x=myRestaurant.deleteTable(index);
					if (x == false){
						System.out.println("This table doesn´t exist");
					}
					break;
				case "3":
					System.out.println("Please, enter the table number which you want booked:");
					text = reader.nextLine();
					index = Integer.parseInt(text);
					System.out.println("Please, enter a name:");
					name = reader.nextLine();
					x = myRestaurant.bookTable(index,name);
					if (x == false){
						System.out.println("This table is already booked");
					}
					break;
				case "4":
					System.out.println("Please, enter the table number which you want make free:");
					text = reader.nextLine();
					index = Integer.parseInt(text);
					x = myRestaurant.freeTable(index);
					if (x == false){
						System.out.println("This table is already free");
					}
					break;
				case "5":
					System.out.println(myRestaurant.showAll());
					break;
				case "6":
					System.out.println();
					System.out.println("See you next time! Bye!");
					break;
				default:
					System.out.println();
					System.out.println("TRY AGAIN");
					break;
			}
		} while (!option.equals("6"));
	}

}
