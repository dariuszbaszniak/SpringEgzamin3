package pl.coderslab.cflowcontrol;

public class Main10 {

    public static void main(String[] args) {

        int n = 5;

        String star = "*";

        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                if(i >= j) {
                    System.out.print(star);
                } else {
                    System.out.print(j);
                }
            }
            System.out.println();
        }
        for (int i = n; i >=1; i--){
            for (int j =1; j <= n; j++){
                if(j > i) {
                    System.out.print(j);
                } else {
                    System.out.print(star);
                }
            }
            System.out.println();
        }
    }

}
