package myPackage;

public class DossierBancaire {

	private Compte _CompteCourant;
	private CompteEpargne _CompteEpargne;

	// Constructeur
	public DossierBancaire() {
		_CompteCourant = new Compte(0);
		_CompteEpargne = new CompteEpargne(0);
	}

	public void deposer(double value) {
		_CompteCourant.AjoutSolde(0.4 * value);
		_CompteEpargne.AjoutSolde(0.6 * value);
		
		System.out.println("Courant : " + _CompteCourant.Solde() + ", épargne : " + _CompteEpargne.Solde());
	}

	public double get_solde() {
		System.out.println("Courant : " + _CompteCourant.Solde() + ", épargne : " + _CompteEpargne.Solde());
		return _CompteCourant.Solde() + _CompteEpargne.Solde();
	}

	public void remunerer() {
		_CompteEpargne.RemunerationEpagne();
		
		System.out.println("Courant : " + _CompteCourant.Solde() + ", épargne : " + _CompteEpargne.Solde());
	}

}
