package Weekopdracht;

import java.util.Scanner;

class Zeeslag{
	static Scanner key = new Scanner (System.in);
	public static void main(String[] args) {
		Speler speler = new Speler;
		Schip schip1 = new Schip(1,2);
		Schip schip2 = new Schip(5,10,15);//let op op de ander
//		speler.bommenGooien(new Schip(1,2));  //let op op de ander
		new Schip(11,12,13,14);//let op op de ander
		Zee zee = new Zee();
		
		
		System.out.println("Welkom bij Zeeslag. Bom erop los en kijk of je het schip kunt laten zinken! Kies het nummer 1 tot en met l2 om te bombarderen!");
		int a = key.nextInt();
		Scanner scInput = new Scanner (System.in);

		
//				String invoerUser = scInput.nextLine();
//		System.out.println(invoerUser);
//		if (invoerUser.equals("4") || invoerUser.equals("8") || invoerUser.equals("12")) {
//			schip1.gebombardeerdWorden(); 
//			System.out.println("Kaboem! Je hebt je eerste doel getroffen!");
//		} else {
//			if(invoerUser.equals("1") || invoerUser.equals("2") || invoerUser.equals("3") || invoerUser.equals("5") || invoerUser.equals("6") || invoerUser.equals("8") || invoerUser.equals("9") || invoerUser.equals("10") || invoerUser.equals("11")){
//				schip1.missen();
//				System.out.println("Plons! Gemist.");
//			}
//		}
//		invoerUser = scInput.nextLine();
//		System.out.println(invoerUser);
//		if (invoerUser.equals("4") || invoerUser.equals("8") || invoerUser.equals("12")) {
//			schip1.gebombardeerdWorden(); 
//			System.out.println("Kaboem! Je hebt je tweede doel getroffen! Het schip is bijna gezonken.");
//		} else {
//			if(invoerUser.equals("1") || invoerUser.equals("2") || invoerUser.equals("3") || invoerUser.equals("5") || invoerUser.equals("6") || invoerUser.equals("7") || invoerUser.equals("9") || invoerUser.equals("10") || invoerUser.equals("11")){
//				schip1.missen();
//				System.out.println("Plons! Gemist.");
//				
//				invoerUser = scInput.nextLine();
//				System.out.println(invoerUser);
//				if (invoerUser.equals("1") || invoerUser.equals("8") ||invoerUser.equals("12")) {
//					schip1.gebombardeerdWorden(); 
//					System.out.println("Ja! Je hebt het hele schip doen zinken! Je hebt gewonnen.");
//					schip1.zinken();
//					boolean gezonken = true;
//				} else {
//					if(invoerUser.equals("1") || invoerUser.equals("2") || invoerUser.equals("3") || invoerUser.equals("4") || invoerUser.equals("6") || invoerUser.equals("7") || invoerUser.equals("9") || invoerUser.equals("10") || invoerUser.equals("11")){
//						schip1.missen();
//						System.out.println("Plons! Gemist.");
//				
//					}
//				}
//			}
//		}
//	}

}
class Speler{
	void bommenGooien(Schip gebombardeerdSchip) {
		if(gebombardeerdSchip.gezonken){ 
		}	
	}
}
class Zee{
	int[][] zee = {{1,2,3,4,5},{6,7,8,9,10},{10,11,12,13,14,15}};
	void inZee() {
		for (int i = 0; i < zee.length;i++) {
			for (int j = 0; j < zee[i].length;j++){
				System.out.print(zee[i][j] + " ");
			}
			System.out.println("");
		}
	}
}
class Schip{
	int coordinaat1;
	int coordinaat2;
	int coordinaat3;
	int coordinaat4;
	
	}
	boolean gezonken;
	Schip (int coordinaat1, int coordinaat2){
		this.coordinaat1 = coordinaat1;
		this.coordinaat2 = coordinaat2;
	}
	Schip (int coordinaat1, int coordinaat2, int coordinaat3){
		this.coordinaat1 = coordinaat1;
		this.coordinaat2 = coordinaat2;
		this.coordinaat3 = coordinaat3;
	}
	Schip (int coordinaat1, int coordinaat2, int coordinaat3, int coordinaat4){
		this.coordinaat1 = coordinaat1;
		this.coordinaat2 = coordinaat2;
		this.coordinaat3 = coordinaat3;
		this.coordinaat4 = coordinaat4;
	}}}
	
