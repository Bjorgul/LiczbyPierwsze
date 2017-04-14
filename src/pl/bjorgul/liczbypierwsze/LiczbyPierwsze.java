package pl.bjorgul.liczbypierwsze;

public class LiczbyPierwsze {

	public static void main(String[] args) {
		final int START = 2;
		int aktualna = 2; // dzielnik do sprawdzenia
		int sprawdzana = 2; // Liczba sprawdzana czy jest pierwsza
		final int KONIEC = 222222222; // do ilu ma sprawdzaæ
		while (sprawdzana <= KONIEC) {
			if (sprawdzana == aktualna) {
				System.out.println(aktualna + " !");
				sprawdzana++;
				aktualna = START;
			} else if (sprawdzana % aktualna == 0) {
				sprawdzana++;
				aktualna = START;

			} else {
				aktualna++;
			}

		}

	}

}
