package h1;

public class H1_main {

	public static void main(String[] args) {
		double guthaben = -100.0;
		double monEingang = 200.0;
		int rating = -2;
		boolean warnhinweis = false;
		boolean negativ = false;

		negativ = true;
		warnhinweis = false;

		if (guthaben > 0) {
			rating += 3;
		} else if (guthaben == 0) {
			rating += 2;
		} else { // guthaben < 0
			negativ = true;

			if (+monEingang >= +guthaben) {
				rating += 1;
			} else {
				rating -= 1;

				if (rating < 0) {
					warnhinweis = true;
				}
			}

		}

		// System.out.println("Rating: " + rating);
		// System.out.println("Negativ: " + negativ);
		// System.out.println("Warnhinweis: " + warnhinweis);
	}

}
