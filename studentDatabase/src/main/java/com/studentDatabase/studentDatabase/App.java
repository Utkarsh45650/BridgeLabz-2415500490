package com.studentDatabase.studentDatabase;

import java.sql.SQLException;
import java.util.Scanner;
import menu.Menu;
import dataQurrey.dataQerry;

public class App 
{
    public static void main( String[] args ) throws SQLException
    {
        Scanner sc=new Scanner(System.in);
        Menu menu=new Menu();
        dataQerry dq=new dataQerry();
        
        while(true) {
        	menu.mainMenu();
        	System.out.print("Please enter a number :- ");
        	int val=sc.nextInt();
        	switch(val) {
        		case 1: dq.CreateTable();break;
        		
        		case 2: dq.DisplayData();break;
        		
        		case 3: dq.InsertSingleData();break;
        		
        		case 4: dq.InsertMultipleData();break;
        		
        		case 5: dq.DeleteSingleData();break;
        		
        		case 6: dq.DeleteMultipleData();break;
        		
        		case 7: dq.UpdateSingleData();break;
        		
        		case 8: dq.UpdateMultipleData();break;
        		
        		case 9: break;
        	
        		default: System.out.println("Invalid Input.");
        		
        	}
        }
    }
}
