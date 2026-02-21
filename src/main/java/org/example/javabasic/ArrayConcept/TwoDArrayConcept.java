package org.example.javabasic.ArrayConcept;

public class TwoDArrayConcept {

    public static void main(String[] args){
        twoDArray();
    }

    public static void twoDArray(){

        String[][] a = new String[3][3];
        a[0][0] = "A00";
        a[0][1] = "A01";
        a[0][2] = "A02";

        a[1][0] = "A10";
        a[1][1] = "A11";
        a[1][2] = "A12";

        a[2][0] = "A20";
        a[2][1] = "A21";
        a[2][2] = "A22";

        for(int row = 0; row<3; row++){
            for(int col = 0; col<3; col++){
                System.out.println(a[row][col]);
            }
        }

    }
}
