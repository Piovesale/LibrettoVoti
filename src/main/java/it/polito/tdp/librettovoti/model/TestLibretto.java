package it.polito.tdp.librettovoti.model;

import java.time.*;

public class TestLibretto {
	
	public static void main(String[] args) {
	
		Libretto libretto = new Libretto();
		Voto voto1 = new Voto("Analisi I",30,LocalDate.of(2019,2,15));
		libretto.add(voto1);
		libretto.add(new Voto("Fisica I",28,LocalDate.of(2019,2,15)));
		libretto.add(new Voto("Informatica",18,LocalDate.of(2019,7,8)));
	
		System.out.println(libretto);
	}
}
