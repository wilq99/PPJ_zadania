package ppj.wynagrodznie;

import java.util.Scanner;

public class WynagrodzenieHM {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("P³aca na godzinê");
		double dblValue1 = Double.parseDouble(in.next());
		System.out.println("Liczba przepracowanych godzin");
		double dblValue2 = Double.parseDouble(in.next());
		in.close();

		if (dblValue2 <= 40) {
			System.out.printf("Wynagrodzenie=%8.2f\n", dblValue1 * dblValue2);
		} else if (dblValue2 > 40) {
			System.out.printf("Wynagrodzenie=%8.2f\n", 40 * dblValue1 + ((dblValue2 - 40) * (dblValue1 * 1.5)));
		}
		if (dblValue2 > 60)

		{
			System.out.printf("Przekroczono limit wypracowanych godzin");

		}
	}
}