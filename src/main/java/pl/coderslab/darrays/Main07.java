package pl.coderslab.darrays;

import java.util.Locale;

public class Main07 {

	public static void main(String[] args) {


		double[] temps = {30, 29, 14, 42, -4, -10, 8, 14, 32, 11, 8, 0, 0};
		double avg=0;

		for (int i = 0; i < temps.length; i++) {
			temps[i] = temps[i] * 1.8 + 32;
			avg = avg + temps[i];
		}

		System.out.println(String.format(Locale.ENGLISH,"%.2f", (avg/ temps.length)));
	}

}