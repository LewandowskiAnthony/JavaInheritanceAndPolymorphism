package com.company;

public class CompteBancaireRemunere extends CompteBancaire{

    private double _tauxDeRendement;

    public CompteBancaireRemunere(String titulaire, double tauxDeRendement){
        super(titulaire); // Appel du constructeur parent.
        _tauxDeRendement = tauxDeRendement;
    }

    @Override
    public void Créditer(int montant){
        _solde += montant + (montant*_tauxDeRendement);
    }
}
