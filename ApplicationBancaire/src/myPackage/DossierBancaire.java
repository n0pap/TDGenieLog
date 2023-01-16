package myPackage;

public class DossierBancaire 
{
	private Compte _CompteCourant;
	private CompteEpargne _CompteEpargne;
	
	private double _interCourant;
	private double _interEpargne;
	
	//Constructeur
    public DossierBancaire()
    {
    	_CompteCourant=new Compte(0);
    	_CompteEpargne=new CompteEpargne(0);
    }

    public void deposer(float value) 
    {	
    	_interCourant=0.4*value; 
    	_interEpargne=0.6*value;

    	_CompteCourant.AjoutSolde(_interCourant);
    	_CompteEpargne.AjoutSolde(_interEpargne); 
    	
    	affichageDossierBancaire();
    }
    
    public double get_solde() 
    {
    	return _CompteCourant.Solde() + _CompteEpargne.Solde();
    }
    
    public void remunerer() 
    {
    	_CompteEpargne.RemunerationEpagne();
    	affichageDossierBancaire();
    }
    
    public Compte getEpargne()
    {
    	return _CompteEpargne;
    }
    
    public Compte getCourant()
    {
    	return _CompteCourant;
    }
    
    public void affichageDossierBancaire()
    {
    	System.out.println("---------Dossier Bancaire---------");
    	System.out.println("Courant : " + _CompteCourant.Solde() + "	 Epargne : " + _CompteEpargne.Solde());
    	System.out.println("Total : "+get_solde()+"€");
    }
    
    
}

