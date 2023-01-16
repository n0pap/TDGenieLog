package tests;

import static org.junit.Assert.*;

import org.junit.Test;

import myPackage.DossierBancaire;

public class TestsDossierBancaire {

	@Test  
	public void testDeposer() 
	{
		System.out.println("---------testDeposer---------");
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		assertEquals(100,dossier.get_solde(),0);
	}
	
	@Test  
	public void testRemunerer() 
	{
		
	}
	
	@Test  
	public void testTotal() 
	{
		
	}
	
	

}
