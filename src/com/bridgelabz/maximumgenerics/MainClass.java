package com.bridgelabz.maximumgenerics;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Welcome1 to generics");
        //UC4 more than three values
        int in1 =4, in2 =6 , in3 =1, in4 =1;
        String s1="deer", s2="rino", s3="lion", s4 ="bear";
        GenericClass genericClass =new GenericClass();
        genericClass.testMaxium(in1,in2,in3,in4);
        genericClass.testMaxium(s1,s2,s3);
    }
}
