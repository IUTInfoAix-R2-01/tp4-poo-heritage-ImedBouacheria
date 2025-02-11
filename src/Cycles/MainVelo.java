package Cycles;

public class MainVelo {
	
public static void main(String[]args) {
	Velo velo = new Velo(15, 0.7);
	System.out.println(velo);
	System.out.println("La puisssance du velo est " + velo.getPuissance(22));
	
	VeloElec veloElec = new VeloElec(15, 0.7, 20.0 );
	System.out.println(veloElec.toString());
	System.out.println("La puisssance du velo electrique est " + veloElec.getPuissance(56));
}
}


