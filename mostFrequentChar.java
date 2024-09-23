import java.util.Scanner;

public class mostFrequentChar {

    public static void main(String[] args) {
        Scanner userInp = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = userInp.next();
        Scanner charInpu = new Scanner(System.in);
        System.out.println("Enter a character to be checked: ");
        char ch = charInpu.next().charAt(0);
        int frequency = 0;

        for(int i = 0; i < word.length(); i++) {
            if(ch == word.charAt(i)) {
                ++frequency;
            }
        }

        System.out.println("The frequency of the letter" + ch + " is = " + frequency + "\n"+"in the input: " + word);
    }

}
