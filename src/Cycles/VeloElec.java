package Cycles;

public class VeloElec extends Velo{
private static final double DEFAULT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
private static final double DEFAUT_BRAQUET = 0;
private double facteurPuissanceMoteur ;

	public VeloElec(double braquet, double diamRoue, double facteurPuissanceMoteur) {
		super(braquet , diamRoue );
		this.facteurPuissanceMoteur = facteurPuissanceMoteur ;
		
	}
	
	public VeloElec( double diamRoue, double coupleMoteur) {
		super(DEFAUT_BRAQUET, diamRoue );
		this.facteurPuissanceMoteur = coupleMoteur ;
		
}
	
	public VeloElec() {
		super();
		this.facteurPuissanceMoteur = DEFAULT_FACTEUR_PUISSANCE_MOTEUR ;
	
}

	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}

	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public double getPuissance(double frequenceCoupsDePedale) {
		return super.getPuissance(frequenceCoupsDePedale) *facteurPuissanceMoteur;
		
		
	}
	public String toString() {
		return "VeloElec [facteurPuissanceMoteur = " + facteurPuissanceMoteur + "]" ;
	}
	
}