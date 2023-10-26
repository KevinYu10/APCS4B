import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        checkWord l = new checkWord();
        l.checkForWord(x);
    }
}

class checkWord {
    String nonLetters = "“,.:;()[]{}!?@#$%^&* ";

    public void checkForWord(String s) {
        String letter = "";
        String letter2 = "";
        for(int i = 0; i<s.length(); i++) {
            if(!(nonLetters.contains(s.substring(i,i+1)))) {
                letter += s.toLowerCase().charAt(i);
            }
        }
        for(int i = letter.length()-1; i>=0; i--) {
            letter2 += letter.charAt(i);
        }
        if(letter2.equals(letter)) {
            System.out.println("This is a Palindrome!");
        } else {
            System.out.println("This is not a Palindrome!");
        }
    }
}