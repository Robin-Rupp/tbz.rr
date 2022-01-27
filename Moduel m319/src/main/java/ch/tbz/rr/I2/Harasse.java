package ch.tbz.rr.I2;

import static ch.tbz.rr.input.Input.*;


public class Harasse {
    public static void main(String[] args) {
        int amountBottels = inputInt("Anzahl flaschen?:");
        int amountContainers = 0;
        System.out.println("Harrass Berechnung:" +
                "\n-------------------");
        System.out.println("Ihre Anzahl Flaschen: " + amountBottels);  // Output user input
        if (amountBottels <= 0) {
            System.out.println("Sie brauchen keinen Harass");
        }

        while (amountBottels >0) {
            amountContainers++;
            amountBottels -= 6;
            String input = inputString("Wollen sie es nochmals machen?: Y/n");
            if (input.equals("Y")){
                break;
            }

        }
        System.out.println("Ihre Anzahl benötigte Harassen: " + amountContainers);  // Output user input
    }


}

