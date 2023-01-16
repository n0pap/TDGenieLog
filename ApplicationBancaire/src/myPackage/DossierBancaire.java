package myPackage;

public class DossierBancaire 
{
	private Compte _CompteCourant; //
	private CompteEpargne _CompteEpargne;
	
	private double _interCourant;
	private double _interEpargne;
	
	//Constructeur
    public DossierBancaire()
    {
    	_CompteCourant=new Compte(0);
    	_CompteEpargne=new CompteEpargne(0);
    }

    //Méthode pour déposer de l'argent sur les comptes du dossier
    public void deposer(float value) 
    {	
    	_interCourant=0.4*value; 
    	_interEpargne=0.6*value;

    	_CompteCourant.AjoutSolde(_interCourant);
    	_CompteEpargne.AjoutSolde(_interEpargne); 
    	
    	affichageDossierBancaire();
    }
    
    //Méthode pour obtenir le total des comptes
    public double get_solde() 
    {
    	return _CompteCourant.Solde() + _CompteEpargne.Solde();
    }
    
    //Méthode de rémunération des épargnes
    public void remunerer() 
    {
    	_CompteEpargne.RemunerationEpagne();
    	affichageDossierBancaire();
    }
    
    //Méthode pour récupérer le compte d'épargne du dossier bancaire
    public Compte getEpargne()
    {
    	return _CompteEpargne;
    }
    
    //Méthode pour récupérer le compte courrant du dossier bancaire
    public Compte getCourant()
    {
    	return _CompteCourant;
    }
    
    //Méthode d'affichage dans la console : utile aux developpeurs
    public void affichageDossierBancaire()
    {
    	System.out.println("---------Dossier Bancaire---------");
    	System.out.println("Courant : " + _CompteCourant.Solde() + "	 Epargne : " + _CompteEpargne.Solde());
    	System.out.println("Total : "+get_solde()+"€");
    }
    
    //Méthode de retrait d'argent sur le compte courant 
    public void retrait(double retrait)
    {
    	_CompteCourant.Retrait(retrait);
    	affichageDossierBancaire();
    }
    
    
    
}

