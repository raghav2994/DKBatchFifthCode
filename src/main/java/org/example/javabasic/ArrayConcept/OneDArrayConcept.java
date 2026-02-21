package org.example.javabasic.ArrayConcept;

public class OneDArrayConcept {

    public static void main(String[] args){
        oneDArrayExample();
    }

    public static void oneDArrayExample(){

//        int[] a = new int[5];
//        a[0] = 1;
//        a[1] = 2;
//        a[2] = 3;
//        a[3] = 4;
//        a[4] = 5;

//        int[] a = {1,2,3,4,5,6};

        int[] a = new int[]{1,2,3};

        System.out.println("Size of array " + a.length);
        for(int i = 0; i< a.length; i++){
            System.out.println(a[i]);
        }

    }
}
