package ch.tbz.rr.Debugger;

import java.util.Scanner;

public class Debugger {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int input; // declare variable

        input = scan.nextInt();

        if ((input >= 3) && (input <= 6)) {
            int zaehler = 1;
            for (int i = zaehler; i <= input; i++) {
                zaehler += i + input;
                System.out.println(zaehler);
            }

        } else {
            System.err.println("Achtung, falsche Eingabe!");
        }
        System.out.println("und fertig");

        scan.close();
    }
}
