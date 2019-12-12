import java.util.*;
public class MorseCode {

    static String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
            "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};


    public static String lettersToMorseCode(String characters) {

        characters = characters.toUpperCase();
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<String> morsetext = new ArrayList<>();
        StringBuilder morseDecoded = new StringBuilder();

        char i = 65;

        while (i<91){
            if (i == 90){
                    char j =32;
                    letters.add(j);
                }
                letters.add(i++);
            }
        int a1 =0;
        int textLength = characters.length();
        while (a1<textLength){
            int a3 =0;
            while (a3<letters.size()){
                char a2 =characters.charAt(a1);
                if (letters.get(a3)==a2){
                    morsetext.add(morseCode[a3]);
                }
                a3++;
            }
            a1++;
        }
        for (String alphabets : morsetext) {
            morseDecoded.append(alphabets + " ");
        }
        return morseDecoded.toString();
    }


    public static String morseCodeToLetters(String morseCodes){

        ArrayList<Character> text = new ArrayList<>();
        ArrayList<Character> morseToLetters = new ArrayList<>();
        String[] input = morseCodes.split(" ");
        StringBuilder lettersDecoded = new StringBuilder();

        char i = 65;
        while (i<91){
            if (i == 90){
                char j =32;
                text.add(j);
            }
            text.add(i++);
        }

        for (String a : input){
            int a1 =0;
            while (a1<morseCode.length){
                if (morseCode[a1].equals(a)){
                    morseToLetters.add(text.get(a1));
                }
                a1++;
            }
        }

        for(Character alphabets : morseToLetters) {
            lettersDecoded.append(alphabets);
        }
        return lettersDecoded.toString();
    }

}