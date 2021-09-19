package pl.coderslab.estartupparameters;

public class Main06 {

    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);

        for(int i = 1; i <= number; i++){
            for(int j = 1; j <= number; j++){
                System.out.println(i+ " x " + j +" = "+ i*j);
            }
        }
    }

}
