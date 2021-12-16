
package ch.tbz.rr.Taschenrecher;

import static java.lang.System.*;
import static ch.tbz.rr.input.Input.*;


public class Calculator {

    public static void main(String[] args) {

        out.println("Kontrollstrukturen kombineren mit benötigten Daten:");
        while (true) {
            double dbiX = inputInt("Geben Sie die 1. Zahl ein: ");
            double dbiY = inputInt("Geben Sie die 2. Zahl ein: ");
            String operator = inputString("What operator?");
            if ((dbiX == 0 || dbiY == 0) && (operator.equals("/") || operator.equals("&"))){
                out.println("Division durch Null geht nicht");
                continue;
            }
            double result = switch (operator) {
                case "+" -> dbiX + dbiY;
                case "-" -> dbiX - dbiY;
                case "*" -> dbiX * dbiY;
                case "/" -> dbiX / dbiY;
                case "%" -> dbiX % dbiY;
                default -> 0.0;
            };

            out.println("Das Resultat ist: " + result);
            double dbiZ = inputInt("Geben Sie die 3. Zahl ein: ");
            switch (operator) {
                case "+" -> result += dbiZ;
                case "-" -> result -= dbiZ;
                case "*" -> result *= dbiZ;
                case "/" -> result /= dbiZ;
                case "%" -> result %= dbiZ;
            }
            out.println("Das Resultat ist: " + result);
            String answer = inputString("What to play again? N/y");
            if (answer.equals("N")){
                break;
            }
        }
    }
}
