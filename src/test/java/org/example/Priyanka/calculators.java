package Polymorphism;

public class calculators {

    public static void main(String[] args){

        System.out.println(add());
            add(2,3);
            System.out.println(add(1,2,3));

    }


    public static void add(int a, int b){
    int sum = a+b;
    System.out.println(sum);
    }


    //even though return type is different (void, int) for same method signature must be varry
    public static int add(int a,int b,int c){
        int sum = a+b+c;
        return sum;
    }


    public static int add(){
        return 0 ;
    }


}
