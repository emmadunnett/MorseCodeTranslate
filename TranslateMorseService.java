package MorseAssigment;

import java.util.HashMap;

public class TranslateMorseService {
   public HashMap<String, String> MorseCodes = new HashMap<String, String>();
   public HashMap<String, String> MorseLetters = new HashMap<String, String>();

    public void Setup() {
        MorseCodes.put(".-", "A");
        MorseCodes.put("-..." ,"B");
        MorseCodes.put("-.-.", "C");
        MorseCodes.put("-..", "D");
        MorseCodes.put(".", "E");
        MorseCodes.put("..-.", "F");
        MorseCodes.put("--.", "G");
        MorseCodes.put("....", "H");
        MorseCodes.put("..", "I");
        MorseCodes.put(".---", "J");
        MorseCodes.put("-.-", "K");
        MorseCodes.put(".-..", "L");
        MorseCodes.put("--", "M");
        MorseCodes.put("-.", "N");
        MorseCodes.put("---", "O");
        MorseCodes.put(".--.", "P");
        MorseCodes.put("--.-", "Q");
        MorseCodes.put(".-.", "R");
        MorseCodes.put("...", "S");
        MorseCodes.put("-", "T");
        MorseCodes.put("..-", "U");
        MorseCodes.put("...-", "V");
        MorseCodes.put(".--", "W");
        MorseCodes.put("-..-", "X");
        MorseCodes.put("-.--", "Y");
        MorseCodes.put("--..", "Z");

        MorseLetters.put("A", ".-");
        MorseLetters.put("B", "-...");
        MorseLetters.put("C", "-.-.");
        MorseLetters.put("D", "-..");
        MorseLetters.put("E", ".");
        MorseLetters.put("F", "..-.");
        MorseLetters.put("G", "--.");
        MorseLetters.put("H", "....");
        MorseLetters.put("I", "..");
        MorseLetters.put("J", ".---");
        MorseLetters.put("K", "-.-");
        MorseLetters.put("L", ".-..");
        MorseLetters.put("M", "--");
        MorseLetters.put("N", "-.");
        MorseLetters.put("O", "---");
        MorseLetters.put("P", ".--.");
        MorseLetters.put("Q", "--.-");
        MorseLetters.put("R", ".-.");
        MorseLetters.put("S", "...");
        MorseLetters.put("T", "-");
        MorseLetters.put("U", "..-");
        MorseLetters.put("V", "...-");
        MorseLetters.put("W", ".--");
        MorseLetters.put("X", "-..-");
        MorseLetters.put("Y", "-.--");
        MorseLetters.put("Z", "--..");
    }

    public String TranslateToLetters(String morseCode) {

        String word = "";

        String[] morseCodes = morseCode.split(" ");
        for(int index = 0; index < morseCodes.length; index++) {
            String currentMorseCode = morseCodes[index];
            String currentLetter = MorseCodes.get(currentMorseCode);
            word = word + currentLetter;
        }

        return word;
    }

    public String TranslateToMorseCodes(String word) {

        String morseCodes = "";

        String[] letters = word.split("");
        for(int index = 0; index < letters.length; index++)
        {
            String currentLetter = letters[index];
            String currentMorseCode = MorseLetters.get(currentLetter);

            if(index == letters.length- 1)
            {
                morseCodes = morseCodes + currentMorseCode;
            }
            else
            {
                morseCodes = morseCodes + currentMorseCode + " ";
            }

        }

        return morseCodes;

    }

    public String Translate(String characters) {

        if(!characters.matches("^[A-Z [.][-]]+$"))
        {
            return "You can only use the capitalized letters A to Z, or the chars . and - if you would like to translate from morse codes.";
        }

        if(characters.contains(".") || characters.contains("-")) {
            return TranslateToLetters(characters);
        }
        else
        {
            return TranslateToMorseCodes(characters);
        }
    }
}

