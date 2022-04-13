package testProject;

import java.util.Scanner;

public class Aggiungo {
	Scanner parola = new Scanner(System.in);
	String p;
	public Aggiungo(){
		setAggiungo();
		System.out.println(p);
	}
	public void setAggiungo(){
		System.out.print("Inserisci una parola ");
		p = parola.next();
	}
	public String getAggiungo() {
		return p;
	}
}
