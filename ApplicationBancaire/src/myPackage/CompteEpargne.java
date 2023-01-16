package myPackage;

public class CompteEpargne extends Compte {

	private double tauxInteret = (float) (3.2 * 0.01) + 1; // 1.032 3.2% 0.032

	public CompteEpargne(double SoldeE) {
		super(SoldeE);
	}

	public void RemunerationEpagne() {
		AjoutSolde(Solde() * tauxInteret);
	}
}
