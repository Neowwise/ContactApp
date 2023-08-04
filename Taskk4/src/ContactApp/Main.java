package ContactApp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ContactManager cm   =  new ContactManager();
		System.out.println("Seciminiz : \n 1)Kontakt elave et  2)Butun kontakti gor ");
		Scanner sc = new Scanner(System.in);
		String secim = sc.next();
		switch(secim) {
		case "1" :cm.Add();break;
		case "2" :cm.getAll();break;
		}
	}

}
