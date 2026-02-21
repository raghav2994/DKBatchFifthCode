package org.example.javabasic.conditionalStatment;

public class ConditionalStatment {


    public static void main(String[] args){

        evenOddNumber(93);
     //   checkGradesOfStudent(79);

    }


    public static void checkGradesOfStudent(int marks){

        if(marks >= 90){
            System.out.println("Grade A");
        }
        else if(marks>=80){
            System.out.println("Grade B");
        }
        else if(marks>=70){
            System.out.println("Grade C");
        }
        else
        {
          System.out.println("Grade D");
        }
    }

    public static void evenOddNumber(int number){
        if(number%2==0){System.out.println("Even number");}
        else
        {System.out.println("I dont know");}
    }


}
