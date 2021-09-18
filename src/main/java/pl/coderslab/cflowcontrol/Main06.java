package pl.coderslab.cflowcontrol;

public class Main06 {

	public static void main(String[] args) {

		int n = 6;

		for (int i=0; i<=n; i++){
			int result = i%2;
			if (result==0){
				System.out.println(i+ " - parzysta");
			}
			else{
				System.out.println(i+ " - nieparzysta");
			}
		}

		int j=0;
		while(j<=n){
			int result = j%2;
			if (result==0){
				System.out.println(j+ " - parzysta");
			}
			else{
				System.out.println(j+ " - nieparzysta");
			}
			j++;
		}

	}

}
