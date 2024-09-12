public class NumberPyramid {

    public static void main(String[] args) {
        int rows = 5; // You can change the number of rows here

        // Outer loop for number of rows
        for (int i = 1; i <= rows; i++) {

            // Inner loop for spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }

            // Inner loop for printing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
