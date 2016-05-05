
import java.util.*;
/*
Class: CSE3320
Semester: Spring 2016
Student Name: Emmanuel Lennix
Student ID: 1001104990
Assignment: project #4

*/
public class Main
{
	private static DBmanager database;
	private static Scanner keyboard;
	private static Boolean loop = true;
	private static String pass;

	public static void main(String[] args)
	{
		keyboard = new Scanner(System.in);
		database = new DBmanager();
		System.out.println("Enter the database password to start!");
		while(database.getConnection() == null)
		{
			System.out.print(">");
			pass = keyboard.nextLine();
			database.setConnection(pass);
		}

		while(loop)
		{
			menu();
		}
		
	}

	private static void menu()
	{
		
		System.out.println("Enter and integer to check the following data in the database!");
		System.out.println("Press 1 for Departure!\nPress 2 for Arrival!\nPress 3 to Exit!");
		int option = Integer.parseInt(keyboard.nextLine());
		switch(option)
		{
			case 1:depart();break;
			case 2:arrive();break;
			case 3:loop=false;break;
		
		}
		
	}

	private static void depart()
	{
		Boolean miniloop = true;
		int flno=0;
		while(miniloop)
		{

			System.out.println("Enter a Flight Number");
		
			try
			{
				flno = Integer.parseInt(keyboard.nextLine());
				break;
			}catch(Exception ex){}
		}
		
		int seq =0;
		while(miniloop)
		{
			System.out.println("Enter a leg sequence:");
			try
			{
				seq = Integer.parseInt(keyboard.nextLine());
				break;
			}catch(Exception ex){}
		}
		
		String date="i";
		//if data isn't obtained then keep looping until is is
		while(miniloop)
		{
			System.out.println("Enter a date:");
			try
			{
				date = keyboard.nextLine();
				break;
			}catch(Exception ex){}
		}
		//create Flight leg instance and stores the data provided from the user
		FlightLegInstance leg = new FlightLegInstance();
		leg.setSeq( Integer.toString(seq)) ;
		leg.setFLNO( Integer.toString(flno) );
		leg.setFDate(date);
			
		//if leg exists in database it returns true`
		if(database.FlightLegExists(leg) )
		{
			//if	
			while(!database.PilotExists(leg))
			{
				database.printAllpilots();
				System.out.println("Enter the pilot id");
				
				try
				{
					leg.setPilot( String.valueOf( Integer.parseInt( keyboard.nextLine() ) ) );

				}catch(Exception ex){}
				
				
			}
			


			String time = null;

			while(time==null)
			{
				System.out.println("Enter the actual depart time!");
				time = keyboard.nextLine();
				
			}
			leg.setActDept(time);
			
			//if leg equal 1 put in database
			if(leg.getSeq().equals("1") )insertArrival(leg);
			else doLegequals2(leg);			

		}
		else 
		{
			//Everything below is not in the database
			System.out.println("Not in Database!");
		}
	}
	
	private static void insertArrival(FlightLegInstance leg)
	{
		//if FlightLegInstance not in FlightInstance then put it in FlightLeg
		if( !database.FlightInstanceExists(leg) )database.putFlightInstance(leg);
		database.putFlightLegInstance(leg);

	}
	
	private static void  doLegequals2(FlightLegInstance leg)
	{
		if( !database.FlightInstanceExists(leg) )database.putFlightInstance(leg);
		if(database.actualTime(leg))database.putFlightLegInstance(leg);		
	}
	private static void arrive()
	{
		
		Boolean miniloop = true;
                int flno=0;
                while(miniloop)
                {

                        System.out.println("Enter a Flight Number");

                        try
                        {
                                flno = Integer.parseInt(keyboard.nextLine());
                                break;
                        }catch(Exception ex){}
                }

                int seq =0;
                while(miniloop)
                {
                        System.out.println("Enter a leg sequence:");
                        try
                        {
                                seq = Integer.parseInt(keyboard.nextLine());
                                break;
                        }catch(Exception ex){}
                }

                String date="i";
                //if data isn't obtained then keep looping until is is
                while(miniloop)
                {
                        System.out.println("Enter a date:");
                        try
                        {
                                date = keyboard.nextLine();
                                break;
                        }catch(Exception ex){}
                }
                //create Flight leg instance and stores the data provided from the user
                FlightLegInstance leg = new FlightLegInstance();
                leg.setSeq( Integer.toString(seq)) ;
                leg.setFLNO( Integer.toString(flno) );
                leg.setFDate(date);

		if(database.FlightLegExists(leg) )
                {  
                        String time = null;

                        while(time==null)
                        {
                                System.out.println("Enter the actual arrival time!");
                                time = keyboard.nextLine();

                        }
                        leg.setActArr(time);
			database.getDeptTime(leg);
			if(leg.getActArr().compareTo( leg.getActDept() ) > 0)
			database.updateFlightLegInstance(leg);

			else System.out.println("The arrival time entered is before the departure time.");

                        
                }
                else
                {
                        //Everything below is not in the database
                        System.out.println("Must be a valid to update thet tuple!");
		}
		

	}
}
    


