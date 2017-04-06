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
  int[][] grille; // Définition de la grille

    /**
     * Permet de mettre des 0 dans toutes les cases de la grille
     */
    @Override
    public void initialisation() {       
         
        grille = new int[5][]; // Grille avec 6 lignes
        for (int i = 0; i <= 6; i++){ // Ajout de 7 zéros dans chacune des lignes
           grille[i] = new int[7];          
        }
        
        System.out.println("toto");
        
    }

    /**
     * Permet de gérer les actions du joueur
     * @param joueur Le joueur
     * @param colonne La position en abscisse où le joueur a mis son pion
     * @return L'état de validation de l'action
     */
    @Override
    public boolean action(int joueur, int colonne) {
        
        int vainqueur;
        
            for (int j=5; j>=0; j--){
                if (grille[colonne][j] == 0) {
                    grille[colonne][j] = joueur;
                    break;
                }                
        }
        
        
        vainqueur = vainqueur(); // Soit : 1, 2, 3, null
        
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
     * Renvoit le résultat de la partie
     * 1 : J1 a gagné
     * 2 : J2 a gagné
     * 0 : match nul
     * @return Le résultat de la partie
     */
    @Override
    public int vainqueur() {
     //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        int cpt = 0; // Compte le nombre de coups joués
        
        if (gagne(joueur, posX, posY), grille) {
            return joueur; // Retourne le joueur qui a gagné            
        } else {
            if (cpt == 42) {
                return 0; // Match nul
            } else {
                cpt++; // Coup suivant
                return 1000;
            }            
        }
           
    }
    
        public boolean parcours (int x, int y){
        boolean dansTableau = false;
        if (x >=1 && x<=7 && y>=1 && y<=6){
            dansTableau=true;
        }
        return(dansTableau);
    }
    
    public boolean gagne(int x, int y, int table[][], int joueur){
        boolean gagne=false;
        int cptH=0;
        int cptV=0;
        int cptDD=0; // droite quand on monte
        int cptDG=0; /// gauche quand on monte
        
        for (int i=1; i<=3; i++){
            if (parcours(x,y-i)){
                cptV+=1;
            }
            if (parcours(x,y+i)){
                cptV+=1;
            }
            if (parcours(x-i,y)){
                cptH+=1;
            }
            if (parcours(x+i,y)){
                cptH+=1;
            }
            if (parcours(x-i,y-i)){
                cptDD+=1;
            }
            if (parcours(x+i,y+i)){
                cptDD+=1;
            }
            if (parcours(x+i,y-i)){
                cptDG+=1;
            }
            if (parcours(x-i,y+i)){
                cptDG+=1;
            }
        }
        if (cptDG>=3 || cptDD>=3 || cptH>=3 || cptV>=3){
            gagne=true;
         }
        return(gagne);
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jeu jeu = new Jeu();
        jeu.initialisation();
    }
 }
   
