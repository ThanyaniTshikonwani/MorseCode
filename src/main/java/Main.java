import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Morse Code Encryption Program");
        System.out.println("Press 1 To Convert letters to Morse Code");
        System.out.println("Press 2 To Convert Morse Code to Letter");
        int option = input.nextByte();
        invoker(option);
    }
    public static void invoker(int option){
        Scanner input2 = new Scanner(System.in);
        String answer;
       do {
           switch (option){
               case 1:
//                   Scanner input = new Scanner(System.in);
                   System.out.println("Please enter a Text eg:(Hello World)");
                   String letters = input2.nextLine();
                   String result0 = MorseCode.lettersToMorseCode(letters);
                   assert letters.length() == result0.split(" ").length: "pass";
                   System.out.println(result0);
                   break;
               case 2:
//                   Scanner  = new Scanner(System.in);
                   System.out.println("Please enter a Morse Code");
                   String morse = input2.nextLine();
                   String result = MorseCode.morseCodeToLetters(morse);
                   assert morse.split(" ").length == result.length(): "pass";
                   System.out.println(result);
                   break;
               default:
                   System.out.println("Incorrect entry, Please run Again.");
                   break;
           }
           System.out.println("To re-run please type 'Yes'or No to exit ");
           answer=input2.next();
       } while (answer.equalsIgnoreCase("Yes"));
       }

    }