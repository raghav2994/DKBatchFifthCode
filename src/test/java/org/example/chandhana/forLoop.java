package org.example.chandhana;

public class forLoop {

    public static void main(String[] args) {
        callForLoop(3, 9);
    }

    public static void callForLoop(int a, int b){
        for( int i = a; i <= b; i++){
            System.out.println(i);
        }
    }

//    public static void main(String[] args) {
//        for(int i = 13; i > 6; i--){
//            System.out.println(i*2);
//        }

//        for(int i = 0; i <= 5; i++)
//        {
//            for(int j = 14; j > 3; j--)
//            {
//                System.out.println(i * j / 2);
//            }
//        }

//        for(int i = 10; i >= 1; i--)
//        {
//            for(int j = 20; j > 12; j--)
//            {
//                for(int k = 0; k < 10; k++)
//                {
//                    System.out.println(i + j + k);
//                }
//            }
//        }

//        for(int i = 5; i <= 9; i++)
//        {
//            System.out.println(i * i);
//        }

//        for(int i = 12; i >= 7; i--)
//        {
//            for(int j = 1; j <= 3; j++)
//            {
//                System.out.println(i - j);
//            }
//        }


//        for(int i = 2; i <= 6; i++)
//        {
//            for(int j = 10; j >= 6; j--)
//            {
//                for(int k = 1; k <= 2; k++)
//                {
//                    System.out.println(i * j + k);
//                }
//            }
//        }

//        for(int i = 3; i <= 7; i++)
//        {
//            for(int j = 2; j <= i; j++)
//            {
//                System.out.print(i + j);
//                System.out.print(" ");
//            }
//            System.out.println();
//        }

//        for(int i = 8; i >= 4; i--)
//        {
//            for(int j = 1; j <= 4; j++)
//            {
//                for(int k = j; k >= 1; k--)
//                {
//                    System.out.print(i * k - j);
//                    System.out.print(" ");
//                }
//                System.out.println();
//            }
//        }
//    }
}
