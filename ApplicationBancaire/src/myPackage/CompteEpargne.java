package myPackage;

public class CompteEpargne extends Compte
{
	private double _tauxInteret=3.2*0.01; //1.032 3.2% 0.032
	//private  float _SoldeE;
	
	public CompteEpargne(float SoldeE)
	{
		super(SoldeE);
	}
	
	public void RemunerationEpagne()
	{
		System.out.println("	---Rémunération---	");
		System.out.print("Solde précédent : 	");
		System.out.println(Solde());
		System.out.print("Taux :			");
		System.out.println(_tauxInteret);

		AjoutSolde(Solde()*_tauxInteret);
		
		System.out.print("Nouveau solde : 	");
		System.out.println(Solde());
	}
	
	
}
