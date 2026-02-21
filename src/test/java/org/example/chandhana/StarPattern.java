package org.example.chandhana;

public class StarPattern {

    public static void main(String[] args) {
        printStar7(5);

    }
//            *
//            **
//            ***
//            ****
//            *****
    public static void printStar1(int n) {
        for( int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//        *****
//        ****
//        ***
//        **
//        *
    public static void printStar2(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

//            *****
//            *****
//            *****
//            *****
//            *****

    public static void printStar3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        }

//                     *
//                     **
//                     ***
//                     ****
//                     *****
        public static void printStar4(int n) {

            for (int i = 1; i <= n; i++) {
                for (int j = i; j<= n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

//        *****
//        ****
//        ***
//        **
//        *
        public static void printStar5(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = n; j >= i; j--) {
                    System.out.print("*");
                }
                for (int j = 1; j<= n; j++) {
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

//         *****
//         ****
//         ***
//         **
//         *
        public static void printStar6(int n) {
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(" ");
                }
                for (int j = n; j >= i; j--) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

//                 *
//                ***
//               *****
//              *******
//             *********

    public static void printStar7(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
        }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

}
