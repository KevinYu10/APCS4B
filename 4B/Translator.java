import java.util.*;

public class Translator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        pigSentenceTranslate p = new pigSentenceTranslate();
        System.out.println(p.toPigLatin(x));
    }
}

class pigSentenceTranslate {
    String a = "";
    pigWord d = new pigWord();
    public String toPigLatin(String s) {
        if(s.length()<2) {
            return s;
        }
        String[] words = s.split(" ");
        for(String word : words) {
            a += d.wordTranslate(word);
            a += " ";
        }
        return a;
    }
}

class pigWord {
    public String wordTranslate(String x) {
        if(x.length()>2) {
            String firstLetter = x.substring(0,1);
            String rest = x.substring(1,x.length());
            return rest+firstLetter+"ay";
        } else {
            return x;
        }
    }
}