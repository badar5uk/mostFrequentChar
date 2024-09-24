import java.util.Scanner;

public class mostFrequentChar {

    public static void main(String[] args) {
        Scanner userInp = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = userInp.next();
        char[] usertoCharArray = word.toCharArray();
        int frequency = 0;
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (usertoCharArray[i] == usertoCharArray[j]) {
                    System.out.println("The most frequent character is: "+ usertoCharArray[j]);
                    frequency++;
                    break;
                }
            }
        }
    }
}
