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
    public Main(){
        
        jeu = new Jeu();
        jeu.initialisation();
        
        // Tant que le jeu n'est pas fini, on fait des actions
        while (!jeu.statut().equals("fini")) {
            
            // joueur le jeu
            
            
        }
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
