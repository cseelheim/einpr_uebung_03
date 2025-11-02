package p1;

public class P1_main {

	public static void main(String[] args) {
		int wuerfel = 4;

		if (wuerfel == 1 || wuerfel == 4) {
			System.out.println("Gewonnen!");
		} else if (wuerfel == 2) {
			System.out.println("Verloren!");
		} else if (wuerfel == 5) {
			System.out.println("Untentschieden!");
		} else {
			System.out.println("Unklar!");
		}
	}
}
