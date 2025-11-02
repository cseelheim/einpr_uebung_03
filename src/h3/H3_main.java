package h3;

public class H3_main {

	public static void main(String[] args) {
		int max = 5;
		int fix = 2;
		int wartend = 12;
		boolean isVoll = false;

		if (fix >= max) {
			isVoll = true;
		} else { // fix < max
			int frei = max - fix;

			if (frei > wartend) {
				fix += wartend;
				wartend = 0;

				isVoll = false;
			} else { // frei <= wartend
				wartend -= frei;
				fix += frei;

				isVoll = true;
			}
		}

		// System.out.println("Max: " + max);
		// System.out.println("Fix: " + fix);
		// System.out.println("Wartend: " + wartend);
		// System.out.println("Ist voll: " + isVoll);
	}

}
