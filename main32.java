// Mirror Upper Star Triangle Pattern
// // // public class main33 {
// // //     public static void main(String[] args) {
// // //         int n = 5;
// // //         for (int i = n; i >= 1; i--) {
// // //             for (int j = 0; j < n - i; j++) {
// // //                 System.out.print(" ");
// // //             }
// // //             for (int k = 0; k < 2 * i - 1; k++) {
// // //                 System.out.print("*");
// // //             }
// // //             System.out.println();
// // //         }
// // //     }
// // // 

import java.util.Scanner;

public class main32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();
        sc.close();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" "); // Print leading spaces
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*"); // Print stars
            }
            System.out.println();
        }
    }
}