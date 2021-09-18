package pl.coderslab.cflowcontrol;

public class Main07 {

	public static void main(String[] args) {

		for(int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				System.out.println("i = " + i + " j = " + j);
			}
		}

		int i = 0;
		while (i < 3){
			int j = 0;
			while (j < 3){
				System.out.println("i = " + i+ " j = " + j);
				j++;
			}
			i++;
		}

	}

}
