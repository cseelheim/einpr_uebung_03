package h1;

public class H1_main {

	public static void main(String[] args) {
		double guthaben = -100.0;
		double monEingang = 200.0;
		int rating = -2;
		boolean warnhinweis = false;
		boolean negativ = false;

		warnhinweis = false;
		negativ = false;

		if (guthaben > 0) {
			rating = rating + 3;
		} else if (guthaben == 0) {
			rating = rating + 2;
		} else { // guthaben < 0
			negativ = true;

			double guthabenBetrag = guthaben * -1.0;

			double monEingangBetrag = monEingang;
			if (monEingang < 0)
				monEingangBetrag = monEingang * -1.0;

//			System.out.println("Guthaben im Betrag: " + guthabenBetrag);
//			System.out.println("Eingang im Betrag: " + monEingangBetrag);

			if (monEingangBetrag >= guthabenBetrag) {
				rating++;
			} else {
				rating--;

				if (rating < 0) {
					warnhinweis = true;
				}
			}

		}

//		System.out.println("Negativ: " + negativ);
//		System.out.println("Rating: " + rating);
//		System.out.println("Warnhinweis: " + warnhinweis);
	}

}
