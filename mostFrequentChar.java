import java.util.Scanner;

public class MostFrequentChar {

    public static void main(String[] args) {
        Scanner userInp = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = userInp.next();
        char[] usertoCharArray = word.toCharArray();
        int maxCount = 0;
        char mostFrequentChar = word.charAt(0);
        int frequency = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (usertoCharArray[i] == usertoCharArray[j]) {
                    ++frequency;
                }
                if (frequency > maxCount) {
                    maxCount = frequency;
                    mostFrequentChar = usertoCharArray[i];
                }
            }
        }
        System.out.println("The most frequent character is: " + mostFrequentChar);
    }
}
