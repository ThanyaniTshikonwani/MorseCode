import java.util.Scanner;

public class Main {


    public static void main(String[] args){
        String rerun;

        do {
            Scanner input = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
            System.out.println("1. Letters to Morse");
            System.out.println("2. Convert Morse to Letters");
            int opt = input.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("Letters to morse");
                    String letters = input2.nextLine();
                    String morseText = MorseCode.lettersToMorseCode(letters);
                    System.out.println(morseText);
                    break;

                case 2:
                    System.out.println("convert MorseCode to letters/words");
                    String morse = input2.nextLine();
                    String textdecoded = MorseCode.morseCodeToLetters(morse);
                    System.out.println(textdecoded);
                    break;

            }
            System.out.println("Type 'Yes' to Run Again or 'No' to Exit  ");
            rerun = input2.nextLine();

        } while (rerun.equalsIgnoreCase("Yes")) ;
    }
}