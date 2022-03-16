package com.harman.project;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Addition addobj=new Addition();
        Division divobj= new Division();
        Multiply mulobj= new Multiply();
        Subtraction subobj= new Subtraction();

        int x,y,addresult;
        Scanner input=new Scanner(System.in);
        System.out.println("input a number");
        x=input.nextInt();
        System.out.println("input another number");
        y=input.nextInt();
        addresult= addobj.add2num(x,y);
        int divresult= divobj.div2num(x,y);
        int mulresult= mulobj.mul2num(x,y);
        int subresult= subobj.sub2num(x,y);
        System.out.println(addresult);
        System.out.println(divresult);
        System.out.println(mulresult);
        System.out.println(subresult);


    }
}
