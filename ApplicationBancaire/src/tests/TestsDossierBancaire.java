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
		System.out.println("---------testRemunerer---------");
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		
		double taux=3.2*0.01;
		double solde_recalcule=dossier.getEpargne().Solde()+dossier.getEpargne().Solde()*taux;
		
		dossier.remunerer();
		assertEquals(dossier.getEpargne().Solde(),solde_recalcule,0);
	}
	
	@Test  
	public void testTotal() 
	{
		System.out.println("---------testTotal---------");
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		double somme=dossier.getCourant().Solde()+dossier.getEpargne().Solde();
		assertEquals(100,somme,0);
	}
	
	@Test  
	public void testRetrait() 
	{
		System.out.println("---------testRetrait---------");
		DossierBancaire dossier=new DossierBancaire();
		dossier.deposer(100);
		boolean thrown=false;
		try
		{
			dossier.retrait(200);
		}
		catch(Exception e)
		{
			thrown =true;
		}
		assertTrue(thrown);
		
		
		
	}
	
	

}
