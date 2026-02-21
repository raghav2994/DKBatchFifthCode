package org.example.javabasic.loopsConcept;

public class ForLoopConcept {

    public static void main(String[] args){
        nestedLoopConcept();
    }


    public static void forLoopConcept(int startPoint, int n){
        int sum = 0;
        for(int i = startPoint ; i <= n ; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }


    public static void nestedLoopConcept(){

        for ( int i = 0; i <= 3 ; i ++ )

        {

            for( int j = 1; j<= 1; j ++)

            {

                System.out.print(i);
                System.out.print(" ");
                System.out.print(j);
                System.out.print(" ");

            }

        }

    }
}
