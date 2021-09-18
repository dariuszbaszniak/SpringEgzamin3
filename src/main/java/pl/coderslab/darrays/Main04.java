package pl.coderslab.darrays;

import javax.swing.*;

public class Main04 {

	public static void main(String[] args) {
		int[] numbers = new int[]{4, 643, 112, 9999, 69};
		int sumOdd=0;

		for(int i = 0; i < numbers.length; i++){
			if (numbers[i]%2 == 0) {
				System.out.println(numbers[i]);
			}
			else{
				sumOdd = sumOdd + numbers[i];
			}
		}
		System.out.println("SUMA: "+sumOdd+".");
	}

}
