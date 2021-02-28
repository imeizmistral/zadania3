package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //jeden();
        //dwa();
       // trzy();
        //cztery();
       //piec();
        //szesc();
        //siedem();
        //dziewiec();
        //dwadwa();
        //czterycztery();
        //piecpiec();
        szescszesc();
    }

    public static void jeden(){

        for(int i = 11; i <=33;i++){
            System.out.println(i);
        }
    }
    public static void dwa(){
        System.out.println("Wpisz liczbę:");
        Scanner liczba = new Scanner(System.in);
        int a = liczba.nextInt();
        int wynik = 1;
        for(int i = 0; i <a;i++){
            wynik=wynik*2;
        }
        System.out.println(wynik);
    }
    public static void trzy(){
        System.out.println("Wpisz liczbę:");
        Scanner liczba = new Scanner(System.in);
        int a = liczba.nextInt();
        if(a > 2) {
            int wynik = 0;
            for(int i = 0; i <=a;i++){
                wynik=wynik+i;
            }
            System.out.println(wynik);
        }else{
            System.out.println("Za mała liczba");
        }

    }
    public static void cztery(){
        System.out.println("Ile kolumn:");
        Scanner liczba = new Scanner(System.in);
        int k = liczba.nextInt();
        System.out.println("Ile wierszy:");
        Scanner liczba2 = new Scanner(System.in);
        int n = liczba2.nextInt();


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
    public static void piec(){
        System.out.println("Wprowadź liczbę:");
        Scanner liczba = new Scanner(System.in);
        int k = liczba.nextInt();

        for (int i = k; i>0; i--) {
            for (int j = i; j <k; j++) {
                System.out.print("*");
            }
            System.out.println("*");

        }
    }
    public static void szesc(){
        System.out.println("Wprowadź liczbę:");
        Scanner liczba = new Scanner(System.in);
        int k = liczba.nextInt();
        int s = k-1;

        for (int i = 1; i<=k; i++)
        {
            for(int j=0;j<=s;j++){
                System.out.print(" ");}
            for (int j = 0; j<(i*2)-1; j++) {
                System.out.print("*"); }
            s--;
            System.out.println(" ");
        }
    }
    public static void siedem(){

        for (int i = 1; i <100; i++) {
            if(i%13==0) {
            System.out.println(i);
            }
        }

    }
    public static void dziewiec(){

        for (int i = 1; i <=10 ; i++) {
            System.out.println("");

            for (int j = 1; j <= 10; j++) {
                System.out.print(j*i +"\t");

            }
        }
    }
    public static void dwadwa(){
        System.out.println("Wprowadź liczbę:");
        Scanner liczba = new Scanner(System.in);
        int n = liczba.nextInt();

        int a=1;
        int wynik=0;
            while(a<n){
            wynik = a+ (2*n-1);
            System.out.println(wynik);
            a++;
        }
    }
    public static void czterycztery(){
        System.out.println("Wprowadź liczbę:");
        Scanner liczba = new Scanner(System.in);
        int a = liczba.nextInt();
        System.out.println("Wprowadź liczbę:");
        Scanner liczba2 = new Scanner(System.in);
        int b = liczba2.nextInt();
        int n = 0;
        int m=0;
        while(m<a){
            while(n<b){
                System.out.print("*");
                n++;
            }
            n=0;
            m++;
            System.out.println();
        }
    }
    public static void piecpiec(){
        Scanner liczba = new Scanner(System.in);
        int a=0;
        do{
            System.out.println("Podaj liczbę rzeczywistą:");
            a = liczba.nextInt();
        }while(a>0);
        System.out.println("Koniec pętli");


    }
    public static void szescszesc(){
        Scanner liczba = new Scanner(System.in);
        Scanner liczba2 = new Scanner(System.in);
        Scanner liczba3 = new Scanner(System.in);

        int a;
        do{
            System.out.println("Pole prostokąta: wciśnij 1");
            System.out.println("Pole kwadrata: wciśnij 2");
            System.out.println("Pole trójkąta: wciśnij 3");
            System.out.println("Wyjdź stąd: wciśnij 0");
            a = liczba.nextInt();
            if(a==1){
                System.out.println("Podaj długość");
               int b = liczba2.nextInt();
                System.out.println("Podaj szerokość");
                int c= liczba3.nextInt();
                System.out.println("Pole prostokąta to:"+(b*c));
            }
            else if(a==2){
                System.out.println("Podaj długość");
                int b = liczba2.nextInt();
                System.out.println("Pole kwadratu to:"+(b*b));
            }
            else if(a==3){
                System.out.println("Podaj długość");
                int b = liczba2.nextInt();
                System.out.println("Podaj wysokość");
                int c= liczba3.nextInt();
                System.out.println("Pole trójkąta to:"+(b/2*c));
            }
            else{
                System.out.println("Podaj wskazaną liczbę");
            }
        }while(a!=0);
        System.out.println("Wyjście udane");


    }
}


// 2// 4 //5 //6