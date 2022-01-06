public class Million {

	public static void main(String[] args) {
		
		int wachstum = 18, i = 0;
		double b_anzahl = 118;
		
		while (b_anzahl <= 1000000) {
			b_anzahl = b_anzahl + b_anzahl * wachstum / 100;
			i++;
		}
		System.out.println("Eine Milliongrenze überschreitet die Kultur in " + i + " Tage.");

	}

}
