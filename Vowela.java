import java.util.*;

class Vowela{
    public static void main(String args[]) {
        String str = "Mca department";
        int vowel = 0;
        int consonant = 0;

               str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

if (Char.isWhitespace(ch)) {
                continue;
            }
            
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            }
        }

        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonant);
    }
}