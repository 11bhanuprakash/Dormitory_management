package info;

import java.util.*;

public class Information
{
	public Information()
	{
	
		Scanner s = new Scanner(System.in);
		boolean check = true;
		do
		{
			System.out.println("\n\t\t======================================");
			System.out.println("\n\t\t\t..::ROOMS OF HOSTEL::..");
			System.out.println("\n\t\t======================================");
			System.out.println("\n\t\t 1. :- Sharing Rooms");
			System.out.println("\n\t\t 2. :- Single Rooms");
			System.out.println("\n\t\t 3. :- Back To Main Menu");
			System.out.println("\n\t\t======================================");
			System.out.print("\n\t\t\t   CHOICE :- ");
			int choice = s.nextInt();
			switch(choice)
			{
				case 1:
			
				new SharingRoom();
				break;
				case 2:
				new SingleRoom();
				break;
				case 3:
				check = false;
				break;
			}
		}while(check);
	}
}

class SharingRoom
{
	SharingRoom()
	{
	
		System.out.println("\n\n\t    ====================================================");
		System.out.println("\n\t\t     ..::Sharing Rooms for Students::..");
		System.out.println("\n\t    ====================================================");
		System.out.println("\n\t\tRoom Type\tName\t\tArea\t\tRent(in Euros)");
		System.out.println("\n\t\t4 Sharing\tleibnizalle\t13\t\t200");
		System.out.println("\n\t\t3 Sharing\tjacobsplan\t18\t\t250");
		System.out.println("\n\t\t2 Sharing\tMerkatel\t20\t\t270");
		System.out.println("\n\t    ----------------------------------------------------");
		System.out.println("\n\t\tLaundry Charges\t 1 Euro per Wash");
		System.out.println("\n\t\tHeater and Electricity bills\\t\\t Not included in Rent");
		System.out.println("\n\t\tInternet\t 10 Euros per Month");
		System.out.println("\n\t    ====================================================");
		System.out.println("\n\t\tEnter any key to continue...");
		Scanner s =new Scanner(System.in);
		String temp = s.next();
	

	}
}

class SingleRoom
{
	SingleRoom()
	{
		System.out.println("\n\n\t    ====================================================");
		System.out.println("\n\t\t     ..::Single Rooms for Students::..");
		System.out.println("\n\t    ====================================================");
		System.out.println("\n\t\tName\t\tArea\t\tRent (in Euros)");
		System.out.println("\n\t\tLeibnizalle\t15\t\t230");
		System.out.println("\n\t\tJacobsplan\t20\t\t290");
		System.out.println("\n\t\tMerketal\t20\t\t260");
		System.out.println("\n\t    ----------------------------------------------------");
		System.out.println("\n\t\tLaundry Charges\t1 Euro per Wash");
		System.out.println("\n\t\tHeater and Electricity bills\t Included in Rent");
		System.out.println("\n\t    ====================================================");
		System.out.println("\n\t\tEnter any key to continue...");
		Scanner s =new Scanner(System.in);
		String temp = s.next();
	}
}
