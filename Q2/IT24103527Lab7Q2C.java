public class IT24103527Lab7Q2C {
    public static void main(String[] args) {
        int i , j ; //variables 

        for (i = 5; i >= 1; i--) {
            for ( j = 1; j <= i; j++) {
                System.out.print(i); // Print the current row number
            }
            System.out.print("\n"); // Move to the next line
        }
    }
}
