package Cycles;

import java.util.Random;

public class Velo {
	private double DEFAUT_BRAQUETTE = 13.0 ;
	private double braquet;
	private double diamRoue ;
	private Random genAlea ;
	
		public Velo() {
			this.braquet = DEFAUT_BRAQUETTE ; 
			this.diamRoue = 0 ;
			this.genAlea = new Random () ;
		}
	
		public Velo(double braquet, double diamRoue) {
			this.braquet = braquet ; 
			this.diamRoue = diamRoue ;
			this.genAlea = new Random () ;
			
		}
		
		public double getBraquet() {
			return braquet;
		}

		public void setBraquet(double braquet) {
			this.braquet = braquet;
		}

		public double getDiamRoue() {
			return diamRoue;
		}

		public void setDiamRoue(double diamRoue) {
			this.diamRoue = diamRoue;
		}

		public Random getGenAlea() {
			return genAlea;
		}

		public void setGenAlea(Random genAlea) {
			this.genAlea = genAlea;
		}
		
		public double getPuissance(double frequenceCoupDePedale) {
			return frequenceCoupDePedale * braquet * diamRoue *  genAlea.nextDouble();
					
		}
		public String toString() {
			return "Velo [braquet = " + braquet + "diamRoue = " + diamRoue + "]" ;
		}
}


