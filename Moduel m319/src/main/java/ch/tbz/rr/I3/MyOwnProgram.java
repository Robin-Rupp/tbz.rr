package ch.tbz.rr.I3;

import java.util.Random;

import static ch.tbz.rr.input.Input.*;

public class MyOwnProgram {
    private static int bet;

    public static void main(String[] args) {
        while (true) {
            bet = inputInt("How much you gonna bet?");
            int diceNumber = diceTrow();
            System.out.println("Your Dice number is " + diceNumber + " and your bet is " + bet);
            switch (diceNumber) {
                case 1, 2 -> System.out.println("you have lost your Bet");
                case 3, 4 -> System.out.println("You Bet has stated the same");
                case 5, 6 -> System.out.println("Your Bet has doubled");
            }
            String inputAnwser = inputString("Do you wanna Play the Game again? \n Y/n");
            if (inputAnwser.equals("n")) {
                break;
            }
        }
    }

    private static int diceTrow() {
        Random random = new Random();
        int diceNumber = random.nextInt(7);
        switch (diceNumber) {
            case 0, 1, 2 -> bet = 0;
            case 5, 6 -> bet *= 2;
            default -> {
                return diceNumber;
            }
        }
        return diceNumber;
    }

}
