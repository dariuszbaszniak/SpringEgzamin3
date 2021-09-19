package pl.coderslab.estartupparameters;

public class Main08 {

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);

        int variable = 0;

            while (x % y != 0) {
                variable = y;
                y = x % y;
                x = variable;
            }
            System.out.println(y);
    }
}
