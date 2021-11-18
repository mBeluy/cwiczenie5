public class Main {

    public static void main(String[] args) {
	    int numbers[] = new int[10];
        for (int a = 0; a < numbers.length; a++){
            numbers[a] = a;
        }
        for (int number: numbers) {
            System.out.println(9 - number);
        }

    }
}
