package pl.coderslab.estartupparameters;

public class Main04 {

    public static void main(String[] args) {

        int maxNumber = 0;
        int maxPosition = 0;
        int sumTwoNumbers = 0;

        for(int i = 0; i < args.length; i++){
            if (Integer.parseInt(args[i]) > maxNumber) {
                maxNumber = Integer.parseInt(args[i]);
                maxPosition = i;
            }
        }

        for(int i =0; i < args.length; i++){
            if (i != maxPosition){
                sumTwoNumbers = sumTwoNumbers + Integer.parseInt(args[i]);
            }
        }

        if (sumTwoNumbers > maxNumber){
            System.out.println("YES");
        }
        else System.out.println("NO");
    }

}
