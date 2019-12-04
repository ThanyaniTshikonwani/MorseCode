import java.util.*;
public class MorseCode {
    public static String lettersToMorseCode(String letter) {
        letter = letter.toUpperCase();
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..","/"};
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<String> convertedL = new ArrayList<>();
        for(char i = 65; i < 91; i++){
            letters.add(i);
            if(i == 90){
                char b = 32;
                letters.add(b);
            }
        }
        int stringLength = letter.length();
        for(int a = 0; a<stringLength; a++){
            char c = letter.charAt(a);
            for(int b= 0; b<letters.size(); b++){
                if(letters.get(b) == c){
                    convertedL.add(morse[b]);
                }
            }
        }
        StringBuilder str0 = new StringBuilder();
        for (String i : convertedL) {
            str0.append(i + " ");
        }
        return str0.toString();
    }
    public static String morseCodeToLetters(String morseCode){
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.",
                "--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."," "};
        ArrayList<Character> letters = new ArrayList<>();
        ArrayList<Character> morseToLetters = new ArrayList<>();
        String[] input = morseCode.split(" ");
        for(char i = 65; i < 91; i++){
            letters.add(i);
            if(i == 90){
                char b = 32;
                letters.add(b);
            }
        }
        for(String a : input){
            for(int c = 0; c<morse.length; c++) {
                if(morse[c].equals(a)){
                    morseToLetters.add(letters.get(c));
                }
            }
        }
        StringBuilder str = new StringBuilder();
        for(Character i : morseToLetters) {
            str.append(i);
        }
        return str.toString();
    }
}