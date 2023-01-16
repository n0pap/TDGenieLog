package myPackage;

public class Compte //Classe d'un compte général
{ 

	private double _Solde; //
	
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
	
	//Méthode de retrait d'argent sur le compte
	public void Retrait(double retrait)
	{
		if(_Solde < retrait)
		{
			throw new ArithmeticException("Montant du compte insufisant.");
		}
		else
		{
			_Solde-=retrait;
		}	
		
	}
	//Méthode pour consulter le solde sur le compte
	public double Solde()
	{
		return _Solde; //et encore
	}
	

}

