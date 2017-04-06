/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jeu;

import static java.lang.Boolean.FALSE;

/**
 *
 * @author Simon Hay
 */
 
public class Jeu implements API{
  private int state=1;

    /**
     * Permet de mettre des 0 dans toutes les cases de la grille
     */
    @Override
    public void initialisation() {       
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        int[][] grille = new int[5][]; // Grille avec 6 lignes
        for (int i; i <= 6; i++){ // Ajout de 7 zéros dans chacune des lignes
           grille[i] = new int[7];          
        }
        
        System.out.println("toto");
        
    }

    @Override
    public boolean action(int joueur, int action) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String affichage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String statut() {
        String ret="";
        if (state ==0){
            ret="fini";
        }
        else if (state ==1){
            ret="joueur1";
        }
        else if (state ==2){
            ret="joueur2";
        }
        return(ret);
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int derniereAction() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * 
     * @return 
     */
    @Override
    public int vainqueur() {
     //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
      int resultat;
      boolean victoire=FALSE;
        if (victoire == FALSE){
            resultat = 0;
        }
        else {
            resultat = 1;
        }
        return resultat;
    }
    
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        jeu.initialisation();
    }
 }
   
