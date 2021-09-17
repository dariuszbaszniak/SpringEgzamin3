package pl.coderslab.cflowcontrol;

public class Main03 {

	public static void main(String[] args) {
		String text = "Java";

		for(int i=0; i<3; i++){
			System.out.println(text);
		}

		int j = 0;
		while (j < 3){
			System.out.println(text);
			j++;
		}
	}

}
