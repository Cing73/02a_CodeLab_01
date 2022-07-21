package com.cc.java;

public class App {
    
    public static void main(String[] args) {
    
        Konto konto1 = new Konto();
        System.out.println("Konto 1 aktuell: " + konto1.getKontostand());

        Konto konto2 = new Konto();
        System.out.println("Konto 2 aktuell: " + konto2.getKontostand());

        Konto konto3 = new Konto();
        System.out.println("Konto 3 aktuell: " + konto3.getKontostand());

        System.out.println("Konto 1 verdoppelt: " + konto1.getKontostand() * 2);

        System.out.println("Konto 2 verdreifacht: " + konto2.getKontostand() * 3);

        System.out.println("Konto 3 verzehnfacht: " + konto3.getKontostand() * 10);

    }

    

}

