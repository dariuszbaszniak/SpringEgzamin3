package pl.coderslab.cflowcontrol;

public class Main09 {

    public static void main(String[] args) {

        int n = 5;
        String star = "*";

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= n; j++){
                if (i >= j){
                    System.out.print(star);
                }
            }
            System.out.println();
        }
    }
}
