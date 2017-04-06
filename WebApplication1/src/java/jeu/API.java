/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

/**
 *
 * @author Simon Hay
 */
public interface API {
    void initialisation();
    boolean action(int joueur, int action);
    String affichage();
    String statut();
    int derniereAction();
    int vainqueur();
}
