package pl.coderslab.estartupparameters;

import java.util.Locale;

public class Main03 {
    public static void main(String[] args) {

        double avg = 0;

        for(int i =0; i < args.length; i++){
            avg = avg + Integer.parseInt(args[i]);
        }

        System.out.println(avg/args.length);
    }
}
