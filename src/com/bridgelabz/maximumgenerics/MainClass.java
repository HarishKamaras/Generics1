package com.bridgelabz.maximumgenerics;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Welcome1 to generics");
        //UC5 Using toPrint method print the more than three values
        int in1 =4, in2 =7 , in3 =1, in4 =1;
        String s1="deer", s2="rino", s3="lion", s4 ="bear";
        float f1=1.3f, f2=6.6f, f3=5.9f, f4=3.3f;
        GenericClass genericClass =new GenericClass();
        System.out.println("*********************************");
        genericClass.testMaxium(in1,in2,in3,in4);
        genericClass.testMaxium(s1,s2,s3,s4);
        genericClass.testMaxium(f1,f2,f3,f4);
        System.out.println("**********************************");
    }
}
