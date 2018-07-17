package Weekopdracht;
//OK Omer wat is de opdracht? Maak Zeeslag
//Wat heb je nodig? Nou allereerst een Zee. Maak die.
//Goed zo! Je kunt fokking class en Zee naast elkaar typen
//Net als in het voorbeeld van de producten in de supermarkt stoppen we de schepen in de zee
//We maken ook een aparte klasse Ship, met daarin de variabele coordinate want ze moeten zich op vaste plekken van de zee bevinden
//en net zoals er in de winkel een product met een prijs ligt doen we hetzelfde met sea.ship.coordinate
//en toen wist ik het even niet meer en was het half 12


import java.util.Scanner;

public class Battleship {

	public static void main(String[] args) {
		int [][]arry = new int[5][5];
		Sea sea = new Sea();
		Ship ship = new Ship();
		Scanner scInput = new Scanner (System.in);
		String invoerUser = scInput.nextLine();
		int movesLeft = 10;
		boolean isValid = false;
		
		sea.ship1.coordinate1 = 1;
		sea.ship1.coordinate2 = 2;
		sea.ship2.coordinate1 = 11;
		sea.ship2.coordinate2 = 12;
		sea.ship2.coordinate3 = 13;
		sea.ship3.coordinate1 = 5;
		sea.ship3.coordinate2 = 10;
		sea.ship3.coordinate3 = 15;
		sea.ship3.coordinate4 = 20;
		
		ship.getInfo();
		
		while (true) {
			while(isValid == false) {
				System.out.println("Please enter coordinates");
				System.out.println(invoerUser);
			
	}
}

	}

class Sea{
	int [][] sea = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20}};
	void inSea() {
		for(int i = 0; i <sea.length;i++) {
			for(int j = 0; j <sea.length;j++) {
			}
		}
	}
	Ship ship1 = new Ship();
	Ship ship2 = new Ship();
	Ship ship3 = new Ship();
}
class Ship{
	int coordinate1;
	int coordinate2;
	int coordinate3;
	int coordinate4;
	void sink() {
		System.out.println("You sank my battleship!");
	}
	boolean win;
	void getInfo() {
		
	}
}

public static boolean validMove (int zee) {
	if(invoerUser >= "1" && invoerUser <= "12");
	
}