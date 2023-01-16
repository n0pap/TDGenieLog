package myPackage;

public class Compte //Classe d'un compte général
{ 

	private double _Solde; 
	
	//Constructeur
	public Compte(double Solde)
	{
		_Solde=Solde;
	}
	
	//Méthode d'ajout d'argent sur le compte
	public void AjoutSolde(double rajout)
	{
		_Solde+=rajout;
	}
	
	//Méthode pour consulter le solde sur le compte
	public double Solde()
	{
		return _Solde; //et encore
	}

}

