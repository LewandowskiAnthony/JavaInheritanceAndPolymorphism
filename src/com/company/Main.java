package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CompteBancaire client1 = new CompteBancaire("A.LEWANDOWSKI");
        client1.Créditer(100);
        client1.Relever();
        CompteBancaire client2 = new CompteBancaire("L.CARMENT");
        client2.Débiter(300);
        client2.Relever();
        CompteBancaireRemunere client3 = new CompteBancaireRemunere("H.LEWANDOWSKI", 0.03);
        client3.Créditer(300);
        client3.Relever();
        client3.Débiter(300);
        client3.Relever();
    }
}
