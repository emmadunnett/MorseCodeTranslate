package MorseAssigment;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Tests {

    @Test
    public void ShouldAddAllLettersInHashMap()
    {
        TranslateMorseService morseService = new TranslateMorseService();
        morseService.Setup();
        assertEquals(26, morseService.MorseLetters.size());
    }

    @Test
    public void ShouldAddAllMorseCodesInHashMap()
    {
        TranslateMorseService morseService = new TranslateMorseService();
        morseService.Setup();
        assertEquals(26, morseService.MorseCodes.size());
    }


    @Test
    public void ShouldTranslateMorseCodeToLetters()
    {
        TranslateMorseService morseService = new TranslateMorseService();
        morseService.Setup();

        String result = morseService.TranslateToLetters(".... . .---");
        assertEquals("HEJ", result);
    }

    @Test
    public void ShouldTranslateLettersToMorseCodes()
    {
        TranslateMorseService morseService = new TranslateMorseService();
        morseService.Setup();

        String result = morseService.TranslateToMorseCodes("BYE");

        assertEquals("-... -.-- .", result);
    }

 @Test
 public void ShouldReturnMorseCodesWhenUsingLetters()
 {
     TranslateMorseService morseService = new TranslateMorseService();
     morseService.Setup();

     String result = morseService.Translate("HEJ");

     assertEquals(".... . .---", result);

 }

    @Test
    public void ShouldReturnLettersWhenUsingMorseCodes()
    {
        TranslateMorseService morseService = new TranslateMorseService();
        morseService.Setup();

        String result = morseService.Translate(".... . .---");

        assertEquals("HEJ", result);

    }

    @Test
    public void ShouldCheckIfUnknownCharactersAreUsed()
    {
        TranslateMorseService morseService = new TranslateMorseService();
        morseService.Setup();

        String result = morseService.Translate("HEJDÅ");

        assertEquals("You can only use the capitalized letters A to Z, or the chars . and - if you would like to translate from morse codes.", result);

    }

    @Test
    public void ShouldCheckIfSmallLettersAreUsed()
    {
        TranslateMorseService morseService = new TranslateMorseService();
        morseService.Setup();

        String result = morseService.Translate("Hej");

        assertEquals("You can only use the capitalized letters A to Z, or the chars . and - if you would like to translate from morse codes.", result);

    }
}
