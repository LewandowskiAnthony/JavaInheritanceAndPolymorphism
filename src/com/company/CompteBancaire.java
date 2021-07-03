package com.company;

public class CompteBancaire {

    protected String _titulaire = "";
    protected static Integer _numéro = 99;
    protected double _solde = 0;

    protected CompteBancaire(){
    }

    protected CompteBancaire(String titulaire) {
        _titulaire = titulaire;
        _numéro += 1;
    }

    public void Créditer(int montant){
        _solde += montant;
    }

    public void Débiter(int montant){
        _solde -= montant;
    }

    public void Relever(){
        System.out.println("Titulaire : " + _titulaire
                + "\n Numéro de compte : " + _numéro
                + "\n Crédit disponible : " + _solde);
    }

    public String get_titulaire() {
        return _titulaire;
    }

    public static Integer get_numéro() {
        return _numéro;
    }

    public double get_solde() {
        return _solde;
    }
}
