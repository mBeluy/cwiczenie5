import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int MIN, MAX;
        Random rn = new Random();
        int numbers[] = new int[10];
        for (int a = 0; a < numbers.length; a++){
            numbers[a] = rn.nextInt(100);
        }
        MIN = MAX = numbers[0];
        for (int number: numbers) {
            System.out.println(number);
            if (MIN > number){
                MIN = number;
            }
            if (MAX < number){
                MAX = number;
            }
        }
        System.out.println("MIN: " + MIN);
        System.out.println("MAX: " + MAX);

    }
}