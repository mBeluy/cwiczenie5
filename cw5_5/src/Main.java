import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Wpisz sting: ");
        String str = in.next();
        char[] word = str.toCharArray();
        if (istPalindrom(word)){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("Nie Palindrom");
        }
    }
    public static boolean istPalindrom(char[] word){
        int i1 = 0;
        int i2 = word.length - 1;
        while (i2 > i1) {
            if (word[i1] != word[i2]) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
