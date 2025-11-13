package menu;
import dataQurrey.dataQerry;

public class Menu implements IMenu {
	
	@Override
	public void mainMenu() {
		
		System.out.println("welcome to StudentDatabase Project Previes(prototype).\n------------------------------------------------------------------");
		System.out.println("Plesase select operation to do :-");
		System.out.println("1 for Create table");
		System.out.println("2 for Display all students.");
		System.out.println("3 for Insert Single Student.");
		System.out.println("4 for Insert Multiple Students.");
		System.out.println("5 fro Delete Single Student.");
		System.out.println("6 for Delete Multiple Students.");
		System.out.println("7 for Edit/Update Single Student.");
		System.out.println("8 for Edit/Update multiple Students.");
		System.out.println("9 for Exit.\n-------------------------------------------------------------------------");
	
	}
}
