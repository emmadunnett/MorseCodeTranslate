package MorseAssigment;

import java.util.Scanner;

public class TranslateMorseCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String currentRow = scanner.nextLine();

        TranslateMorseService morseService = new TranslateMorseService();
        morseService.Setup();

        String result = morseService.Translate(currentRow);

        System.out.println(result);
    }

}