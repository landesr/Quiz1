package pkgMain;

import java.util.Scanner;

import pkgCore.Quarterback;

public class cMain {

	public static void main(String[] args) {
		Quarterback Wentz = new Quarterback();
		
		Scanner input = new Scanner(System.in);
		System.out.println("Number of touchdowns: ");
		Wentz.setTD(input.nextInt());

		System.out.println("Passing yards: ");
		Wentz.setYDS(input.nextDouble());

		System.out.println("Number of interceptions: ");
		Wentz.setINTER(input.nextInt());

		System.out.println("Number of completions: ");
		Wentz.setCOMP(input.nextInt());

		System.out.println("Number of attempts: ");
		Wentz.setATT(input.nextInt());
		input.close();
		
		System.out.print("Passer Rating: " + Wentz.QBrating());

	}

}
