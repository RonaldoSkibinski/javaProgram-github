package application;

import java.util.Scanner;

import entities.Pensions;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rent?: ");
		int n = sc.nextInt();
		Pensions[] pensions = new Pensions[10];
		for(int i=1; i<=n; i++) {
			System.out.println("#Rent" + i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			pensions[room] = new Pensions(name, email);
		}
		for(int i=0; i<pensions.length; i++) {
			if(pensions[i] != null) {
				System.out.println(i + ": " + pensions[i].toString());
			}			
		}
		sc.close();
		
	}

}
