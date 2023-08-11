package ContactApp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import ContactApp.Interface.ContactService;

public class ContactManager implements ContactService{
public String ffayladresi = "C:\\Users\\USER\\Desktop\\datalar.txt";

		
	@Override
	public void Add() {
	try{
		Scanner sc = new Scanner(System.in);
		    Contact c = new Contact();	
		    System.out.println("Adiniz");
			c.setName(sc.next());
			System.out.println("Soyadiniz");
			c.setSurname(sc.next());
			System.out.println("Nomreniz");
			c.setPhonenumber(Integer.parseInt(sc.next()));
			System.out.println("Emailniz");
			c.setEmail(sc.next());
			System.out.println("Yeni kontakt:" + c.getName() + " " + c.getSurname() + " " + c.getPhonenumber() +  " " + c.getEmail() + "\n");
			BufferedWriter bw = new BufferedWriter(new FileWriter(ffayladresi,true));
			bw.write(c.getName() + " " + c.getSurname() + " " + c.getPhonenumber() +  " " + c.getEmail() + "\n") ;
			bw.close();
	}
			 catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}		
			catch(NumberFormatException nfe) {
				System.out.println("format sehvdir " + nfe.getMessage());
			}
	}
	
	@Override
	public void getAll() {
		try {
			BufferedReader br  = new BufferedReader(new FileReader(ffayladresi));
			String text;
			while((text = br.readLine()) != null) {
				System.out.println(text);
			}
			br.close();
		}  catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
