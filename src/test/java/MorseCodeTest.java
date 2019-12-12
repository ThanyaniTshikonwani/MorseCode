import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MorseCodeTest {



    @Test
    void lettersToMorseCode() {
        assertEquals("- .... .- -. -.-- .- -. .. ",MorseCode.lettersToMorseCode("Thanyani"));
        assertNotEquals("- .... .- -. -.-- .- -. .. ",MorseCode.lettersToMorseCode("hi there"));
    }

    @Test
    void morseCodeToLetters() {
//        assertEquals("TSHIKONWANI",MorseCode.lettersToMorseCode("- ... .... .. -.- --- -. .-- .- -. .. "));
        assertNotEquals("Hello",MorseCode.lettersToMorseCode("- .... .- -. -.-- .- -. .. "));
    }
}