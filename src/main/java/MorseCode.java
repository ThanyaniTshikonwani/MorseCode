import java.util.LinkedList;
import java.util.List;

public class MorseCode {


    static String[] morseCode = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
            "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};


    public static String lettersToMorseCode(String characters) {

        List<Character> letters = new LinkedList<>();
        List<String> morsetext = new LinkedList<>();
        StringBuffer morseDecoded = new StringBuffer();

        char i = 65;
        while (i<91){
            if (i == 90){
                    char j =32;
                    letters.add(j);
                }
                letters.add(i++);
            }

        int l =0;
        int textLength = characters.length();
        while (l<textLength){
            int l1 =0;
            while (l1<letters.size()){
                char l2 =characters.charAt(l);
                if (letters.get(l1)==l2){
                    morsetext.add(morseCode[l1]);
                }
                l1++;
            }
            l++;
        }

        int j =0;
        while (j<morsetext.size()){
            morseDecoded.append(morsetext.get(j));
            j++;
        }
        return morseDecoded.toString();
    }



    public static String morseCodeToLetters(String morseCodes){

        List<Character> inputText = new LinkedList<>();
        List<Character> morseToLetters = new LinkedList<>();
        String[] input = morseCodes.split(" ");
        StringBuffer lettersDecoded =new StringBuffer();

        char i = 65;
        while (i<91){
            if (i == 90){
                char j =32;
                inputText.add(j);
            }
            inputText.add(i++);
        }

        for (int y= 0; y < input.length; y++) {
            int z =0;
            while (z<morseCode.length){
                if (morseCode[z].equals(input[y])){
                    morseToLetters.add(inputText.get(z));
                }
                z++;
        }
        }


        for (int j = 0; j < morseToLetters.size(); j++) {
            lettersDecoded.append(morseToLetters.get(j));
        }

        return lettersDecoded.toString();
    }

}