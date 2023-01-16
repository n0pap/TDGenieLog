package myPackage;

public class Compte { // truc en plus

	private double _Solde;
	// je teste un truc et encore un autre

	public Compte(double Solde) {
		_Solde = Solde;
	}

	public void AjoutSolde(double d) {
		_Solde += d;
	}

	public double Solde() {
		return _Solde; // et encore
	}

}
