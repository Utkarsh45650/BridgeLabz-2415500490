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
        	int val=sc.nextInt();
        	switch(val) {
        	case 1: dq.CreateTable();
        		
        	case 2: dq.DisplayData();
        		
        	case 3: dq.InsertSingleData();
        		
        	case 4: dq.InsertMultipleData();
        		
        	case 5:
        		
        	case 6:
        		
        	case 7:
        		
        	case 8:
        		
        	case 9: break;
        		
        	}
        }
    }
}
