package pracmod3;

import java.util.Scanner;

public class HotelOccupancy_19331153 {

  public static void main(String[] args) {
	
    Scanner kb = new Scanner(System.in);

    //initialization 

  	int floors; // floors in hotel
  	int floorRooms; //number of rooms on a floor
  	int occFloorRooms; // number of occupied floor rooms
  	double occFloorRate = 0; // rate of occupation for the floor
  	int totalRoomsOcc = 0; //total number of rooms occupied in hotel
  	int totalRooms = 0; // total number of rooms in hotel
  	int unoccRooms = 0; //total number of vacant rooms in hotel
  	double occupancyRate = 0; // rate of occupation for the hotel

  	//First finding out how many floors the hotel has
  	System.out.print("How many floors in the hotel? ");
  	floors = kb.nextInt();
  
  
  	while (floors < 1) {
  	  System.out.println("Error, please enter valid number of floors.");
  	  floors = kb.nextInt();
  	}
  
  	// will ask how many rooms there are per floor, then print the occupancy rate per floor
  	for (int i = 1; i <= floors; i++) {
  	  System.out.println("How many rooms on this floor?");
  	  floorRooms = kb.nextInt();

  	  // Will check that room number isn't less than 10
  	  while (floorRooms < 10) {
  	    System.out.println("Error, please enter valid number of rooms on the floor.");
  	    floorRooms = kb.nextInt();
  	  }

  	  System.out.println("How many rooms are occupied?");
  	  occFloorRooms = kb.nextInt();

  	  //checks that the occupied rooms does not exceed total rooms
  	  while (occFloorRooms > floorRooms || occFloorRooms < 0) {
	    System.out.println("Error, please enter valid number of occupied rooms on the floor.");
	    occFloorRooms = kb.nextInt();
  	  }
    
  	  //prints occupancy rate per floor
  	  occFloorRate = (double)occFloorRooms/floorRooms; 
  	  System.out.println("Floor number " + i + " has an occpancy rate of " + occFloorRate);
		
	
  	  // total rooms, occupied and vacant, as well as occupancy rate overall based in input
  	  totalRooms = floorRooms + totalRooms;
  	  totalRoomsOcc = occFloorRooms + totalRoomsOcc;
  	  unoccRooms = totalRooms - totalRoomsOcc;
  	}
  	
  	occupancyRate = (double)totalRoomsOcc/totalRooms;
  
  	//prints the total amount of rooms, occ rate, vacancies and occupied rooms
  	System.out.print("The hotel has " + totalRooms + " rooms, ");
  	System.out.print(totalRoomsOcc + " rooms are occupied, ");
  	System.out.print(unoccRooms + " rooms are vacant and ");
  	System.out.print("the occupancy rate is " + occupancyRate);

  }

}