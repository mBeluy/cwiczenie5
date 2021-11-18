import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String str1, str2, str1_plus_2, str2_plus_1;
	    Scanner in = new Scanner(System.in);
        System.out.print("Wpisz string1: ");
        str1 = in.next();
        System.out.print("Wpisz string2: ");
        str2 = in.next();
        str1_plus_2 = str1.concat(str2);
        str2_plus_1 = str2.concat(str1);
        if (str1_plus_2.equals(str2_plus_1)){
            System.out.println("naprzemienne");
        }
        else {
            System.out.println("nie naprzemienne");
        }
    }
}
