package myPackage;

public class DossierBancaire {

	private Compte _CompteCourant;
	

	// Constructeur
	public DossierBancaire()
	{
		_CompteCourant = new Compte(0);
		
	}

	//Méthode pour déposer de l'argent sur le compte
	public void deposer(double value) 
	{
		_CompteCourant.AjoutSolde(0.4 * value);
	}

	//Méthode pour plus tard...
	public double get_solde() 
	{
		return 0;
		
	}

	//Méthode pour plus tard
	public void remunerer() 
	{
		
	}

}
