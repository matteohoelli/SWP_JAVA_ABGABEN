package all;

public class end {
	private static long zeit;

	public static void main(String[] args) {
		// Summe

		zeit = System.nanoTime();
		long sumR = sumRek(20);
		zeit = System.nanoTime() - zeit;
		System.out.println("Summe Rekursiv Ergebnis: " + sumR + " Zeit: " + zeit + "ns");

		zeit = System.nanoTime();
		long sumE = sumEnd(20);
		zeit = System.nanoTime() - zeit;
		System.out.println("Summe End-Rekursiv Ergebnis: " + sumE + " Zeit: " + zeit + "ns");

		// Potenz

		zeit = System.nanoTime();
		long potR = potRek(6, 3);
		zeit = System.nanoTime() - zeit;
		System.out.println("Potenz Rekursiv Ergebnis: " + potR + " Zeit: " + zeit + "ns");

		zeit = System.nanoTime();
		long potE = potEnd(6, 3);
		zeit = System.nanoTime() - zeit;
		System.out.println("Potenz End-Rekursiv Ergebnis: " + potE + " Zeit: " + zeit + "ns");

	}

	public static long sumEnd(int z) {
		return addS(0, z);
	}

	public static long addS(int u, int j) {
		if (j == 0) {
			return u;
		}
		return addS(u + j, j - 1);
	}

	static long sumRek(long number) {
		if (number <= 0) {
			return 0;
		}
		return number + sumRek(number - 1);
	}

	public static long potEnd(int base, int ex) {
		return addP(base, ex, 1);
	}

	public static long addP(int base, int ex, int u) {
		if (ex == 0) {
			return u;
		}
		return addP(base, ex - 1, base * u);
	}

	public static long potRek(long zahl, long pot) {
		if (pot == 1) {
			return zahl;
		} else {
			return zahl * potRek(zahl, pot - 1);
		}
	}

}