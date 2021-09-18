package pl.coderslab.estartupparameters;

import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;

public class Main05 {

    public static void main(String[] args) {

        int points = Integer.parseInt(args[0]);

        if (points >= 0 && points <= 100){
            if (points >=0 && points < 51 ){
                System.out.println("F");
            }
            else if (points >=51 && points < 71){
                System.out.println("E");
            }
            else if (points >= 71 && points < 91){
                System.out.println("C");
            }
            else {
                System.out.println("A");
            }
        }
        else {
            System.out.println("BADVALUE");
        }
    }

}
