public class Main {

    public static void main(String[] args) {
        int matrix[][] = new int[10][10];
	    for (int a = 1; a < 10; a++){
            for (int j = 1; j < 10; j++){
                matrix[a][j] = 0;
                matrix[a][a] = a;
                System.out.print(matrix[a][j] + " ");
            }
            System.out.println();
        }
    }
}
