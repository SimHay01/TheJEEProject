/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

/**
 *
 * @author Simon Hay
 * TEST SIMON
 */
public class Main {
    
    private Jeu jeu; // Le jeu
    private int joueur; // Le joueur qui joue (1 ou 2)
    private int action; // L'action du joueur
    int tableau[][];
    private String statut;
    boolean isValide = false;
    
    
    public Main(){
        
        jeu = new Jeu();
        
        // Grille à 0, joueur à 1, statut à "Joueur 1"
        jeu.initialisation();
        
        // Tant que le jeu n'est pas fini, on fait des actions
        while (!jeu.statut().equals("fini")) {
            
            while (!isValide){
                isValide = jeu.action(joueur, action);
            }
            
            jeu.changerJoueur(joueur);
            
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Jeu jeu = new Jeu();
        jeu.initialisation();
    }
    
}
